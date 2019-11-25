package ex_02;

public class Ex01Class7 {

	public static void main(String[] args) {

		final int k = 10;
//		k = 20; // Error : final 변수의 값 변경 X
		
		System.out.println(Math.PI); // 파이(원주율)
		System.out.println(Math.E); // 자연상수
		
	}

}

class Constants {

	int x;
	final int y; // y는 값을 변경할 수 없는 변수
	static final int z = 10; // static final 변수는 반드시 초기화 필요

	public Constants() {
		x = 10;
		y = 10; // 생성자 메소드에서 final 변수의 값 변경 가능
//		z = 10; // 생성자 메소드에서 static final 변수의 값 변경 X
	}

	public void method() {
		x = 20;
//		y = 20; // final 변수의 값 변경 X
//		z = 20; // static final 변수의 값 변경 X
	}

}