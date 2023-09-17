package org.example.Coaches;
//Demonstrate Constructor Injection, Setter Injection, Field Injection. Autowired and Qualifier use.
import org.example.Fortunes.Fortune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    //Field Injection
    @Autowired
    @Qualifier("badFortune")
    private Fortune fortune;
    public FootballCoach(){}
    //COnstructor Injection
//    @Autowired
//    public FootballCoach(Fortune fortune){
//        this.fortune = fortune;
//    }
    //Setter Injection
//    @Autowired
//    public void setFortune(Fortune fortune){
//        this.fortune = fortune;
//    }
    @Override
    public String getDailyWorkout(){
        return "Practice GoalKeeping Daily in the Morning";
    }
    public String getDailyFortune(){
        return fortune.getDailyFortune();
    }
}
