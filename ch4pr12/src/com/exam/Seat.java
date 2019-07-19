package com.exam;

public class Seat {
	String[] s;
	String[] a;
	String[] b;
	
	public Seat() {
		s = new String[10];
		a = new String[10];
		b = new String[10];
		for(int i = 0; i < s.length; i++) {
			s[i] = "---";
			a[i] = "---";
			b[i] = "---";
		}
	}
	
	public Seat(String[] s, String[] a, String[] b) {
		this.s = s;
		this.a = a;
		this.b = b;
	}
	
	public String[] getS() {
		return s;
	}
	public void setS(String[] s) {
		this.s = s;
	}
	public String[] getA() {
		return a;
	}
	public void setA(String[] a) {
		this.a = a;
	}
	public String[] getB() {
		return b;
	}
	public void setB(String[] b) {
		this.b = b;
	}
	
	// Á¶È¸
	void show() {
		System.out.print("S>> ");
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}System.out.println();
		
		System.out.print("A>> ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}System.out.println();
		
		System.out.print("b>> ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}System.out.println();
	}
	
}
