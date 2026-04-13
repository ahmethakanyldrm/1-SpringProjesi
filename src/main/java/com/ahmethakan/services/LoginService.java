package com.ahmethakan.services;

import com.ahmethakan.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoginService {

    public void login() {
        // user listesine ihtiyaç var
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);


    }
}
