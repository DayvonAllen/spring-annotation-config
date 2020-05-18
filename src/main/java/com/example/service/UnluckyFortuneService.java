package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class UnluckyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your unlucky day.";
    }
}
