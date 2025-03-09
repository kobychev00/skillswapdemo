package com.example.SkillswapDemo.service;

import com.example.SkillswapDemo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService{
    private final Map<Integer, User> users;
    public UserServiceImpl(List <User> initialUsers){
        this.users = new HashMap<>();
        if (initialUsers != null) {
            for (User user : initialUsers) {
                users.put(user.getId(), user);
            }
        }
    }

    @Override
    public String getUserById(int id) {
        User user = users.get(id);
        return (user!=null) ? user.getLogin():"User not found";
    }

    @Override
    public String getUserInfoById(int id) {
        User user = users.get(id);
        return (user!=null) ? user.getFullInfo():"User not found";
    }
}