package com.example.poll_project.question;

import com.example.poll_project.model.Question;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



//this page might need to be deleted
@FeignClient(name="${external-api.question.name}",url="${external-api.question.url}")
public interface QuestionClient {
    @GetMapping("/re-question/{questionId}")
    ResponseEntity<Question> getQuestionById(@PathVariable int questionId);

//    @DeleteMapping("/re-question/questions-by-user/{userId}")
//    ResponseEntity<String> deleteAnswersByUserId(@PathVariable int userId);
//type the code in the other poll


    //this was for testing
    //    /api/data
//    ("/re-question/{questionId}")
//    @GetMapping("/api/data")
//        ResponseEntity<String> getDataFromServiceA();
}
