package com.example.demo_debug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDebugApplication implements CommandLineRunner {

    @Autowired
    ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(DemoDebugApplication.class, args);
         
    }

    @Override
    public void run(String... args) throws Exception {
        String c1 = ctx.getBean(Compo1.class).getId();
        System.out.println(c1);
    }
}
