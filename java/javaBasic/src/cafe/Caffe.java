package cafe;

import java.util.Scanner;

public class Caffe {
	public static void main(String[] args) {

		BusinessOfCaffe business = new BusinessOfCaffe();
		Scanner scanner = BusinessOfCaffe.sc;
		
		while (true) {
			System.out.println("〓〓〓〓〓〓〓〓〓〓카페 Pos〓〓〓〓〓〓〓〓〓〓");
			System.out.println("1.커피 판매\t2.재고 확인\t3.나가기");
			int inputnumber = Integer.parseInt(scanner.nextLine());		//예외처리 연습

			switch (inputnumber) {
			case 1:
				business.choiceCoffee();
				break;
			case 2:
				business.stock.showStock();
				break;
			case 3:
				System.out.println("카페에서 나갑니다.");
				System.exit(0);
			default:
				System.out.println("올바른 숫자를 입력해주세요!");
			}

		}
	}
}