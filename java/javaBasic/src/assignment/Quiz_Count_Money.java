package assignment;

import java.util.Scanner;

public class Quiz_Count_Money {
	public static void main(String[] args) {

		int unit = 10000;
		int num = 0;
		int sw = 0;

		Scanner scanner = new Scanner(System.in);

		int money = Integer.parseInt(scanner.nextLine());

		while (true) {
			num = money / unit; 				// 123456 -> num = 12

			System.out.printf("[%d]원 [%d]매 \n", unit, num);
			if (unit > 1) { 					// 화폐단위가 1원까지만
				money = money - (unit * num); 	// 방금 센 매수만큼 입력값에서 마이너스 -> 남은 돈 세기
				if (sw == 0) { 					// 화폐 다음단위를 위한 변수 -> 처음 조건 검사 시 무조건 실행
					unit = unit / 2;
					sw = 1; 					// 화폐단위의 앞자리가 5일때 무조건 else문을 타기 위해 스위칭변수 할당 : 10000 > 5000...
				}
				else {							// 스위칭변수 값으로 앞자리가 5단위일 때 앞자리를 1로 변경 : 5000 > 1000...
					unit = unit / 5;
					sw = 0;
				}
			} 
			else {
				break;							//화폐단위를 1까지 나눴다면 탈출
			}
		}
	}
}
