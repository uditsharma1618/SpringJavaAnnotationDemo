package org.example.Fortunes;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune{
    @Override
    public String getDailyFortune(){
        return "Today is your Lucky Day";
    }
}
