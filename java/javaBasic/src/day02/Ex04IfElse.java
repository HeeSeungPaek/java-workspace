package day02;
//ifelse
//만약 if문 조건식이 false면 무조건 else문을 실행한다.
public class Ex04IfElse {
	public static void main(String[] args) {
		int age = 15;
		
		if(age < 18) {
			System.out.println("미성년자입니다");
		}else {
			System.out.println("성인입니다.");
		}
		
		System.out.println("---종료---");
	}
}
