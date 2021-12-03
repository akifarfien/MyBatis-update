package com.example.Mybatis_Update;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Mybatis_Update.service.UpdateService;

@SpringBootApplication
public class MybatisUpdateApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(MybatisUpdateApplication.class, args);
		
		UpdateService service = context.getBean(UpdateService.class);
		service.createrecords();
	}

}
