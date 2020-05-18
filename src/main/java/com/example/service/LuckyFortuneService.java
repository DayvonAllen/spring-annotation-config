package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class LuckyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
