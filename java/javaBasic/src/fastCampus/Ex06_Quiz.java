package fastCampus;

import java.util.Scanner;

public class Ex06_Quiz {

	public static void main(String[] args) {
		// 코딩해 보세요
		// 제어문까지 배운것을 복습하면서 예제를 풀어보자

		// 1. 연산자와 두 수를 변수로 선언한 후 사칙연산이 수행 되는 프로그램을 만들어보세요.
		// if-else if-else, switch-case 두 방식 모두 구현해 봅시다.

		Scanner sc = new Scanner(System.in);
		final int LIMIT = 1000;
		String result = "";

		System.out.print("입력값1 > ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("\n연산자 > ");
		String operator = sc.nextLine();
		System.out.print("\n입력값2 > ");
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
				System.out.println("연산자 (+, -, *, /, %)를 정확히 입력해 주세요.");
				operator = sc.nextLine();
			}
		}
		System.out.print("연산 결과 > " + num1 + " " + operator + " " + num2 + " = " + result);

		// 2.마름모 다이아몬드를 구현해 보세요.

		Scanner scanner = new Scanner(System.in);

		System.out.println("홀수 입력하시오 > ");
		int un = Integer.parseInt(scanner.nextLine());

		for (int h = 1; h <= un; h++) {
			String str = new String();
			if (h <= un / 2 + 1) { // 입력한 홀수개 라인 정삼각형
				for (int w = h; w <= un / 2; w++) { // 정삼각형 공백은 갈수록 줄어든다
					str += " ";
				}
				for (int w = 1; w <= (h * 2) - 1; w++) { // 정삼각형 갈수록 별은 늘어난다
					str += "*";
				}
				System.out.println(str);
			} else { // 입력한 홀수 숫자/2 +1 라인부터는 역정삼각형
				for (int w = un / 2 + 1; w < h; w++) { // 역정삼각형의 공백은 갈수록 늘어난다
					str += " ";
				}
				for (int w = 1; w <= (un * 2) - (h * 2) + 1; w++) { // 역정삼각형의 별은 갈수록 줄어든다
					str += "*";
				}
				System.out.println(str);
			}
		}

	}

}
