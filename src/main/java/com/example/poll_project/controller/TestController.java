package com.example.poll_project.controller;


import com.example.poll_project.question.QuestionClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//this page might need to be deleted
@RestController
@RequestMapping("/api")
public class TestController {
//        private QuestionClient questionClient;
//
//    public TestController(QuestionClient questionClient) {
//        this.questionClient = questionClient;
//    }
//    @GetMapping("/data")
//    public ResponseEntity<String > getData(){
//        ResponseEntity<String> response = questionClient.getDataFromServiceA();
//        return response;
//
////                return questionClient.getDataFromServiceA();
//    }

}
