package com.answer.svc.domain;


public class Question {

    private int questionId;
    private String question;
    private int askedby;

    public Question(int questionId,String question,int askedBy) {

        this.questionId = questionId;
        this.question = question;
        this.askedby = askedBy;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public int getAskedby() {
        return askedby;
    }
}
