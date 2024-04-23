package ru.elengaupt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public int random(int min, int max){
        return (int)((Math.random() * max) + min);
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
    public Integer min(){
        return 0;
    }

    @Bean
    public Integer max(){
        return 110;
    }
}
