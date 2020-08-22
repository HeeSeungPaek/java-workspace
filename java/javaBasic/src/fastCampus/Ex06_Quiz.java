package fastCampus;

import java.util.Scanner;

public class Ex06_Quiz {

	public static void main(String[] args) {
		// �ڵ��� ������
		// ������� ������ �����ϸ鼭 ������ Ǯ���

		// 1. �����ڿ� �� ���� ������ ������ �� ��Ģ������ ���� �Ǵ� ���α׷��� ��������.
		// if-else if-else, switch-case �� ��� ��� ������ ���ô�.

		Scanner sc = new Scanner(System.in);
		final int LIMIT = 1000;
		String result = "";

		System.out.print("�Է°�1 > ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("\n������ > ");
		String operator = sc.nextLine();
		System.out.print("\n�Է°�2 > ");
		int num2 = Integer.parseInt(sc.nextLine());

		while (true) {
			if (operator.equals("+")) {
				result += num1 + num2;
				break;
			} else if (operator.equals("-")) {
				result += num1 - num2;
				break;
			} else if (operator.equals("*")) {
				result += num1 * num2;
				break;
			} else if (operator.equals("/")) {
				result += num1 / num2;
				break;
			} else if (operator.equals("%")) {
				result += num1 % num2;
				break;
			} else {
				System.out.println("������ (+, -, *, /, %)�� ��Ȯ�� �Է��� �ּ���.");
				operator = sc.nextLine();
			}
		}
		System.out.print("���� ��� > " + num1 + " " + operator + " " + num2 + " = " + result);

		// 2.������ ���̾Ƹ�带 ������ ������.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ȧ�� �Է��Ͻÿ� > ");
		int un = Integer.parseInt(scanner.nextLine());

		for (int h = 1; h <= un; h++) {
			String str = new String();
			if (h <= un / 2 + 1) { // �Է��� Ȧ���� ���� ���ﰢ��
				for (int w = h; w <= un / 2; w++) { // ���ﰢ�� ������ ������ �پ���
					str += " ";
				}
				for (int w = 1; w <= (h * 2) - 1; w++) { // ���ﰢ�� ������ ���� �þ��
					str += "*";
				}
				System.out.println(str);
			} else { // �Է��� Ȧ�� ����/2 +1 ���κ��ʹ� �����ﰢ��
				for (int w = un / 2 + 1; w < h; w++) { // �����ﰢ���� ������ ������ �þ��
					str += " ";
				}
				for (int w = 1; w <= (un * 2) - (h * 2) + 1; w++) { // �����ﰢ���� ���� ������ �پ���
					str += "*";
				}
				System.out.println(str);
			}
		}

	}

}
