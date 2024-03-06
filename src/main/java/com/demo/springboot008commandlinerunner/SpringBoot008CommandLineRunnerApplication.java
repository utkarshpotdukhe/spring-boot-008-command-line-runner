package com.demo.springboot008commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot008CommandLineRunnerApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBoot008CommandLineRunnerApplication.class, args);

        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
