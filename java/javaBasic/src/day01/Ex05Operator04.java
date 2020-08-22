package day01;
//논리연산자
//논리연산자는 논리형 값에 대한 연산을 한다.
//AND OR NOT
//&& : 2개의 값 모두 true일 때 true 반환
//|| : 2개의 값 중 하나라도 true라면 true 반환
//! : true는 false로 false는 true로 반환

//한글자판은 원화, 중국어판은 위안화, 일본어자판은 엔화
//영어자판은 백슬래시 + shift를 사용한다.

//부정연산자는 바꿀 변수 앞에 !를 붙여주면 된다.
public class Ex05Operator04 {
	public static void main(String[] args) {
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		
		//and연산
		System.out.println("true && false : " + (myBoolean1 && myBoolean2));
		//or연산
		System.out.println("true || false : " + (myBoolean1 || myBoolean2));
		//부정
		System.out.println("true! : " + (!myBoolean1));
		System.out.println("false! : " + (!myBoolean2));
	}
}
