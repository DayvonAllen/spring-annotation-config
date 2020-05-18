package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class KindaLuckyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is kinda lucky for you.";
    }
}
