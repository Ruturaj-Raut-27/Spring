package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configure.MyConfig;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee e = context.getBean(Employee.class);
		
		System.out.println(e);
		
		context.close();

	}

}
