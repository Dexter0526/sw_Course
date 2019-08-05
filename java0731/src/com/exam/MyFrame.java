package com.exam;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		setTitle("창 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout()); // 배치관리자
		
		c.add(new JButton("더하기"));
		c.add(new JButton("빼기"));
		c.add(new JButton("곱하기"));
		c.add(new JButton("나누기"));
		c.add(new JButton("계산"));
		
		setSize(300, 300); // 창의 크기 300X300
		setVisible(true); // 창 보이기
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
