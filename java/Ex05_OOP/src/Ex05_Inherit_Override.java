import kr.or.bit.Emp;

class Test2 {
	int x = 100;

	void print() {
		System.out.println("부모 함수 test2");
	}
}

class Test3 extends Test2 {
	int x = 300;	// C#: 부모 무시하기 -> 이런방식은 쓰지마세요. 오류는 안나지만 쓸 이유가 없죠
	
	@Override
	void print() {
		System.out.println("자식이 부모함수를 재정의");
	}
	
	void print(String str) {
		System.out.println("나는 오버로딩 함수야 + str");
	}
}

public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println(t.x);
		t.print();
		t.print("overload");
		
		///////////////////////////////
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp); //주소값은 그닥 중요하지 않아요
		//고민 : 사번하고 이름이 담긴 정보를 출력하고 싶어...
		//근데 누구나 동일한 함수를 가지고 놀았으면 좋겠다...
		
		//눈에 보이지 않지만 위의 emp출력하는 것에 사실은 emp.toString()가 생략되어 있는 거시어따!
		//Object클래스가 toString에 대해서 주소값을 출력하도록 구현해놓은것!
		
		//JAVA API가 제공하는 수많은 클래스가 Object클래스의 toString()메서드를 재정의하고 있다.
		//이유 : 제일 많이 알려진 함수니까..
	}

}
