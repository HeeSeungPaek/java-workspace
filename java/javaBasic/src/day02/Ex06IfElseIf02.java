package day02;

import java.util.Scanner;

//사용자로부터 점수를 입력받아서
//90점이상 a
//80~89점 b
//70~79점 c
//60~69점 d
//59점 이하 f가 출력되는 프로그램을 만들어보라

public class Ex06IfElseIf02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("점수입력 : ");
		int score = scanner.nextInt();

		if (score < 60) {
			System.out.println("성적 F 입니다");
		} else if (score < 70) {
			System.out.println("성적 D 입니다");
		} else if (score < 80) {
			System.out.println("성적 C 입니다");
		} else if (score < 90) {
			System.out.println("성적 B 입니다");
		} else {
			System.out.println("성적 A 입니다");
		}

		/*
		 * if(score >= 90) { System.out.println("성적 A 입니다"); }else if(score >= 80) {
		 * System.out.println("성적 B 입니다"); }else if(score >= 70) {
		 * System.out.println("성적 C 입니다"); }else if(score >= 60) {
		 * System.out.println("성적 D 입니다"); }else { System.out.println("성적 F 입니다"); }
		 */

		// 위의 코드는 점수가 유효한 점수인지 검증을 하지 않았기 깨문에
		// 100을 초과하거나 0 미만인 점수가 들어가도 작동하는 형태이다.
		// 그렇다면 어떻게 해야 이러한 일을 방지할 수 있을까?
		// 2가지 방법으로 방지가 가능하다.
		//첫번째 방법은 정확한 범위를 제한해 주는 것,
		//두번째 방법은 먼저 데이터가 유효한지 체크한 후
		//데이터가 유효할 때에만 점수를 분류하는 if문으로 들어간다.
		//유효하지 않을 때에는 무조건 잘못된 점수입니다 가 출력되게 만들어준다
		//이 때는 if문 안에 if가 들어가는 중첩 if문(nested if)구조가 된다.
		
		System.out.println("데이터검증(유효성 검사)1 : 정확한 범위 할당");
		if (score >= 90 && score <= 100) {
			System.out.println("성적 : A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("성적 : B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("성적 : C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("성적 : D");
		} else if (score >= 0 && score <= 59) {
			System.out.println("성적 : F");
		} else {
			System.out.println("0~100 사이의 점수만 입력해주세요.");
		}

		System.out.println("데이터검증(유효성 검사)2 : nested if block");
		if(score >= 0 && score <= 100) {
			if (score < 60) {
				System.out.println("성적 F 입니다");
			} else if (score < 70) {
				System.out.println("성적 D 입니다");
			} else if (score < 80) {
				System.out.println("성적 C 입니다");
			} else if (score < 90) {
				System.out.println("성적 B 입니다");
			} else {
				System.out.println("성적 A 입니다");
			}
		}else {
			System.out.println("0~100 사이의 점수만 입력해주세요.");
		}
		
		scanner.close();
	}
}
