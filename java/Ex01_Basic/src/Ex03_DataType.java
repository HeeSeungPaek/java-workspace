/*
1. 자바가 제공하는 기본타입(시스템타입)자료형>>8 가지 기본타입 
2. 8 가지 기본타입은 값을 저장하는 타입이다.
3. 숫자>>정수>>(음의정수,0,양의정수)>>byte(=8 bit)(-128~127)
>>char:한 문자를 표현하는 타입 
ex_'A','가'>>>한글 1 자:2 
byte>>>영문자,특수문자,공백:1 
byte>>>협의함->char 타입 하나 만들어서 2 byte로 정의해서 이안에 한글 영문 특문 공백 상관없이 한글자 넣자
>>>국가간 협의(unicode)>>아스키 코드표>>
short:언어간(c언어와)호환성을 위해 만들어 놓은거 별로 안씀 2 byte
>>int:(-21 억~21 억:4 byte)**Java 정수의 기본타입**
>>long:(8 byte)int 보다 길다는 거 만 알고있으면 됨
>>실수(부동소수점)>>float(4 byte)>>double(8 byte)>>정밀도가 높다=표현 범위가 크다**Java 실수의 기본타입**
4. 논리>>참 거짓으로 나뉘는거 ture or false>>boolean(프로그램에 논리적인 흐름제어)

========================문자열 표현=====================================
"홍길동"or"HelloString name="홍길동";
>>String 은 클래스 타입(참조타입)그럼에도 불구하고 다른이야기를 하기전까지는 String은 문자열을 저장하는 기본타입으로 본다.
int double 처럼 사용하라!
====================================================================

=>총 9 가지로 일단은 생각

자바는 크게 
1. 값타입:8 가지 기본타입-value Type 
2. 참조타입(주소값):클래스,배열=>변수에 값이 저장되는게 아니라 주소값(참조값)이 저장되어 있다.-reference Type(=ref Type)
*/

// class == 설계도 == 타입(Type)
class Car { // Car는 Type이고 설계도이다. >> 구체화된 산물 >> 객체(메모리)

	String color;
	int window; // 창문의 개수

	void printColor() {
		System.out.println(color);
	}

}

