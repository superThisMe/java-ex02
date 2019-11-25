package ex_02;

public class Ex02Inheritance {

	public static void main(String[] args) {

		// 1. 상속확인 : 상속된 멤버의 사용
		TheDerived d1 = new TheDerived();
		d1.m1(); // 상속받은 메소드 사용
		d1.m2(); // 자신의 메소드 사용

		// 2. 상속관계에 있는 크래스 사이의 형변환
		TheBase b1 = new TheBase();
		TheBase b2 = new TheDerived(); // 부모타입 참조변수 -> 자식타입 인스턴스 생성
//		System.out.println(b2.data3); // TheBase 기반이기에 변수 data3는 사용 X
//		TheDerived d2 = new TheBase(); // Error : 자식타입 참조변수 -> 부모타입 인스턴스 생성
		TheDerived d3 = (TheDerived)b2; // 형변환
		
		// 3. 메소드 재정의
		TheBase b3 = new TheBase();
		b3.m1();
		TheDerived d4 = new TheDerived();
		d4.m1();
		
		
		// 4.
		TheBase b4 = new TheDerived();
		b4.m1();
	}

}

class TheBase {

	private String data1;
	public String data2;

	public void m1() {
		System.out.println("TheBase.m1");
	}

}

// TheBase 상속 -> TheBase의 멤버가 TheDrived에 포함
class TheDerived extends TheBase {

	private String data3;

	public void m1() {
		System.out.println("The Derived.m1");
	}
	
	public void m2() {
//		data1 = "Modified String"; // 부모 클래스의 private 멤버는 사용 X
		System.out.println("TheDerived.m2");
	}

}