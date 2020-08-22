package kr.or.bit;
//class == 설계도 == 데이터 타입
//설꼐도는 구체화(메모리)를 통해서 객체 생성
//구체화 된 것 : 객체, 인스턴스
//설계도 : 필드(고유, 상태, 부품) + 함수 ... + 생성자
//속성(정보를 담을 수 있는 것,곳) + 기능(행위)

//여태까지 변수/타입/연산자/제어문 했습니다~
//제어문은 암기!
//oop를 배우는 이유 : 설계도를 잘 그리기 위해~

public class Person {
	
	
	//모든 클래스의 기본타입은 null;
	public String name; 	// 기본값 : null
	public int age;			// 정수 : 0
	public boolean power;	// 불린 : false
	//멤버 필드(Member Field) >> (객체의 것 = Instance Variable)
	//이 녀석들의 특징 : 초기화하지 않아도 된다. >> default값을 가지고 있다. >> 초기화 (변수가 처음으로 값을 할당 받는 것)
	//문법적인 의미보단, 의미론적으로 초기화를 하지 않는 이유가 있다.
	//초기화 하지 않는 이유 : 이 설계도를 가지고 다양하게 사용하기 위해서이다.
	//강사님 말>> [생성되는 객체 (사람) 마다] [다른 이름을 가지기 때문에]
	//Person p = new Person(); p.name = "김똥깨"; p.age 출력하면 >> 0
	//Person p = new Person(); p.name = "장자하";
	//초기화하느냐 하지 않느냐는 그 클래스를 사용하는 사람마다마다 사용방법을 정하고 쓰기 때문!
	
	//함수생성 (기능, 행위, 메소드)
	public void personPrint() { //사람의 정보를 출력하는 기능을 만들어보자
		System.out.println("name: " + name + " age: " + age + " power: " + power);
	}
	
	
}
