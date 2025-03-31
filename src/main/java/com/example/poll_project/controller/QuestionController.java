package com.example.poll_project.controller;


import com.example.poll_project.model.Question;
import com.example.poll_project.question.QuestionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/re-question")
public class QuestionController {
    @Autowired
    private QuestionClient questionClient;

    public QuestionController(QuestionClient questionClient) {
        this.questionClient = questionClient;
    }

    //add crud. mostly delete

    @GetMapping("/{questionId}")
        public ResponseEntity<Question> getQuestionById(@PathVariable int questionId){

        try{
            return questionClient.getQuestionById(questionId);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    //    @GetMapping("/{qustionId}")
//    public QuestionResponse getQuestion(@PathVariable int questionId){
//        System.out.println("controller ");
//        return questionClient.getQuestionById(questionId);
//    }

}
