/*
	Instance Variable : class Car { private String color; }
	Local Variable : class Car { public void move() {int speed;} } //사용 전 반드시 초기화! (default값 없음)
	main함수 안에 만드는 모든 변수는 : Local Variable //반드시 초기화
	*Static Variable : 공 유 자 원 ( 객 체 간 ), 객체 생성 이전에 메모리에 올라가는 자원(class area==method area)

*/
class Variable{
	int iv;	//객체가 생성되면 힙메모리에 객체가 생성되고, 객체 안에 int iv == 0 이 들어감!
	/*
	 1. member field, instance variable
	 2. Variable v = new Variable(); > heap 메모리에 객체를 생성하여 쓴다.(메모리에 올라가야 쓸 수 있다) >> iv생성
	 3. Variable v2 = new Variable(); > heap 메모리에 객체를 생성하여 쓴다.(메모리에 올라가야 쓸 수 있다) >> iv생성
	 4. 멤버필드의 목적 : 정보를 담으려 하는데 어떤 정보? : 고유정보, 상태정보, 부품정보 (참조 타입 : 클래스타입 : 설계도의 설계도)
	 				  ***생성되는 객체마다 다른 값을 가질 수 있다.
	 				   그래서 굳이 초기화 하지 않는다. > default 값이 있기 때문
	 --default : int > 0, double > 0.0, char > 빈문자(스페이스 한 개==' '), boolean > false, String > Null, Car > null
	 --iv 변수의 생성 시점은 : new라는 연산자를 통해서 힙에 객체가 생성되고 나서 바로 생성된다.
	 */
	void method() {
		int lv = 0;
		/*
		 Local Variable (함수 안에 있는 변수 = 지역 변수) : 사용전에 반드시 초기화!
		 생명주기 : 함수 호출되면 생성(Stack 영역), 함수 종료 시 같이 소멸
		 
		 함수 안에 Block Variable
		 for(int i..) > for 시작 시 생성..for 종료 시 소멸
		 */
	}
	
	static int cv;
	/*
	스태틱이 뭘까?
	1.Class Variable (==클래스 변수), >>>> 범용적 표현 : Static Variable(***객체 간 공유 자원***)
	2.목적은 뭘까? : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
	  			  heap 영역에 생성된 [객체]들의 공통 (공유)
	3.특징 : 접근 방법
			1) class 이름.static 변수명 >> variable.cv >> why? 객체가 만들어지기 전에 접근 가능
			2) Variable v = new Variable(); >> v.cv
			   Variable v2 = new Variable(); >> v2.cv
			   v.cv == v2.cv (같은 메모리 접근 = 주소를 통해서 접근하는 방법)
			
	4. 생성시점 : Hello.java > javac Hello.java > Hello.class
		>java.exe Hello 엔터로 실행...
		>class loader System에 의해서
			클래스를 정보(metadata: 설명) class area(method area) 올린다.
		--이 클래스 언제 만들었고 어떤 자원을 import 하고 있고 변수 몇개.. 기술..
		--이 클래스 안에 static 변수 또는 스태틱 메소드 있으면
		--이 녀석을 메모리에 
	*/
}



public class Ex05_Variable_Scope {

	public static void main(String[] args) {
		//Variable v = new Variable();
		//javac Ex05_Variable_Scope.java 컴파일
		//>> Ex05_Variable_Scope.class 생성
		//java Ex05_Variable_Scope 실행
		
		//1.
		Variable.cv = 100;
		//2.
		Variable v = new Variable();
		System.out.println(v.cv);
		
		Variable v2 = new Variable();
		v2.cv = 500;
		
		System.out.println(Variable.cv);
	}

}
