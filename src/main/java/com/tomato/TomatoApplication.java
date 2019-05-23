package com.tomato;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tomato.db")
@SpringBootApplication
public class TomatoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TomatoApplication.class, args);
	}

}
