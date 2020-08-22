package day03;

import java.util.Scanner;

public class Ex07Stars07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("별 찍기 7번 출력할 줄 개수를 입력");
		int userNumber = scanner.nextInt();

		for (int h = 1; h <= userNumber * 2 - 1; h++) {
			String stars = new String();
			if (h < userNumber) {
				for (int w = 1; w <= h; w++) {
					stars += "*";
				}
			} else {
				int lowerH = h - userNumber + 1;
				for (int w = lowerH; w <= userNumber; w++) {
					stars += "*";
				}
			}
			System.out.println(stars);
		}
		scanner.close();
		/*
		 * for (int h = 1; h <= userNumber; h++) { String stars = new String(); for (int
		 * w = 1; w <= h; w++) { stars += "*"; } System.out.println(stars); }
		 * 
		 * for (int h = userNumber - 1; h >= 1; h--) { String stars = new String();
		 * 
		 * for (int w = 1; w <= h; w++) { stars += "*"; } System.out.println(stars); }
		 */
	}
}
