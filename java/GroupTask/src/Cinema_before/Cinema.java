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
			case "1": // �¼� ����
				showSeat();
				break;
			case "2": // �¼� ����
				loop_2: while (true) {
					showSeat();
					if (verifySeat() == null) {
						break loop_2;
					} else
						break; // ���⿡ �����ൿ �߰�
				}
			case "3": // ���� ��ȸ

			case "4": // ���� ���
				break;
			case "5": // ������
				break loop_1;
			default:
				System.out.println("�ùٸ� ���� ���� �Է����ּ���");
				break;
			}
		}
		System.out.println("�̿��� �ּż� �����մϴ�.");
	}

	private String showMenu() { // return selectnum -> �޴� ����
		System.out.println("**********************");
		System.out.println("*Bit_Cinema ���� ���α׷�*");
		System.out.println("**********************");
		System.out.println();
		System.out.println("���ϴ� �޴� ��ȣ�� �Է��ϼ���.");
		System.out.println("\n1.�¼� ����");
		System.out.println("\n2.�¼� ����");
		System.out.println("\n3.���� ��ȸ");
		System.out.println("\n4.���� ���");
		System.out.println("\n5. ������");
		System.out.println();
		String selectnum = scanner.nextLine();
		return selectnum;
	}

	private void showSeat() {
		System.out.println("�ءءءءءءءءءءءءءءءء�");
		System.out.println("�غ�Ʈ �ó׸� �¼�(����) ��Ȳ��");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (!seat[i][j].equals((i + 1) + "_" + (j + 1))) {
					System.out.printf("[����]");
				} else {
					System.out.printf("[%s]", (i + 1) + "_" + (j + 1));
				}
			}
			System.out.println();
		}
		System.out.println("�ءءءءءءءءءءءءءءءء�");
	}

	private String[][] verifySeat() { // 2��. �¼� ����

		loop_1: while (true) {
			System.out.println("�¼��� �������ּ���. ex) 2_3");
			System.out.println("���̹� ���ŵ� �¼��� \"����\"��� ǥ�õ˴ϴ�.");
			String seatnumber = scanner.nextLine();

			loop_2: while (true) {
				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						if (seat[i][j].equals(seatnumber)) {

							System.out.println("���� �����մϴ�.���� �Ͻðڽ��ϱ�?");
							System.out.println("1.�����ϱ�, 2.�¼� �� �����ϱ�, 3.�ʱ�ȭ��");
							String checknumber = scanner.nextLine();

							switch (checknumber) {
							case "1":
								System.out.println("������ �¼���ȣ:[" + seat[i][j] + "]");
								String rand = "" + r.nextInt(99999999);
								this.seat[i][j] = rand;
								System.out.println("���� ��ȣ : " + rand);
								System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
								return seat;
							case "2":
								System.out.println("�¼��� �ٽ� �����ϼ���");
								break;
							case "3":
								System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
								return null;
							default:
								System.out.println("�ùٸ� ��ȣ�� �Է����ּ���");
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