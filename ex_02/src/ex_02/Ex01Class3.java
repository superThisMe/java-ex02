package ex_02;

public class Ex01Class3 {

	public static void main(String[] args) {

		int x = 100;
		int y = 200;
		Point p = new Point(); // 참조변수 만들기 + 인스턴스 만들기 + 주소를 참조변수에 저장
		p.x = 10;
		p.y = 20;

		String info = p.info();

		p.x = 11;
		p.y = 21;

		System.out.println(info);
		System.out.println(p.info());

		Calc calc = new Calc();
		for (int i = 0; i < calc.data.length; i++) {
			calc.data[i] = (int) (Math.random() * 900) + 100;
			System.out.printf("[%d ] ", calc.data[i]);
		}
		System.out.println();
		int sum = calc.sum();
		System.out.printf("[합계 : %d]", sum);
		
	}
}

class Point {
	int x;
	int y;

	String info() {
//		return "[X : " + x + "]" + "[Y : " + y + "]";
		return String.format("[X : %d][Y : %d]", x, y); // String.format -> System.out.printf와 동일하지만 출력 X
	}
}

class Calc {
	int[] data = new int[10];

	int sum() {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
}