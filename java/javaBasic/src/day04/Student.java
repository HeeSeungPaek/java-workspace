package day04;

public class Student {
	// 필드를 만들어보자
	// String, int형 변수의 초기화는? 그 클래스 객체를 쓰는 다른 클래스가 알아서 할 문제!
	private String name;
	private int korean;
	private int english;
	private int math;

	public void setName(String name) {
		this.name = name;
	}// setter메소드이다. this.name = name;은 이 메소드를 호출한다는 뜻이다.

	public String getName() {
		return name;
	}// getter메소드이다.

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getKorean() {
		return korean;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getEnglish() {
		return english;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	// 메소드를 만들어보자
	void printInfo() {
		System.out.printf("이름:%s, 국어:%03d점, 영어:%03d점, 수학:%03d점\n", 
				name, korean, english, math);
	}

	// 첨에 생성하면 빨간줄이 나온다. 왜? 이 메소드의 리턴타입은 int이다.
	// 근데 돌려주는 int타입 리턴값이 없으니 에러가 생긴다.
	// return 값을 정해주면 에러없이 작성할 수 있다.
	int calculateSum() {
		return korean + english + math;
	}

	// 이것도 마찬가지, 이 메소드의 리턴타입은 double이므로 리턴값을 정해줬다.
	double calculateAverage() {
		return calculateSum() / 3.0;
	}
	
	//생성자는 리턴타입이 없다.
	public Student() {
		System.out.println("기본 생성자입니다.");
		name = "기본 생성됨";
		korean = 0;
		english = 0;
		math = 0;
	}
	
	//생성자 오버로딩 하기
	//오버로딩 : 같은 이름의 메소드를 다른 파라미터로 여러개 만드는 것.
	public Student(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	//자바의 System.out.println()에 파라미터로
	//객체를 넣으면, 객체의 toString() 메소드의 결과값이 화면에 출력이 된다.
	//만약 우리가 toString() 메소드를 오버라이드 안해주면
	//패키지.클래스이름@메모리주소 가 출력이 된다.
	//따라서 객체의 필드 내용을 알고 싶다면 toString()메소드를
	//오버라이드 해줘야 한다.
	public String toString() {
		return "★이름 : "+name+", 국어점수: "+korean+"점"
				+", 영어점수: "+english+"점, 수학점수: "+math+"점";
	}
	
	//equals 메소드를 오버라이드해보자.
	//equals 메소드는 파라미터로 모든 클래스 객체가 올 수 있다.
	//모든 클래스 객체를 오게 하기 위해서는 공통 조상을 파라미터로 적어주면 된다.
	//자바의 모든 클래스의 공통 조상은 Java.lang.Object이다.
	//따라서 equals 메소드의 파라미터는 Object obj가 된다.
	//ture/false가 최종 리턴 값이다 = 리턴 타입은 boolean이 된다.
	public boolean equals(Object obj) {
		//1. 2개가 같은 클래스의 객체인지 비교한다.
		//   즉, 파라미터로 넘어온 obj가 Student 클래스의 객체인지
		//   확인한다. 이때는 instanceof라는 명령어를 통해서 한다.
		if(obj instanceof Student) {
			//obj instanceof Student가 true가 나왔다는 것은
			//obj가 Student클래스의 객체라는 뜻이 된다.
			//따라서 명시적 형변환을 통해서 obj를 Student 클래스
			//객체에 덮어 씌어줄 수 있다.
			Student s = (Student)obj;
			//그 다음에 이 메소드를 호출한 객체의 정보(필드)와
			//s의 정보(필드)를 비교해서
			//true가 나오는지 확인한다.
			if(name.equals(s.name) &&
					english == s.english &&
					math == s.math &&
					korean == s.korean) {
				return true;
			}
		}
		return false;
	}
}
