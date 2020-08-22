//static 변수는 객체마다 같은 값을 가지게 할거야
//instance 변수는 객체마다 다른 값을 가지게 할거야
class InitTest{
	static int cv = 10;
	static int cv2;
	int iv = 11;
	
	static{ //static 초기자 : static 자원을 초기화한다. 멤버필드가 먼저 올라간 후 따라간다. 
		cv = 111;
		cv2 = cv + 222;
	}
	
	{
		//초기자 블럭 (member field의 초기화)
		//객체 생성되고 나서 int iv = 1; 변수가 메모리에 올라가고나서 바로 호출
		//인위적 >> if(iv > 10) iv = 100;
		System.out.println("초기자 블럭");
		if(iv > 10) iv = 100;
	}
	
	public InitTest() {
		System.out.println("생성자");
	}
	
}

public class Ex08_Static_Init {

	public static void main(String[] args) {

		System.out.println(InitTest.cv);	//문법적으로, 클래스.스태틱변수에 진입할 수 잇다
		System.out.println(InitTest.cv2);
		//System.out.println(InitTest.iv); 당연히 보이지 않는다. 참조변수가 없기 떄문에
		
		InitTest it = new InitTest(); //힙메모리에 객체를 올리기!
		System.out.println("iv:" + it.iv);
		
		
	}

}
