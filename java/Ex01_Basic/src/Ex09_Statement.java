import java.util.Scanner;

public class Ex09_Statement {
	public static void main(String[] args) {

		System.out.println("입력");
		Scanner sc = new Scanner(System.in);

		/*
		 * if(sc.hasNextInt()) { //has가 들어가면 의문형 ( true, false ) //정수가 입력되었어 }else {
		 * //정수가 아니야 }
		 */

		// 암기할 것.
		// 조건문 : if 3가지, switch(조건){case 값... break}
		// 반복문 : for( 초기식; 조건식; 증감식 ), while문(true, false), do{수행식}while(조건)
		// 분기문 : break(블럭을 탈출해라); continue(그 아래 구문을 스킵해라);

		int count = 0;
		if (count < 1) {
			System.out.println("True");
		}

		char data = 'A';

		switch (data) {
		case 'A':
			System.out.println("문자 비교 가능");
			break;
		default:
			System.out.println("나머지 모든 것");
			// break; default에는 생략가능
		}

		// 1부터 100까지의 합을 출력(for)
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i; // 대입연산자 사용 <- sum = sum + i;
		}
		System.out.println("1~100까지의 합 : " + sum);

		// 1~5까지의 합
		// n * (a + l) / 2 -> 등차수열의 합 공식
		// 개수 * (시작+끝) / 2
		sum = 5 * (1 + 5) / 2;
		System.out.println("1~5까지의 합 : " + sum);

		// for문을 사용해서 1~10까지의 홀수의 합을 구하여라
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
			i++;
		}
		System.out.println("1~10가지 홀수의 합은 : " + sum2);

		// for문을 사용해서 1~10까지의 홀수의 합을 구하여라 -version 2
		int sum3 = 0;
		for (int i = 1; i <= 10; i += 2) { // i = i + 2 (i + = 2)처럼 for문의 증감식에 조건을 더 달아줄 수 있다.
			sum3 += i;
		}
		System.out.println("1~10가지 홀수의 합은 : " + sum3);

		// 1~100까지의 합 (짝수) if문 사용
		int sum4 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0)
				continue;
			else
				sum4 += i;
		}
		System.out.println("1~100까지의 짝수의 합 : " + sum4);

		// 입사시험(중소기업)문제
		// 구구단을 출력(중첩 for문)
		// 2단 ~ 9단까지
		// 2 >> 1~9까지 곱해지는 연산이 있음

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("[%d] X [%d] = [%d]  ", i, j, i * j);
			}
			System.out.println();
		}

		// 분기문 (continue, break)
		// Today Point : continue (아래 구문을 skip), break (블럭 탈출)

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					break;
				}
				System.out.printf("%s", "*");
			}
			System.out.println();
		}

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					continue;
				}
				System.out.printf("[%d] X [%d] = [%d]  ", i, j, i * j);
			}
			System.out.println();
		}

		// 별찍기 / 정렬도 한번 해보기
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j < i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		for(int i = 100; i >= 0; i--) { //조건반복문은 연습이 살 길이다
			System.out.println(i);
		}

		//피보나치 수열 -> 간단하게
		int a = 0, b = 1, c = 0;
		for(int i = 0; i < 10; i ++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println("\t" + c);
		}
		
	}
}