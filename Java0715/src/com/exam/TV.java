package com.exam;

public class TV {
	String name;
	int year;
	int inch;
	public TV(String name, int year, int inch) {
		super();
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	void show() {
		System.out.println(name + "에서 만든 " + year +"년형 "+ inch + "인치 TV");
	}
	
}
