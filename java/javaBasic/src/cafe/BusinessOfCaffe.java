package cafe;

import java.util.Scanner;

public class BusinessOfCaffe { // 커피를 만들어주는 클래스

	private int priceOfAmericano;
	private int priceOfLatte;
	private int priceOfMoca;
	private int customerprice;
	static Scanner sc = new Scanner(System.in);
	Stock stock;

	BusinessOfCaffe() { // --각 음료의 가격 초기화
		this.stock = new Stock();
		this.priceOfAmericano = 1000;
		this.priceOfLatte = 2000;
		this.priceOfMoca = 3000;
	}

	public void choiceCoffee() {
		System.out.println("고객님, 메뉴를 선택해주세요.");
		System.out.println("1.아메리카노  2.카페라떼    3.카페모카");
		int choice = Integer.parseInt(sc.nextLine());
		boolean option = true;
		
		while (option)
			switch (choice) { // 바꾸기
			case 1: // 아메리카노
				System.out.printf("아메리카노는 [%d]원입니다. 금액 입력>\n", priceOfAmericano);
				customerprice = Integer.parseInt(sc.nextLine());
				while (option) {
					if (stock.getWater() > 0 && stock.getShot() > 0) { // 품절이 아닌 경우
						if (customerprice < priceOfAmericano) { // 아메리카노 가격보다 투입금액이 적은 경우
							System.out.printf("금액이 [%d]원 모자랍니다.더 투입해주세요\n", priceOfAmericano - customerprice);
							customerprice += Integer.parseInt(sc.nextLine());
						} else {
							if (customerprice >= priceOfAmericano) {
								System.out.printf("거스름돈 [%d원] 있습니다.\n", customerprice - priceOfAmericano);
							}
							americano();
							option = false;
						}
					} else if (stock.getWater() != 0 || stock.getShot() != 0) {
						soldOutPrint();
						System.out.println("1.아메리카노\t2.카페라떼\n3.카페모카");
						choice = Integer.parseInt(sc.nextLine());
					}
				}
				break;
			case 2: // 카페라떼
				System.out.printf("카페라떼는 [%d]원입니다. 금액 입력>\n", priceOfLatte);
				customerprice = Integer.parseInt(sc.nextLine());
				while (option) {
					if (stock.getMilk() > 0 && stock.getShot() > 0) {
						if (customerprice < priceOfLatte) {
							System.out.printf("금액이 [%d]원 모자랍니다.더 투입해주세요\n", priceOfLatte - customerprice);
							customerprice += Integer.parseInt(sc.nextLine());
						} else {
							if (customerprice >= priceOfLatte) {
								System.out.printf("거스름돈 [%d원] 있습니다.\n", customerprice - priceOfLatte);
							}
							latte();
							option = false;
						}
					} else {
						soldOutPrint();
						System.out.println("1.아메리카노\t2.카페라떼\n3.카페모카");
						choice = Integer.parseInt(sc.nextLine());
					}
				}
				break;
			case 3: // 카페모카
				System.out.printf("카페모카는 [%d]원입니다. 금액 입력>\n", priceOfMoca);
				customerprice = Integer.parseInt(sc.nextLine());
				while (option) {
					if (stock.getMilk() > 0 && stock.getShot() > 0
							&& stock.getSyrup() > 0 && stock.getWhipping() > 0) {
						if (customerprice < priceOfMoca) {
							System.out.printf("금액이 [%d]원 모자랍니다.더 투입해주세요\n", priceOfMoca - customerprice);
							customerprice += Integer.parseInt(sc.nextLine());
						} else {
							if (customerprice >= priceOfMoca) {
								System.out.printf("거스름돈 [%d원] 있습니다.\n", customerprice - priceOfMoca);
							}
							moca();
							option = false;
						}
					} else {
						soldOutPrint();
						System.out.println("1.아메리카노\t2.카페라떼\n3.카페모카");
						choice = Integer.parseInt(sc.nextLine());
					}
				}
				break;
			default:
				System.out.println("올바른 숫자를 입력해주세요!");
				choice = Integer.parseInt(sc.nextLine());
			}
	}

	public void soldOutPrint() {
		System.out.println("품절입니다. 다른것을 주문해주세요!");
	}

	public void americano() { // 아메리카노 만듦
		stock.useAmericano();
		System.out.println("아메리카노 나왔습니다~");
	}

	public void latte() { // 카페라떼
		stock.useLatte();
		System.out.println("카페 라떼 나왔습니다~");
	}

	public void moca() { // 카페모카
		stock.useMoca();
		System.out.println("카페 모카 나왔습니다~");
	}

	public int getPriceOfAmericano() {
		return priceOfAmericano;
	}

	public int getPriceOfLatte() {
		return priceOfLatte;
	}

	public int getPriceOfMoca() {
		return priceOfMoca;
	}
}