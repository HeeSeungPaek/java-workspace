package day02;

import java.util.Scanner;

//����ڷκ��� ������ �Է¹޾Ƽ�
//90���̻� a
//80~89�� b
//70~79�� c
//60~69�� d
//59�� ���� f�� ��µǴ� ���α׷��� ������

public class Ex06IfElseIf02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("�����Է� : ");
		int score = scanner.nextInt();

		if (score < 60) {
			System.out.println("���� F �Դϴ�");
		} else if (score < 70) {
			System.out.println("���� D �Դϴ�");
		} else if (score < 80) {
			System.out.println("���� C �Դϴ�");
		} else if (score < 90) {
			System.out.println("���� B �Դϴ�");
		} else {
			System.out.println("���� A �Դϴ�");
		}

		/*
		 * if(score >= 90) { System.out.println("���� A �Դϴ�"); }else if(score >= 80) {
		 * System.out.println("���� B �Դϴ�"); }else if(score >= 70) {
		 * System.out.println("���� C �Դϴ�"); }else if(score >= 60) {
		 * System.out.println("���� D �Դϴ�"); }else { System.out.println("���� F �Դϴ�"); }
		 */

		// ���� �ڵ�� ������ ��ȿ�� �������� ������ ���� �ʾұ� ������
		// 100�� �ʰ��ϰų� 0 �̸��� ������ ���� �۵��ϴ� �����̴�.
		// �׷��ٸ� ��� �ؾ� �̷��� ���� ������ �� ������?
		// 2���� ������� ������ �����ϴ�.
		//ù��° ����� ��Ȯ�� ������ ������ �ִ� ��,
		//�ι�° ����� ���� �����Ͱ� ��ȿ���� üũ�� ��
		//�����Ͱ� ��ȿ�� ������ ������ �з��ϴ� if������ ����.
		//��ȿ���� ���� ������ ������ �߸��� �����Դϴ� �� ��µǰ� ������ش�
		//�� ���� if�� �ȿ� if�� ���� ��ø if��(nested if)������ �ȴ�.
		
		System.out.println("�����Ͱ���(��ȿ�� �˻�)1 : ��Ȯ�� ���� �Ҵ�");
		if (score >= 90 && score <= 100) {
			System.out.println("���� : A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("���� : B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("���� : C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("���� : D");
		} else if (score >= 0 && score <= 59) {
			System.out.println("���� : F");
		} else {
			System.out.println("0~100 ������ ������ �Է����ּ���.");
		}

		System.out.println("�����Ͱ���(��ȿ�� �˻�)2 : nested if block");
		if(score >= 0 && score <= 100) {
			if (score < 60) {
				System.out.println("���� F �Դϴ�");
			} else if (score < 70) {
				System.out.println("���� D �Դϴ�");
			} else if (score < 80) {
				System.out.println("���� C �Դϴ�");
			} else if (score < 90) {
				System.out.println("���� B �Դϴ�");
			} else {
				System.out.println("���� A �Դϴ�");
			}
		}else {
			System.out.println("0~100 ������ ������ �Է����ּ���.");
		}
		
		scanner.close();
	}
}
