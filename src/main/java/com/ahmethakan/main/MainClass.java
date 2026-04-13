package com.ahmethakan.main;

import com.ahmethakan.config.AppConfig;
import com.ahmethakan.entity.User2;
import com.ahmethakan.services.LoginService;
import com.ahmethakan.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);

       UserService userService = context.getBean(UserService.class);

        for (User2 user: userService.getUserList()){
            System.out.println(user.getName());
        }

        LoginService loginService = new LoginService();
        loginService.login();

    }
}
