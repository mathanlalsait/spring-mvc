package com;

public class Student 
{
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0 & age <100) {
		this.age = age;
		}
		else
		{
			throw new IllegalArgumentException("Invalid age " + age + " age should be 0 to 100 olyl");
		}
	}

}
