package day03;

import java.util.Scanner;

public class Ex03Stars03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("별 찍기 3번");
		System.out.println("줄 수를 입력해주세요");
		int userNumber = scanner.nextInt();

		for (int h = 1; h <= userNumber; h++) {
			String stars = new String();
			//공백을 담당하는 w for문과 별을 담당하는 w for문
			
			for(int w = 1; w <= userNumber - h; w++) {
				//공백은 각 줄 usernumber - h개이다.
				stars += " ";
			}
			//별을 담당하는 w for문이다.
			for(int w = 1; w <= h; w++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
