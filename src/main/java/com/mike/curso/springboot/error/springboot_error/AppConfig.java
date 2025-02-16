package com.mike.curso.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mike.curso.springboot.error.springboot_error.models.domain.User;



@Configuration
public class AppConfig {

    @Bean
    public List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "Gonzalez"));
        users.add(new User(2L, "Maria", "Perez"));
        users.add(new User(3L, "Josefa", "Ramirez"));
        users.add(new User(4L, "Ale", "Gutierrez"));
        users.add(new User(5L, "Mike", "Garzon"));
        return users;
    }

}
