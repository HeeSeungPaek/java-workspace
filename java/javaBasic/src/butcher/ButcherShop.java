package butcher;

import java.util.Scanner;

public class ButcherShop {
	private int beefAmount;
	private int porkAmount;
	private int lambAmount;

	private int shopBalance;

	Scanner scanner = new Scanner(System.in);
	KindOfMeat m = new KindOfMeat();

	ButcherShop() { // 고기의 양(근)
		this.beefAmount = 20;
		this.porkAmount = 5;
		this.lambAmount = 10;
		this.shopBalance = 500000;
	}

	public void showMenu() {
		System.out.println("========정육점========");
		System.out.println("   1.판매자     2.구매자");
	}

	public void choiceSell() {
		System.out.println("=====구매할 고기 선택=====");
		System.out.println("1.소    2.돼지    3.양");
		boolean invalid = true;
		while(invalid) {
			if(choiceMeat() == 1) {
				
			}else if(choiceMeat() == 2) {
				
			}else if(choiceMeat() == 3) {
				
			}else {
				System.out.println("그런 고기 없음. 다시 입력");
			}
		}
	}
	
	public void checkBalance() {
		
	}
	
	public int choiceMeat() {
		int choice = Integer.parseInt(scanner.nextLine());
		return choice;
	}
	
		public void printBalance() {
		System.out.println("가게 매출 : " + this.getShopBalance());
	}
	
	public void soldOut() {

	}

	public int getBeefAmount() {
		return beefAmount;
	}

	public int getPorkAmount() {
		return porkAmount;
	}

	public int getLambAmount() {
		return lambAmount;
	}

	public int getShopBalance() {
		return shopBalance;
	}

}
