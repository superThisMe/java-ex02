package ex_02;

public class Ex08Interface {

	public static void main(String[] args) {

		// 1. 인터페이스로 인스턴스 만들 수 없음 (new X)
//		TheInterface obj = new TheInterface(); // 오휴

		TheInterface obj2 = new TheImplement();
		obj2.m();
		
	}

}

interface TheInterface {

	int X = 10; // 인터페이스의 모든 필드는 자동으로 public static final

	void m(); // 인터페이스의 모든 메소드는 자동으로 public abstract

}

// 인터페이스는 다른 클래스가 구현해서 사용
// 구현하는 클래스는 인터페이스의 모든 메소드를 재정의해야함
class TheImplement implements TheInterface {

	@Override
	public void m() {
		System.out.println("재정의");
	}

}