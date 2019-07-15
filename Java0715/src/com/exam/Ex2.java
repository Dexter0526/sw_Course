package com.exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Animal an = new Animal();
		an.run();
		
		Animal an1 = new Animal(1);
		an1.run();
		
		Animal an2 = new Animal("��");
		an2.run();
		
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		Song song = new Song("Dancing Queen", "ABBA", 1978, "������");
		song.show();
		
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ : " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
