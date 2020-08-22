package Caffe_Sunwoo;

public class Screen {
	Cafe_Coffee coffeeMaking = new Cafe_Coffee();

	public void manage() {
		while (true) {
			System.out.println("=================카페=================");
			System.out.println("1.구매\t\t2.관리\t\t3.종료");
			int i = Integer.parseInt(coffeeMaking.sc.nextLine());
			while (i < 1 && i > 3) {
				System.out.println("올바른 숫자를 입력해 주세요");
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
			System.out.println("================커피머신===============");
			System.out.println("매뉴를 선택하세요");
			System.out.println("1.아메리카노   2.라떼   3.모카   4.종료");
			int i = Integer.parseInt(coffeeMaking.sc.nextLine());
			while (i < 1 || i > 4) {
				System.out.println("올바른 숫자를 입력해 주세요");
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