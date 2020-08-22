package fastCampus;

import java.util.Scanner;

public class Ex02_Do_While {
	public static void main(String[] args) {
		//입력받는 정수를 모두 더해준다.
		//입력된 정수가 0이면 반복문을 빠져 나온다.
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		
		//첫번째 주 금요일 배운 내용:
		//숫자던 문자던 일단 String형식으로 받고 >>스캐너.nextLine()
		//그 문자가 정수형일 경우 Integer.parseInt()써서 정수형으로 변환!
		//Integer.parseInt()는 wrapper클래스 종류로
		//wrapper클래스는 원시 타입(int, char, double등)의
		//종류마다 존재한다. 사용방법은 위의 방법과 같다.
		//많은 사용 방법 종류 중의 하나. 일단 이런 방식이
		//있다는 것만 알아두자.
		
		int sum = 0;

		do {
			input = Integer.parseInt(scanner.nextLine());
			sum += input;
		}while(input != 0);
		
		System.out.println(sum);
		
	}
}
