package com.example.poll_project.question;

import com.example.poll_project.model.Question;
import com.example.poll_project.model.QuestionResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@FeignClient(name="${external-api.question.name}",url="${external-api.question.url}")
public interface QuestionClient {
    @GetMapping("/re-question/{questionId}")
//    /api/data
//    ("/re-question/{questionId}")
    ResponseEntity<Question> getQuestionById(@PathVariable int questionId);


    @GetMapping("/api/data")
        ResponseEntity<String> getDataFromServiceA();
}
