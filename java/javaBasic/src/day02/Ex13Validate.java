package day02;
//����ڷκ��� ������ �Է¹޾�
//a,b,c,d,f�� ����ϴ� ���α׷�.
//��, �߸��� ������ �ԷµǸ� ���޼��� ��� ��
//�ùٸ� ������ ���� ������ �ٽ� �Է¹޴´�.
import java.util.Scanner;

public class Ex13Validate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� : ");
		int score = scanner.nextInt();
		
		//this is validation how using While
		while(score < 0 || score > 100) {
			System.out.println("�߸��� �����Դϴ�.\n �ٽ� �Է����ּ���. : ");
			score = scanner.nextInt();
		}
		
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
		
		scanner.close();
	}
}
