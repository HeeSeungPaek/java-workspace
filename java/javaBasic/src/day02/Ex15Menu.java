package day02;
//���ѷ����� ����� �޴� �����

//������ �Է� ���� �� ����
//�г��� 3�г����
//���� 5�ݱ���
//�� �������� ��� ��ȿ�� ������

//������ ��� ���� ��
//�г�, ���� 2�ڸ� ������ ����
//������, �������� ������ 3�ڸ� ������ ���� �ϰ� ���� ������� 0���� ä���
//����� �Ҽ��� 3��° �ڸ����� ��µǰ� �ۼ��Ͻÿ�.

//������ ���� ��ġ�� �� ����
//int kor, eng, math = 0; ���� �ʱ�ȭ �ϸ�
//math ���� �ϳ��� �ʱ�ȭ �Ǵ� ���̴�.
import java.util.Scanner;

public class Ex15Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int haknyeon = 0;
		int ban = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		String name = new String();

		while (true) {
			System.out.println("=====================");
			System.out.println("��Ʈ����б� �����������α׷�");
			System.out.println("=====================");
			System.out.println("1.�Է� 2.��� 3.����");
			int choice = scanner.nextInt();

			if (choice == 1) { // ���� �Է�
				System.out.println("�г� �Է� : ");
				haknyeon = scanner.nextInt();
				while (haknyeon < 1 || haknyeon > 3) {
					System.out.println("�߸��� �г�");
					System.out.println("�г� �Է� : ");
					haknyeon = scanner.nextInt();
				}

				System.out.println("�� �Է� : ");
				ban = scanner.nextInt();
				while (ban < 1 || ban > 5) {
					System.out.println("�߸��� ��");
					System.out.println("�� �Է� : ");
					ban = scanner.nextInt();
				}

				System.out.println("�̸� �Է� :");
				scanner.nextLine();
				name = scanner.nextLine();

				System.out.println("���� ���� �Է� : ");
				kor = scanner.nextInt();
				while (kor < 0 || kor > 100) {
					System.out.println("�߸��� ���� ����");
					System.out.println("���� ���� �Է� : ");
					kor = scanner.nextInt();
				}

				System.out.println("���� ���� �Է� : ");
				eng = scanner.nextInt();
				while (eng < 0 || eng > 100) {
					System.out.println("�߸��� ���� ����");
					System.out.println("���� ���� �Է� : ");
					eng = scanner.nextInt();
				}

				System.out.println("���� ���� �Է� : ");
				math = scanner.nextInt();
				while (math < 0 || math > 100) {
					System.out.println("�߸��� ���� ����");
					System.out.println("���� ���� �Է� : ");
					math = scanner.nextInt();
				}

			} else if (choice == 2) { // ���� ���
				// ������ ��� ���� ��
				// �г�, ���� 2�ڸ� ������ ����
				// ������, �������� ������ 3�ڸ� ������ ���� �ϰ� ���� ������� 0���� ä���
				// ����� �Ҽ��� 3��° �ڸ����� ��µǰ� �ۼ��Ͻÿ�.
				/*
				 * System.out.printf("%2d�г� %2d�� %s �л��� ����\n" +
				 * "���� : %03d��, ���� : %03d��, ���� : %03��\n" + "�� ���� : %03d��, ��� : %.3f��", haknyeon,
				 * ban, name, kor, eng, math, total, average);
				 */
				if (haknyeon == 0) {
					System.out.println("�Էµ� ������ �����ϴ�.");
				} else {
					System.out.printf("%2d�г� %2d�� %s �л��� ����\n", haknyeon, ban, name);
					System.out.printf("���� : %03d��, ���� : %03d��, ���� : %03d��\n", kor, eng, math);
					int total = kor + eng + math;
					double average = total / 3.0;
					System.out.printf("�� ���� : %03d��, ��� : %.3f��\n", total, average);
				}

			} else if (choice == 3) {
				// break�� �ش� �ڵ� ����� ������ �����Ų��
				// ���� �� break�� else if(choice == 3)�ڵ� ����� ����������
				// �����δ� choice�� 3�̸�
				// 18,19������ for loop�ȿ� ���ԵǴ� ���̶� �����ϸ� �ȴ�.
				System.out.println("������ּż� �����մϴ�");
				break;
			} else {
				System.out.println("Wrong input");
			}
		}
		scanner.close();
	}
}