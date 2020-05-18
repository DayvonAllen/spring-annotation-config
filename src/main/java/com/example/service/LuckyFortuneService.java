package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LuckyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
