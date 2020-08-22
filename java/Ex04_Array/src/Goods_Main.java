import java.util.Scanner;

public class Goods_Main {

	public static void main(String[] args) {

		Goods[] goodsArray = new Goods[3];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < goodsArray.length; i++) { // for문을 이용해 강제적 값 입력
			System.out.printf("[%d]번째 상품의 이름 입력 >  ", i + 1);
			String name = scanner.nextLine();

			System.out.printf("[%d]번째 상품의 가격 입력 >  ", i + 1);
			int price = Integer.parseInt(scanner.nextLine());

			System.out.printf("[%d]번째 상품의 재고 입력 >  ", i + 1);
			int stock = Integer.parseInt(scanner.nextLine());

			goodsArray[i] = new Goods(name, price, stock);
			System.out.println("-------------가르기----------------");
		}

		for (int i = 0; i < goodsArray.length; i++) {
			goodsArray[i].goodsInfoPrint();
		}

	}
}

