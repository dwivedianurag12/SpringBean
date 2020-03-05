package com.anurag;

public class User {
	public String name;
	public String address;

	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public User() {
		super();
	}
public void showUser(){
	System.out.println(name +"   "+ address);
}
}
