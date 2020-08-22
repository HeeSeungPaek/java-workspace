/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
*/
//tv audio 냉장고는 제품이다. 제품의 공통점
class Product {
	int price;
	int bonuspoint;

	Product(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv extends Product {
	KtTv() {
		// 티비의 기본가격이 500원이라고 가정
		super(500);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product {
	Audio() {
		// 오디오의 기본가격이 100원이라고 가정
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	NoteBook() {
		// 노트북의 기본가격이 150원이라고 가정
		super(150);
	}

	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer { // 구매자
	int money = 1000;
	int bonuspoint;

	// 구매자는 구매행위를 할 수 있다 - 기능
	// 구매행위라는건 (잔액 - 제품가격, 포인트 + 갱신)
	// **************구매자는 매장에 있는 모든 물건을 구매할 수 있다.**************

	/*
	 * // 1차 코드 // 물건이 3개니까 구매할 수 있는 함수도 3개가 있어야할듯
	 * 
	 * // 1차 오픈
	 * 
	 * //2차 시나리오 //매장에 갑자기 제품이 1000개의 다른 제품이 추가 (마우스, 토스터...) (제품 등록 POS가 등록을 자동화)
	 * //매장에 1000개 제품이 전시됨. 그런데 문제? //1. 매장에서 구매자가 3개밖에 구매를 못해, 나머지 997개의 제품을 살 수
	 * 없어.. //왜? 나머지 997개의 제품을 구매할 수 있는 기능이 없다.. //변화에 대응하는 코드를
	 * 
	 * void KtTvBuy(KtTv n) { // 함수가 제품 객체의 주소를 파라미터로 받아줘야, 제품의 가격과 포인트를 알 수 있다. if
	 * (this.money < n.price) { System.out.println("고객님. 잔액이 부족합니다." + this.money);
	 * return; // return 함수종료(구매행위를 종료) } // 실 구매 행위 this.money -= n.price; // 잔액
	 * this.bonuspoint += n.bonuspoint; System.out.println("구매한 물건은 : " +
	 * n.toString()); }
	 * 
	 * void AudioBuy(Audio n) { // 함수가 제품 객체의 주소를 파라미터로 받아줘야, 제품의 가격과 포인트를 알 수 있다.
	 * if (this.money < n.price) { System.out.println("고객님. 잔액이 부족합니다." +
	 * this.money); return; // return 함수종료(구매행위를 종료) } // 실 구매 행위 this.money -=
	 * n.price; // 잔액 this.bonuspoint += n.bonuspoint;
	 * System.out.println("구매한 물건은 : " + n.toString()); }
	 * 
	 * void NotebookBuy(NoteBook n) { // 함수가 제품 객체의 주소를 파라미터로 받아줘야, 제품의 가격과 포인트를 알 수
	 * 있다. if (this.money < n.price) { System.out.println("고객님. 잔액이 부족합니다." +
	 * this.money); return; // return 함수종료(구매행위를 종료) } // 실 구매 행위 this.money -=
	 * n.price; // 잔액 this.bonuspoint += n.bonuspoint;
	 * System.out.println("구매한 물건은 : " + n.toString()); }
	 */

	/*
	 * //2차 개선 (재설계 : 리팩토링) - 함수의 이름만 같게 바꿈 -> 어차피 997개 또 만들어야 하는건 변하지 않음! //하나의
	 * 이름으로 여러가지 기능(method overloading) void Buy(KtTv n) { // 함수가 제품 객체의 주소를 파라미터로
	 * 받아줘야, 제품의 가격과 포인트를 알 수 있다. if (this.money < n.price) {
	 * System.out.println("고객님. 잔액이 부족합니다." + this.money); return; // return
	 * 함수종료(구매행위를 종료) } // 실 구매 행위 this.money -= n.price; // 잔액 this.bonuspoint +=
	 * n.bonuspoint; System.out.println("구매한 물건은 : " + n.toString()); }
	 * 
	 * void Buy(Audio n) { // 함수가 제품 객체의 주소를 파라미터로 받아줘야, 제품의 가격과 포인트를 알 수 있다. if
	 * (this.money < n.price) { System.out.println("고객님. 잔액이 부족합니다." + this.money);
	 * return; // return 함수종료(구매행위를 종료) } // 실 구매 행위 this.money -= n.price; // 잔액
	 * this.bonuspoint += n.bonuspoint; System.out.println("구매한 물건은 : " +
	 * n.toString()); }
	 * 
	 * void Buy(NoteBook n) { // 함수가 제품 객체의 주소를 파라미터로 받아줘야, 제품의 가격과 포인트를 알 수 있다. if
	 * (this.money < n.price) { System.out.println("고객님. 잔액이 부족합니다." + this.money);
	 * return; // return 함수종료(구매행위를 종료) } // 실 구매 행위 this.money -= n.price; // 잔액
	 * this.bonuspoint += n.bonuspoint; System.out.println("구매한 물건은 : " +
	 * n.toString()); }
	 */

	// 3차 개선 - 중복코드를 줄여보자 - 다형성!
	// 제품이 추가 되더라도 구매행위 계속할 수 있음.
	// 모든 제품은 Product를 상속하고 있다 - 부모는 자식타입의 주소를 가질 수 있다.
	// -> 제품이 1000개였다면 엄청난 코드량을 줄일 수 있다!
	// 하나의 이름을 사용, 중복코드를 제거,...
	// 이렇게 할 수 있는 이유 : 모든 제품이 Product를 상속하고 있다.(Product가 모든 제품의 부모)
	// Product p;
	// Audio audio = new Audio();
	// p = audio;
	// 필요한 코드는 부모객체가 가지고 있다! > 설계 시
	void Buy(Product n) {
		if (this.money < n.price) {
			System.out.println("고객님. 잔액이 부족합니다." + this.money);
			return;
		}
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
}

//KtTv tv = new KtTv(); 제품을 만드는 것!
public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		// 매장
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();

		Buyer buyer = new Buyer();

		// 1차구매
		// buyer.KtTvBuy(tv);
		// buyer.NotebookBuy(notebook);
		// buyer.AudioBuy(audio);
		// buyer.KtTvBuy(tv);

		buyer.Buy(tv);
		buyer.Buy(notebook);
		buyer.Buy(audio);
		buyer.Buy(tv);

	}

}
