package day03;
//*

//**
//***
//****
//*****
//...

import java.util.Scanner;

public class Ex01Star01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ���� �Է����ּ���");
		int userNumber = scanner.nextInt();

		// �����Ѱ�
		// for(int height = 0; height <= cnt - 1; height++) {
		// for(int width = 0; width <= height; width++) {
		// System.out.print("*");
		// }
		// System.out.println("");
		// }

		for (int height = 1; height <= userNumber; height++) {
			// ���� j for�� ���� �߰��� string�� �ϳ� ������
			String stars = new String();
			for (int width = 1; width <= height; width++) {
				stars += "*";
			}
			System.out.println(stars);
		}

		scanner.close();
	}
}
