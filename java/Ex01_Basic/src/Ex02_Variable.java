//라인주석
/* 
 * 블럭주석
  
  -클래스의 종류
 	-- class Test {} 이런설계도는 독자적으로 실행이 불가능함 >> 다른 클래스(설계도) 참조하는 클래스 : main함수가 없는클래스
 	=>  참조해서 다른 클래스를 도와주는 역할을 함 = lib(library) 라고 부름 
  	-- class Test { public static void main(String[] args){}   } 이렇게 만들면 >> 실행 가능한 클래스
 	-- static void main(String[] args) >> main 이름을 가지는 함수 >> 프로그램 진입점, 시작점 (약속임)
 ====================
 Tip) 
 c# : static void Main(){}
 ====================
 변수 : variable
 	definition)_ 데이터(자료)를 담을 수 있는 공간의 이름
 	=> 공간이 있으려면 크기가 있어야함 => 공간의 크기 : type (자료형)
 	
 데이터 타입
 primitive type (java 태어날때 원래 갖고 있는 애들)
  * int, double, float...
  * char : 하나당 그냥 2바이트 안에 한글, 영어를 모두 표시함
  * boolean : 참 거짓 true false 로 표현가능한거
 => 이런게 8개가 있음
 
 reference type (내가 만드는 타입들)
  * class type(클래스타입) (ex/이름, 성별, 나이 등을 지정)
 	=> 누구의 이름이고 어떤사람의 성별 인지 모름
 	=> 여러개의 다른 타입들을 모아놓은 의미있는 집함.
 
 데이터 타입 변수명 >> int i = 100;
 
 변수가 선언되는 위치 (scope : 유효범위)
  1. instance variable : 객체 변수 >> class Person {int age;} 라고 하면 age가 instance variable이다. => instance variable은 초기화값이 필요X
  2. local variable : 지역 변수 ( 지역: 함수 안_밖) >> class Person{public void run() {int speed}} 
  	 여기서 speed는 class 안이 아니라 함수 안에 들어있음 => 함수가 실행되면 만들어 졌다가 함수가 끝나면 다시 소멸됨.
  	 하지만 instance variable 은 함수가 끝나도 계속 있음
  3. 함수 안에 제어문을 쓸 수 있음 (ex_if 블럭, for블럭) 제어문 안에 있는 변수도 있음.이런 아이들은 블럭 안에서만 유지 된다.
  4. static variable : 공유자원 (객체간)
  
 
============================================
하나의 물리적인 자바파일에 여러 클래스를만드는것은 좋지않은 방법 
둘중 하나가 main 함수를 갖고 있는다면 출력하는데는 문제 없음
============================================
 */

// class 는 설계도이다 == class Type이다 (여러개의 의미있는 작은 타입을 가지는 큰 타입) == 사용자 정의타입
class Test {
	int iv = 100; // instance variable
	// int iv; 이런식으로 하면 초기화 값이 없음 => instance variable 은 초기화 값이 필요없다
	// (내부적을 기본값을 갖고있음 : default)
	// 정수의 기본값은 = 0 실수의 기본값은 0.0 boolean의 기본값은 false <모든 프로그램언어는 부정적이다>
	int window;
	// 초기화란 변수가 처음 값을 갖는 것 (할당을 통해서)

	// 질문 : 왜 window변수(아파트의 창문의 개수를 갖는 변수라 하자)는 초기화를 하지 않아도 사용 가능 할까?
	// hint) 설계도는 하나인데 설계도를 기반을 아파트를 여러개 짓고 아파트마다 창문의 개수는 다를 수 있다.
	// => 아파트(객체) 마다 창문의 개수는 다르게 가져가려고

	// main 함수 안에 들어있는
	// Test 삼성아파트 = new Test();
	// 삼성아파트.window = 4;

	// Test 현대아파트 = new Test();
	// 현대아파트.window = 2;
	// 이런식으로 객체마다 하나의 설정해놓은 변수로 다르게 선언해서 쓸 수있다.

	// 프로그램이 실행 되면 stack에 공간이 할당되고 거기에 삼성아파트 공간이 생기고 new를 만나 heap에 공간을 만듦
	// 그 공간안에 iv=500이 있고 window =0의 공간이 생기고 주소 256번지 생김
	// 이때 삼성아파트.window =4;가 돌아가면 256번지로 찾아가서 window 값을 4로 바꿈

	// stack 에 현대아파트공간 생기고 ->...-> window 값을 2로 바꿈

	Test() { // 생성자 함수 (특수한 함수 _ 원래 함수는 이름을 불러야 시작이 됨 _ 근데 이름을 부르지 않아도 시작 됨)
		// => 객체가 생성될때 자동으로 호출되는 함수 _ 객체 생성과 동시에 생성되는 함수 : constructor
		System.out.println("나는 생성자");

		// 밑에 Test t = new Test(); 라고 객체를 생성 하자마자 자동으로 System.out.println("나는 생성자") 가
		// 실행이됨
		// 따로 실행할 필요 없음.
	}

	Test(int data) {
		// 오버로딩(overloading) 똑같은 생성자 함수지만 여기다가 parameter(data) 를 태워서 다르게 만들 수 있음
		// => 하나의 이름으로 여러가지 기능을 수행
		// 자동으로 호출되는 함수 :아파트가 지어질때 ( 객체가 생성될때)
		window = data; // 창문의 강제 초기화
	}
	//오버라이딩 = 상속받아 재정의 하는 것

	// => 현재까지 생성자가 총 2개가 있음

