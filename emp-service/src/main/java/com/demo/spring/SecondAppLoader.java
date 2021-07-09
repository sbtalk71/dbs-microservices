package com.demo.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondAppLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("From Second App Loader class...");
    }
}