public class Ex03_DataType {
	public static void main(String[] args) {

		String str = "홍길동";
		int age = 100;

		Car c; 
		// c는 main 함수 안에 있는 지역변수 -> 선언
		// System.out.println(c); 이렇게 하면 지역변순데 초기화 안해서 못함
		// 이렇게 하면 stack에 c라는 4byte 공간이 생김 근데 아직까진 아무것도 없음(초기화가 안됨)

		// 그럼 클래스변수의 초기화하는 방법은?
		// 주소를 갖게 하는것 == new 연산자를 통해서 만들어진 주소가 할당 된게 하는것

		c = new Car(); // ()는 생성자를 호출하게 하는것 A=B일때 B가 실행돼서 A에게 할당한다. -> 할당
		// 초기화 됨
		// 이제 heap 에 car 공간 생기고 string type color공간, int type window 공간 생김
		// 만들어진 공간에 대한 주소값을 c에 할당해줌
		// 그럼 비어져있는 stack에 있는 c에 주소값이 들어가는거임
		System.out.println(c); // 이제 주소값이 나옴 Car@15db9742

		// 선언과 초기화를 한꺼번에하면
		Car c2 = new Car();
		// stack 에 c2 만들고, heap에 car만들어서 주소값을 c2에 넣어줌

		// <정리>
		// 참조타입의 초기화는 주소값을 가진다.

		c2.window = 100;
		c2.color = "blue";

		int i = 10;

		int j;
		j = 20;

		int k;
		k = j; // 이 할당은 주소할당이 아니라 point 값 할당한거임
		System.out.println("k : " + k);

		k = 300;
		System.out.println("k : " + k);
		System.out.println("j : " + j);

		// int p, g, q;
		// 이런 경우라면 Array : int[] arr = new int[3]; arr[0]=1; ....

		// int (-21억 ~ 21억)

//===============Today Point==================
		// literal : 있는 그대로
		// 정수 literal : 기본값 default 가 int 범위이다.
		int p = 1000000000;

		long l = 10000000000L;
		// long이 100억을 받을 수는 있다
		// 즉 , 할당의 문제가 아니라 자바가 문자그대로의 정수로 인식하는거는 21억까지라서
		// 21억 이상 숫자 그대로 쓰려면 long 변수를 쓸때 뒤에 L을 붙혀 줘야한다.

		long l2 = 100; // 그냥 가능
//============================================

		// char : 2byte 정수값
		// 한 문자를 표현한는 자료형

//=====================================Today point====================================
		// 문자열 : "가", "홍길동" >> String str = "가나다라마바";

		// 문자(하나) : 'A' , '가' >> char ch = 'A';
		char single = '가';
		System.out.println(single); // char는 정수값을 가지는데 single 출력시 가 나오는게 print특성때문임
		char ch = 'A';
		System.out.println(ch); // char는 문자를 저장하지만 내부적으로 정수값을 가지고 있다.

		// 아스키 코드표에서 정수값을 16진법으로 바꿔서 숫자에 대응되는 문자를 출력해 내는거
		// 대문자 A 는 10진수로 65 소문자 a는 10진수로 97이다

		// casting (타입 변환)
		int intch = 'A'; // 내부적으로 자동(암시)적으로 형 변환이 일어난 것

		System.out.println("intch : " + intch);
		System.out.println((int) ch); // 정수값으로 ch를 바꿔서 출력하겠다 = 65

		// 사실상 int intch = (int)'A'; 이런식으로 해야하지만 자바가 눈치껏 지가 알아서 바꿔주는거

		char ch2 = 'a';
		System.out.println(ch2);
		int intch2 = (int) ch2;
		System.out.println(intch2);

		// 반대로는??
		int intch3 = 65;
		char ch3 = (char) intch3; // 그냥은 안됨 (char)을 붙혀 줘야함
		System.out.println(ch3);
		// 속지말자 값을 따라가지 말고 값이 가지는 타입을 따라가서 확인하자.
		int intch4 = 999999989;
		char ch4 = (char) intch4;
		System.out.println(ch4); // 이렇게 출력하면 char 수용범위를 넘어가기 때문에 컴터가 짜름
		// 강제적 형변환 (명시적 형변환)

//**** Key Point *** : 65라는 숫자가 char 타입에 속하는 경우 데이터 손실없이 할당가능		

		// 큰거를 작은걸로 강제로 바꾸면 데이터 손실이 일어난다. 감수하면 OKAY

		int intch5 = ch3; // 컴파일러가 형변환을 자동으로 해줌 = 자동형변환 int intch5 = (int)ch3 으로 컴파일러가 재생성함
		System.out.println(intch5);
//==================================================================================

		/*
		 * Day 4
		 * 
		 * Today Point 1. 할당에서 변수가 갖고 있는 값을 보지 말고 변수의 타입과 크기를 확인하자\ 2. 큰 타입에는 작은 타입을 넣을
		 * 수 있다. 3. 작은타입에는 큰 타입을 못 넣는다 (casting 해서 넣으면 데이터 손실) char <- int >>>> char <-
		 * char(int) => 데이터 손실남 int <- char >>>> in <- char => 실행하면 내부적으로 컴파일러가 int <-
		 * (int)char 로 변환 실행
		 * 
		 * 
		 */
		int intvalue = 930306;
		byte bytevalue = (byte) intvalue;
		System.out.println("bytevalue : " + bytevalue); // => 원하지 않는 값이 나옴(쓰레기)

		// 이런게 아니라
		int intvalue2 = 93;
		byte bytevalue2 = (byte) intvalue;
		System.out.println("bytevalue2 : " + bytevalue2); // => 원하는 값이 나옴

		// 때에 따랏서 손실되지 않는 원하는 값이 나올 수 있다.

		// String(문자열)
		String name = "Hello world";
		System.out.println(name);

		String name2 = name + " 방가방가 ";
		// + 연산자가 문자열 사이에 있으면 변수와 결합하여 주지만, 숫자 사이에 있으면 산술 연산자로서 역할을 함
		System.out.println(name2);
		// ======================Tip==============================
		// DB (Oracle) >> + : 연산자(산술) , || : 결합연산자 => '안녕' || '방가'

		/*
		 * Java 특수문자 이스케이프 문자 >> 특정문자 앞에 \(역슬러쉬) 하기되면
		 */

		char sing = '\'';
		// '(single Quotation) 하나를 표현하고 싶다! => 역슬러쉬 문자와 결합하여 사용하면 문자로 인식해줌
		System.out.println(sing);

		// 홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력하고 싶다!
		String name3 = "홍\"길\"동";
		System.out.println(name3);

		String str3 = "1000"; // 숫자 1000 아님!! 문자열 1,0,0,0임
		String str4 = "10";

		String result = str3 + str4; // 문자열 100010이 나옴

		System.out.println(result);

		// 문자열 + 숫자 => 문자열

		// C:\temp 문자열을 화면에 출력

		System.out.println("C:\\temp"); // \t : 기본적으로 tab을 의미 \n : 기본적으로 줄 바꿈
		// \t 를 만나 지금 tab으로 인식 => \\을해줘야 (\\)t 느낌으로 해서 \t를 문자그대로 출력함
		String path = "C:\\temp";
		System.out.println(path);

		// 실수형(부동소수점) : 정확한 수를 표현하지는 않음
		// float (4byte) > int(4byte)
		// double (8byte)
		// 실수 literal의 기본타입은 double이다.

		float f = 3.14f; // 그냥 문자그대로 3.14 치면 기본적으로 double타입에 담기 때문에 정수 long에 int를 넘치는 수를 넣을때처럼
		// 3.14를 float그릇에 담으려면 casting 또는 접미사 f or F를 붙혀주면 된다
		float f2 = (float) 3.14;

		float f3 = 1.123456789f;
		System.out.println("f3 = " + f3);
		// f3 = 1.1234568 소수점 8째자리에서 반올림 해서 소수점 7자리 표현함
		// 반올림이 default

		double d = 1.123456789123456789;
		System.out.println("d: " + d);
		// d: 1.1234567891234568 소수점 17째자리에서 반올림 해서 소수점 16자리 표현
		// 반올림이 default

		System.out.println((byte) 128);
		// byte -128~127까지 범위
		System.out.println((byte) 129);
		// 양수에 한해 127로 나눠 나머지가 1이면 다시 -128부터 시작한다

		double d2 = 100;
		// 소수점까지 표기하는게 정확한 표현
		// 그냥 100만 표기하면 컴파일러가 알아서 암시적으로 형변환을 함
		System.out.println(d2);

		double d3 = 100;
		int i5 = 100;

		int result2 = (int) d3 + i5;
		// 오류가 안나게 하려면
		// 1. int result2 = (int)(d3+i5) => 이렇게하면 double을 int로 강제로 바꿧기 때문에 소수점이 있다면 손실 날
		// 수 있다.
		// 2. double result2 = d3 + i5; 도 가능 => 이방법이 모든 수를 표현 할 수 있기때문에 더 적합함
		System.out.println(result2);

		/*
		 * ====================================Today
		 * Point=================================
		 * 
		 * 작은타입 + 큰타입 = 큰타입 타입간 변환 => 변수가 갖는 값을 보지말고 변수의 타입을 보고 판단하자. 필요하다면 명시적
		 * 형변환(casting)을 통해서 변환하지만 손실분에 대해 고민하자
		 * 
		 * =============================================================================
		 * =
		 */

		int i6 = 100;
		byte b2 = (byte) i6;
		// 명시적 형변환을 해주거나 아에 b2의 타입을 int로 바꾸자!

	}
}
