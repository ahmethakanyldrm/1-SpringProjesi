package com.ahmethakan.config;

import com.ahmethakan.entity.User2;
import com.ahmethakan.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        UserService userService = new UserService();
        List<User2> userList = new ArrayList<>();

        userList.add(new User2("Ahmet"));
        userList.add(new User2("Hakan"));

        // I Love You Kseniaa ❤️
        userList.add(new User2("Kseniaa"));

        userService.setUserList(userList);

        return userService;
    }
}
