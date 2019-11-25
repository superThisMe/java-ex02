package pac.example;

// pac.example 패키지 내의 Ex04Package 클래스
public class Person {

	int no; // 접근지정자 default : 동일 패키지에서만 접근 가능
	protected int no2; // 접근지정자 protected : 동일 패키지 혹은 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근 가능
	private String name;
	private String email;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
