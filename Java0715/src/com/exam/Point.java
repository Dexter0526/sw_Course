package com.exam;
// 생성자 오버로딩 : 생성자 여러개 정의

// 생성자 정의부는 생성된 객체의 구성요소로 포함안됨!
public class Point {
	// 필드(멤버변수) 정수형x 정수형y
	int x;
	int y;
	// 기본생성자 x와 y를 2로 초기화
	public Point() {
		x = 2;
		y = 2;
	}
	public Point(int _x) {
		x = _x;
	}
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	void printData() {
		System.out.println(x + ", " + y);
	}

	// x 필드값 가져오기 setter 메서드(쓰기)
	void setX(int _x) {
		if(_x < 0) {
			x = 0;
		}
		else{
			x = _x;
		}
	}
	void setY(int _y) {
		if(_y < 0) {
			y = 0;
		}else {
			y = _y;	
		}

	}
	// x 필드값 가져오기 getter 메서드(읽기)
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
