package kr.or.bit;

/*

1. å�� å�̸��� ������ �ְ� ������ ������ �ִ� 

2. å�� ���ǵǸ� �ݵ�� å�̸��� å�� ������ ������ �־�� �Ѵ�

3. å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� ���� �ְ� , ���ǵ� ���Ŀ��� ������ �� ����	

4. å�̸��� ���������� ����Ȯ�� �� �� �ִ�. �������� ���Ѵ�.

*/
public class Book {
	private String bookname;
	private int price;

	public Book(String bookname, int price) {	//å�� ���ǵǸ� �ݵ�� å �̸��� ������ ����ϵ��� �����ϴ� �⺻������ ���� [�����ε��� ������]
		this.bookname = bookname;
		this.price = price;
	}

	public void bookInfo() { // å�� �̸��� ���������� ��� Ȯ���ϴ� �޼ҵ�
		System.out.println("å�� �̸��� ������? \n" + this.bookname + "," + this.price);
	}
	
	public void bookNameInfo() { // å�� �̸� ������ Ȯ���ϴ� �޼ҵ�
		System.out.println("å�� �̸� : " + this.bookname);
	}

	public void bookPriceInfo() { // å�� ���������� Ȯ���ϴ� �޼ҵ�
		System.out.println("å�� ���� : " + this.price);
	}

	public String getBookname() {
		return bookname;
	}

	
	//�䱸���� �ݿ� > ���ǵ� ���Ŀ� ������ �� ���� ! > setter�� �����Ѵ�! 
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
