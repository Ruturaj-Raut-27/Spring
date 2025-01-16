package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfig;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		Employee e = context.getBean("emp", Employee.class);
		System.out.println(e);

//		Employee e2 = context.getBean("emp",Employee.class);
//		System.out.println(e == e2);
		context.close();

	}

}
