package com.shakhawat.aspring;

public class Student {
	
	String id;
	String name;
	String age;
	String gender;
	String address;
	String result;
	
	public Student() {
	}

	public Student(String id, String name, String age, String gender, String address, String result) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.result = result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
