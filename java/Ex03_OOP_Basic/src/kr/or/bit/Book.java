package kr.or.bit;

/*

1. 책은 책이름을 가지고 있고 가격을 가지고 있다 

2. 책이 출판되면 반드시 책이름과 책의 가격을 가지고 있어야 한다

3. 책의 이름과 가격 정보는 특정 기능을 통해서만 볼수 있고 , 출판된 이후에서 수정할 수 없다	

4. 책이름과 가격정보는 각각확인 할 수 있다. 변경하지 못한다.

*/
public class Book {
	private String bookname;
	private int price;

	public Book(String bookname, int price) {	//책이 출판되면 반드시 책 이름과 가격을 명시하도록 강제하는 기본생성자 없는 [오버로딩된 생성자]
		this.bookname = bookname;
		this.price = price;
	}

	public void bookInfo() { // 책의 이름과 가격정보를 모두 확인하는 메소드
		System.out.println("책의 이름과 가격은? \n" + this.bookname + "," + this.price);
	}
	
	public void bookNameInfo() { // 책의 이름 정보만 확인하는 메소드
		System.out.println("책의 이름 : " + this.bookname);
	}

	public void bookPriceInfo() { // 책의 가격정보만 확인하는 메소드
		System.out.println("책의 가격 : " + this.price);
	}

	public String getBookname() {
		return bookname;
	}

	
	//요구사항 반영 > 출판된 이후엔 변경할 수 없다 ! > setter를 삭제한다! 
	/*
	 * public void setBookname(String bookname) { this.bookname = bookname; }
	 */

	public int getPrice() {
		return price;
	}

	/*
	 * public void setPrice(int price) { this.price = price; }
	 */

}
