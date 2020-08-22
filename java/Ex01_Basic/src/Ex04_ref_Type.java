/*
클래스는 설계도이다, 클래스는 타입이다
클래스 == 설계도 == 타입
클래스는 구체화를 통해서 사용한다(집을 짓는 행위)
프로그램 세계에서는 new 연산자를 통해서 memory안에 집을 짓는다 >> 만든 것(객체:인스턴스)
용어에 너무 빠지지 말자

설계도 2가지
1. main 함수(메소드)를 가지고 있는 설계도 >>독자적으로 실행이 가능한 클래스
>>java Ex04_Ref_Type >> 실행 가능하다!

2. main 함수 없는 클래스(설계도) >> 도와주는 역할 >> 라이브러리(lib) 클래스라고 부른다. 
   >> 라이브러리가 모이면 Framework가 된다

*/

/*class Apt{ //이 공간(default package)안 같은 이름의 클래스가 올 수 없다
	
}*/

class Apt2 {
	int door = 10; // member field or instance variable
	int window = 20; 
}

public class Ex04_ref_Type { //참조 타입에 대하여..
	
	public static void main(String[] args) {
		//Apt2 설계도 >> 구체화 == 메모리에 올린다! >> new연산자를 이용해서 올린다
		//클래스의 초기화라는 것은 주소값을 갖는 것이다. == 메모리를 만든다
		//new Apt2()의 괄호는 default Constructor(기본 생성자)
		Apt2 lgapt = new Apt2();
		//Apt2 lgapt(참조 변수 == reference == 객체변수 == 주소를 가지고 있는 변수)
		System.out.println("lgapt = " + lgapt); //Apt2@15db9742 -> 클래스이름 @ 주소값(주소값을 문자열로 해독해 반환)
		//call stack에 main함수가 올라가고 그 속에 기본 데이터 크기 4byte상의 lgapt가 올라가고, 객체가 생성되면서 heap영역에
		//Apt2와 Apt2의 주소가 자동 생성
		
		Apt2 ssapt = lgapt; //할당이라는 것도 주소를 가지게하는 방법 중 하나이다 == 초기화하는 방법 중 하나!
		//우리가 만드는 모든 클래스는 기본적으러 무언가을 물려받는다. 그 곳은 바로 java.lang.Object! >> 모두의 어머니 >> 상속의 기초
		//== inheritance >> 상속! 그래서 우리가 만든 객체에 점 연산자를 찍으면 엄마로부터 상속받은 것들이 나온다.
		ssapt.door = 1000;
		
		System.out.println(lgapt.door); //그래서 lgapt.door 가 100개
	}
	
}
