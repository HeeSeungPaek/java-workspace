import kr.or.bit.Book;

public class Ex17_Book {
	
	public static void main(String[] args) {
		Book book1 = new Book("혼돈의 해독제", 23000);
		book1.bookInfo();
		
		Book book2 = new Book("상실의 시대", 15000);
		book2.bookNameInfo();
		
		Book book3 = new Book("자바의 정석", 45000);
		book3.bookPriceInfo();
		
		//book1.setPrice(500); 수정 불가하게 만듬
		//book2.setBookname("바꾸지 못함");
		
	}
	
}

