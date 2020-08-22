package day03;

import java.util.Scanner;

public class Ex04Stars04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("별 찍기 4번");
		System.out.println("줄 수를 입력해주세요.");
		int userNumber = scanner.nextInt();

		for (int h = 1; h <= userNumber; h++) {
			String stars = new String();
			for (int w = 1; w <= h - 1; w++) {
				stars += " ";
			}
			for (int w = h; w <= userNumber; w++) {
				stars += "*";
			}
			System.out.println(stars);
		}

		scanner.close();
	}
}
