package kr.or.bit;

/*
새 (공통 (일반화,추상화)) : 새는 날 수 있다, 새는 빠르다.
 */
public class Bird {
	//공통 기능
	public void fly() {
		System.out.println("flying");
	}
	
	//설계자가 당신한테 protected 자원을 줬다는 이야기는?
	// : 나를 상속하는 당신은 moveFast를 필요에 따라서 재정의 했으면 좋겠어 (강제성 없음)
	protected void moveFast() {
		fly();
	}
}
