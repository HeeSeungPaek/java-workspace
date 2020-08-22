/*
������ �Լ� (Constructor)
1. �� �Լ��� Ư���� ������ �Լ��̴�. [Ư���� ����? : member field�� �ʱ�ȭ]
	Tip) {�Ϲ� �ʱ��� �Լ�} / static{�ʱ��� �Լ�}�� �����ϴ�. ������ ������ �Լ��� �Ϲ����̴�.
2.�Ϲ��Լ��� �ٸ� ����?
	2.1) �Լ� �̸��� ���� (Ŭ���� �̸��� ������ ����)
	2.2) ������ �Լ��� ����Ǵ� ���� - ��ü ���� ��(new) >> heap�� ������ ����� ����(memberfield) >> �ڵ����� ȣ��Ǵ� �Լ�
	2.3) ���� ����������, return type�� ����. >> �� void��� ���, �����ϴ� �� ������. >> void�� ������> public ClassName(){ }
		>>public�� private���� �ٲ�� �̱����̶�� ģ���� �ٲ�� (����)
3.���� : �����Ǵ� ��ü���� [������]���� MemberField�� ���� �ʱ�ȭ �� �� �ִ�.

ex)class Car{ String color; }

�䱸����.. �ڵ����� ����� �ڵ����� ������ ������ �ϳ� ������ �Ѵ�.
>>class Car{ String color= "blue"; } 

���� �䱸����.. �ڵ����� ����� �ڵ��� �ϳ��� ������ �����µ� �ٸ� ���� �������� �ִ�.
>>class Car{ String color= "blue"; } >> new >> c.color="red"; 

class Car { 
	String color;
	public Car(String color){
		this.color = color;
	}
}

4.������ �Լ� (OverRoading�� ����!)

5.����� ���� overroading ������ �Լ��� �ϳ��� �����ߴٸ� 
  "default ������ �Լ�"�� �ݵ�� ������ ���ؼ��� ��� �����ϴ�.

*/
//���赵�� �ǵ� : ����� ���� �ڵ��� �����, �ݵ�� �ڵ����� �̸��� �ο��ϼ���.
class Car {
	String carname;
	// �����Ϸ��� �˾Ƽ� ������ > ������ : �Լ���..
	// �����ڰ� ���� �����ڸ� ������ ������ �����Ϸ��� �ڵ����� �Ʒ��� �ڵ带 �����մϴ�.
	// public Car() {}
	// public Car(){Sout("������ ��������");}

}

class Car2 {
	String carname;

	public Car2() { // default constructor
		carname = "����";
	}

}

class Car3 {
	String carname;

	public Car3() {
		carname = "ī�Ϲ�";
	}

	public Car3(String name) { // ������ overloading
		carname = name;
	}
}

class Car4 {
	String carname;	//�ν��Ͻ� ���� -> ����Ʈ���� ������ �ִ�(�ʱ�ȭ�� �ƴ�)

	// default constructor �ڵ尡 ����
	// ���������� [overroaded ������]�� �����ߴٸ�, default �����ڴ� �ڵ����� ��������� �ʾƿ�
	// �������� ������ �Է��� �ǵ��� �˾�æ �����Ϸ��� ������ ����Ʈ �ȸ���
	// -> �������� �ǵ� : �ڵ����� ������ �� ������ �̸��� ��������.. �ȱ׷��� �� ����ϴ�.
	
	public Car4(String name) {
		carname = name;
	}

}

public class Ex16_Constructor {

	public static void main(String[] args) {

		Car c = new Car(); // Car();�Լ��� ȣ���ض�
		c.carname = "����"; // �ݵ�� �ڵ��ؾ߸� ������ �����Ѵ�>> �ڵ� �Ⱦ��� �䱸���� ����ġ!

		Car2 c2 = new Car2();
		System.out.println(c2.carname);

		Car3 c3 = new Car3();
		System.out.println(c3.carname);

		Car3 c4 = new Car3("���ο���");
		System.out.println(c4.carname);
		
		 
		Car4 c5 = new Car4("ī�Ϲ�"); //�̰� �ٷ� [������ ����]
		System.out.println(c5.carname);
		
		

	}

}
