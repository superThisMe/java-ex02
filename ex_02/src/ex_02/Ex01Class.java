package ex_02;

public class Ex01Class {

	public static void main(String[] args) {

		// 1. 클래스의 인스턴스 만들기	
		int x; // DataType Variable_Name; (Primitive Type)
		Person person; // DataType(=class) Variable_Name; (Reference Type)
		person = new Person(); // 인스턴스 만들기 + 인스턴스의 주소를 참조변수에 저장

		// 2. 인스턴스 사용하기 (인스턴스의 멤버 사용하기)
		person.name = "David";
		person.email = "david@gmail.com";
		person.phone = "010-9111-1119";

		String info = person.info();
		System.out.println(info);

	}

}

//클래스 만들기 -> 자료형 만들기
class Person {
	// Variable : Attribute
	String name;
	String email;
	String phone;

	// Method : Function
	String info() {
		return "[" + name + "]" + "[" + email + "]" + "[" + phone + "]";
	}

}