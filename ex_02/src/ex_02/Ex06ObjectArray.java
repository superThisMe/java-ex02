package ex_02;

import java.util.*;

public class Ex06ObjectArray {

	public static void main(String[] args) {

		TheTest[] tests = new TheTest[10];
		for (int i = 0; i < tests.length; i++) {

			tests[i] = new TheTest(); // 인스턴스 초기화

			tests[i].x = (int) (Math.random() * 100);
			tests[i].y = (int) (Math.random() * 100);
		}

		System.out.println(tests[5].x + "/" + tests[5].y);
		System.out.println("End of program");
		
	}

}

class TheTest {
	int x;
	int y;
}
