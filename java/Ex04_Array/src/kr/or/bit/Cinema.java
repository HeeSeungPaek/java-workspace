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

			case "4": // 4�� ���� : ���� ��ȣ�� ���� ���
				break;
			case "5": // 5�� ���� : ���α׷� ������
				break;
			default:
				System.out.println("�ùٸ� ���� ���� �Է����ּ���");
				break;
			}
		}
	}

	private void showSeat() {
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

	private void reservation() {
		showSeat();
		System.out.println("�����Ͻ� �¼��� �����ϼ���. (ex. 2-3)");
		String seatInput = scanner.nextLine();

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (seatInput.equals(seat[i][j])) {
					String ticketNumber = ticket();
					System.out.println("���� �Ϸ�. �¼���ȣ : [" + seatInput + "]");
					seat[i][j] = ticketNumber;
					System.out.println("���� ��ȣ : [" + ticketNumber + "]");
				} else {
					System.out.println("��ȿ���� ���� �¼���ȣ, �ٽ� �Է��ϼ���.");
					return;
				}
			}
		}
	}

	private String ticket() { // 5�ڸ� ���� ����(=����) �޼ҵ�
		String ticketNumber = Integer.toString(random.nextInt(10000)); // ���� ��ȣ(int -> String casting)
		return ticketNumber;
	}

}
