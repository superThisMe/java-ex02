package ex_02;

public class Ex01Class6 {

	public static void main(String[] args) {

		Item item1 = new Item();
		item1.setNo(1);
		item1.setName("Test Item");
		item1.setShared("Shared Member");
		
		System.out.printf("[%d][%s]\n", item1.getNo(), item1.getName());
		
		Item item2 = new Item();
		
		System.out.printf("[%d][%s]\n", item2.getNo(), item2.getName());
		System.out.println(item2.getShared());
		
		double d = Math.random(); // Math클래스의 static 메소드 사용
	}

}

class Item {
	private static String shared; // 공유 멤버 : 한 번만 만들고 모든 인스턴스가 공유
	private int no;
	private String name;

	public static String getShared() {
		return shared;
	}

	public static void setShared(String shared) {
		Item.shared = shared;
	}

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

}
