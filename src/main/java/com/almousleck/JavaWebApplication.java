package com.almousleck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaWebApplication {
    public static void main(String[] args) {
        //-Dmaven.tests-skip=true
        SpringApplication.run(JavaWebApplication.class, args);
    }
}
