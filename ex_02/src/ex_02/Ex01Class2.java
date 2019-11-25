package ex_02;

public class Ex01Class2 {

	public static void main(String[] args) {

		int x; // 값을 저장하는 변수
		Person2 person; // 주소(참조)를 저장하는 참조변수
		person = new Person2(); // 값을 저장하는 인스턴스
		
		x = 10;
		person.name = "Jason";
		
		int y = x;
		Person2 person2 = person;
		
		y = 20;
		person2.name = "Jane";

		System.out.println("x = " + x);
		System.out.println("name = " +person.name);
		
		person.name = "Jack";
		
		System.out.println("name = " + person2.name);
		
	}

}

//클래스 만들기 -> 자료형 만들기
class Person2 {
	// Variable : Attribute
	String name;
	String email;
	String phone;

	// Method : Function
	String info() {
		return "[" + name + "]" + "[" + email + "]" + "[" + phone + "]";
	}

}