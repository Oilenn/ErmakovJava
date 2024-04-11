package ru.elengaupt.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.Random;
import java.util.function.Predicate;

@Configuration
public class Beans {
    @Bean
    String sayHello(){
        return "Hello world!";
    }

    @Bean
    public int random(){
        return (int)(Math.random() * 99);
    }

    @Bean
    public Date date(){
        return new Date();
    }

    @Bean
    public Predicate<Integer> range(){
        return x -> x >= 2 && x <= 5;
    }

    @Bean
    public int min(){
        return 0;
    }

    @Bean
    public int max(){
        return 110;
    }
}
