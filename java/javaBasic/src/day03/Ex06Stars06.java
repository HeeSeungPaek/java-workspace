package day03;

import java.util.Scanner;

public class Ex06Stars06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ��� 6�� ����Ͻ� �� ������ �Է����ּ���.");
		int userNumber = scanner.nextInt();

		// 5 �Է½� // 090 // 171 // 252 // 333 // 414
		for (int h = 1; h <= userNumber; h++) {
			String stars = new String();

			for (int w = 1; w <= h - 1; w++) {
				stars += " ";
			}
			for (int w = 1; w <= (userNumber * 2) - (h * 2) + 1; w++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();

		/*
		 * System.out.println("�� ��� 6�� ���Ƕ�̵�, ����� �� ������ �Է�"); int userNumber =
		 * scanner.nextInt();
		 * 
		 * // 5�� �Է� // 4 1 4 // 3 3 3 // 2 5 2 // 1 7 1 // 0 9 0 for (int h =
		 * userNumber; h <= 1; h--) { String stars = new String(); for (int w = 1; w <=
		 * userNumber - h; w++) { stars += " "; } for (int w = 1; w <= (h * 2) - 1; w++)
		 * { stars += "+"; }
		 * 
		 * System.out.println(stars);
		 * 
		 * }
		 */
	}
}
