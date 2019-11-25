package ex_02;

public class Ex05Object {

	public static void main(String[] args) {

		// 1.
		MyObject obj = new MyObject();
		System.out.println(obj.toString()); // Object.toString : 디폴트는 객체의 참조 주소를 문자열로 반환 -> 재정의 가능
		@SuppressWarnings("unused")
		Object obj1_1 = obj; // 상속을 받았기 때문에 형변환 가능

		// 2.
		MyObject obj2 = new MyObject();
		obj2.setNo(1);
		obj2.setName("Apple");
		MyObject obj2_1 = new MyObject();
		obj2_1.setNo(1);
		obj2_1.setName("Apple");

		if (obj2 == obj2_1) { // 비교연산자는 항상 참조를 비교
			System.out.println("참조가 같습니다.");
		} else {
			System.out.println("참조가 다릅니다.");
		}

		if (obj2.equals(obj2_1)) { // Object.equals : 디폴트는 참조 비교 -> 재정의 가능
			System.out.println("값이 같습니다.");
		} else {
			System.out.println("값이 다릅니다.");
		}
		
		// 3.
		MyObject obj3 = new MyObject();
		obj3.setNo(7);
		System.out.println(obj3.hashCode()); // Object.hashCode : 디폴트는 해쉬코드 반환 -> 재정의 가능

	}

}

class MyObject /* extends Object */ {

	private int no;
	private String name;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyObject [no=" + no + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) { // Object.equals 가 값을 비교하도록 재정의

		if (obj instanceof MyObject == false) {
			return false;
		}

		MyObject other = (MyObject) obj;
		if (this.no == other.no && this.name == other.name) {
			return true;
		} else {
			return false;
		}
	}
	
//	@Override
//	public int hashCode() {
//		return no; // 고유값을 반환하도록 정의
//	}

}