package a;

public class AccessEx {
	private     int a = 10; // 같은클래스 내에서만 접근
	/*package*/ int b = 20; // 같은패키지 내에서만 접근
	protected   int c = 30; // 같은패키지 + 다른패키지의 상속받은 자식클래스에서 접근가능
	public      int d = 40; // 다른패키지에서도 접근가능
	
	public void printField() {
		System.out.println("AccessEx - printField()");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
