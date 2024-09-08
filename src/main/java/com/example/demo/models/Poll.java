package com.example.demo.models;

import java.util.HashMap;
import java.util.Map;

public class Poll {
    private String id;
    private String title;
    private String question;
    private Map<String, String> votes;  // Track votes by userId -> option

    // Default constructor
    public Poll() {
        this.votes = new HashMap<>();  // Initialize votes as an empty HashMap
    }

    // Getters and setters for id, title, question
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    // Getters and setters for votes
    public Map<String, String> getVotes() {
        return votes;
    }

    public void setVotes(Map<String, String> votes) {
        this.votes = votes;
    }
}
