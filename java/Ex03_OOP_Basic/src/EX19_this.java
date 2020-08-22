/*
this
1. ��ü �ڽ��� ����Ű�� this(������ ������ �ּҸ� ���� ���̶�� ����)
2. this ��ü �ڽ� (�����ڸ� ȣ���� �� �ִ�) > ��Ģ������ ���� �����ڴ� �ѹ��� �ϳ��ۿ� ȣ���� ����
	������ ���������� this�� ����ϸ� �������� �����ڸ� ȣ���� �� �ִ�!!

*/
class Test {
	int i;
	int j;

	Test() { // default ������ �Լ�

	}

	Test(int i, int j) { // Test(int k, int y){
		// ���� �ڵ�� ������ ������,
		// ������... > parameter �̸��� member field��� ����
		// Test(int i, int j) { } �� ������
		// >> This >> Test ���� ��ü�� �ּҸ� �޾ƿ� >> Test�� ������ �ִ� �ı���(�����)�� ����Ŵ
		this.i = i;
		this.j = j;
	}
}

class Book2 {
	String bookname;

	Book2(String bookname) {
		this.bookname = bookname;
	}

}

//*************************
//Today Point


class Socar {
	String color;
	String geartype;
	int door;

	Socar() { // �⺻ ����
		this.color = "red";
		this.geartype = "auto";
		this.door = 2;
	}

	Socar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}

	void print() {
		System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}

}

public class EX19_this {

	public static void main(String[] args) {
		Test t = new Test(10, 20);
		System.out.println(t.i + " , " + t.j);

		Book2 book = new Book2("����� ��������");
		System.out.println(book.bookname);

		Socar socar = new Socar();
		socar.print();

		Socar socar2 = new Socar("gold", "auto", 4);
		socar2.print();
	}

}
