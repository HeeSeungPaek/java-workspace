package assignment;

import java.util.Scanner;
/*
�ó�����
 -������ �뿩�ϴ� ���� ���α׷� �ۼ�
 -�����Ŵ� 10�밡 �ʿ��ϴ� �������� ���ο��� ������ 17��ġ�̰� �ٵ�� 200cm�̰� �ι� ������, 
  �ڵ��� ũ��� 30cm�� �����̴�.
 -�뿩 �� �⺻ �������� ������ black�̸�, �뿩 �� ���� ������ ����ϸ�, ������ �ٲ� �뿩�� �� �ִ�.
 -������ �뿩 ���
 >�̸��� ��������� �ۼ��ϸ� �뿩�� �����ϴ�.
 >�̸��� ��������� �ۼ��ϸ� �ݳ��� �����ϴ�.
 >�뿩 �ð��� �ݳ� �ð��� ����ϵ� ���ױ����� 1�ð��� /3�ð��� /6�ð���/ ���ϱ� ������ �����ϴ�.
 >���� �ݾ��� 1�ð����� 1000��, 3�ð����� 3000��, 6�ð����� 6000��, ���ϱ��� 20000���̴�.
 >�����Ÿ� ��������, ���� �뿩������ �����Ű� �� �� �ִ��� �� �� �ְ�, ���� �뿩������ �����Ű� 0����
  ���� �� �ִ� �����Ű� ���ٰ� �����Ѵ�. 
 */

class Bicycle { // =================================================Bicycle Ŭ����
	// ��������
	private static int handle = 30;
	private static int body = 200;
	private static int wheel = 17;

	// ���� ����
	private String color;

	Scanner sc = new Scanner(System.in);
	
	// �⺻ �����ڿ� this �޼ҵ带 �߰���, �⺻ �����ڸ� �Է��ϸ� "�⺻ ������ ������ black"
	public Bicycle() {
		this("black");
	}

	public Bicycle(String color) {	//������ �����ϰ� ���� �� ���� ����Ǵ� �����ε��� �������Լ�
		color = sc.nextLine();
		this.color = color;
	}

	public int getHandle() {
		return handle;
	}

	public int getBody() {
		return body;
	}

	public int getWheel() {
		return wheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

class Rent { // ==================================================== Rent Ŭ����
	// ��������
	private String userName;
	private int userBirth;
	private int choice; // ������

	private int price;
	// private int totalprice; �� �����̳� ���� ���ԵǸ� Ȱ��ȭ, �ƴϸ� �����ϱ�

	private static int count = 3; // ��Ʈ Ŭ�������� ������ �����Ѵ�

	// count�� set�� �� ����(write)
	/*
	 * public static void setCount(int count) { Bicycle.count = count; }
	 */

	// �����Ÿ� ������ �� ����Ǿ�� �ϴ� �޼ҵ�(������ �� -1)

	public static void minusCount() {
		count -= 1;
	}

	// ��ǰ����
	Bicycle bicycle;

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
				if (getCount() > 0 && getCount() <= 3) {	//������ ������ 3�� ������ ���
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
		rental(bicycle);
	}

	// �뿩 �޼ҵ�
	public void rental(Bicycle b) {
		b = new Bicycle();
	}

	// ����ǥ ���� �޼ҵ�
	public void choicePrice(int choice) { // �޼ҵ��̸� ���̽������̽� - �ʵ� ���̽� �����ϸ� ������
		System.out.print("1:1�ð��� 2:3�ð��� 3.6�ð���  4.���ϱ�:  ");
		choice = Integer.parseInt(sc.nextLine());
		while (true) {
			if (choice == 1) {
				System.out.println("1�ð����� 1000���Դϴ�.");
				price = 1000;
				// System.out.println("�ð��ʰ��� 1�ð��� 1000���� �߰������˴ϴ�.");
				break;
			} else if (choice == 2) {
				System.out.println("3�ð����� 3000���Դϴ�.");
				price = 3000;
				// System.out.println("�ð��ʰ��� 1�ð��� 1000���� �߰������˴ϴ�.");
				break;
			} else if (choice == 3) {
				System.out.println("6�ð����� 6000���Դϴ�.");
				price += 6000;
				// System.out.println("�ð��ʰ��� 1�ð��� 1000���� �߰������˴ϴ�.");
				break;
			} else if (choice == 4) {
				System.out.println("���ϱ��� 20000���Դϴ�.");
				price += 20000;
				// System.out.println("�ð��ʰ��� 1�ð��� 1000���� �߰������˴ϴ�.");
				break;
			} else {
				System.out.println("�ٽ��Է����ּ���");
				// System.out.print("1:1�ð��� 2:3�ð��� 3.6�ð��� 4.���ϱ� ");
				choice = Integer.parseInt(sc.nextLine());
			}
		}
	}

	public static int getCount() {
		return count;
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

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

// ����
public class Bicycle_Show_main {
	public static void main(String[] args) {
		
		Rent rent = new Rent();
		//ù ��° �մ��� �⺻�����Ÿ� �뿩�ϰ� �;��Ѵ�. 
		Bicycle b1 = new Bicycle();
		
		
		
	}
}
