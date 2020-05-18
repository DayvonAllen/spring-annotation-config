package com.example.model;

import com.example.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    //field injection
    @Autowired
    @Qualifier("unluckyFortuneService")
    private FortuneService fortuneService;

    public BasketballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Get 30 shots up.";
    }

    @Override
    public String getDailyFortune() {
        return "Basketball: " + fortuneService.getFortune();
    }
}
