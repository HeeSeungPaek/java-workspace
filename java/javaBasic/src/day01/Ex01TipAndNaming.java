package day01;

/*기초 팁
1.괄호 여닫이 확인하기
2.대소문자 구분하기 (파이썬은 대소문자에 연연하지 않지만 자바는 주의할 것)
3.자바 네이밍 - 공통 규칙
	> 50가지 예약어와 같은 변수생성 시 사용이 불가 (= 예약어 숙지 필요)
	- 이클립스 내 해당 예약어는 보라색으로 출력.(다크테마는 주황색)
	> 동일한 스코프 내 동일명으로 생성 불가
	> 한글, 특수문자 사용은 가능하지만 지양한다.
	> 첫글자 숫자는 x
	> 변수, 클래스, 메소드 = 낙타등 표기법 사용.
		※ 낙타등 표기법이란? : 첫글자는 소문자, 음절 추가 시 첫 글자 대문자로 표현
	> 더 이상 약어는 사용하지 않는다. Scanner 메소드 변수니까 sc라고 지으면 안된다는 말씀!
클래스 명명 규칙
	> 첫 글자는 무조건 대문자로 시작 (예 - Scanner 등)
	
변수 명명 규칙 [변수 : 해당 공간 내 값이 변할 수 있는 공간]
	> 첫 글자는 무조건 소문자로 시작 (예 - myNumber 등)
	
메소드 명명 규칙 [메소드 : 기능을 정의해놓은 공간]
	> 소문자로 시작하는 동사! (예 - println(), selectAll() 등)

상수 명명 규칙 [상수 : 한번 값이 결정되면 절대 바꿀 수 없는 공간]
	> 모든 글자를 대문자로, 음절 띄울 땐 언더바(_)사용한다. (예 - PI, UNIT_PRICE 등) 
*/
public class Ex01TipAndNaming {
	public static void main(String[] args) {
		/*데이터타입 -> 기본형 데이터타입(primitive)과 참조형 데이터타입(reference)으로 나뉜다.
		  
		기본형 데이터타입 8가지 
		>정수형 : byte short int long 
		(예전과 달리 리소스 절약 측면에서 널널해져, 자바에서 정수형은 int로 인식.
		정수형 범위를 벗어나면 over,underflow 버그 발생
		2진법 숫자 최상위 비트가 0이면 양수, 1이면 음수)
			-byte : 총 2^8개 (256개), 범위 : -2^7 ~ 2^7-1
			-short :총 2^16개 , 범위 : -2^15 ~ 2^15-1
			-int : 총 2^32개 , 범위 : -2^31 ~ 2^31-1
			-long : 총 2^64개, 범위 : -2^63 ~ 2^63-1
	 	>실수형 : float double
		>문자형 : char
		>논리형 : boolean
		*/
		
		//데이터타입 변수명 =(할당연산자 사용) 값; 으로 변수를 생성한다.
		byte myByte;
		myByte = 127;
		System.out.println("myByte의 현재값 : " + myByte);
		
		//myByte에 127+1 값을 강제로 넣어보자, 만약 데이터타입과 안맞는 값을 넣으면 형변환을 해줘야 할 수도 있다.
		myByte = (byte)128;
		System.out.println("myByte의 현재값: " + myByte);
		//이렇게 최대범위를 벗어나 오히려 음의 정수로 바뀌는 것을 Overflow!
		
		myByte = (byte)-129;
		System.out.println("myByte의 현재값: " + myByte);
		//반대로 최소 범위를 벗어나면 오히려 양의 정수로 바뀌는 것을 Underflow!
		
		//하지만 이제는 자바가 자동으로 int형을 사용하기 때문에 우리도 int형 변수를 사용하면 방금의 문제에 대해 자유롭지만
		//매우 큰 수 (약 15억 이상)일 경우에는 long 자료형을 사용하는 것을 권장한다.
		
		//실수형은 자바에서 double이 기본형이다.
		double myDouble = 3.141592;
		System.out.println("myDouble: " + myDouble);
		
		//만약 float 자료형을 써야하는 상황이 온다면 실수 맨 마지막에 f를 써서
		//해당 실수가 float형인 것을 표시해주면 된다!!
		float myFloat = 3.1f;
		System.out.println("myFloat: " + myFloat);
		
		//char는 character의 준말, 딱 한 글자(알파벳 || 특수문자)만 들어갈 수 있다.
		//char자료형 변수 선언 시 값에 '' 필수.
		char myChar = 'A';
		System.out.println("myChar: " + myChar);
		myChar = '1';
		System.out.println("myChar: " + myChar);
		
		
		//기본형 데이터타입의 특징은 해당 위치에 값이 이진법으로 들어가있다는 것이 특징 글자인 char나 
		//true/false값이 나오는 불린도 2진법 숫자가 들어가 있다.
		boolean myBoolean = true;
		System.out.println("myBoolean:" + myBoolean);
		
		//char의 경우 아스키코드와 대조되는 값을 가진 문자를 보여준다.(A=65,a=97)
		myChar = 'A'+32;
		System.out.println("myChar 'A'+32 : " + myChar);
		
		
		//▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
		/*참조형 데이터타입은 크게 3가지로 분류한다.
		 *1. 클래스형 변수(=객체)
		 *2. 인터페이스형 변수
		 *3. 배열형 변수
		 *  */
		
	}
}
