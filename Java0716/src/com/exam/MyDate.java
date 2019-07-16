package com.exam;

public class MyDate {
	int year;
	int month;
	int day;
	
	public MyDate() {
		// TODO Auto-generated constructor stub
	}
	
	public MyDate(int year) {
		this.year = year;
	}

	// alt s a
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	// alt s r
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	void printDate() {
		System.out.println(year + "-" + month + "-" + day);
	}
	
}
