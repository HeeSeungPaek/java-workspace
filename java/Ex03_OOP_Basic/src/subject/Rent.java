package subject;

import java.util.Scanner;

public class Rent {
	// �ʵ�
	private String userName;
	private int userBirth;
	private int price;
	//private int totalprice;	�� �����̳� ���� ���ԵǸ� Ȱ��ȭ, �ƴϸ� �����ϱ�

	// ��ǰ����
	Bycicle bycicle;

	// ���
	// ���θ޴� ���
	
	Scanner sc = new Scanner(System.in);
			
			
	public void mainMenu() {
		System.out.println("==========������=========");
		System.out.println("�̸��� ��������� �ۼ��� �ּ���");
		System.out.print("�̸�: ");
		this.userName = sc.nextLine();
		System.out.print("�������(6�ڸ� �Է�) : ");
		this.userBirth = Integer.parseInt(sc.nextLine());
		// System.out.println("���� �����Ű� "+b.count+"�� ���ҽ��ϴ�.");
		do {
			try {
				if (Bycicle.getCount() > 0 && Bycicle.getCount() <= 10) {
					break;
				} else {
					// 0���� �۰ų�, 10���� ū�� => ���α׷� ����
					throw new Exception("���� �뿩�� �� �ִ� �����Ű� �����ϴ�.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("�˼��մϴ�. ������ �湮�� �ּ���");
			}
		} while (true);
		// ����
		// �뿩 �޼ҵ�
		rental();
	}

	// �뿩 �޼ҵ�
	public void rental() {
		Bycicle bycicle = new Bycicle();
	}
	
	//����ǥ ���� �޼ҵ�
	public void price(int price) {	//�޼ҵ��̸� ���̽������̽� - �ʵ� ���̽� �����ϸ� ������
		System.out.print("1:1�ð��� 2:3�ð��� 3.6�ð���  4.���ϱ�:  ");
		price = Integer.parseInt(sc.nextLine());
		while (true) {
			if (price == 1) {
				System.out.println("1�ð����� 1000���Դϴ�.");
				//System.out.println("�ð��ʰ��� 1�ð��� 1000���� �߰������˴ϴ�.");
				break;
			} else if (price == 2) {
				System.out.println("3�ð����� 3000���Դϴ�.");
				//System.out.println("�ð��ʰ��� 1�ð��� 1000���� �߰������˴ϴ�.");
				break;
			}else if (price == 3) {
				System.out.println("6�ð����� 6000���Դϴ�.");
				//System.out.println("�ð��ʰ��� 1�ð��� 1000���� �߰������˴ϴ�.");
				break;
			}else if (price == 4) {
				System.out.println("���ϱ��� 20000���Դϴ�.");
				//System.out.println("�ð��ʰ��� 1�ð��� 1000���� �߰������˴ϴ�.");
				break;
			}else {
				System.out.println("�ٽ��Է����ּ���");
				//System.out.print("1:1�ð��� 2:3�ð��� 3.6�ð���  4.���ϱ� ");
				price = Integer.parseInt(sc.nextLine());
			}
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(int userBirth) {
		this.userBirth = userBirth;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}