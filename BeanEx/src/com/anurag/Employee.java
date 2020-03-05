package com.anurag;

public class Employee {
public int id;
public String name;
public double salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void show(){
	System.out.println("Employee ID "+id);
	System.out.println("Employee name "+name );
	System.out.println("Employee salary "+salary);
}

}
