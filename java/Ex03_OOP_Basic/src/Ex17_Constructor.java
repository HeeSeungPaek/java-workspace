import java.util.Scanner;

/*
�ڵ��� ������ �Դϴ�.
��������� ������ �ڵ����� �ȷ��� �մϴ�
���� �ڵ����� �⺻ ����� �� ���� �ְ�... �������� ���� �ɼ��� ������ �� �ֽ��ϴ�.
�ڵ����� �⺻��
���� ���� 4��, �ڵ��� ������ "red"�� �⺻�Դϴ�.

�׷��� ����
���� ������ ���� �����ϰ� ���� ������ 4�� �⺻���� �� �� �ְ�
���� ������ �⺻���� �ϰ� ���� ������ ���� �����ϰ�
���� ������ ���� ������ ��� ���� �Ͽ� ���� ������ �� �ֽ��ϴ�.

�ڵ��� ����		//�����ڰ� 4��
1.�⺻ ���		
2.�ɼ� : �� ����, �� �⺻
3.�ɼ� : �� �⺻, �� ����
4.�ɼ� : �� ����, �� ����
*/

class Car5 {
	private int window; // ��� �ʵ忡���� �ʱ�ȭ�� ���������� ���� ���� �ʴ´�.
	private String color;

	public Car5() { // �⺻
		this.window = 4;
		this.color = "red";
	}

	public Car5(int window) { // �� ����, ���� �⺻
		this.window = window;
		this.color = "red";
	}

	public Car5(String color) { // �� �⺻, ���� ����
		this.window = 4;
		this.color = color;
	}

	public Car5(int window, String color) { // ��, ���� ����
		this.window = window;
		this.color = color;
	}

	public void showMenu() {
		System.out.println("�ڡ١ڡ١ڡ١ڡ��ڵ��� �����ҡ١ڡ١ڡ١ڡ١ڡ١�");
		System.out.println("�����Ͻ� ������ �Է����ּ���");
		System.out.println("1.�⺻ 2.�� ���� ���� 3.���� ���� 4.��� ����");
		System.out.println(">>");
	}

	public void carInfo() {
		System.out.println(this.window + "," + this.color);
	}

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

public class Ex17_Constructor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Car5 car = new Car5();

		car.showMenu();
		int inputnumber = Integer.parseInt(sc.nextLine());
		int choicewindow = 0;
		String choicecolor = "";

		if (inputnumber == 1) {
			Car5 car1 = new Car5();
			car1.carInfo();
		} else if (inputnumber == 2) {
			System.out.println("���Ͻô� �� ���� �Է� >>");
			Car5 car2 = new Car5(choicewindow = Integer.parseInt(sc.nextLine()));
			car2.carInfo();
		} else if (inputnumber == 3) {
			System.out.println("���Ͻô� �� ���� �Է�");
			Car5 car3 = new Car5(choicecolor = sc.nextLine());
			car3.carInfo();
		} else if (inputnumber == 4) {
			System.out.println("���Ͻô� ���� �� ����, ���� ���� �Է�");
			Car5 car4 = new Car5(choicewindow = Integer.parseInt(sc.nextLine()), choicecolor = sc.nextLine());
			car4.carInfo();
		} else
			System.out.println("�ùٸ��� �Է����ּ���.");
		System.out.println("���α׷� ����");

		sc.close();

	}
}
