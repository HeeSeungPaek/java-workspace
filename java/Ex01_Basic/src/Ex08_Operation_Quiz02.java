import java.util.Scanner;

public class Ex08_Operation_Quiz02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자입력
		System.out.print("입력값 (숫자): ");
		String inputValue = scan.nextLine();
		int number1 = Integer.parseInt(inputValue);
		// 문자입력
		System.out.print("입력값(기호):");
		String operation = scan.nextLine();
		// 숫자입력
		System.out.print("입력값(숫자): ");
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
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				double result1 = (double) number1 / number2;
				System.out.println("연산결과 :" + result1);
			}
			scan.close();
			return;
			// return 키워드 : [함수단위]의 종결자 > "main 함수 탈출" > 종료
			// return을 타면 아래 문장은 실행되지 않고 탈출한다.
		}
		System.out.println("연산결과 :" + result);
		scan.close();
	}
}