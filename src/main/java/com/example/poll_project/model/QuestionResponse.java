package com.example.poll_project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestionResponse {
    @JsonProperty("question_id")
    private int questionId;
    @JsonProperty("answer_id")
    private int answerId;
    @JsonProperty("user_id")
    private int userId;

    public QuestionResponse(int questionId, int answerId, int userId) {
        this.questionId = questionId;
        this.answerId = answerId;
        this.userId = userId;
    }

    public QuestionResponse() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "QuestionResponse{" +
                "questionId=" + questionId +
                ", answerId=" + answerId +
                ", userId=" + userId +
                '}';
    }
}
