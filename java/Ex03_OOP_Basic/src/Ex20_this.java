/*
원칙:생성자는 객체 생성 시 1개만 호출될 수 있다{ Car() or Car(10, 20) or ...}
	어차피 this가 객체를 가리킨다면서요?
	
아래의 코드를 보시고, 마음에 안드시는 부분이 있으면 이야기해 주세요!
>>	this.color = "red";
	this.geartype = "auto";
	this.door = 2;
	

*/
//리팩토링 : 기존에 만든 코드를 재수정하는 것
class Zcar {
	String color;
	String geartype;
	int door;

	Zcar() { // 기본 설정
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

	Zcar2() { //기본 생성자를 호출하면 red, auto, 1이 자동으로 생산되는 생성자
		this("red",1);
		System.out.println("default constructor");
	}

	Zcar2(String color, int door) {	//이걸 쓴다면 geartype을 auto로 가져가는 생성자함수
		this(color,door,"auto");
		System.out.println("overloading constructor param 2개");
	}

	Zcar2(String color, int door, String geartype) { //모든 걸 옵션으로 선택할 수 있는 생성자
		this.color = color;
		this.door = door;
		this.geartype = geartype;
		System.out.println("overloading constructor param 3개");
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
