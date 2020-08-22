/*
조별 과제
문제 풀어 보세요 ^^
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy() 함수안에서 카트에 담는 것을 구현)
hint) Buyer ..>> summary()  main 함수에서 계산할때
구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
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
		for (int i = 0; i < cart.length; i++) {	//널포인터 익셉션....
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