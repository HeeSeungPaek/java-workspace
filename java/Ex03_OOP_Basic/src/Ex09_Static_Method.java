/*
1. static method : 설계자가 static 함수를 만든다는 것 - 의미 > 많이 사용하니까 편하게 쓰고싶어서.. 
	>> 객체 생성없이 바로바로 쓴다는 뜻!
2. Math m = new Math()(x) ... > Math.Random() 생각해봐 객체 생성안하고 그냥 쓰잖아
   System s = new System()(X)... > System.out.println() 이 두가지 예시를 생각하면 스태틱에 대한 이해가 된다

끼리끼리 놀아라. >> 일반자원(필드)은 일반자원(메소드)끼리 놀고, 스태틱은 스태틱끼리 놀아라.  
왜? 에러는 안날거임. 스태틱과 일반자원이 같이 놀 떄가 있는데, 그 상황을 이해만 하면 된다.

*/
class StaticClass{
	
	int iv;			//인스턴스 배리어블
	
	static int cv;	//스태틱 배리어블
	
	
	
	void m() { //"생성 시점"이 포인트(클래스 에이리어, 힙 등등)
		//일반함수
		//1. iv값을 가지고 놀 수 있따
		iv = 100;
		//2. cv값도 가지고 놀 수 있다. >> [생성 시점]
		//static 자원은 항상 일반자원보다 memory에 먼저 생성됨.
		
		//staticClass.cv = 300;가능
		cv = 200;
	}
	
	static void sm() {
		//static 함수
		//1. 일반 변수 iv값을 가지고 놀 수 있다. (x) [생성 시점]
		//iv = 100; (x)
		cv = 500;
		//error 끼리끼리 놀아라 (static끼리 놀아라)
	}
	
}
public class Ex09_Static_Method {

	public static void main(String[] args) {

		StaticClass.sm();
		System.out.println(StaticClass.cv); //객체를 생성하지 않았음에도 불구하고 static으로 선언되어
											//메모리에 선행되었기 때문에 호출할 수 있는 것이다!
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(sc.iv);
		System.out.println(sc.cv);
		
	}

}
