package com.exam;

public class Animal {
	// �ʵ�(�������)
	// ���ڿ� name
	// ������ age
	String name;
	int age;
	
	// �⺻������
	// �����̸��� ������, ���̴� 3��� �ʱ�ȭ
	public Animal() {
		name = "������";
		age = 3;
	}
	// name �޾Ƽ� �ʱ�ȭ�ϴ� ������. age�� 1��
	public Animal(String name) {
		this.name = name;
		age = 1;
	}
	// age �޾Ƽ� �ʱ�ȭ�ϴ� ������. name�� ������
	public Animal(int age) {
		this.age = age;
		name = "������";
	}
	
	// name�� age �޾Ƽ� �ʱ�ȭ�ϴ� ������
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	// setter, getter �޼��� �����
	
	// �޼��� run() -> ��� "age�� name�� �ڴ�"
	void run() {
		System.out.println(age + "�� " + name +"��(��) �ڴ�");
	}
}
