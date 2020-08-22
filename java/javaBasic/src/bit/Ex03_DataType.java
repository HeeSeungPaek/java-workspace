package bit;
/*
1.자바가 제공하는 기본 타입(시스템 타입), 자료형 >> 8가지 기본 타입 제공
2.8가지 기본타입은 '값을 저장'하는 타입이다.
3.숫자 > 정수 > 음,0,양 
byte (-128 ~ 127) char short int*** long
4.float double -> double은 자바 실수연산의 기본타입이다.***
5.boolean > 논리 참, 거짓을 true,false로 ==> (프로그램의 논리적인 흐름을 제어할때 사용된다)
***문자열 : String "홍길동", "hello" >> 클래스 타입(참조 타입) >> 그럼에도 불구하고...
다른 이야기를 하기 전까지 String은 기본타입으로 생각하고 공부한다.

자바는 크게
1. 값 타입				 :8가지 기본타입: int i = 100;							 - value type
2. 참조 타입 (주소값을 저장하는):클래스, 배열: 변수에 값이 저장되는 것이 아니라 주소값이 저장(참조값) - ref type
  >>힙 메모리에 있는 객체의 주소값을 가진다.
 */
// class = 설계도 == 타입(Type)
class Car{ // Car 타입, Car 설계도, Car 클래스이다 >>> 이걸가지고 구체화된 산물을 만든다 >> 객체화(메모리) >> 
	String color; //인스턴스 변수 == 멤버 필드
	int window;
}

public class Ex03_DataType {

	public static void main(String[] args) {
		String str="홍길동";
		int age = 100;
		
		Car c;//c는 메인함수의 지역변수 -> 초기화를 해야 쓸수 있다 왜? 지역변수니까
		//default 실행시 할당공간은 4byte
		//c라는 변수의 초기화의 뜻은? :주소를 가지게 하는것 >> new 연산자를 통해 만들어진 [new 연산자]를 통해서 만들어진 [주소]가 할당되게 하는 것
		c = new Car();
		System.out.println(c);//bit.Car@15db9742
		
		//선언과 초기화
		//참조타입의 초기화라는 것은, 주소값
		Car c2 = new Car();
		c2.window = 100;
		c2.color = "blue";
		
		int i = 10;
		int j;
		j = 20;
		
		int k;
		k = j;//point 값 할당
		System.out.println("k"+k);
		k = 300;
		System.out.println("j"+j);
		
		//int p, g, q; // 이런경우라면 Array : int[] arr = new int[3]; arr[0] = 1;...
		
		//int (-21억 ~ 21)
		//Today Point
		//literal >> 있는 그대로
		//정수 리터럴 : [기본값 default는 int 범위]
		//int p = 10000000000;
		/*
		 * long l = 10000000000L; long l2 = 100;
		 * 
		 */
		//char : 2byte 정수값 - 한 문자를 표현하는 자료형
		//Today Point
		//문자열 " "
		//문자 ' '
		//캐스팅 -> 타입변환
		int intch = 'a'; //implicit cast == 자동
		System.out.println(intch);
		char ch = 'a';
		System.out.println((int)ch);
		
		int intch3 = 999999996;
		char ch3 = (char)intch3;
		System.out.println(intch3);
		//속 지 말 자 -> [값을 보지 말고 값이 가지는 타입을 보자]
		//강제적 형변환 = 명시적 형변환
		//key point:65라는 숫자가 다행히도 char타입에 속하는 경우
		//데이터의 손실이 없이 할당
		//int intch3=999999999;
		//큰 것을 작은 것으로 강제 형변환하면 [데이터손실 발생]
		
		int intch4 = ch3; //컴파일러가 자동으로 형 변환 -> 컴파일러가 코드 재생산함.
		
	}
	
}
