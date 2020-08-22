import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {
	public static void main(String[] args) {
		Fclass fc = new Fclass();
		fc.m(); // 모든 함수는 스택으로 끌고 와서 실행된다. //함수 = 스택에서 실행 = LIFO
				// 나중 얘기 : 함수는 한번에 한개밖에 수행할 수 없다 -> Sequancial 함수
		fc.m2(50);

		int result = fc.m3();
		System.out.println("result : " + result);

		result = fc.m4(-1);
		System.out.println("result : " + result);

		result = fc.sum(10, 20, 30);
		System.out.println("result : " + result);

		// fc.subSum(); 이건 안보이지 private니까 같은 패키지 안에서도 못봐, 클래스 안에서만 볼수 있어 -> 블랙박스
		fc.callSubSum(); // private 함수를 public int callSubSum()함수를 불러오는 모습을 볼 수 있다.

		result = fc.opSum(20);
		System.out.println("result : " + result);

		result = fc.max(7, 6);
		System.out.println("result === " + result);

		result = fc.max100(-99, -100);
		System.out.println("100점짜리 함수 : " + result);
		
		Tv t2 = fc.tCall(); // 메소드를 이용해 주소값을 타입 [변수] 로 받는 걸 볼 수 있다.
	}
}
