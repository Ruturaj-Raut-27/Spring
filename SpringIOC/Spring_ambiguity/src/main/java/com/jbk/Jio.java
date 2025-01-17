package com.jbk;

import org.springframework.stereotype.Component;

@Component("Jio")
public class Jio implements Sim{

	@Override
	public String calling() {
		return "classing from jio";
	}

}
