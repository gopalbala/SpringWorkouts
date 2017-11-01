package com.gb.springsamples.xmlconfiguration.SpringXmlConfigurationSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringXmlConfigurationSampleApplication {

    public static void main(String[] args) {

       // SpringApplication.run(SpringXmlConfigurationSampleApplication.class, args);

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortune());
        classPathXmlApplicationContext.close();
    }
}

