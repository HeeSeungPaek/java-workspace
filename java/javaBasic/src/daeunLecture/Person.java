package daeunLecture;

class Person {

	// Person class�� �ν��Ͻ� ����(�ʵ�) �����ϱ�
	private String name;
	private String phone;
	private int age;

	public Person() { // ���������� Ŭ�����̸�() {} == Constructor
		// �����ڸ� ȣ���ϸ� (�ν��Ͻ�&&��ü) �ڵ����� ����Ǵ� ���? -> �ʱ�ȭ�� ����ϰڴ�.
		this.name = "�����";
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

	// ���� �޼ҵ�

}
