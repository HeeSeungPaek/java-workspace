import java.util.Scanner;

public class Goods_Main {

	public static void main(String[] args) {

		Goods[] goodsArray = new Goods[3];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < goodsArray.length; i++) { // for���� �̿��� ������ �� �Է�
			System.out.printf("[%d]��° ��ǰ�� �̸� �Է� >  ", i + 1);
			String name = scanner.nextLine();

			System.out.printf("[%d]��° ��ǰ�� ���� �Է� >  ", i + 1);
			int price = Integer.parseInt(scanner.nextLine());

			System.out.printf("[%d]��° ��ǰ�� ��� �Է� >  ", i + 1);
			int stock = Integer.parseInt(scanner.nextLine());

			goodsArray[i] = new Goods(name, price, stock);
			System.out.println("-------------������----------------");
		}

		for (int i = 0; i < goodsArray.length; i++) {
			goodsArray[i].goodsInfoPrint();
		}

	}
}

