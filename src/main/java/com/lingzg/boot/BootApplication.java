package com.lingzg.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.lingzg.boot.dao")
@SpringBootApplication
public class BootApplication /*extends SpringBootServletInitializer*/{

	/*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootApplication.class);
    }*/
	
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
