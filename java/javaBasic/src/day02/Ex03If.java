package day02;

//제어문이란 특정코드들이 실행될지 말지 혹은 얼마동안 반복할지 결정
//제어문은 크게 조건문과 반복문이 있다.
//조건문 : 특정 조건을 만족시에 코드 실행
//반복문 : 특정 조건을 만족시에 코드 반복

//실행 혹은 반복될 코드들은 하위에 {}에 감싸지는데
//이걸 하나의 "코드블록" 이라 한다.
public class Ex03If {
	public static void main(String[] args) {
		
		int age = 15;
		if(age <= 18) {
			System.out.printf("나이: %03d세\n", age);
			System.out.println("미성년자입니다.");
		}
		//변수 선언 시 해당 변수가 선언되고 나서 그 변수가 속한 블락이 끝날 때 까지
		//그 변수와 이름이 같은 변수는 새로 만들지 못한다.
		//또한 그 변수가 속한 코드 블락이 끝나면 그 변수는 소멸된다.(korean)
		System.out.println("맨 마지막줄");
	}
}