	void wirte() { // 기능, 행위를 하는 함수 method 이며 void는 return하지 않는 명령어
		// 앞에 void 가 있고 ()안에 아무것도 없으면 아무나 할 수 있고 결과값이 없는 게임기 같이 실행되는거

		int num; // 지역 변수(local variable)선언
		// write함수가 가 호출되면 생성되고 함수가 종료되면 같이 메모리에서 사라진다.
		// num은 지역변수인데 지역변수를 사용하고 싶다면 사용하기 전, 반드시 초기화를 해야한다.
		// 하지만 초보자는 처음에 하자마자 바로 초기화를 시작하자!!!
		num = 100;
		System.out.println(num);

		int age = 99;
		System.out.println(age);

	}

	void print() { //창문의 개수를 출력하는 메소드
		
		// 안에서 age 변수 사용할 수 있다 없다?
		// 없다 (위에 write함수가 종료되면 age 가 같이 종료 됨)
		// System.out.println(age); => 사용불가
		System.out.println(window); // window 는 scope가 class전체여서 가능

	}

}

class Apt {
	
	int window;

}

public class Ex02_Variable { // Ex02_Variable 클래스 >> 설계도 >> 타입이다.

	public static void main(String[] args) { // main 함수가 있으니까 그 안에 들어있는 코드들을 무조건 실행함.

		System.out.println("hello");
		Test t = new Test(); // 이렇게 클래스를 불러서 생성자를 생성 할 때 위에 생성자 2개 중에 선택 할 수 있음 =new Test(10)을 하면 두번째 생성자 생성
		// t 를 인스턴스화 했다
		System.out.println(t);

		t.print(); // 이런식으로 부를 수 있음 

		int pv = 100; // local variable (main함수 안에 들어있음) -> 습관적으로 초기화함
		System.out.println("lv 지역변수 :" + pv);

		int lv = 1000; // lv는 main 함수 안에 들어있음 => main함수가 할당받은 stack 공간 중에 t가 가져간 공간 말고 lv 라는 공간을 새로만듦
		// 위에있는 클래스는 설계도를 메모리 위에 올리는것 = 설계도를 구체화 하는거 = 객체를 만드는것 't' 가 객체의 이름
		// 프로그램을 실행하면 JVM이 OS한테 메모리를 할당 받아서 나눔
		// Stack 영역에 일부를 main 함수의 영역으로 가져감
		// Test도 하나의 변수이므로 할당받은 공간에 t라는 공간을 만듦
		// new 가 있어서 heap이라는 장소에 Test라는 설계도를 보고 만듦 => Test라는 공간이 만들어짐 그 안에 iv가 만들어 지는거
		// heap에 만들어 놓은 Test 공간에 iv(=4byte)라는 공간을 만듦 이 공간에는 4바이트가 넘지않는 정수가 들어갈 수 있음 여기에
		// 500이 있음
		// heap에 만들어진 공간에 주소가 만들어짐(16진수) 그 주소를 x 라고 하면
		// 이 주소를 다시 stack에 t라는 공간으로 전달해줌 => 실제 지어진 iv로 찾아갈 수 있는 주소가 생김
		// t.여기서 . 은 heap에 있는 주소를 찾아 갈 수 있는 방법 => t.iv 하면 500이 됨
		// 이런 변수를 instance variable이라고 함
		System.out.println(t.iv);

		// main 함수가 종료되면 stack에 있는거는 사라지지만 heap에 있는공간은 남아있음
		// 프로그램이 종료되면 stack이랑 heap이랑 다 없어짐 할당받은 부분은 다시 OS에게 돌려줌

		// cmd에서 실행할라믄
		// javac Ex02_Variable.java 하면 class file이 만들어짐 Ex02_Variable.class -컨파일해서
		// java Ex02_Variable 실행 함
		// 실행하면 JVM동작 >> OS에게 메모리 할당받고 app 구성함 >> 자원 할당 >> 프로그램 종료 >> 사용했던 메모리(공간)를 OS에게
		// 반환

		// 이클립스에서는 이거를 한큐에 해결해줌 ctrl + F11

		// <정리>
		// 1. 지역변수는 반드시 초기화를 하고 사용(변수에 처음 값을 할당 초기화)
		// 2. 약속 : main 도 함수다! -> 메인안에 쓰는 변수도 초기화를 해야한다!!

		// 초기화 방법
		int number = 0; // 1. 선언과 동시에 한다

		number = 100; // 2. 따로 선언을 하면 0에서 100을 덮어씀
		number = 200; // 또 덮어씀

		System.out.println("number: " + number);

		int a; // 선언
		int b; // 선언

		// 여기서는 System.out.println(a); 안된다 선언을 안했음~

		a = 100; // => 선언과 초기화는 분리가 가능하다.
		b = 200;

		System.out.println(a); // 여기서는 됨 윗줄에 초기화를 했음

		int c, d; // 이렇게 선언가능하다 근데 선호하지 않음 직접적으로 선언을 못함 >> 배열을 사용하기 때문에

		Apt ssung = new Apt();
		System.out.println(ssung.window);

		Apt ppark = ssung;
		ppark.window = 100;
		System.out.println(ssung.window);
		System.out.println(ssung); // 이렇게 하면 heap에서 있는 주소값이 나옴 Apt@15db9742 >> 설게도의 이름 + @ + 주소값
		System.out.println(ppark);// 이렇게 하면 위랑 같은 주소가 나옴 heap에 갖고 있는 주소가 같음.

	}

}
