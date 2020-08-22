package day03;

import java.util.Scanner;

public class Ex09Stars09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("별 찍기 9번 줄 개수 입력");
		int userNumber = scanner.nextInt();

		// 윗부분 h
		for (int h = 1; h < userNumber; h++) {
			String stars = new String();
			for (int w = 1; w <= userNumber - h; w++) {
				stars += " ";
			}
			for (int w = 1; w <= 2 * h - 1; w++) {
				stars += "*";
			}
			System.out.println(stars);
		}

		// 아랫부분 h
		for (int h = userNumber; h >= 1; h--) {
			String stars = new String();
			for (int w = 1; w <= userNumber - h; w++) {
				stars += " ";
			}
			for (int w = 1; w <= 2 * h - 1; w++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
