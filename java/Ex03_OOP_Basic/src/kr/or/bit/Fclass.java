package kr.or.bit;
/*
기능(행위) 만드는 방법
함수 (function, method)

method : 행위 또는 기능 (최소 단위) : 하나의 함수는 하나의 기능만 구현해라, 
안그러면 복잡해서 유지보수 못함
ex) 먹는다, 잔다, 걷는다. 걸으면서 먹는다 이런거 말고...

클래스 : 필드 + 함수 + 생성자

ex) 게임방 : 게임기 동전 넣고 ... 함수 (돌려주는 것 x)
	인형뽑기 : 동전 넣고 인형을 받는 것 (돌려주는 것 o)
	
함수는 [호출에 의해서만(이름을 부르는 것)] 동작한다!
	
JAVA)
1. void 면서 parameter가 있는 놈 : [void] print(String str) { 실행코드 }
2. void 면서 parameter도 없는 놈 : [void} print() { 실행코드 }
(아래 3,4번 return type 메소드 생성 시 반드시 return키워드 명시)
3. return type, parameter o : [int] print(int data) { return [int] }  
4. return type, parameter x : [int] print() { return [int] }

****중요****
void      >> 돌려주는 것이 없다 >> return value 없다.
return    >> 8가지 기본 값타입 + String, Class, Array, Collection, Interface... >> 클래스(설계도)
parameter >> 8가지 기본 값타입 + String, Class, Array, Collection, Interface... >> 클래스(설계도) 
ex) void print(int a, int b, int c, int d) { }... 인수, 인자, 매개값, 전달값 == 파라미터!
ex) print(10, 20, 30) >> 실행되지 않는다. 파라미터 개수를 다 넣어줘야 작동한다!!
ex) print(1, 2, 3, 4) >> 정상 작동! 파라미터개수가 같으면 실행된다.


Car print() { Car c = new Car(); return c; } //Car[타입]의 메소드 리턴값은 주소!!
...단축하자면	{ return new Car(); }
boolean print(boolean bo) { return true or false; }

함수의 이름 : 관용적으로 의미있는 단어의 조합
: getChannelNumber()
: getEmpListByEmpno()

*** 함수는 반드시 호출(call)되어야 실행된다 : 누군가 그의 이름을 부르지 않으면 실행이 안된다.


*/

public class Fclass {
	public int data;

	// void m() //이렇게 쓰면 컴파일러가 default void m()로 해석 -> 다른 패키지에서 볼 수 없다.
	public void m() { // 그래서 public을 붙여 다른 패키지 안에서도 메소드를 호출할 수 있도록 쓴다.
		System.out.println("일반 함수 : void, parameter(X)");
	}

	// void m(int ..)
	public void m2(int i) { // 파라미터는 함수 실행시 생성, 종료시 소멸
		System.out.println("일반함수 : void. parameter(O)");
		System.out.println("parameter value (Scope = 함수내부) : " + i);
	}

	public int m3() {
		return 100; // return Type 존재하면 반.드.시. return 키워드가 있어야 한다.
	}

	public int m4(int data) {
		return 100 + data;
	}
	// 여기까지가 함수의 기본...

	// 확장
	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// default int subSum()...
	// 설계자의 의도 : subSum() 이라는 함수는 다른 함수를 도와주는 함수로서, [함수 내부]에서 호출되도록 설계한 것
	// 내부에서 공통적인 내용..
	// 이런 경우는 private 접근자 : 클래스 내부에서만 사용하게 할 수 있다. 같은 패키지에서도 접근하지 못하도록..
	// **클래스 내부 : public, private, default 구분 x
	private int subSum(int i) { // 클래스 내부의 공통함수로 쓰겠다는 개발자의 의지가 담긴 코드라고 볼 수 있다.
		return i + 100;
	}

	public void callSubSum() { // 내부의 public 메소드로 private 메소드를 호출하는것을 볼수있다.
		int result = subSum(100);
		System.out.println("Call result : " + result);
	}

	private int operationMethod(int data) { // 클래스 내부에서... 공통함수로...
		return data * 200;
	}

	public int opSum(int data) {
		int result = operationMethod(data);
		if (result > 0) {
			return 1;
		} else {
			return -1;
		}
	}

	// Quiz
	// a와 b 둘 중에 큰 값을 return하는 함수를 만드세요
	// ex) max(300, 100) return값은 300

	// 내가한거 : 쓸 데 없이 너무 길다는게 정계의 학설
	private int maxMethod(int a, int b) {
		return a - b;
	}
	public int max(int a, int b) {
		int result = maxMethod(a, b);
		if (result < 0) {
			return b;
		} else { // (result > 0)
			return a;
		}
	}

	// 30점짜리 : return을 최소한으로 (반복적인 사용 X)
	public int max30(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	// 60점짜리 : return 횟수를 줄여준다.
	public int max60(int a, int b) {
		int result = 0;
		if (a > b) {
			result = a;
		} else {
			result = b;
		}
		return result;
	}
	// 90점짜리 :
	public int max90(int a, int b) {
		int max = (a > b) ? a : b;
		return max;
	}
	// 100점짜리 :
	public int max100(int a, int b) {
		return (a > b) ? a : b;
	}

	//함수를 사용할 때 기본타입(값 타입)
	//함수에 참조타입을 걸어보자.
	//return 타입에 클래스가 올 수 있다!!!
	//클래스 타입이 return 타입이라면, 주소값을 리턴한다!

	//****중요한 곳****
	public Tv tCall() { //Tv타입을 가지는 [주소]를 tCall()함수를 이용해 return해라
						//>> new...
		//return null;
		Tv t = new Tv();
		t.brandname = "A"; 	//아래의 메소드보다 확장성 측면에서 유리!
		return t;
	}
	//위의 코드보다 더 났다는 의미
	public Tv tCall2() {
		return new Tv();
	}
	
	public void tCall3(Tv t) { //Tv타입을 가지는 주소를 파라미터로 넣어라
		System.out.println("t 주소값: " + t);
	}
	/*
	 연습만이 살 길
	 	main()
	 	{
	 		1.tCall3(new Tv()); //주소만 넘기는 행위
	 		
	 		2.Tv t = new Tv(); //주소를 넘기면서, t를 이용해 t.으로 놀수있다.
	 		  tCall3(t);
	  	}
	  	
	 */
	
}
