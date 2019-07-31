package com.exam;

class StaticSample {
	public static int y;
	public static int f() { return y; }
	
	public int x;
}

public class UsingStatic {
	public static void main(String[] args) {
//		StaticSample.x = 5;
		StaticSample ss = new StaticSample();
		ss.x = 5;
		ss.y = 20;
		StaticSample.y = 10;
		
		
	} // main method
}
