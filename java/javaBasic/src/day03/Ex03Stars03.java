package day03;

import java.util.Scanner;

public class Ex03Stars03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ��� 3��");
		System.out.println("�� ���� �Է����ּ���");
		int userNumber = scanner.nextInt();

		for (int h = 1; h <= userNumber; h++) {
			String stars = new String();
			//������ ����ϴ� w for���� ���� ����ϴ� w for��
			
			for(int w = 1; w <= userNumber - h; w++) {
				//������ �� �� usernumber - h���̴�.
				stars += " ";
			}
			//���� ����ϴ� w for���̴�.
			for(int w = 1; w <= h; w++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
