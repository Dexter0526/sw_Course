package com.exam;
// ������ �����ε� : ������ ������ ����

// ������ ���Ǻδ� ������ ��ü�� ������ҷ� ���Ծȵ�!
public class Point {
	// �ʵ�(�������) ������x ������y
	int x;
	int y;
	// �⺻������ x�� y�� 2�� �ʱ�ȭ
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

	// x �ʵ尪 �������� setter �޼���(����)
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
	// x �ʵ尪 �������� getter �޼���(�б�)
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
