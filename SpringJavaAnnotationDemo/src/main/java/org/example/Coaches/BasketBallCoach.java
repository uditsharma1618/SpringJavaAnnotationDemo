package org.example.Coaches;

//Demonstrating IOC with @Component Annotation
import org.springframework.stereotype.Component;
@Component
public class BasketBallCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practice Ball Throwing daily";
    }
    @Override
    public String getDailyFortune(){
        return null;
    }

}
