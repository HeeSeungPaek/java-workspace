package Quiz_Computer;
import java.util.Scanner;
//������� �䱸���� �м�
//�䱸���� : 
//��ǻ�ʹ�
//�Ӽ� : ����, �귣��, �ø���ѹ�, ������ ������ �־�� �Ѵ�.
//���� : ������尡 �����ؾ� �Ѵ�.
//��ǰ : ��ü, Ű����, ����͸� ����� �� �ִ�.
//��� : ��,��� | ����on,off | ������� on,off | ��Ģ���� ����
public class Computer {
	private int price; // --------------------------����ʵ�
	private String brand;
	private String serialnumber;
	private String color;
	private boolean sleep; // �������
	MainBody mainbody = new MainBody(); //
	Monitor monitor; //
	KeyBoard keyboard = new KeyBoard();
	public void showMenu() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("------------------------------------------");
			System.out.println("----------------��ǻ�� ���α׷�----------------");
			System.out.println("------------------------------------------");
			System.out.println("----1.�Է�  2.���  3.�������  4.�������  5.��Ģ���� 6.���α׷� ����----");
			System.out.println(">>");
			int inputnumber = Integer.parseInt(scanner.nextLine());
			if (inputnumber == 1) { // �Է� > Ű���带 �̿��� �Է��� �޴´� (��ĳ�� ����Ͽ� ������ ����,setKbutton()�̿��� �����Ѵ�.
				inputString();
			} else if (inputnumber == 2) {
				outputString();
			} else if (inputnumber == 3) {
				System.out.println("���� ��ü ���� : " + checkBodyPower());
				/*
				 * Scanner scanner = new Scanner(System.in); if(mainbody.isPower()==false) {
				 * System.out.println("��ü�� �ѽðڽ��ϱ�?\n 1.��\t 2.�ƴϿ�"); int pnumber =
				 * Integer.parseInt(scanner.nextLine()); if(pnumber==1) {
				 * System.out.println("����ð� ���� 1�� �Ӹ��� �ȵ��ư���"); } } else {
				 * System.out.println("��ü�� ���ðڽ��ϱ�?\n 1.��\t 2.�ƴϿ�"); int pnumber =
				 * Integer.parseInt(scanner.nextLine()); //�̱��� }
				 */
			} else if (inputnumber == 4) {
				// �̱���
				break;
			} else if (inputnumber == 5) {
				calculator();
			} else if (inputnumber == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
	public String inputString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nŰ���带 �̿��� ���� �Է����ּ��� >> ");
		keyboard.setKbutton(scanner.nextLine()); // kbutton ���ڿ����� ���� �Ҵ�
		System.out.println("�Է� �Ϸ�.");
		return keyboard.getKbutton();
	}
	public void outputString() {
		if (keyboard.getKbutton() == null) { // �����Է¹ۿ� �� �ɸ�
			System.out.println("�Է��Ͻ� ���� �����ϴ�!");
		} else
			System.out.println("�Է��Ͻ� �� : " + keyboard.getKbutton()); // �Է°��� �Է����� �ʾƵ� �Է��Ͻ� ���� ����.
	}
	public String checkBodyPower() { // ���� üũ
		String str = "";
		if (mainbody.isPower() == true) {
			str = "ON";
		} else
			str = "OFF";
		return str;
	}
	public void turnOnPower() { // ���� �ѱ�
		if (mainbody.isPower() == true) {
			System.out.println("�̹� ���� �ֽ��ϴ�!");
		} else {
			System.out.println("������ ŵ�ϴ�.");
			mainbody.setPower(true);
		}
	}
	public void turnOffPower() { // ���� ����
		if (mainbody.isPower() != true) {
			System.out.println("�̹� ���� �ֽ��ϴ�!");
		} else {
			System.out.println("������ ���ϴ�.");
			mainbody.setPower(false);
		}
	}
	public void calculator() {
		Scanner scanner = new Scanner(System.in);
		String result = "";
		System.out.print(">�Է°�:");
		int number1 = Integer.parseInt(scanner.nextLine());
		System.out.print("\n>�Է°�(��ȣ): ");
		String operator = scanner.nextLine();
		System.out.print("\n>�Է°�: ");
		int number2 = Integer.parseInt(scanner.nextLine());
		if (operator.equals("+")) {
			result += number1 + number2;
		} else if (operator.equals("-")) {
			result += number1 - number2;
		} else if (operator.equals("*")) {
			result += number1 * number2;
		} else {
			result += number1 / number2;
		}
		System.out.print(">������: " + result + "\n");
	}
	public int getPrice() { // --------------------------getter, setter
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isSleep() {
		return sleep;
	}
	public void setSleep(boolean computersleep) {
		this.sleep = computersleep;
	}
}