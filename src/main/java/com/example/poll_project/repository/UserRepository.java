package com.example.poll_project.repository;

import com.example.poll_project.model.User;
import com.example.poll_project.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User save(User user){
        try {
            String sql="INSERT INTO users (first_name, last_name, email,age,address) VALUES(?,?,?,?,?)";
            jdbcTemplate.update(sql,user.getFirstName(),user.getLastName(),user.getEmail(),user.getAge(),user.getAddress());
            return getByEmailHelper(user.getEmail());
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public User update(User user) {
        try {
            String sql = "UPDATE users SET first_name= ?, last_name= ?, email= ?, age=?, address=?,joining_date=? WHERE id= ?";
            jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(),user.getAge(),user.getAddress(),user.getJoiningDate(), user.getId());
            return getById(user.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public String deleteById(int id) {
        try {
            String sql = "DELETE FROM users WHERE id= ?";
            jdbcTemplate.update(sql, id);
            return "the user with id " + id + " deleted successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public User getById(int id) {
        try {
            String sql = "SELECT * FROM users WHERE id=?";
            return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public User getByEmailHelper(String email){
        try {
            String sql="SELECT * FROM users WHERE email = ?";
            return jdbcTemplate.queryForObject(sql,new UserMapper(),email);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
