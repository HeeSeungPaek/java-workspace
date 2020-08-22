import java.util.Scanner;

public class Ex09_Statement {
	public static void main(String[] args) {

		System.out.println("�Է�");
		Scanner sc = new Scanner(System.in);

		/*
		 * if(sc.hasNextInt()) { //has�� ���� �ǹ��� ( true, false ) //������ �ԷµǾ��� }else {
		 * //������ �ƴϾ� }
		 */

		// �ϱ��� ��.
		// ���ǹ� : if 3����, switch(����){case ��... break}
		// �ݺ��� : for( �ʱ��; ���ǽ�; ������ ), while��(true, false), do{�����}while(����)
		// �б⹮ : break(���� Ż���ض�); continue(�� �Ʒ� ������ ��ŵ�ض�);

		int count = 0;
		if (count < 1) {
			System.out.println("True");
		}

		char data = 'A';

		switch (data) {
		case 'A':
			System.out.println("���� �� ����");
			break;
		default:
			System.out.println("������ ��� ��");
			// break; default���� ��������
		}

		// 1���� 100������ ���� ���(for)
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i; // ���Կ����� ��� <- sum = sum + i;
		}
		System.out.println("1~100������ �� : " + sum);

		// 1~5������ ��
		// n * (a + l) / 2 -> ���������� �� ����
		// ���� * (����+��) / 2
		sum = 5 * (1 + 5) / 2;
		System.out.println("1~5������ �� : " + sum);

		// for���� ����ؼ� 1~10������ Ȧ���� ���� ���Ͽ���
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
			i++;
		}
		System.out.println("1~10���� Ȧ���� ���� : " + sum2);

		// for���� ����ؼ� 1~10������ Ȧ���� ���� ���Ͽ��� -version 2
		int sum3 = 0;
		for (int i = 1; i <= 10; i += 2) { // i = i + 2 (i + = 2)ó�� for���� �����Ŀ� ������ �� �޾��� �� �ִ�.
			sum3 += i;
		}
		System.out.println("1~10���� Ȧ���� ���� : " + sum3);

		// 1~100������ �� (¦��) if�� ���
		int sum4 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0)
				continue;
			else
				sum4 += i;
		}
		System.out.println("1~100������ ¦���� �� : " + sum4);

		// �Ի����(�߼ұ��)����
		// �������� ���(��ø for��)
		// 2�� ~ 9�ܱ���
		// 2 >> 1~9���� �������� ������ ����

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("[%d] X [%d] = [%d]  ", i, j, i * j);
			}
			System.out.println();
		}

		// �б⹮ (continue, break)
		// Today Point : continue (�Ʒ� ������ skip), break (�� Ż��)

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					break;
				}
				System.out.printf("%s", "*");
			}
			System.out.println();
		}

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					continue;
				}
				System.out.printf("[%d] X [%d] = [%d]  ", i, j, i * j);
			}
			System.out.println();
		}

		// ����� / ���ĵ� �ѹ� �غ���
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j < i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		for(int i = 100; i >= 0; i--) { //���ǹݺ����� ������ �� ���̴�
			System.out.println(i);
		}

		//�Ǻ���ġ ���� -> �����ϰ�
		int a = 0, b = 1, c = 0;
		for(int i = 0; i < 10; i ++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println("\t" + c);
		}
		
	}
}