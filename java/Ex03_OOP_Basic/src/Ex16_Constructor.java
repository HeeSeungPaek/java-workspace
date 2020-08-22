/*
생성자 함수 (Constructor)
1. 이 함수는 특수한 목적의 함수이다. [특수한 목적? : member field의 초기화]
	Tip) {일반 초기자 함수} / static{초기자 함수}도 가능하다. 하지만 생성자 함수가 일반적이다.
2.일반함수와 다른 점은?
	2.1) 함수 이름이 고정 (클래스 이름과 동일한 형태)
	2.2) 생성자 함수가 실행되는 시점 - 객체 생성 시(new) >> heap에 공간을 만들고 변수(memberfield) >> 자동으로 호출되는 함수
	2.3) 실행 시점때문에, return type이 없다. >> 다 void라는 얘기, 생략하는 걸 좋아함. >> void도 생략함> public ClassName(){ }
		>>public이 private으로 바뀌면 싱글톤이라는 친구로 바뀐다 (참고만)
3.목적 : 생성되는 객체마다 [강제적]으로 MemberField의 값을 초기화 할 수 있다.

ex)class Car{ String color; }

요구사항.. 자동차를 만들면 자동차는 무조건 색상을 하나 가져야 한다.
>>class Car{ String color= "blue"; } 

만약 요구사항.. 자동차를 만들면 자동차 하나의 색상을 가지는데 다른 색을 가질수도 있다.
>>class Car{ String color= "blue"; } >> new >> c.color="red"; 

class Car { 
	String color;
	public Car(String color){
		this.color = color;
	}
}

4.생성자 함수 (OverRoading이 가능!)

5.당신이 만약 overroading 생성자 함수를 하나라도 구현했다면 
  "default 생성자 함수"는 반드시 구현을 통해서만 사용 가능하다.

*/
//설계도의 의도 : 당신이 만약 자동차 만들면, 반드시 자동차의 이름을 부여하세요.
class Car {
	String carname;
	// 컴파일러가 알아서 만들어요 > 무엇을 : 함수를..
	// 개발자가 직접 생성자를 만들지 않으면 컴파일러가 자동으로 아래의 코드를 생성합니다.
	// public Car() {}
	// public Car(){Sout("생성자 강제구현");}

}

class Car2 {
	String carname;

	public Car2() { // default constructor
		carname = "포니";
	}

}

class Car3 {
	String carname;

	public Car3() {
		carname = "카니발";
	}

	public Car3(String name) { // 생성자 overloading
		carname = name;
	}
}

class Car4 {
	String carname;	//인스턴스 변수 -> 디폴트값을 가지고 있다(초기화가 아님)

	// default constructor 코드가 없네
	// 예외적으로 [overroaded 생성자]를 구현했다면, default 생성자는 자동으로 만들어지지 않아요
	// 개발자의 강제적 입력의 의도를 알아챈 컴파일러가 삐져서 디폴트 안만듬
	// -> 설계자의 의도 : 자동차를 생산할 때 무조건 이름을 넣으세요.. 안그러면 못 만듭니다.
	
	public Car4(String name) {
		carname = name;
	}

}

public class Ex16_Constructor {

	public static void main(String[] args) {

		Car c = new Car(); // Car();함수를 호출해라
		c.carname = "현대"; // 반드시 코딩해야만 조건을 보장한다>> 코딩 안쓰면 요구사항 불일치!

		Car2 c2 = new Car2();
		System.out.println(c2.carname);

		Car3 c3 = new Car3();
		System.out.println(c3.carname);

		Car3 c4 = new Car3("새로운차");
		System.out.println(c4.carname);
		
		 
		Car4 c5 = new Car4("카니발"); //이게 바로 [강제적 구현]
		System.out.println(c5.carname);
		
		

	}

}
