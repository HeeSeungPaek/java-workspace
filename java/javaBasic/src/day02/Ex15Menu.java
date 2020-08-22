package day02;
//무한루프를 사용한 메뉴 만들기

//성적을 입력 받을 때 까지
//학년은 3학년까지
//반은 5반까지
//각 점수들은 모두 유효한 점수로

//성적을 출력 받을 때
//학년, 반은 2자리 오른쪽 정렬
//국영수, 총점수는 점수는 3자리 오른쪽 정렬 하고 왼쪽 빈공간은 0으로 채우기
//평균은 소숫점 3번째 자리까지 출력되게 작성하시오.

//변수의 선언 위치를 잘 알자
//int kor, eng, math = 0; 으로 초기화 하면
//math 변수 하나만 초기화 되는 것이다.
import java.util.Scanner;

public class Ex15Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int haknyeon = 0;
		int ban = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		String name = new String();

		while (true) {
			System.out.println("=====================");
			System.out.println("비트고등학교 성적관리프로그램");
			System.out.println("=====================");
			System.out.println("1.입력 2.출력 3.종료");
			int choice = scanner.nextInt();

			if (choice == 1) { // 성적 입력
				System.out.println("학년 입력 : ");
				haknyeon = scanner.nextInt();
				while (haknyeon < 1 || haknyeon > 3) {
					System.out.println("잘못된 학년");
					System.out.println("학년 입력 : ");
					haknyeon = scanner.nextInt();
				}

				System.out.println("반 입력 : ");
				ban = scanner.nextInt();
				while (ban < 1 || ban > 5) {
					System.out.println("잘못된 반");
					System.out.println("반 입력 : ");
					ban = scanner.nextInt();
				}

				System.out.println("이름 입력 :");
				scanner.nextLine();
				name = scanner.nextLine();

				System.out.println("국어 성적 입력 : ");
				kor = scanner.nextInt();
				while (kor < 0 || kor > 100) {
					System.out.println("잘못된 국어 점수");
					System.out.println("국어 점수 입력 : ");
					kor = scanner.nextInt();
				}

				System.out.println("영어 성적 입력 : ");
				eng = scanner.nextInt();
				while (eng < 0 || eng > 100) {
					System.out.println("잘못된 영어 점수");
					System.out.println("영어 점수 입력 : ");
					eng = scanner.nextInt();
				}

				System.out.println("수학 성적 입력 : ");
				math = scanner.nextInt();
				while (math < 0 || math > 100) {
					System.out.println("잘못된 수학 점수");
					System.out.println("수학 점수 입력 : ");
					math = scanner.nextInt();
				}

			} else if (choice == 2) { // 성적 출력
				// 성적을 출력 받을 때
				// 학년, 반은 2자리 오른쪽 정렬
				// 국영수, 총점수는 점수는 3자리 오른쪽 정렬 하고 왼쪽 빈공간은 0으로 채우기
				// 평균은 소숫점 3번째 자리까지 출력되게 작성하시오.
				/*
				 * System.out.printf("%2d학년 %2d반 %s 학생의 성적\n" +
				 * "국어 : %03d점, 영어 : %03d점, 수학 : %03점\n" + "총 점수 : %03d점, 평균 : %.3f점", haknyeon,
				 * ban, name, kor, eng, math, total, average);
				 */
				if (haknyeon == 0) {
					System.out.println("입력된 정보가 없습니다.");
				} else {
					System.out.printf("%2d학년 %2d반 %s 학생의 성적\n", haknyeon, ban, name);
					System.out.printf("국어 : %03d점, 영어 : %03d점, 수학 : %03d점\n", kor, eng, math);
					int total = kor + eng + math;
					double average = total / 3.0;
					System.out.printf("총 점수 : %03d점, 평균 : %.3f점\n", total, average);
				}

			} else if (choice == 3) {
				// break란 해당 코드 블락을 무조건 종료시킨다
				// 지금 이 break가 else if(choice == 3)코드 블락에 속해있지만
				// 실제로는 choice가 3이면
				// 18,19라인이 for loop안에 포함되는 것이라 이해하면 된다.
				System.out.println("사용해주셔서 감사합니다");
				break;
			} else {
				System.out.println("Wrong input");
			}
		}
		scanner.close();
	}
}