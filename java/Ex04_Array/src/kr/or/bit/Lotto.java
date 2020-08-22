package kr.or.bit;
import java.util.Random;
import java.util.Scanner;
/*
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
	(int)(Math.random()*45 + 1)
	lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)
4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
추후에는 별도의 클래스 분리해서 Lotto.java ..... 
현재 main 함수 안에서 사용 ....연습...
조별 1개 입니다
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요  (처음...)
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (기초 학습...)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요   (자료구조 ...)
4. 위 결과를 담고 있는 배열을 출력하세요 
 */

//설계도로 분리할 땐, 어떤 걸 정보로 담고, 어떤 기능을 만들지!
public class Lotto {
	// public int[] numbers = new int[6]; -> 틀린 코드는 아니나, 개선의 여지가 있다.
	// 개선의 여지? : public(: 상태정보는 캡슐화해야함)
	private int[] numbers; // 개선의 여지? : 초기화는 스태틱 조기자, 일반 초기자 또는 생성자가 목적에 맞게 해줘야 한다.
	// private Scanner scanner = new Scanner(System.in); //개선의 여지가 있다.
	private Scanner scanner;
	private Random r; // new Random();

	public Lotto() { // 초기화 - 멤버필드에 대해
		numbers = new int[6];
		scanner = new Scanner(System.in);
		r = new Random();
	}

	// 기능 >> 함수로 만든다. >> 함수 하나당 기능은 하나.
	// 함수는 외부에서 노출되려면 public
	// 그런데, public이 아닌 함수도 선언할 수 있다.
	// private 함수 : 내부적으로 사용되는 공통 함수같은 것

	// 실 번호 추출해주세요.
	// 중복값 나오면 안되요.
	// 낮은 순으로 정렬해 주세요.
	// 화면에 출력해 주세요.
	// 메뉴 기능을 만들어 주세요.

	public void selectLottoNumbers() {
		loop_1: while (true) {
			String selectnum = showMenu();
			switch (selectnum) {
			case "1":
				// makeLottoNumbers(); // 실번호 추출
				// showLottoNumbers();
				do {
					makeLottoNumbers();
				} while (!checkAverage());
				showLottoNumbers();
				break;
			case "2": // 프로그램 종료 : >> 함수 종료(return), 프로그램 Kill(System.exit(0))
						// 라벨값을 이용해 종료 총 3가지로 본다.
				System.out.println("Good Luck");
				break loop_1; // break 지점이 switch... 라벨위치(loop_1)로 나가버림(while문 탈출)
			default:
				System.out.println("not in operation");
				break;
			}
		}
	}

	private String showMenu() {
		System.out.println("********************");
		System.out.println("*1.당첨 예상 번호 추출하기*");
		System.out.println("*2.프로그램 종료 ^^! ^^*");
		System.out.println("********************");
		System.out.println("원하는 메뉴 번호를 입력하세요.");
		String selectnum = scanner.nextLine();
		return selectnum;
	}

	// 번호 추출, 중복값 배제
	private void makeLottoNumbers() {
		for (int i = 0; i < numbers.length; i++) { // 1번,2번. 난수 할당 및 중복 시 추출, 재할당
			numbers[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					// System.out.println("중복 확인됨");
					i--;
				}
			}
		}
	}

	// 화면에 출력 (낮은 값)
	private void showLottoNumbers() {
		for (int i = 0; i < numbers.length - 1; i++) { // 3번. 작은 값과 큰 값의 위치 바꾼 후 처음부터 검사
			// System.out.printf("[%d],[%d]\n", i, numbers[i]);
			if (numbers[i] > numbers[i + 1]) {
				int temp = numbers[i];
				numbers[i] = numbers[i + 1];
				numbers[i + 1] = temp;
				i = -1; // 다음 i는 1이 더해지기때문에 다시 처음부터 검사
			}
		}

		System.out.println("[선택한 Lotto번호]");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("lotto번호 [%02d]번째 : [%d]\n", i + 1, numbers[i]);
		}

	}

	// 로또 (로또 번호의 합의 평균 범위 ...) ...아니면 재추출
	private boolean checkAverage() {
		int sum = 0;
		int average = 0;
		for (int num : numbers) {
			sum += num;
		}
		average = sum / numbers.length;
		System.out.println("평균 : " + average);
		return (average > 15 && average <= 35); // true 리턴되면 ok, false리턴되면 재추출
	}
}
