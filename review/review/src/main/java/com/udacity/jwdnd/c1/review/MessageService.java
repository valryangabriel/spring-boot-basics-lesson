package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageService {

    private String message;

    MessageService(String message) {
        this.message = message;
    }

    public String uppercase() {
        return this.message.toUpperCase();
    }

    public String lowercase() {
        return this.message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("MessageService Bean Created");
    }

}
