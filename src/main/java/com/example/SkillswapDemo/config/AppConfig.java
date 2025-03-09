package com.example.SkillswapDemo.config;

import com.example.SkillswapDemo.domain.PremiumUser;
import com.example.SkillswapDemo.domain.User;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
@Configuration
public class AppConfig {
    @Bean
    public List<User> initialUsers(){
        return List.of(new User(1, "alex", "password1", "Aleksandr", "Kobychev"),
                new PremiumUser(2, "anyuta", "password2", "Anna", "Shcherbakova", "2","PREM-2"));
    }
}