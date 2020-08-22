package day01;

import java.util.Scanner;

//사용자로부터
//학년, 반, 이름, 국어, 영어, 수학 점수를 입력받아서
//몇학년 몇반 누구 국어점수 :#점, 영어점수 #점, 수학점수 : #점
//총점 #점, 평균 #.#점이 출력되는 프로그램을 작성하세요.
//예시)
//학년? 3
//반? 2
//이름? 백희승
//국어? 95
//영어? 100
//수학? 15
//3학년 2반 조재영 국어점수 : 80점, 영어점수: 80점, 수학점수: 81점
//총점: 210점, 평균: ##.##점

public class Ex07 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("학년 입력 : ");
		int haknyeon = scanner.nextInt();

		System.out.println("반 입력 : ");
		int ban = scanner.nextInt();

		// String을 입력 받기 전에는 scanner.nextLine(); 필요
		scanner.nextLine();
		System.out.println("이름 입력 :");
		String name = scanner.nextLine();

		System.out.println("국어 성적 입력 : ");
		int kor = scanner.nextInt();

		System.out.println("영어 성적 입력 : ");
		int eng = scanner.nextInt();

		System.out.println("수학 성적 입력 : ");
		int math = scanner.nextInt();

		int total = (kor + eng + math);
		double average = (kor + eng + math) / 3;

		System.out.println(
				+haknyeon + "학년 " + ban + "반 " + name + "\n" + "국어점수 : " + kor + " 영어점수 : " + eng + " 수학점수 : " + math);
		System.out.println("총점 : " + total + "점" + "\n평균 : " + average + "점");
		
		scanner.close();
	}
}
