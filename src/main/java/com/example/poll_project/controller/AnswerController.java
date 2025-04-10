package com.example.poll_project.controller;

import com.example.poll_project.answer.AnswerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/re-answer")
public class AnswerController {
    @Autowired
    private AnswerClient answerClient;


    @DeleteMapping("/questions-by-user/{userId}")
    public ResponseEntity<String> deleteAllAnswersByUserId(@PathVariable int userId) {
        try {
            return answerClient.deleteAllAnswersByUserId(userId);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
