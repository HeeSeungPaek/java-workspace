import java.util.Scanner;

public class Ex11_While {

	public static void main(String[] args) {
		// ���ĺ�(A~Z) ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		// (for ���� ����ϼ���)
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		System.out.println();

		for (char i = 65; i <= 90; i++) {
			System.out.print(i);
		}
		System.out.println();

		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i);
		}
		System.out.println();

		// 1~100���� 10�� 10���� ����ϴ� ���α׷��� �ۼ��ϼ���
		// (for���� ����ϼ���)
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%d\t", i);
			if (i % 10 == 0) {
				System.out.println();
			}
		}

		// 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				System.out.println("i : " + i);
				sum += i;
			}

		}

		System.out.println("sum : " + sum);
		// �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					count++;
					System.out.printf("[%d]+[%d]= [%d]\n", i, j, i + j);
				}
			}
		}
		System.out.println("count : " + count);

		double random = Math.random();
		System.out.println(random); // 0<= random < 1
		random = (3 * random + 1); // 1 <= random < 4;
		System.out.println((int) random);
		/*
		 * ���� (1) , ����(2) , �� (3) if(����� == ��ǻ�� ){
		 * 
		 * }else if((����� == 1) && (��ǻ�� == 2)){ ���� - ���� �Ľ� }else if((����� == 1) && (��ǻ�� ==
		 * 3)){ ���� - �� ��� }else if((����� == 2) && (��ǻ�� == 1)){ ���� - ���� ��� }else if((�����
		 * == 2) && (��ǻ�� == 3)){ ���� - �� �Ľ� }else if((����� == 3) && (��ǻ�� == 1)){ �� - ���� �Ľ�
		 * }else if((����� == 3) && (��ǻ�� == 2)){ �� - ���� ��� }else{
		 * 
		 * }
		 */

		/*
		 * 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
		 * 
		 * �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		 * 
		 * ���� , ���� ,�� ���� �� ����� ���ؼ� �ۼ��ϼ��� (IF) ���� ���) ��ǻ�Ͱ� �ڵ����� ���� ���� , ���� , �� �� ���ؼ�
		 * ����ڰ� ���� �Է� �ؼ� ó�� �ϼ��� ( ���� ��� : ����=> 1 , ���� => 2 , �� => 3)
		 */

		boolean auto = true;
		int balance = 0;

		Scanner sc = new Scanner(System.in);

		while (auto) {
			System.out.println("**********************");
			System.out.println("1. ����  |  2. ���  |  3. �ܰ�  |  4. ����");
			System.out.println("**********************");

			System.out.println("����");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				System.out.println("���� :");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("��� :");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.println("�ܰ� : " + balance);
				break;
			case 4:
				System.out.println("�����մϴ�");
				auto = false;
				break;
			default:
				System.out.println("�ùٸ� �޴��� �����ϼ���");

			}

		}
	}

}