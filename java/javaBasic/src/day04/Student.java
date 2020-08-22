package day04;

public class Student {
	// �ʵ带 ������
	// String, int�� ������ �ʱ�ȭ��? �� Ŭ���� ��ü�� ���� �ٸ� Ŭ������ �˾Ƽ� �� ����!
	private String name;
	private int korean;
	private int english;
	private int math;

	public void setName(String name) {
		this.name = name;
	}// setter�޼ҵ��̴�. this.name = name;�� �� �޼ҵ带 ȣ���Ѵٴ� ���̴�.

	public String getName() {
		return name;
	}// getter�޼ҵ��̴�.

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getKorean() {
		return korean;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getEnglish() {
		return english;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	// �޼ҵ带 ������
	void printInfo() {
		System.out.printf("�̸�:%s, ����:%03d��, ����:%03d��, ����:%03d��\n", 
				name, korean, english, math);
	}

	// ÷�� �����ϸ� �������� ���´�. ��? �� �޼ҵ��� ����Ÿ���� int�̴�.
	// �ٵ� �����ִ� intŸ�� ���ϰ��� ������ ������ �����.
	// return ���� �����ָ� �������� �ۼ��� �� �ִ�.
	int calculateSum() {
		return korean + english + math;
	}

	// �̰͵� ��������, �� �޼ҵ��� ����Ÿ���� double�̹Ƿ� ���ϰ��� �������.
	double calculateAverage() {
		return calculateSum() / 3.0;
	}
	
	//�����ڴ� ����Ÿ���� ����.
	public Student() {
		System.out.println("�⺻ �������Դϴ�.");
		name = "�⺻ ������";
		korean = 0;
		english = 0;
		math = 0;
	}
	
	//������ �����ε� �ϱ�
	//�����ε� : ���� �̸��� �޼ҵ带 �ٸ� �Ķ���ͷ� ������ ����� ��.
	public Student(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	//�ڹ��� System.out.println()�� �Ķ���ͷ�
	//��ü�� ������, ��ü�� toString() �޼ҵ��� ������� ȭ�鿡 ����� �ȴ�.
	//���� �츮�� toString() �޼ҵ带 �������̵� �����ָ�
	//��Ű��.Ŭ�����̸�@�޸��ּ� �� ����� �ȴ�.
	//���� ��ü�� �ʵ� ������ �˰� �ʹٸ� toString()�޼ҵ带
	//�������̵� ����� �Ѵ�.
	public String toString() {
		return "���̸� : "+name+", ��������: "+korean+"��"
				+", ��������: "+english+"��, ��������: "+math+"��";
	}
	
	//equals �޼ҵ带 �������̵��غ���.
	//equals �޼ҵ�� �Ķ���ͷ� ��� Ŭ���� ��ü�� �� �� �ִ�.
	//��� Ŭ���� ��ü�� ���� �ϱ� ���ؼ��� ���� ������ �Ķ���ͷ� �����ָ� �ȴ�.
	//�ڹ��� ��� Ŭ������ ���� ������ Java.lang.Object�̴�.
	//���� equals �޼ҵ��� �Ķ���ʹ� Object obj�� �ȴ�.
	//ture/false�� ���� ���� ���̴� = ���� Ÿ���� boolean�� �ȴ�.
	public boolean equals(Object obj) {
		//1. 2���� ���� Ŭ������ ��ü���� ���Ѵ�.
		//   ��, �Ķ���ͷ� �Ѿ�� obj�� Student Ŭ������ ��ü����
		//   Ȯ���Ѵ�. �̶��� instanceof��� ��ɾ ���ؼ� �Ѵ�.
		if(obj instanceof Student) {
			//obj instanceof Student�� true�� ���Դٴ� ����
			//obj�� StudentŬ������ ��ü��� ���� �ȴ�.
			//���� ����� ����ȯ�� ���ؼ� obj�� Student Ŭ����
			//��ü�� ���� ������ �� �ִ�.
			Student s = (Student)obj;
			//�� ������ �� �޼ҵ带 ȣ���� ��ü�� ����(�ʵ�)��
			//s�� ����(�ʵ�)�� ���ؼ�
			//true�� �������� Ȯ���Ѵ�.
			if(name.equals(s.name) &&
					english == s.english &&
					math == s.math &&
					korean == s.korean) {
				return true;
			}
		}
		return false;
	}
}
