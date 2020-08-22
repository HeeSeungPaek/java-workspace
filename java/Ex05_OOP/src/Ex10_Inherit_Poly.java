//외워야 한다!
/*
다형성 (상속관계에서 존재)
다형성 : 여러가지 성질(형태)를 가질 수 있는 능력

C# : 다형성 (Overloading, Overriding)
JAVA : [상속관계]에서 [하나의 참조변수]가 여러 개의 타입을 가질 수 있다.
[하나의 참조변수] >> [부모 타입]
부모클래스 타입의 참조변수가 여러 개의 자식 클래스 객체를 담을 수 있다.

현실세계의 부모는 자식에게 조건없이 모든 것을 준다.
프로그램은 자식이 부모에게 조건없이 드린다. >> 다형성
*/
class Tv2 { // 부모 = 일반화하고 추상화하는 자원, 공통(분모)
	boolean power;
	int ch;

	void power() {
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2 { // CaptionTv가 가지고 있는 [특수화,구체화되고 고유한 자원들]을 표현
	String text;

	String captionText() {
		return this.text = "현재 자막 처리 중....";
	}
}

public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("전원 : " + captv.power);
		
		captv.chUp();
		System.out.println("채널 : " + captv.ch);
		System.out.println(captv.captionText());
		
		//Car c = new Car();
		//Car c2 = c;
		
		Tv2 tv2 = captv;	//외우기** captv는 Tv2를 상속하고 있다.
							//상속관계에서 부모타입은 자식타입의 주소를 가질 수 있다.
							//단, 부모는 자신의 자원만 접근할 수 있다.
							//단, 재정의 제외하고...
		System.out.println(tv2.toString());		//CapTv@15db9742
		System.out.println(captv.toString());	//CapTv@15db9742
		//같은 601호에 들어가도, 자식은 다 볼 수 있지만 (오디오) , 부모는 자신이 사준 것만 볼 수 있다.(냉장고, tv)
		//tv2.captionText() 불가하다..
		
		
	}

}
