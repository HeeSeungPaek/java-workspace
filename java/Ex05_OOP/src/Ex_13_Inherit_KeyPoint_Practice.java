/*
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

hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart  담는 것을 구현 ) + 물건을 구매하면, 물품가격의 10%는 보너스로 받는다.
hint) Buyer ..>> summary()  main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/

class Product4 { // 상품이란 객체의 부모 클래스
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

	Customer() { // default로 가지는 금액
		this(7000, 150);
	}

	Customer(int balance, int bonus) { // 사용자설정 금액
		cart = new Product4[10];
		this.balance = balance;
		this.bonus = bonus;
	}

	void buy(Product4 merch) {
		if (balance < merch.price) {
			System.out.println("손님 돈이 모질라요.");
			return;
		}
		if (index >= 10) {
			System.out.println("카트 꽉 참");
			return;
		}

		cart[index++] = merch;
		this.balance -= merch.price;
		this.bonus += merch.bonus;
		System.out.printf("잔여 : 잔고 [%d원], 현재 보유 포인트 [%d]\n", this.balance, this.bonus);
	}

	void summary() {
		int totalSum = 0;
		int totalPoint = 0;
		System.out.println();
		System.out.println("----영수증-----");
		for (int i = 0; i < index; i++) {
			System.out.println("구매상품 : " + cart[i].toString() + ", 상품가격 : " + cart[i].price + ", POINT : "
					+ cart[i].bonus);
			totalSum += cart[i].price;
		}
		System.out.println("물품 총 가격 : " + totalSum + "원");
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
