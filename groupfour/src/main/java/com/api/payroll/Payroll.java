package com.api.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Payroll {

	public static void main(String[] args) {
		SpringApplication.run(Payroll.class, args);
	}

}
