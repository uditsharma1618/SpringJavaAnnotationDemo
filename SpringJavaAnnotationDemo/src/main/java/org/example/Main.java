package org.example;

import org.example.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myBasketBallCoach = context.getBean("basketBallCoach", Coach.class);
        System.out.println(myBasketBallCoach.getDailyWorkout());
        Coach myFootballCoach = context.getBean("footballCoach", Coach.class);
        System.out.println(myFootballCoach.getDailyWorkout());
        System.out.println(myFootballCoach.getDailyFortune());

    }
}