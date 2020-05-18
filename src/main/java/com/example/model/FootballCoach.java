package com.example.model;

import com.example.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach() {
    }

    //setter injection
    @Autowired
    @Qualifier("kindaLuckyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit the bags.";
    }

    @Override
    public String getDailyFortune() {
        return "Football fortune, " + fortuneService.getFortune();
    }
}
