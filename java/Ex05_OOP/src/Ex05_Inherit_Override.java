import kr.or.bit.Emp;

class Test2 {
	int x = 100;

	void print() {
		System.out.println("�θ� �Լ� test2");
	}
}

class Test3 extends Test2 {
	int x = 300;	// C#: �θ� �����ϱ� -> �̷������ ����������. ������ �ȳ����� �� ������ ����
	
	@Override
	void print() {
		System.out.println("�ڽ��� �θ��Լ��� ������");
	}
	
	void print(String str) {
		System.out.println("���� �����ε� �Լ��� + str");
	}
}

public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println(t.x);
		t.print();
		t.print("overload");
		
		///////////////////////////////
		Emp emp = new Emp(1000, "ȫ�浿");
		System.out.println(emp); //�ּҰ��� �״� �߿����� �ʾƿ�
		//��� : ����ϰ� �̸��� ��� ������ ����ϰ� �;�...
		//�ٵ� ������ ������ �Լ��� ������ ������� ���ڴ�...
		
		//���� ������ ������ ���� emp����ϴ� �Ϳ� ����� emp.toString()�� �����Ǿ� �ִ� �Žþ��!
		//ObjectŬ������ toString�� ���ؼ� �ּҰ��� ����ϵ��� �����س�����!
		
		//JAVA API�� �����ϴ� ������ Ŭ������ ObjectŬ������ toString()�޼��带 �������ϰ� �ִ�.
		//���� : ���� ���� �˷��� �Լ��ϱ�..
	}

}
