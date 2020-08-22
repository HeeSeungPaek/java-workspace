package Cinema_before;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	private String[][] seat;
	private Scanner scanner;
	private Random r;

	public Cinema() {
		this.scanner = new Scanner(System.in);
		this.r = new Random();
		this.seat = new String[5][5];

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i + 1) + "_" + (j + 1);
			}
		}

	}

	public void startProgram() {
		loop_1: while (true) {
			String selectnum = showMenu();
			switch (selectnum) {
			case "1": // 좌석 보기
				showSeat();
				break;
			case "2": // 좌석 예매
				loop_2: while (true) {
					showSeat();
					if (verifySeat() == null) {
						break loop_2;
					} else
						break; // 여기에 다음행동 추가
				}
			case "3": // 예매 조회

			case "4": // 예매 취소
				break;
			case "5": // 나가기
				break loop_1;
			default:
				System.out.println("올바른 형식 값을 입력해주세요");
				break;
			}
		}
		System.out.println("이용해 주셔서 감사합니다.");
	}

	private String showMenu() { // return selectnum -> 메뉴 선택
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

	private void showSeat() {
		System.out.println("※※※※※※※※※※※※※※※※※");
		System.out.println("※비트 시네마 좌석(예매) 현황※");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (!seat[i][j].equals((i + 1) + "_" + (j + 1))) {
					System.out.printf("[예매]");
				} else {
					System.out.printf("[%s]", (i + 1) + "_" + (j + 1));
				}
			}
			System.out.println();
		}
		System.out.println("※※※※※※※※※※※※※※※※※");
	}

	private String[][] verifySeat() { // 2번. 좌석 예매

		loop_1: while (true) {
			System.out.println("좌석을 선택해주세요. ex) 2_3");
			System.out.println("※이미 예매된 좌석은 \"예매\"라고 표시됩니다.");
			String seatnumber = scanner.nextLine();

			loop_2: while (true) {
				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						if (seat[i][j].equals(seatnumber)) {

							System.out.println("예매 가능합니다.예매 하시겠습니까?");
							System.out.println("1.예매하기, 2.좌석 재 선택하기, 3.초기화면");
							String checknumber = scanner.nextLine();

							switch (checknumber) {
							case "1":
								System.out.println("예매한 좌석번호:[" + seat[i][j] + "]");
								String rand = "" + r.nextInt(99999999);
								this.seat[i][j] = rand;
								System.out.println("예매 번호 : " + rand);
								System.out.println("예매가 완료되었습니다.");
								return seat;
							case "2":
								System.out.println("좌석을 다시 선택하세요");
								break;
							case "3":
								System.out.println("초기화면으로 돌아갑니다.");
								return null;
							default:
								System.out.println("올바른 번호를 입력해주세요");
								break;
							}
						} else if (!seat[i][j].equals(seatnumber)) {

						}

					}
				}
			}

		}
	}

	public String[][] getSeat() {
		return seat;
	}

	public void setSeat(String[][] seat) {
		this.seat = seat;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

}