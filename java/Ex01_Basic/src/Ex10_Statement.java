import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		// �ݺ��� (while, do ~ while)

		int i = 10;

		while (i >= 10) {
			i--; // �ݵ�� while���� ��,���� ���� �ʿ��ϴ�, ���� ��� ���ѷ���!
			System.out.println("i : " + i);
		}

		// while 1~100������ ��
		int sum = 0;
		int j = 1;
		while (j <= 100) {
			// j++; // sum:5150
			sum += j;
			j++; // sum : 5050

		}
		System.out.printf("sum : [%d] , j : [%d]", sum, j);
		System.out.println();

		// while������ ������ ���
		// ���ǹ��� �� ����ϴ� ���� ���δ� ������ ���� �ߴ���, ���ߴ����̴�.
		// ������ ���� �ڵ�� ���� �� ���� �ȵȴ�.
		// ���Ƽ��� �����ϴ� ������
		// ������ �� ���� ���� ���� �غ��� ����(���ڵ��� �ƴ� ���ڵ�) �� �ΰ����� �ʼ��̴�.
		// �ڵ带 ¥���� ���� ����� ������ �ʿ�
		
		int a = 2;
		int b = 1;

		while (a <= 9) {
			while (b <= 9) {
				System.out.printf("[%d] X [%d] = [%d] ", a, b, a * b);
				b++;
			}
			a++;
			b = 1;
			System.out.println();
		}

		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�\n");

		int a1 = 2;
		while (a1 <= 9) {
			int b1 = 1;
			while (b1 <= 9) {
				System.out.printf("[%d] X [%d] = [%d] ", a1, b1, a1 * b1);
				b1++;
			}
			a1++;
			b1 = 1;
			System.out.println();
		}
	
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�\n");
		
		//while(true) {if(true) break;} �̰ŵ� ����
		
		//do ~while �ܿ��� : ������ ���� ... while���� ������ �����̸� �ѹ��� ��Ÿ����, do~while�� ������ �ѹ� ��������
		//�ַ� �޴������� ���� �� ���� ���δ�.
		//do { ���๮ } while (���ǽ�) : ������ true�� do�� ��� ����, ������ false�� ��������.
		//�޴� ����
		//1. �λ�
		//2. ȸ��
		//����� ���ϴ� ������ �����ϼ��� >> do {�����ϼ��� _ ���� �޾Ƽ�}
		//�Է°� : 3 >> while(���ǽ�) ���� �Ǵ� -> 
		
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		
		do {
			System.out.println("���� (0~9)�Է��� : ");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata >= 10); //������ true��� do���� ��� ����...
								 //������ false�� �� Ż��!! ��� ���鶧 �����Ͽ� �����
		System.out.println("����� �Է��� ���ڴ� : " + inputdata);
		
		
	}

}