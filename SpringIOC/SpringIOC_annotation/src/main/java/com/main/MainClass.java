package com.main;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Myconfig;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		
		Employee e = context.getBean(Employee.class);
		
//		e.setEmpId(1000);
//		e.setName("ruturaj");
//		e.setSalary(20000);
		
		System.out.println(e);
		
		context.close();
	}
}
