package com.example.poll_project.answer;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "${external-api.answer.name}", url = "${external-api.answer.url}")
public interface AnswerClient {
    @DeleteMapping("/re-answer/delete-all-answers-by-user/{Id}")
    ResponseEntity<String> deleteAllAnswersByUserId(@PathVariable int Id);
}
