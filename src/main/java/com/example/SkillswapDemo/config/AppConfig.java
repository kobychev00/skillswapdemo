package com.example.SkillswapDemo.config;

import com.example.SkillswapDemo.domain.PremiumUser;
import com.example.SkillswapDemo.domain.User;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
@Configuration
public class AppConfig {
    @Bean
    public List<User> initialUsers(){
        return List.of(new User(1, "alex", "password1", "Aleksandr", "Kobychev", new Date(2025, Calendar.MARCH,9)),
                new PremiumUser(2, "anyuta", "password2", "Anna", "Shcherbakova",new Date(2025, Calendar.MARCH,10),"CERT-2", "PREM-2"));
    }
}