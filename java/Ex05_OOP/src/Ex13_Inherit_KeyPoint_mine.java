/*
���� ����
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

hint) īƮ ������ ��� ���� (Buy() �Լ��ȿ��� īƮ�� ��� ���� ����)
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�
�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
*/
class Product2 {
	String name;
	int price;

	Product2() {
		this("",0);
	}

	Product2(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class Cellphone extends Product2 {
	Cellphone() {
		super("Cellphone",1000);
	}

	@Override
	public String toString() {
		return "Cellphone";
	}
}

class Pen extends Product2 {
	Pen() {
		super("Pen",20);
	}

	@Override
	public String toString() {
		return "Pen";
	}
}

class Keyboard extends Product2 {
	Keyboard() {
		super("Keyboard",1000);
	}

	@Override
	public String toString() {
		return "Keyboard";
	}
}

class Moniter extends Product2 {
	Moniter() {
		super("Moniter",1000);
	}

	@Override
	public String toString() {
		return "Moniter";
	}
}

class Mouse extends Product2 {
	Mouse() {
		super("Mouse",250);
	}

	@Override
	public String toString() {
		return "Mouse";
	}
}

class Candy extends Product2 {
	Candy() {
		super("Candy",10);
	}

	@Override
	public String toString() {
		return "Candy";
	}
}

class Macbook extends Product2 {
	Macbook() {
		super("Macbook",10000);
	}

	@Override
	public String toString() {
		return "Macbook";
	}
}

class HandCream extends Product2 {
	HandCream() {
		super("HandCream",50);
	}

	@Override
	public String toString() {
		return "HandCream";
	}
}

class Buzz extends Product2 {
	Buzz() {
		super("Buzz",300);
	}

	@Override
	public String toString() {
		return "Buzz";
	}
}

class Airpod extends Product2 {
	Airpod() {
		super("Airpod",200);
	}

	@Override
	public String toString() {
		return "Airpod";
	}
}

class Buyer2 {
	int money;
	Product2[] cart;
	int count = 0;

	Buyer2() {
		this(0);
	}

	Buyer2(int money) {
		this.money = money;
		cart = new Product2[10];
	}

	void buy(Product2 p) {
		cart[count] = p;
		this.count++;
	}

	void summary() {
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {	//�������� �ͼ���....
			sum += cart[i].price;
		}
		System.out.println(sum);
	}
}

public class Ex13_Inherit_KeyPoint_mine {
	public static void main(String[] args) {
		Buzz buzz = new Buzz();
		HandCream handcream = new HandCream();
		Buyer2 buyer = new Buyer2(10000);
		
		buyer.buy(buzz);
		buyer.buy(handcream);
		buyer.summary();
	}
}