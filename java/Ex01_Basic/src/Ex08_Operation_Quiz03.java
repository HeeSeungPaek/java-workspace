import java.util.Scanner;

public class Ex08_Operation_Quiz03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int Total = 0;

		boolean flag = true;

		try {

			System.out.print(">�Է°�:");

			int number1 = Integer.parseInt(scanner.nextLine());

			System.out.print("\n>�Է°�(��ȣ): ");

			String operator = scanner.nextLine();

			System.out.print("\n>�Է°�: ");

			int number2 = Integer.parseInt(scanner.nextLine());

			scanner.close();

			switch (operator) {

			case "+":

				Total += number1 + number2;

				break;

			case "-":

				Total += number1 - number2;

				break;

			case "*":

				Total += number1 * number2;

				break;

			case "/":

				Total += number1 / number2;

				break;

			default:

				flag = false;

				break;

			}

			if (operator.equals("+")) {

				System.out.print(">������: " + Total);

			} else if (operator.equals("-")) {

				System.out.print(">������: " + Total);

			} else if (operator.equals("*")) {

				System.out.print(">������: " + Total);

			} else if (operator.equals("/")) {

				System.out.print(">������: " + Total);

			} else {

				System.out.print(">�߸��� �����ȣ�Դϴ�. error : " + operator);

			}

		} catch (Exception e) {

			System.out.print(">����  : " + e.getMessage());

		}

	}

}