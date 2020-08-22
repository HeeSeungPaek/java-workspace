import java.util.Scanner;

public class Ex11_Quiz {

	// 조별과제 (제어문)
	public static void main(String[] args) {
		
		
		// 1번문제 : 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println("1~20 사이 정수 중 2 또는 3의 배수를 제외한 합 : " + sum);


		// 2. 두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("합이 6이 되는 경우의 수\t[%d,%d]\n", i, j);
				}
			}
		}


		// 3번 문제
		Scanner scanner = new Scanner(System.in);

		int com = (int) ((Math.random() * 3) + 1);
		String message = "";
		String win = "You win.\n";
		String draw = "Draw.\n";
		String lose = "You Lose.\n";

		System.out.println(">가위[1], 바위[2], 보[3] 입력 > ");
		int user = Integer.parseInt(scanner.nextLine());

		while (user < 1 || user > 3) { // 입력값 외일 때,
			System.out.println("가위[1], 바위[2], 보[3] 중에 하나를 입력해주세요! > ");
			user = Integer.parseInt(scanner.nextLine());
		}

		if (user == com) { // 비겻을 경우
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
		System.out.println("컴퓨터 (가위[1], 바위[2], 보[3]): " + com + " ");
		System.out.println("사용자 (가위[1], 바위[2], 보[3]): " + user + " ");
		System.out.println(message);
	}

}