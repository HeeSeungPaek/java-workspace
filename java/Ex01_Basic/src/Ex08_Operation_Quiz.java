
/*
������ ��Ģ ����� (+ , - , * , /)
�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)
���� : Integer.parseInt() ,  **equals() Ȱ��**
ȭ��
>�Է°�:����
>�Է°�(��ȣ): +
>�Է°�:���� 
>������ :200
-------------
>�Է°�:100
>�Է°�(��ȣ): -
>�Է°�:100
>������ :0
*/

import java.util.Scanner;

public class Ex08_Operation_Quiz {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String result = "";

		System.out.print(">�Է°�:");
		int number1 = Integer.parseInt(scanner.nextLine());

		System.out.print("\n>�Է°�(��ȣ): ");
		String operator = scanner.nextLine();

		System.out.print("\n>�Է°�: ");
		int number2 = Integer.parseInt(scanner.nextLine());

		scanner.close();

		if (operator.equals("+")) {
			result += number1 + number2;
		} else if (operator.equals("-")) {
			result += number1 - number2;
		} else if (operator.equals("*")) {
			result += number1 * number2;
		} else {
			result += number1 / number2;
		}
		System.out.print(">������: " + result);
	}

}
