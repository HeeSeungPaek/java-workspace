package day03;

import java.util.Scanner;

public class Ex04Stars04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ��� 4��");
		System.out.println("�� ���� �Է����ּ���.");
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
