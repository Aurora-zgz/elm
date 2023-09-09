package com.example.elmspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.elmspring.dao")
@ServletComponentScan(basePackages = "com.example.elmspring.filter")
public class ElmSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElmSpringApplication.class, args);
    }
}
