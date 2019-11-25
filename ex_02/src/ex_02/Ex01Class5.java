package ex_02;

public class Ex01Class5 {

	public static void main(String[] args) {

		int x = 10; // 초기화
		int[] arr = { 1, 2, 3 }; // 초기화

		Point3 p = new Point3(); // 인스턴스 만들기
		System.out.println(p.info());

		Point3 p2 = new Point3(100, 200); // 절달인자 있는 생성자로 인스턴스 만들기
		System.out.println(p2.info());

		Product pd1 = new Product(1, "potato", 3.4);
		System.out.println(pd1.info());

		Product pd2 = new Product(1, "potato", 3.4);
		System.out.println(pd2.info());

		System.out.println(pd1.equals(pd2));
		System.out.println(pd1 == pd2);
		
	}
}

class Point3 {

	private int x;
	private int y;

	// 생성자 메소드 -> 인스턴스가 생성될 때 (new 할 때) 자동으로 호출

	public Point3() {
		System.out.println("전달인자 없는 생성자 메소드");
	}

	public Point3(int x, int y) {
		System.out.println("전달인자 있는 생성자 메소드");
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String info() {
		return String.format("[X : %d][Y : %d]", x, y);
	}
}

class Product {
	private int no;
	private String name;
	private double price;

	public Product() {
		System.out.println("매개변수가 없는 생성자");
	}

	public Product(int no, String name, double price) {
		System.out.println("매개변수가 있는 생성자");
		this.no = no;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String info() {
		return String.format("[번호 : %d][이름 : %s][가격 : %.2f]", no, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		Product anotherProduct = (Product) obj;
		boolean bl = false;
		if (this.no == anotherProduct.no
				&& this.name.equals(anotherProduct.name)
				&& this.price == anotherProduct.price) {
			bl = true;
		}
		return bl;

	}
}
