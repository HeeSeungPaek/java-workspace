/*��ü �迭 ���� �ֶѷ� ���ѷ�
>> Ŭ���� : ��ǰ
>> ��ǰ ��ü�� ��ǰ �̸�, ����, ��� 
������ �ִ�.
>> ĸ��ȭ�Ѵ�.
>> ��ǰ ��ü�� ��ü�� ������ ����ϴ� 
����� ������ �ִ�.
>> �츮�� 3���� ��ǰ�� ������ �ִ�.
>> for���� ��ü �迭�� �̿��� ��ü�� 
�����ϰ�, ��ǰ 3���� ������ 
     ��ĳ�ʷ� �Է� �ް�, 
�� ��ǰ���� (�̸�, ����, ���)�� 
�Է� ���� �� �ִ�.
*/
public class Goods {

	private String name;
	private int price;
	private int stock;

	public Goods(String name, int price, int stock) {	// ��ü ���� �� ������ �Է� ����
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void goodsInfoPrint() {
		System.out.println("��ǰ���� - �̸� : " + this.name + ", ���� : " 
							+ this.price + "��, ��� : "
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
