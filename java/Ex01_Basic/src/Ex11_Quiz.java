import java.util.Scanner;

public class Ex11_Quiz {

	// �������� (���)
	public static void main(String[] args) {
		
		
		// 1������ : 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println("1~20 ���� ���� �� 2 �Ǵ� 3�� ����� ������ �� : " + sum);


		// 2. �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("���� 6�� �Ǵ� ����� ��\t[%d,%d]\n", i, j);
				}
			}
		}


		// 3�� ����
		Scanner scanner = new Scanner(System.in);

		int com = (int) ((Math.random() * 3) + 1);
		String message = "";
		String win = "You win.\n";
		String draw = "Draw.\n";
		String lose = "You Lose.\n";

		System.out.println(">����[1], ����[2], ��[3] �Է� > ");
		int user = Integer.parseInt(scanner.nextLine());

		while (user < 1 || user > 3) { // �Է°� ���� ��,
			System.out.println("����[1], ����[2], ��[3] �߿� �ϳ��� �Է����ּ���! > ");
			user = Integer.parseInt(scanner.nextLine());
		}

		if (user == com) { // ����� ���
			message += draw;
		} else if (user == 1) {
			if (com == 2) {
				message += lose;
			} else
				message += win;
		} else if (user == 2) {
			if (com == 3) {
				message += lose;
			} else
				message += win;
		} else if (user == 3) {
			if (com == 1) {
				message += lose;
			} else
				message += win;
		}
		System.out.println("��ǻ�� (����[1], ����[2], ��[3]): " + com + " ");
		System.out.println("����� (����[1], ����[2], ��[3]): " + user + " ");
		System.out.println(message);
	}

}