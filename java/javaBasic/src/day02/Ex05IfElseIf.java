package day02;
//if-else if 구조는 여러개의 조건을 체크할 때 사용된다.
//여러개의 조건식 중 true가 나오는 가장 먼저의 코드 블락이 실행된다.
//if와 else 사이에
//필요한 만큼의 else if를 넣어줄 수 있다.

public class Ex05IfElseIf {
	public static void main(String[] args) {
		int age = 99;
		if(age < 6) {
			System.out.println("유아");
		}else if(age <= 13) {
			System.out.println("어린이");
		}else if(age < 18) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		
		System.out.println("종료");
	}
}
