package com.example.wand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@MapperScan("com.example.wand.mapper")
public class WandApplication {

    public static void main(String[] args) {
        SpringApplication.run(WandApplication.class, args);
    }

}
