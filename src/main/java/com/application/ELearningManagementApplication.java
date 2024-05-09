package com.application;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ELearningManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(ELearningManagementApplication.class, args);
		System.out.println("Java Application started");
	}

}
