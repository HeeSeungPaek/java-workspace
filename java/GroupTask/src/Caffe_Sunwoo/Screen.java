package Caffe_Sunwoo;

public class Screen {
	Cafe_Coffee coffeeMaking = new Cafe_Coffee();

	public void manage() {
		while (true) {
			System.out.println("=================ī��=================");
			System.out.println("1.����\t\t2.����\t\t3.����");
			int i = Integer.parseInt(coffeeMaking.sc.nextLine());
			while (i < 1 && i > 3) {
				System.out.println("�ùٸ� ���ڸ� �Է��� �ּ���");
				i = Integer.parseInt(coffeeMaking.sc.nextLine());
				if (i >= 1 && i <= 3) {
					break;
				}
			}
			if (i == 1) {
				buy();
			} else if (i == 2) {
				coffeeMaking.check();
			} else if (i == 3) {
				break;
			}
		}
	}

	public void buy() {
		while (true) {
			System.out.println("================Ŀ�Ǹӽ�===============");
			System.out.println("�Ŵ��� �����ϼ���");
			System.out.println("1.�Ƹ޸�ī��   2.��   3.��ī   4.����");
			int i = Integer.parseInt(coffeeMaking.sc.nextLine());
			while (i < 1 || i > 4) {
				System.out.println("�ùٸ� ���ڸ� �Է��� �ּ���");
				i = Integer.parseInt(coffeeMaking.sc.nextLine());
				if (i >= 1 && i <= 4) {
					break;
				}
			}
			if (i == 1) {
				coffeeMaking.americano();
			} else if (i == 2) {
				coffeeMaking.latte();
			} else if (i == 3) {
				coffeeMaking.moca();
			} else if (i == 4) {
				break;
			}
		}
	}
}