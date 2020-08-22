import java.util.Scanner;

public class Ex08_Operation_Quiz03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int Total = 0;

		boolean flag = true;

		try {

			System.out.print(">입력값:");

			int number1 = Integer.parseInt(scanner.nextLine());

			System.out.print("\n>입력값(기호): ");

			String operator = scanner.nextLine();

			System.out.print("\n>입력값: ");

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

				System.out.print(">연산결과: " + Total);

			} else if (operator.equals("-")) {

				System.out.print(">연산결과: " + Total);

			} else if (operator.equals("*")) {

				System.out.print(">연산결과: " + Total);

			} else if (operator.equals("/")) {

				System.out.print(">연산결과: " + Total);

			} else {

				System.out.print(">잘못된 연산기호입니다. error : " + operator);

			}

		} catch (Exception e) {

			System.out.print(">오류  : " + e.getMessage());

		}

	}

}