package com.exam;

public class Ex4 {
	public static void main(String[] args) {
		// �迭 : ���� �ڷ����� �����Ҹ� ������ ���
		// �迭�� ��ü�̴�.
		
		int [] a; // ������ �迭�� �����ϴ� ��������
		a = new int[5]; // �迭��ü ���� -> ��ü�� �⺻������ �ʱ�ȭ��
		for(int i = 0; i <= 4; i++) {
			a[i] = i;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		int[] c = {1,2,3,4,5};	// ��Ӱ���
//		c = {10,20,30}; ���� �߻�
		int[] d = new int[] {10,20,30,40,50};
		d = new int[] {1,2,3};
		
		
		// �Ǽ��� �迭 ���� dArr ũ�� : 4
		double[] dArr = new double[4];
		dArr[0] = 3.14;
		dArr = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};
		for(double dnum : dArr) {
			System.out.println("dnum = " + dnum);
		}
		
		// ���ڿ� String �迭 ���� strArr ũ�� 4
		// �ε���0 "ȫ�浿" ����
		// �ε���1 "������" ����
		// �ε���2 "�̸���" ����
		String[] strArr = new String[4];
		strArr[0] = "ȫ�浿";
		strArr[1] = "������";
		strArr[2] = "�̸���";
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
		System.out.println();
		
		// boolean �� �迭 ���� ũ�� 3
		// true, true, 
		boolean[] boolArr = new boolean[3];
		boolArr[0] = true;
		boolArr[1] = true;
		for(int i = 0; i < boolArr.length; i++) {
			System.out.print(boolArr[i] + "\t");
		}
	} 
	
}
