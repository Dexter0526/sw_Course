package com.exam;

public class Person {
	// �ʵ�
	// ���ڿ� name ����
	private String name;
	// ������ age ����
	private int age;
	// �⺻������ �̸� : "ȫ�浿", ���� : 22
	public Person() {
//		this("ȫ�浿", 22);
		name = "ȫ�浿";
		age = 22;
	}
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	//set/get �޼ҵ� ��ü����	
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
	
	
	
}
