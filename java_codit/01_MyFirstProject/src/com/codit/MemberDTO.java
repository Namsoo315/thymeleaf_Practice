package com.codit;

public class MemberDTO {
	private String name;
	private int age;
	private String address;
	private String test;

	public MemberDTO(String name, int age, String address, String test) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.test = test;
	}

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
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}
