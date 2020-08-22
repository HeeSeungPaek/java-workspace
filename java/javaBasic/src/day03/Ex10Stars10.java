package day03;

import java.util.Scanner;

public class Ex10Stars10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("별 찍기 10번 입력");
		int userNumber = scanner.nextInt();
		
		for(int h = 1; h <= 2 * userNumber - 1; h++) {
			String stars = new String();
			if(h == 1 || h == 2 * userNumber - 1) {
				for(int w = 1; w <= 2 * userNumber - 1; w++) {
					stars += "*";
				}
			} else if ( h < userNumber) {
				int upperH = h - 1;
				//왼쪽 별부터 찍어보자 for문으로.
				for(int w = 1; w <= userNumber - upperH; w++) {
					stars += "*";
				}
				//가운데 공백을 담당하는 for문
				for(int w = 1; w <= 2 * upperH - 1; w++) {
					stars += " ";
				}
				//별 찍어주는 부분 똑같이 사용
				for(int w = 1; w <= userNumber - upperH; w++) {
					stars += "*";
				}
			} else {
				//왼쪽 별을 담당하는 for문
				int lowerH = h - userNumber + 1;
				for(int w = 1; w <= lowerH; w++) {
					stars += "*";
				}
				//가운데 공백을 담당하는 for문
				for (int w = 1; w <= (userNumber - lowerH) * 2 - 1; w++) {
					stars += " ";
				}
				
				//오른쪽 별을 담당하는 for문
				for(int w = 1; w <= lowerH; w++) {
					stars += "*";
				}
			}
			
			System.out.println(stars);
			
		}
		scanner.close();
	}
}
