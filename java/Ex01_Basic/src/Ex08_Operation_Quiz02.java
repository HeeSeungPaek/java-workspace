import java.util.Scanner;

public class Ex08_Operation_Quiz02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �����Է�
		System.out.print("�Է°� (����): ");
		String inputValue = scan.nextLine();
		int number1 = Integer.parseInt(inputValue);
		// �����Է�
		System.out.print("�Է°�(��ȣ):");
		String operation = scan.nextLine();
		// �����Է�
		System.out.print("�Է°�(����): ");
		String inputValue2 = scan.nextLine();
		int number2 = Integer.parseInt(inputValue2);

		int result = 0;

		if (operation.equals("+")) {
			result = number1 + number2;
		} else if (operation.equals("-")) {
			result = number1 - number2;
		} else if (operation.equals("*")) {
			result = number1 * number2;
		} else if (operation.equals("/")) {
			if (number2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			} else {
				double result1 = (double) number1 / number2;
				System.out.println("������ :" + result1);
			}
			scan.close();
			return;
			// return Ű���� : [�Լ�����]�� ������ > "main �Լ� Ż��" > ����
			// return�� Ÿ�� �Ʒ� ������ ������� �ʰ� Ż���Ѵ�.
		}
		System.out.println("������ :" + result);
		scan.close();
	}
}