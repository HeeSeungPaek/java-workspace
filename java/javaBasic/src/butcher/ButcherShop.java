package butcher;

import java.util.Scanner;

public class ButcherShop {
	private int beefAmount;
	private int porkAmount;
	private int lambAmount;

	private int shopBalance;

	Scanner scanner = new Scanner(System.in);
	KindOfMeat m = new KindOfMeat();

	ButcherShop() { // ����� ��(��)
		this.beefAmount = 20;
		this.porkAmount = 5;
		this.lambAmount = 10;
		this.shopBalance = 500000;
	}

	public void showMenu() {
		System.out.println("========������========");
		System.out.println("   1.�Ǹ���     2.������");
	}

	public void choiceSell() {
		System.out.println("=====������ ��� ����=====");
		System.out.println("1.��    2.����    3.��");
		boolean invalid = true;
		while(invalid) {
			if(choiceMeat() == 1) {
				
			}else if(choiceMeat() == 2) {
				
			}else if(choiceMeat() == 3) {
				
			}else {
				System.out.println("�׷� ��� ����. �ٽ� �Է�");
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
		System.out.println("���� ���� : " + this.getShopBalance());
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
