package com.jbk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Person p = context.getBean(Person.class);
		
		System.out.println(p.getSim1().calling());
		System.out.println(p.getSim2().calling());

		context.close();
	}

}
