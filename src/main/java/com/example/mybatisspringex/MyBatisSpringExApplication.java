package com.example.mybatisspringex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisspringex.mapper")
public class MyBatisSpringExApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisSpringExApplication.class, args);
    }
}