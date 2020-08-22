package day02;

import java.util.Scanner;

/*for문 예제
 * 1. 1~100까지의 합을 구하는 프로그램을 만들어보자
 * 2. 사용자로부터 수를 입력 받아서 1부터 그 수까지의 곱을 구하는 프로그램을 작성한다.
 * 단, 사용자가 입력한 수는 15미만이어야 한다.
 * */
public class Ex09For02 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in); 
		
		//1번 문제
		for(int i = 0; i <= 100; i++) {
			/* 
			 * sum의 현재값에 i를 더해주면 0~100까지의 i가 계속 더해진다. 
			 * 이걸 코드로 쓰면 'sum = sum + i -> sum += i;'로 쓸 수 있다.
			 */
			sum += i;
		}
		System.out.println("1~100의 합 : "+sum);
		
		//2번 문제
		int factorial = 1;
		System.out.println("숫자 입력:");
		int userNumber = scanner.nextInt();
		
		if(userNumber >= 0 && userNumber < 15) {
			for(int i = 1; i <= userNumber; i++) {
				factorial *= i;
			}
			System.out.printf("1~%d까지의 곱 : %d", userNumber, factorial);
		}else {
			System.out.println("15미만의 값을 입력해주세요");
		}
		
		scanner.close(); 
	}
}
