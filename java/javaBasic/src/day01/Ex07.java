package day01;

import java.util.Scanner;

//����ڷκ���
//�г�, ��, �̸�, ����, ����, ���� ������ �Է¹޾Ƽ�
//���г� ��� ���� �������� :#��, �������� #��, �������� : #��
//���� #��, ��� #.#���� ��µǴ� ���α׷��� �ۼ��ϼ���.
//����)
//�г�? 3
//��? 2
//�̸�? �����
//����? 95
//����? 100
//����? 15
//3�г� 2�� ���翵 �������� : 80��, ��������: 80��, ��������: 81��
//����: 210��, ���: ##.##��

public class Ex07 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("�г� �Է� : ");
		int haknyeon = scanner.nextInt();

		System.out.println("�� �Է� : ");
		int ban = scanner.nextInt();

		// String�� �Է� �ޱ� ������ scanner.nextLine(); �ʿ�
		scanner.nextLine();
		System.out.println("�̸� �Է� :");
		String name = scanner.nextLine();

		System.out.println("���� ���� �Է� : ");
		int kor = scanner.nextInt();

		System.out.println("���� ���� �Է� : ");
		int eng = scanner.nextInt();

		System.out.println("���� ���� �Է� : ");
		int math = scanner.nextInt();

		int total = (kor + eng + math);
		double average = (kor + eng + math) / 3;

		System.out.println(
				+haknyeon + "�г� " + ban + "�� " + name + "\n" + "�������� : " + kor + " �������� : " + eng + " �������� : " + math);
		System.out.println("���� : " + total + "��" + "\n��� : " + average + "��");
		
		scanner.close();
	}
}
