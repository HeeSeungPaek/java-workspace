package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	private String[][] seat;
	private Scanner scanner;
	private Random random;

	public Cinema() { // ������
		scanner = new Scanner(System.in); // ��ĳ��
		random = new Random(); // ���� ����
		seat = new String[5][5]; // �ڸ� 5by5

		for (int i = 0; i < seat.length; i++) { // 5by5 �ʱ�ȭ (ex. 1-1)
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i + 1) + "-" + (j + 1);
			}
		}
	}

	private String showMenu() {
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

	public void startProgram() {
		while (true) {
			String selectnum = showMenu(); // ���α׷� ����
			switch (selectnum) {
			case "1": // 1�� ���� : �¼� ����
				showSeat();
				break;
			case "2": // 2�� ���� : �¼� ����
				reservation();
				break;
			case "3": // 3�� ���� : ���� ��ȣ(����)�� ���� ��ȸ
				checkSeat();
				break;
			case "4": // 4�� ���� : ���� ��ȣ�� ���� ���
				cancelReservation();
				break;
			case "5": // 5�� ���� : ���α׷� ������
				System.out.println("��ȭ������ �����ϴ�.");
				return;
			default:
				System.out.println("�ùٸ� ���� ���� �Է����ּ���");
				break;
			}
		}
	}

	private void showSeat() { // �¼� ��� �Լ�
		System.out.println("�ءءءءءءءءءءءءءءءء�");
		System.out.println("�غ�Ʈ �ó׸� �¼�(����) ��Ȳ��");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (!seat[i][j].equals((i + 1) + "-" + (j + 1))) {
					System.out.printf("[����]");
				} else {
					System.out.printf("[%s]", (i + 1) + "-" + (j + 1));
				}
			}
			System.out.println();
		}
		System.out.println("�ءءءءءءءءءءءءءءءء�");
	}

	private void reservation() { // �¼� ���� �Լ�
		showSeat();
		System.out.println("�����Ͻ� �¼��� �����ϼ���. (ex. 2-3)");
		String seatInput = scanner.nextLine();

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (seatInput.equals(seat[i][j])) {
					System.out.println("�����Ͻ� �¼� ��ȣ�� " + seat[i][j] + " �Դϴ�.");
					System.out.println("�����Ͻðڽ��ϱ�?");

					choiceMethod();
					String ticketNumber = ticket();
					System.out.println("���� �Ϸ�. �¼���ȣ : [" + seatInput + "]");
					seat[i][j] = ticketNumber;
					System.out.println("���� ��ȣ : [" + ticketNumber + "]");
					return;
				}
			}
		}
		System.out.println("��ȿ���� ���� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
		reservation(); // ����Լ�
	}

	private void choiceMethod() { // �¼� ���� �� ������ ���� �Լ�(���� �Լ��� �����ִ� �Լ�)
		System.out.println("1.�����Ѵ�.\t 2.�¼� �缱���Ѵ�. \t 3.�ʱ�ȭ��");
		String choiceInput = scanner.nextLine();
		while (true) {
			switch (choiceInput) {
			case "1":
				System.out.println("�����ϱ⸦ �����ϼ̽��ϴ�.");
				return; // choiceMethod() ���� -> ���� ���� �̾ ����
			case "2":
				System.out.println("�¼� �缱��");
				reservation();
				break;
			case "3":
				System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
				startProgram();
				break;
			default:
				System.out.println("��ȿ���� ���� �Է��Դϴ�. �ٽ� �������ּ���.");
				choiceMethod();
			}
		}
	}

	private void checkSeat() { // ���� ��ȣ�� ���� ���� ��ȸ
		System.out.println("���� Ȯ�� : ���� ��ȣ�� �Է����ּ���.");
		String checkNumber = scanner.nextLine();

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (checkNumber.equals(seat[i][j])) {
					System.out.println("�Է��Ͻ� ���� ��ȣ : " + seat[i][j] + " �Դϴ�.");
					System.out.println("�����Ͻ� �¼� ��ȣ : " + (i + 1) + "-" + (j + 1));
					return;
				}
			}
		}
		System.out.println("�Է��Ͻ� ��ȣ�� ��ȿ���� �ʽ��ϴ�.");
		System.out.println("1.���Է��Ͽ� Ȯ���ϱ�\t 2.�ʱ�ȭ������ ������");
		String choiceNumber = scanner.nextLine();
		switch (choiceNumber) {
		case "1":
			checkSeat();
			break;
		case "2":
			System.out.println("�ʱ�ȭ������ ���ϴ�.");
			return;
		default:
			System.out.println("��ȿ�� ������ �Է��� �ּ���.");
			checkSeat();
			break;
		}
		/*
		 * if (choiceNumber.equals("1")) checkSeat(); else if (choiceNumber.equals("2"))
		 * return; else System.out.println("��ȿ���� ���� �����Դϴ�."); checkSeat();
		 */
	}

	private void cancelReservation() {	//���� ��� �Լ�
		System.out.println("���� ��� : ���� ��ȣ�� �Է����ּ���.");
		String cancelTicket = scanner.nextLine();

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (cancelTicket.equals(seat[i][j])) {
					System.out.println("�Է��Ͻ� ���� ��ȣ : " + seat[i][j] + " �Դϴ�.");
					System.out.println("����Ͻ� �¼� ��ȣ : " + (i + 1) + "-" + (j + 1));
					System.out.println("������ ���Ÿ� ����Ͻðڽ��ϱ�?");
					System.out.println("1.����Ѵ�\t 2.�ʱ�ȭ������ ���ư���.");
					String choiceCancel = scanner.nextLine();
					switch (choiceCancel) {
					case "1":
						System.out.println(
								"���� ��� ���� -> ���� ��ȣ : " + seat[i][j] + ", ����� �¼� : " + ((i + 1) + "-" + (j + 1)));
						seat[i][j] = (i + 1) + "-" + (j + 1);
						System.out.println("���Ű� ���������� ��ҵǾ����ϴ�.");
					case "2":
						System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
						return;
					default:
					}
				}
			}
		}
		System.out.println("��ȿ�� ������ �Է��� �ּ���.");
		cancelReservation();
	}

	private String ticket() { // 5�ڸ� ���� ����(=����) �޼ҵ�
		String ticketNumber = Integer.toString(random.nextInt(10000)); // ���� ��ȣ(int -> String casting)
		return ticketNumber;
	}

}
