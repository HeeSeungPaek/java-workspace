import kr.or.bit.Book;

public class Ex17_Book {
	
	public static void main(String[] args) {
		Book book1 = new Book("ȥ���� �ص���", 23000);
		book1.bookInfo();
		
		Book book2 = new Book("����� �ô�", 15000);
		book2.bookNameInfo();
		
		Book book3 = new Book("�ڹ��� ����", 45000);
		book3.bookPriceInfo();
		
		//book1.setPrice(500); ���� �Ұ��ϰ� ����
		//book2.setBookname("�ٲ��� ����");
		
	}
	
}

