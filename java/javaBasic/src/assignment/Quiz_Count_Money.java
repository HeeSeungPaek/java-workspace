package assignment;

import java.util.Scanner;

public class Quiz_Count_Money {
	public static void main(String[] args) {

		int unit = 10000;
		int num = 0;
		int sw = 0;

		Scanner scanner = new Scanner(System.in);

		int money = Integer.parseInt(scanner.nextLine());

		while (true) {
			num = money / unit; 				// 123456 -> num = 12

			System.out.printf("[%d]�� [%d]�� \n", unit, num);
			if (unit > 1) { 					// ȭ������� 1��������
				money = money - (unit * num); 	// ��� �� �ż���ŭ �Է°����� ���̳ʽ� -> ���� �� ����
				if (sw == 0) { 					// ȭ�� ���������� ���� ���� -> ó�� ���� �˻� �� ������ ����
					unit = unit / 2;
					sw = 1; 					// ȭ������� ���ڸ��� 5�϶� ������ else���� Ÿ�� ���� ����Ī���� �Ҵ� : 10000 > 5000...
				}
				else {							// ����Ī���� ������ ���ڸ��� 5������ �� ���ڸ��� 1�� ���� : 5000 > 1000...
					unit = unit / 5;
					sw = 0;
				}
			} 
			else {
				break;							//ȭ������� 1���� �����ٸ� Ż��
			}
		}
	}
}
