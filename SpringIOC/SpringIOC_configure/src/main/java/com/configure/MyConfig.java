package com.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Employee;

@Configuration
public class MyConfig {

	@Bean
	public Employee getEmp() {
		return new Employee();
	}
}
