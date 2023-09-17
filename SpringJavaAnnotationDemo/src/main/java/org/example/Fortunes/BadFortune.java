package org.example.Fortunes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune{
    @Override
    public String getDailyFortune(){
        return "Today is your bad day. Be careful";
    }
}
