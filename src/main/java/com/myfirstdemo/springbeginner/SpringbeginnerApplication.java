package com.myfirstdemo.springbeginner;

import com.myfirstdemo.springbeginner.beans.IocExample;
import com.myfirstdemo.springbeginner.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@SpringBootApplication

public class SpringbeginnerApplication implements CommandLineRunner {

    @Autowired
    private Services services ;





    public static void main(String[] args) {
        SpringApplication.run(SpringbeginnerApplication.class, args);
       // getData();

    }

    @Override
    public void run(String... args) throws Exception {

        services.getData();

    }
}
