/*
OOP 객체지향 프로그래밍  3대 특징-> 작은 프로그램을 만들기에는 설계시간이 많이 걸린다는 단점
1.상속	(==재사용성을 뜻한다.)	[캔커피 자판기와 자판기 공통기능을 가지는 빈 자판기 일화] == Loosly Coupled 추구하기에
														상속을 그닥 추구하진 않지만 알아야한다!
2.캡슐화	(==은닉화)	:	private ... setter..getter(직접할당을 막고 간접할당을 통해 데이터를 보호)
3.다형성	: 하나의 타입으로 여러개의 객체를 가질 수 있는 것()
>>재사용성, 은닉, 

3대특징에 이어지는 하부 특징들
//method overloading
하나의 이름으로 여러가지 기능을 하는 함수 
System.out.println(); >> println(); 오버로딩을 구현하고 있는 함수
오버로딩의 특징
1.오버로딩은 성능향상에 영향을 준다(x)
	>>메소드를 편하게 사용하기 위해 설계자가 배려 (개발자가 쓸 때 편하게 써라)
2.오버로딩 모르면 20개 메소드를 다른이름으로 만들면 되는거...
	>>그런데, 하나의 이름으로 만들어주면 편하지

그렇다면 문법적으로 어떻게 만들어야할까?
	>>함수 이름은 같고, 파라미터의 [갯수]와 [타입]을 달리해 만들면 된다.
1.함수이름은 같아야 한다.
2.parameter의 갯수 또는 타입은 달라야 한다.
3.return type은 오버로딩의 판단 기준이 아니다!
4.컴퓨터는 메소드의 [parameter의 순서]를 인지한다!

*/

class Human {
	String name;
	int age;
}

class OverTest {

	int add(int i) {
		return 100 + i;
	}

	// String add(int j) { //당연히 충돌이난다, 리턴타입은 신경쓰지않고, 파라미터가 같기 때문에.

	// }

	int add(int i, int j) {
		System.out.println("Overroaded : " + i + " , " + j);
		return i + j;
	}

	String add(String s) {
		System.out.println("Overroaded : " + s);
		return "hello" + s;
	}

	// --------------------------두 메서드 오버로딩 : 파라미터의 순서가 다름을 인정한다!--------
	String add(String s, int i) {
		return null;
	}

	String add(int i, String s) {
		return null;
	}
	// ---------------------------------------------------------------------------
	
	void add(Human human) {	//오버로딩
		human.name = "홍길동";
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
