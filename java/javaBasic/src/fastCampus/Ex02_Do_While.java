package fastCampus;

import java.util.Scanner;

public class Ex02_Do_While {
	public static void main(String[] args) {
		//�Է¹޴� ������ ��� �����ش�.
		//�Էµ� ������ 0�̸� �ݺ����� ���� ���´�.
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		
		//ù��° �� �ݿ��� ��� ����:
		//���ڴ� ���ڴ� �ϴ� String�������� �ް� >>��ĳ��.nextLine()
		//�� ���ڰ� �������� ��� Integer.parseInt()�Ἥ ���������� ��ȯ!
		//Integer.parseInt()�� wrapperŬ���� ������
		//wrapperŬ������ ���� Ÿ��(int, char, double��)��
		//�������� �����Ѵ�. ������� ���� ����� ����.
		//���� ��� ��� ���� ���� �ϳ�. �ϴ� �̷� �����
		//�ִٴ� �͸� �˾Ƶ���.
		
		int sum = 0;

		do {
			input = Integer.parseInt(scanner.nextLine());
			sum += input;
		}while(input != 0);
		
		System.out.println(sum);
		
	}
}
