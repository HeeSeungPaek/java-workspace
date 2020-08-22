package day03;

import java.util.Scanner;

public class Ex10Stars10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ��� 10�� �Է�");
		int userNumber = scanner.nextInt();
		
		for(int h = 1; h <= 2 * userNumber - 1; h++) {
			String stars = new String();
			if(h == 1 || h == 2 * userNumber - 1) {
				for(int w = 1; w <= 2 * userNumber - 1; w++) {
					stars += "*";
				}
			} else if ( h < userNumber) {
				int upperH = h - 1;
				//���� ������ ���� for������.
				for(int w = 1; w <= userNumber - upperH; w++) {
					stars += "*";
				}
				//��� ������ ����ϴ� for��
				for(int w = 1; w <= 2 * upperH - 1; w++) {
					stars += " ";
				}
				//�� ����ִ� �κ� �Ȱ��� ���
				for(int w = 1; w <= userNumber - upperH; w++) {
					stars += "*";
				}
			} else {
				//���� ���� ����ϴ� for��
				int lowerH = h - userNumber + 1;
				for(int w = 1; w <= lowerH; w++) {
					stars += "*";
				}
				//��� ������ ����ϴ� for��
				for (int w = 1; w <= (userNumber - lowerH) * 2 - 1; w++) {
					stars += " ";
				}
				
				//������ ���� ����ϴ� for��
				for(int w = 1; w <= lowerH; w++) {
					stars += "*";
				}
			}
			
			System.out.println(stars);
			
		}
		scanner.close();
	}
}
