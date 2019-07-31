package com.exam;


class TV {
	int size;
	String manufacturer;
	
	public TV() {
		this(32, "LG");
	}

	public TV(String manufacturer) {
		this(32, manufacturer);
	}

	public TV(int size, String manufacturer) {
		this.size = size;
		this.manufacturer = manufacturer;
		System.out.println(size+"인치 "+manufacturer);
	}
	
}



class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class Power {
	private int kick;
	private int punch;
	
	public Power() {
	}
	
	public Power(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
	}

	public int getKick() {
		return kick;
	}

	public void setKick(int kick) {
		this.kick = kick;
	}

	public int getPunch() {
		return punch;
	}

	public void setPunch(int punch) {
		this.punch = punch;
	}
}


class StaticTest {
	static int a;
	static int getA() { return a; }
	//static int g() { return getB(); }
	
	
	int b;
	int getB() { return b; }
	int f() { return getA(); }
}




public class Ex1 {
	public static void main(String[] args) {
		Power robot = new Power();
//		robot.kick = 10;
//		robot.punch = 20;
		robot.setKick(10);
		robot.setPunch(20);
		
//		Power robot = new Power(10, 20);
		
		
		
		
		
//		new TV();
//		new TV("삼성");
//		TV tv = new TV(65, "삼성");
//		
//		Person p = new Person();
//		p.setAge(17);
		
		
		
		
		String s = null;
		for (int n=0; n<10; n++) {
			s = new String("Hello" + n);
			System.out.println(s);
		}
		
		
		String a = new String("aa");
		String b = a;
		String c = b;
		a = null;
		b = null;
		
		
		
		
		
	} // main method

}
