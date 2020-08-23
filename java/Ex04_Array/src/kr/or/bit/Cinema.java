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

			case "4": // 4번 선택 : 예매 번호로 예매 취소
				break;
			case "5": // 5번 선택 : 프로그램 나가기
				break;
			default:
				System.out.println("올바른 형식 값을 입력해주세요");
				break;
			}
		}
	}

	private void showSeat() {
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

	private void reservation() {
		showSeat();
		System.out.println("예매하실 좌석을 선택하세요. (ex. 2-3)");
		String seatInput = scanner.nextLine();

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (seatInput.equals(seat[i][j])) {
					String ticketNumber = ticket();
					System.out.println("예매 완료. 좌석번호 : [" + seatInput + "]");
					seat[i][j] = ticketNumber;
					System.out.println("예매 번호 : [" + ticketNumber + "]");
				} else {
					System.out.println("유효하지 않은 좌석번호, 다시 입력하세요.");
					return;
				}
			}
		}
	}

	private String ticket() { // 5자리 난수 생성(=쿠폰) 메소드
		String ticketNumber = Integer.toString(random.nextInt(10000)); // 쿠폰 번호(int -> String casting)
		return ticketNumber;
	}

}
