package com.example.model;

import com.example.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("singleton")
public class TennisCoach implements Coach {

    private final FortuneService fortuneService;

    //constructor injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit tennis balls for 40 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
