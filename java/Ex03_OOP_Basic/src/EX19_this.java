/*
this
1. 객체 자신을 가르키는 this(앞으로 생성될 주소를 담을 곳이라고 가정)
2. this 객체 자신 (생성자를 호출할 수 있다) > 원칙적으로 보면 생성자는 한번에 하나밖에 호출을 못함
	하지만 예외적으로 this를 사용하면 여러개의 생성자를 호출할 수 있다!!

*/
class Test {
	int i;
	int j;

	Test() { // default 생성자 함수

	}

	Test(int i, int j) { // Test(int k, int y){
		// 위의 코드는 문제가 없으나,
		// 가독성... > parameter 이름을 member field명과 같이
		// Test(int i, int j) { } 로 만들어라
		// >> This >> Test 본인 객체의 주소를 받아옴 >> Test가 가지고 있는 식구들(멤버들)을 가리킴
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

	Socar() { // 기본 설정
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

		Book2 book = new Book2("충실히 이행하자");
		System.out.println(book.bookname);

		Socar socar = new Socar();
		socar.print();

		Socar socar2 = new Socar("gold", "auto", 4);
		socar2.print();
	}

}
