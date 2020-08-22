/*
���� Ǯ�� ������ ^^
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���

hint) īƮ ������ ��� ���� (Buy() �Լ��ȿ��� cart  ��� ���� ���� ) + ������ �����ϸ�, ��ǰ������ 10%�� ���ʽ��� �޴´�.
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
*/

class Product4 { // ��ǰ�̶� ��ü�� �θ� Ŭ����
	int price;
	int bonus;

	Product4(int price) {
		this.price = price;
		this.bonus = (int) (price / 10.0);
	}
}

class PencilCase extends Product4 {
	PencilCase() {
		super(2000);
	}

	@Override
	public String toString() {
		return "PencilCase";
	}

}

class Cigarette extends Product4 {
	public Cigarette() {
		super(4500);
	}

	@Override
	public String toString() {
		return "Cigarette";
	}

}

class Customer {
	int balance;
	int bonus;

	Product4[] cart;
	int index = 0;

	Customer() { // default�� ������ �ݾ�
		this(7000, 150);
	}

	Customer(int balance, int bonus) { // ����ڼ��� �ݾ�
		cart = new Product4[10];
		this.balance = balance;
		this.bonus = bonus;
	}

	void buy(Product4 merch) {
		if (balance < merch.price) {
			System.out.println("�մ� ���� �������.");
			return;
		}
		if (index >= 10) {
			System.out.println("īƮ �� ��");
			return;
		}

		cart[index++] = merch;
		this.balance -= merch.price;
		this.bonus += merch.bonus;
		System.out.printf("�ܿ� : �ܰ� [%d��], ���� ���� ����Ʈ [%d]\n", this.balance, this.bonus);
	}

	void summary() {
		int totalSum = 0;
		int totalPoint = 0;
		System.out.println();
		System.out.println("----������-----");
		for (int i = 0; i < index; i++) {
			System.out.println("���Ż�ǰ : " + cart[i].toString() + ", ��ǰ���� : " + cart[i].price + ", POINT : "
					+ cart[i].bonus);
			totalSum += cart[i].price;
		}
		System.out.println("��ǰ �� ���� : " + totalSum + "��");
	}

}

public class Ex_13_Inherit_KeyPoint_Practice {

	public static void main(String[] args) {
		PencilCase pc = new PencilCase();
		Cigarette cg = new Cigarette();
		
		Customer me = new Customer();
		
		me.buy(pc);
		me.buy(cg);
		me.buy(cg);
		
		me.summary();
		
	}

}
