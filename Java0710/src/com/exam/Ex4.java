package com.exam;

// static�� ������ ��ü�� ������Ұ� �ƴ�
class Tree{
	// �ʵ�(��� ����)
	String name;
	int age;
	void wave() {
		System.out.println(age + "��" + name + "(��)�� �ٶ��� ��鸳�ϴ�.");
	}
}

public class Ex4 {

	public static void main(String[] args) {
		// ����(�Ѱ� ������)
		// -> �迭(���� �ڷ��� ������ ������)
		// -> ����ü(�ٸ��ڷ��� ������ ������)
		// -> Ŭ����(����ü + �Լ�)
		
		// Ŭ���� : ��ü ����(������� + �޼ҵ�)
		// ��ü(�ν��Ͻ�) : ����(������ Ȯ��, �ʱ�ȭ), ���
		// Ŭ����		��ü(�ν��Ͻ�)
		// ��ǰ���赵	��ǰ
		// tv���赵	tv
		// �ؾ���	�ؾ
		
		int a;	// ��������
		a = 0;
		
		int[] arr; // �迭���� ����
		arr = new int[5];
		
		Tree tree;
		tree = new Tree();
		
		System.out.println(tree.name);
		System.out.println(tree.age);
		
		tree.name = "�ҳ���";
		tree.age = 100;
		System.out.println(tree.name);
		System.out.println(tree.age);
		tree.wave();
		
		Tree tree2 = new Tree();
		
		tree2.name = "�볪��";
		tree2.age = 10;
		System.out.println(tree2.name);
		System.out.println(tree2.age);
		tree2.wave();
		
		
		
	}
}
