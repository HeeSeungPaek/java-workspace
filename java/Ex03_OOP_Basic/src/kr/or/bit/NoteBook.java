package kr.or.bit;

public class NoteBook {
	public String color;
	// public int year;
	private int year; // 캡슐화, 은닉화한 것이다.
	// 간접 할당
	// 캡슐화의 진정한 의미 : 직접 할당을 막아주고,
	// 간접할당을 통해 외부로부터 자료를 보호(개발자가 원하는 값만 처리하겟다)

	//노트북은 마우스를 가지고 있다.
	//마우스는 여러개의 속성과 기능으로 구성된다
	//==별도의 클래스(설계도)를 만들어야 한다!
	//일체형 마우스가 아닐 때
	//public Mouse mouse;
	
	public Mouse handle(Mouse m) { //Mouse 타입의 [주소]값이 파라미터로 올 수 있다.>>new
		m.x = 100;
		m.y = 200;
		return m; //리턴값이 Mouse 타입이니 Mouse 타입으로 받으면 된다!
	}
	
	
	// 만약에
	// public int year >>
	// 음수값 입력이 가능 NoteBook notebook = new NoteBook(); >>
	// notebook.year = -2000;

	//객체지향의 3대 특징 중 하나인 캡슐화(은닉화)
	//내가 원하는 데이터는 개발자인 내가 제어하겠다는 장점!
	
	//캡슐화된 멤버필드에 대하여 write(set), read(get)
	//>> setter함수와 getter함수라고 부른다
	
	
	public void setYear(int y) { // 간접 할당
		if (y < 0) {
			year = 1999;
		} else {
			year = y;
		}
	}

	public int getYear() { // private 필드를 간접적으로 볼 수 있는 것
		return year;
	}
}
