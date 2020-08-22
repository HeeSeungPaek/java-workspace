/*객체 배열 갖고 휘뚜루 마뚜루
>> 클래스 : 상품
>> 상품 객체는 상품 이름, 가격, 재고를 
가지고 있다.
>> 캡슐화한다.
>> 상품 객체는 객체의 정보를 출력하는 
기능을 가지고 있다.
>> 우리는 3개의 상품을 가지고 있다.
>> for문과 객체 배열을 이용해 객체를 
생성하고, 상품 3개의 정보를 
     스캐너로 입력 받고, 
각 상품마다 (이름, 가격, 재고)를 
입력 받을 수 있다.
*/
public class Goods {

	private String name;
	private int price;
	private int stock;

	public Goods(String name, int price, int stock) {	// 객체 생성 시 강제적 입력 요함
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void goodsInfoPrint() {
		System.out.println("상품정보 - 이름 : " + this.name + ", 가격 : " 
							+ this.price + "원, 재고 : "
							+ this.stock);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
