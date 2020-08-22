package Cinema_after;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	private String[][] seat;
	private Scanner scanner;
	private Random r;

	public Cinema() { // Cinema 디폴트 생성자로 스캐너 On, Random객체 On, 좌석 2차원 배열 seat 지정
		this.scanner = new Scanner(System.in);
		this.r = new Random();
		this.seat = new String[5][5];

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i + 1) + "-" + (j + 1);
			}
		}

	}

	private String showMenu() { // return selectnum -> 메뉴 선택
		System.out.println("**********************");
		System.out.println("*Bit_Cinema 예매 프로그램*");
		System.out.println("**********************");
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
		exit_program: while (true) {
			String selectnum = showMenu();
			switch (selectnum) {
			case "1": // 좌석 보기
				showSeat();
				break;
			case "2": // 좌석 예매
				BackToProgram: while (true) {
					showSeat();
					if (reserveSeat() == null) {
						break BackToProgram;
					} else
						break;
				}
			case "3": // 예매 조회

			case "4": // 예매 취소
				break;
			case "5": // 나가기
				break exit_program;
			default:
				System.out.println("올바른 형식 값을 입력해주세요");
				break;
			}
		}
		System.out.println("이용해 주셔서 감사합니다.");
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

	private String[][] reserveSeat() { // 2번. 좌석 예매

		while (true) {
			System.out.println("좌석을 선택해주세요. ex) 2_3");
			System.out.println("※이미 예매된 좌석은 \"예매\"라고 표시됩니다.");
			String seatnumber = scanner.nextLine();
			//좌석 선택할 때, 이상한 글자로 좌석 선택하면 다시 돌게 해야됨
			loop_1: while (true) {
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
								break loop_1;
							case "3":
								System.out.println("초기화면으로 돌아갑니다.");
								return null;
							default:
								System.out.println("올바른 번호를 입력해주세요");
								break;
							}
						} else if (!seat[i][j].equals(seatnumber)) { // 설정해주기
							System.out.println("이미 예매된 좌석입니다. 다시 선택해주세요. \n");
							break loop_1;
						}
					}
				}
			}
		}
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
