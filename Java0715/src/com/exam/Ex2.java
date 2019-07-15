package com.exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Animal an = new Animal();
		an.run();
		
		Animal an1 = new Animal(1);
		an1.run();
		
		Animal an2 = new Animal("개");
		an2.run();
		
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
		
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 : " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
	}
}
