package com.proxiad.formation.spring.exo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exo1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"com/proxiad/formation/spring/exo1/vide.xml"});

	}

}
