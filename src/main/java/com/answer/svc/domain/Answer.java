package com.answer.svc.domain;


public class Answer {

    private int answerId;
    private String answer;
    private int questionId;
    private int userId;

    public Answer(int answerId,String answer,int questionId,int userId) {

        this.answerId = answerId;
        this.answer = answer;
        this.questionId = questionId;
        this.userId = userId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getUserId() {
        return userId;
    }
}
