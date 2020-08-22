/*
OOP ��ü���� ���α׷���  3�� Ư¡-> ���� ���α׷��� ����⿡�� ����ð��� ���� �ɸ��ٴ� ����
1.���	(==���뼺�� ���Ѵ�.)	[ĵĿ�� ���Ǳ�� ���Ǳ� �������� ������ �� ���Ǳ� ��ȭ] == Loosly Coupled �߱��ϱ⿡
														����� �״� �߱����� ������ �˾ƾ��Ѵ�!
2.ĸ��ȭ	(==����ȭ)	:	private ... setter..getter(�����Ҵ��� ���� �����Ҵ��� ���� �����͸� ��ȣ)
3.������	: �ϳ��� Ÿ������ �������� ��ü�� ���� �� �ִ� ��()
>>���뼺, ����, 

3��Ư¡�� �̾����� �Ϻ� Ư¡��
//method overloading
�ϳ��� �̸����� �������� ����� �ϴ� �Լ� 
System.out.println(); >> println(); �����ε��� �����ϰ� �ִ� �Լ�
�����ε��� Ư¡
1.�����ε��� ������� ������ �ش�(x)
	>>�޼ҵ带 ���ϰ� ����ϱ� ���� �����ڰ� ��� (�����ڰ� �� �� ���ϰ� ���)
2.�����ε� �𸣸� 20�� �޼ҵ带 �ٸ��̸����� ����� �Ǵ°�...
	>>�׷���, �ϳ��� �̸����� ������ָ� ������

�׷��ٸ� ���������� ��� �������ұ�?
	>>�Լ� �̸��� ����, �Ķ������ [����]�� [Ÿ��]�� �޸��� ����� �ȴ�.
1.�Լ��̸��� ���ƾ� �Ѵ�.
2.parameter�� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
3.return type�� �����ε��� �Ǵ� ������ �ƴϴ�!
4.��ǻ�ʹ� �޼ҵ��� [parameter�� ����]�� �����Ѵ�!

*/

class Human {
	String name;
	int age;
}

class OverTest {

	int add(int i) {
		return 100 + i;
	}

	// String add(int j) { //�翬�� �浹�̳���, ����Ÿ���� �Ű澲���ʰ�, �Ķ���Ͱ� ���� ������.

	// }

	int add(int i, int j) {
		System.out.println("Overroaded : " + i + " , " + j);
		return i + j;
	}

	String add(String s) {
		System.out.println("Overroaded : " + s);
		return "hello" + s;
	}

	// --------------------------�� �޼��� �����ε� : �Ķ������ ������ �ٸ��� �����Ѵ�!--------
	String add(String s, int i) {
		return null;
	}

	String add(int i, String s) {
		return null;
	}
	// ---------------------------------------------------------------------------
	
	void add(Human human) {	//�����ε�
		human.name = "ȫ�浿";
		human.age = 100;
		System.out.println(human.name + "," + human.age);
	}
}

public class Ex14_Method_Overroading {

	public static void main(String[] args) {

		OverTest ot = new OverTest();

		int result = ot.add(100, 200);
		System.out.println(result);

		String str = ot.add(" world");
		System.out.println(str);
		
		Human h = new Human();
		ot.add(h);
		System.out.println(h.name);

	}

}
