package com.example;

import com.example.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach tCoach = context.getBean("tennisCoach", Coach.class);
        Coach fCoach = context.getBean("footballCoach", Coach.class);
        Coach bCoach = context.getBean("basketballCoach", Coach.class);
        System.out.println(tCoach.getDailyWorkout());
        System.out.println(tCoach.getDailyFortune());
        System.out.println("----------------------------------------------------");
        System.out.println(fCoach.getDailyWorkout());
        System.out.println(fCoach.getDailyFortune());
        System.out.println("----------------------------------------------------");
        System.out.println(bCoach.getDailyWorkout());
        System.out.println(bCoach.getDailyFortune());

        context.close();
    }
}
