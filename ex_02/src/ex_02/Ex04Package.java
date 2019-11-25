package ex_02;

import pac.example.Person; // 이제 Person은 pac.example.Person으로 대체

// ex_02 패키지 내의 Ex04Package 클래스
public class Ex04Package extends Person {

	public static void main(String[] args) {

		// 클래스 이름은 원칙적으로 package name.class name 으로 사용
		pac.example.Person p1 = new pac.example.Person();
//		p1.no = 10;
//		p1.no2 = 20;
		Ex04Package p2 = new Ex04Package();
//		p2.no = 10; // 외부 패키지에 상속되지 않는 default 변수
		p2.no2 = 20; // 상속받은 protected 변수

		Person p3 = new Person();
		p2.setName("John");
		p2.setEmail("abc@abc.com");
		p2.setPhone("010-1111-2222");

		System.out.println(p2.getEmail());

	}
}