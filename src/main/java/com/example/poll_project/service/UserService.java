package com.example.poll_project.service;

import com.example.poll_project.model.User;
import com.example.poll_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        if (user.getFirstName().trim().isEmpty()||user.getLastName().trim().isEmpty()||user.getEmail().trim().isEmpty()||user.getAddress().trim().isEmpty()){
            return null;
        }
        return userRepository.save(user);
    }

    public User update(User user) {
        if (user.getFirstName().trim().isEmpty()||user.getLastName().trim().isEmpty()||user.getEmail().trim().isEmpty()||user.getAddress().trim().isEmpty()){
            return null;
        }
        return userRepository.update(user);
    }

    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    public String deleteById(int id) {
        if (userRepository.getById(id) != null) {
            return userRepository.deleteById(id);
        }
        return "the user with id " + id + " doesnt exist so it cant be deleted";
    }

    public User getById(int id) {
        return userRepository.getById(id);
    }

}
