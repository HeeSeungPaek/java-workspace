package cafe;

import java.util.Scanner;

public class Caffe {
	public static void main(String[] args) {

		BusinessOfCaffe business = new BusinessOfCaffe();
		Scanner scanner = BusinessOfCaffe.sc;
		
		while (true) {
			System.out.println("�����������ī�� Pos�����������");
			System.out.println("1.Ŀ�� �Ǹ�\t2.��� Ȯ��\t3.������");
			int inputnumber = Integer.parseInt(scanner.nextLine());		//����ó�� ����

			switch (inputnumber) {
			case 1:
				business.choiceCoffee();
				break;
			case 2:
				business.stock.showStock();
				break;
			case 3:
				System.out.println("ī�信�� �����ϴ�.");
				System.exit(0);
			default:
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���!");
			}

		}
	}
}