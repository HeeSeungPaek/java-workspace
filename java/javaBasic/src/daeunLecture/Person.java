package daeunLecture;

class Person {

	// Person class의 인스턴스 변수(필드) 설정하기
	private String name;
	private String phone;
	private int age;

	public Person() { // 접근제한자 클래스이름() {} == Constructor
		// 생성자를 호출하면 (인스턴스&&객체) 자동으로 실행되는 목록? -> 초기화를 사용하겠다.
		this.name = "백희승";
		this.phone = "01058965335";
		this.age = 0;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 각종 메소드

}
