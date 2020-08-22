/*
��Ģ:�����ڴ� ��ü ���� �� 1���� ȣ��� �� �ִ�{ Car() or Car(10, 20) or ...}
	������ this�� ��ü�� ����Ų�ٸ鼭��?
	
�Ʒ��� �ڵ带 ���ð�, ������ �ȵ�ô� �κ��� ������ �̾߱��� �ּ���!
>>	this.color = "red";
	this.geartype = "auto";
	this.door = 2;
	

*/
//�����丵 : ������ ���� �ڵ带 ������ϴ� ��
class Zcar {
	String color;
	String geartype;
	int door;

	Zcar() { // �⺻ ����
		// this.color = "red";
		// this.geartype = "auto";
		// this.door = 2;
		this("red", "auto", 2);
		System.out.println("Default constructor");
	}

	Zcar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("Overloading constructor");
	}

	void print() {
		System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}

}

/////////////////////////////////////////////
class Zcar2 {
	String color;
	String geartype;
	int door;

	Zcar2() { //�⺻ �����ڸ� ȣ���ϸ� red, auto, 1�� �ڵ����� ����Ǵ� ������
		this("red",1);
		System.out.println("default constructor");
	}

	Zcar2(String color, int door) {	//�̰� ���ٸ� geartype�� auto�� �������� �������Լ�
		this(color,door,"auto");
		System.out.println("overloading constructor param 2��");
	}

	Zcar2(String color, int door, String geartype) { //��� �� �ɼ����� ������ �� �ִ� ������
		this.color = color;
		this.door = door;
		this.geartype = geartype;
		System.out.println("overloading constructor param 3��");
	}

	void print() {
		System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}

}
/////////////////////////////////////////////

public class Ex20_this {

	public static void main(String[] args) {

		Zcar zcar = new Zcar();
		zcar.print();

		Zcar zcar2 = new Zcar("blue", "manual", 10);
		zcar2.print();
		
		Zcar2 zcar3 = new Zcar2();
		zcar3.print();
	}

}
