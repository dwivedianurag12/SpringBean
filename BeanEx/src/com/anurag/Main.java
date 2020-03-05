package com.anurag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee obj = (Employee) context.getBean("employee");

		obj.show();

		System.out.println();

		User u = (User) context.getBean("user");
		u.showUser();

	}
}