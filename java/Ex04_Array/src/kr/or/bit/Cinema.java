package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	private String[][] seat;
	private Scanner scanner;
	private Random random;

	public Cinema() { // 생성자
		scanner = new Scanner(System.in); // 스캐너
		random = new Random(); // 난수 생성
		seat = new String[5][5]; // 자리 5by5

		for (int i = 0; i < seat.length; i++) { // 5by5 초기화 (ex. 1-1)
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i + 1) + "-" + (j + 1);
			}
		}
	}

	private String showMenu() {
		System.out.println("**********************");
		System.out.println("*Bit_Cinema 예매 프로그램*");
		System.out.println("**********************");
		System.out.println();
		System.out.println("원하는 메뉴 번호를 입력하세요.");
		System.out.println("\n1.좌석 보기");
		System.out.println("\n2.좌석 예매");
		System.out.println("\n3.예매 조회");
		System.out.println("\n4.예매 취소");
		System.out.println("\n5. 나가기");
		System.out.println();
		String selectnum = scanner.nextLine();
		return selectnum;
	}

	public void startProgram() {
		while (true) {
			String selectnum = showMenu(); // 프로그램 가동
			switch (selectnum) {
			case "1": // 1번 선택 : 좌석 보기
				showSeat();
				break;
			case "2": // 2번 선택 : 좌석 예매
				reservation();
				break;
			case "3": // 3번 선택 : 예매 번호(난수)로 예매 조회
				checkSeat();
				break;
			case "4": // 4번 선택 : 예매 번호로 예매 취소
				cancelReservation();
				break;
			case "5": // 5번 선택 : 프로그램 나가기
				System.out.println("영화관에서 나갑니다.");
				return;
			default:
				System.out.println("올바른 형식 값을 입력해주세요");
				break;
			}
		}
	}

	private void showSeat() { // 좌석 출력 함수
		System.out.println("※※※※※※※※※※※※※※※※※");
		System.out.println("※비트 시네마 좌석(예매) 현황※");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (!seat[i][j].equals((i + 1) + "-" + (j + 1))) {
					System.out.printf("[예매]");
				} else {
					System.out.printf("[%s]", (i + 1) + "-" + (j + 1));
				}
			}
			System.out.println();
		}
		System.out.println("※※※※※※※※※※※※※※※※※");
	}

	private void reservation() { // 좌석 예매 함수
		showSeat();
		System.out.println("예매하실 좌석을 선택하세요. (ex. 2-3)");
		String seatInput = scanner.nextLine();

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (seatInput.equals(seat[i][j])) {
					System.out.println("선택하신 좌석 번호는 " + seat[i][j] + " 입니다.");
					System.out.println("예약하시겠습니까?");

					choiceMethod();
					String ticketNumber = ticket();
					System.out.println("예매 완료. 좌석번호 : [" + seatInput + "]");
					seat[i][j] = ticketNumber;
					System.out.println("예매 번호 : [" + ticketNumber + "]");
					return;
				}
			}
		}
		System.out.println("유효하지 않은 번호입니다. 다시 입력하세요.");
		reservation(); // 재귀함수
	}

	private void choiceMethod() { // 좌석 선택 시 선택지 제공 함수(예매 함수를 도와주는 함수)
		System.out.println("1.예약한다.\t 2.좌석 재선택한다. \t 3.초기화면");
		String choiceInput = scanner.nextLine();
		while (true) {
			switch (choiceInput) {
			case "1":
				System.out.println("예매하기를 선택하셨습니다.");
				return; // choiceMethod() 종료 -> 예매 로직 이어서 시작
			case "2":
				System.out.println("좌석 재선택");
				reservation();
				break;
			case "3":
				System.out.println("초기화면으로 돌아갑니다.");
				startProgram();
				break;
			default:
				System.out.println("유효하지 않은 입력입니다. 다시 선택해주세요.");
				choiceMethod();
			}
		}
	}

	private void checkSeat() { // 예매 번호로 예매 내역 조회
		System.out.println("예매 확인 : 예매 번호를 입력해주세요.");
		String checkNumber = scanner.nextLine();

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (checkNumber.equals(seat[i][j])) {
					System.out.println("입력하신 예매 번호 : " + seat[i][j] + " 입니다.");
					System.out.println("예매하신 좌석 번호 : " + (i + 1) + "-" + (j + 1));
					return;
				}
			}
		}
		System.out.println("입력하신 번호가 유효하지 않습니다.");
		System.out.println("1.재입력하여 확인하기\t 2.초기화면으로 나가기");
		String choiceNumber = scanner.nextLine();
		switch (choiceNumber) {
		case "1":
			checkSeat();
			break;
		case "2":
			System.out.println("초기화면으로 갑니다.");
			return;
		default:
			System.out.println("유효한 형식을 입력해 주세요.");
			checkSeat();
			break;
		}
		/*
		 * if (choiceNumber.equals("1")) checkSeat(); else if (choiceNumber.equals("2"))
		 * return; else System.out.println("유효하지 않은 형식입니다."); checkSeat();
		 */
	}

	private void cancelReservation() {	//예매 취소 함수
		System.out.println("예매 취소 : 예매 번호를 입력해주세요.");
		String cancelTicket = scanner.nextLine();

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (cancelTicket.equals(seat[i][j])) {
					System.out.println("입력하신 예매 번호 : " + seat[i][j] + " 입니다.");
					System.out.println("취소하신 좌석 번호 : " + (i + 1) + "-" + (j + 1));
					System.out.println("정말로 예매를 취소하시겠습니까?");
					System.out.println("1.취소한다\t 2.초기화면으로 돌아간다.");
					String choiceCancel = scanner.nextLine();
					switch (choiceCancel) {
					case "1":
						System.out.println(
								"예매 취소 내역 -> 예매 번호 : " + seat[i][j] + ", 취소한 좌석 : " + ((i + 1) + "-" + (j + 1)));
						seat[i][j] = (i + 1) + "-" + (j + 1);
						System.out.println("예매가 성공적으로 취소되었습니다.");
					case "2":
						System.out.println("초기화면으로 돌아갑니다.");
						return;
					default:
					}
				}
			}
		}
		System.out.println("유효한 형식을 입력해 주세요.");
		cancelReservation();
	}

	private String ticket() { // 5자리 난수 생성(=쿠폰) 메소드
		String ticketNumber = Integer.toString(random.nextInt(10000)); // 쿠폰 번호(int -> String casting)
		return ticketNumber;
	}

}
