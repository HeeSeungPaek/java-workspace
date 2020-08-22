package butcher;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ButcherShop butcher = new ButcherShop();
		Consumer consumer = new Consumer();
		Scanner scanner = new Scanner(System.in);

		while(true) {
			butcher.showMenu();
			
		}
	}
}
