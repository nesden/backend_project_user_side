package com.example.poll_project.answer;


import com.example.poll_project.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="${external-api.answer.name}",url="${external-api.answer.url}")
public interface AnswerClient {

//    @GetMapping("/re-answer/{questionId}")
//    ResponseEntity<Question> getQuestionById(@PathVariable int questionId);

//    @DeleteMapping("/re-answer/{userId}")
//    ResponseEntity<String> deleteAnswersByUserId(@PathVariable int userId);

    @DeleteMapping("/re-answer/questions-by-user/{userId}")
    ResponseEntity<String> deleteAllAnswersByUserId(@PathVariable int userId);
}
