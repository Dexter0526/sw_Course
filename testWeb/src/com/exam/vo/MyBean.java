package com.exam.vo;

public class MyBean {
	// 자바빈: 데이터를 저장 -> 이동 전달
	// 자바빈 정의 방법: 필드 접근지정자는 private
	//                   필드마다 getter / setter 메소드. 접근지정자는 public
	//                   기본생성자 필요
	
	// 필드
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
		this.age = age;
	}
}
