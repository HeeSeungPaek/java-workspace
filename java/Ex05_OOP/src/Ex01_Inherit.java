/*
****************************�ܿ���*********************************
OOP Ư¡
	1.���
	2.ĸ��ȭ (����ȭ) >> private
	3.������ (Polymorphism)
	
	1.��� ����� ��
	java: child extends Base / c# : child : Base
	
	2.Ư¡
		1)���� ����� �Ұ�.
		2)���� ��Ӹ� ����! (��, ������ ��� : �̰��� ���ؼ� �������� Ŭ������ ����� �� �ֽ��ϴ�.)
		3)���߻���� �����ϴ°� �ٷ� �������̽�
		
	3.����� �ǹ�
		1)������ �ǹ� : ���뼺
		2)���� : �ʱ⿡ ���� ����� ���� ���.(�������̽� �����, �پ��� �������� ����ٺ���, ����� ���� ����µ� ���� �ð��� ���� �ɸ���)
		3)���뼺�� �ᱹ ����ܰ迡�� ������� ��Ұ� ���� ������(�ð��� ������ ���� �ڿ��� ����� ��[�и�or�߻�ȭ])
		
	4.��� ������ ��  Memory������ ��� �ɱ�?
		GrandFather -> Father -> Child
		
	>>����ڰ� (�����ڰ�) ����� ��� Ŭ������ default��(������� �ʾƵ�) Object��� Ŭ������ ����Ѵ�!
	if> class Car extends Object�� �����Ǿ��ִ°�! Object�� �ܱ��̴�. >> Object�� ��� Ŭ������ Root(�ֻ��� Ŭ����) >> ��� Ŭ������ �θ� Ŭ����
**************************�ܿ���*********************************
 */

class Car extends Object {
	
}

class GrandFather extends Object {
	public int gmoney = 5000;
	private int pmoney = 10000;	//private�� �޸� ���ٺҰ� (��ü, ��Ӱ���) : ���ο���

	public GrandFather() {
		System.out.println("�Ҿƹ���");
	}
}

class Father extends GrandFather {
	public int fmoney = 3000;

	public Father() {
		System.out.println("�ƹ���");
	}
}

class Child extends Father {
	public int cmoney = 1000;

	public Child() {
		System.out.println("�ڽ�");
	}
}

public class Ex01_Inherit {

	public static void main(String[] args) {

		Child child = new Child();
		System.out.println(child.gmoney); // �Ҿƹ��� ���� ����
		System.out.println(child.fmoney); // �ƹ��� ���� ����
		System.out.println(child.cmoney); // ���͵� ���
		
		Car car = new Car();

	}

}



























