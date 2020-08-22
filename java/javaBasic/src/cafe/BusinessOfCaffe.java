package cafe;

import java.util.Scanner;

public class BusinessOfCaffe { // Ŀ�Ǹ� ������ִ� Ŭ����

	private int priceOfAmericano;
	private int priceOfLatte;
	private int priceOfMoca;
	private int customerprice;
	static Scanner sc = new Scanner(System.in);
	Stock stock;

	BusinessOfCaffe() { // --�� ������ ���� �ʱ�ȭ
		this.stock = new Stock();
		this.priceOfAmericano = 1000;
		this.priceOfLatte = 2000;
		this.priceOfMoca = 3000;
	}

	public void choiceCoffee() {
		System.out.println("����, �޴��� �������ּ���.");
		System.out.println("1.�Ƹ޸�ī��  2.ī���    3.ī���ī");
		int choice = Integer.parseInt(sc.nextLine());
		boolean option = true;
		
		while (option)
			switch (choice) { // �ٲٱ�
			case 1: // �Ƹ޸�ī��
				System.out.printf("�Ƹ޸�ī��� [%d]���Դϴ�. �ݾ� �Է�>\n", priceOfAmericano);
				customerprice = Integer.parseInt(sc.nextLine());
				while (option) {
					if (stock.getWater() > 0 && stock.getShot() > 0) { // ǰ���� �ƴ� ���
						if (customerprice < priceOfAmericano) { // �Ƹ޸�ī�� ���ݺ��� ���Աݾ��� ���� ���
							System.out.printf("�ݾ��� [%d]�� ���ڶ��ϴ�.�� �������ּ���\n", priceOfAmericano - customerprice);
							customerprice += Integer.parseInt(sc.nextLine());
						} else {
							if (customerprice >= priceOfAmericano) {
								System.out.printf("�Ž����� [%d��] �ֽ��ϴ�.\n", customerprice - priceOfAmericano);
							}
							americano();
							option = false;
						}
					} else if (stock.getWater() != 0 || stock.getShot() != 0) {
						soldOutPrint();
						System.out.println("1.�Ƹ޸�ī��\t2.ī���\n3.ī���ī");
						choice = Integer.parseInt(sc.nextLine());
					}
				}
				break;
			case 2: // ī���
				System.out.printf("ī��󶼴� [%d]���Դϴ�. �ݾ� �Է�>\n", priceOfLatte);
				customerprice = Integer.parseInt(sc.nextLine());
				while (option) {
					if (stock.getMilk() > 0 && stock.getShot() > 0) {
						if (customerprice < priceOfLatte) {
							System.out.printf("�ݾ��� [%d]�� ���ڶ��ϴ�.�� �������ּ���\n", priceOfLatte - customerprice);
							customerprice += Integer.parseInt(sc.nextLine());
						} else {
							if (customerprice >= priceOfLatte) {
								System.out.printf("�Ž����� [%d��] �ֽ��ϴ�.\n", customerprice - priceOfLatte);
							}
							latte();
							option = false;
						}
					} else {
						soldOutPrint();
						System.out.println("1.�Ƹ޸�ī��\t2.ī���\n3.ī���ī");
						choice = Integer.parseInt(sc.nextLine());
					}
				}
				break;
			case 3: // ī���ī
				System.out.printf("ī���ī�� [%d]���Դϴ�. �ݾ� �Է�>\n", priceOfMoca);
				customerprice = Integer.parseInt(sc.nextLine());
				while (option) {
					if (stock.getMilk() > 0 && stock.getShot() > 0
							&& stock.getSyrup() > 0 && stock.getWhipping() > 0) {
						if (customerprice < priceOfMoca) {
							System.out.printf("�ݾ��� [%d]�� ���ڶ��ϴ�.�� �������ּ���\n", priceOfMoca - customerprice);
							customerprice += Integer.parseInt(sc.nextLine());
						} else {
							if (customerprice >= priceOfMoca) {
								System.out.printf("�Ž����� [%d��] �ֽ��ϴ�.\n", customerprice - priceOfMoca);
							}
							moca();
							option = false;
						}
					} else {
						soldOutPrint();
						System.out.println("1.�Ƹ޸�ī��\t2.ī���\n3.ī���ī");
						choice = Integer.parseInt(sc.nextLine());
					}
				}
				break;
			default:
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���!");
				choice = Integer.parseInt(sc.nextLine());
			}
	}

	public void soldOutPrint() {
		System.out.println("ǰ���Դϴ�. �ٸ����� �ֹ����ּ���!");
	}

	public void americano() { // �Ƹ޸�ī�� ����
		stock.useAmericano();
		System.out.println("�Ƹ޸�ī�� ���Խ��ϴ�~");
	}

	public void latte() { // ī���
		stock.useLatte();
		System.out.println("ī�� �� ���Խ��ϴ�~");
	}

	public void moca() { // ī���ī
		stock.useMoca();
		System.out.println("ī�� ��ī ���Խ��ϴ�~");
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