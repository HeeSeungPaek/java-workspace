/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 
[Ŭ���̾�Ʈ �䱸����]
������ǰ��  ��ǰ�� ���� , ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
ex)
������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio , Computer)
������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000 ....)
��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�
 
�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ� 
���� ��� : 10����  , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ� ����Ʈ�� �ö󰣴�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�
*/
//tv audio ������ ��ǰ�̴�. ��ǰ�� ������
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
		// Ƽ���� �⺻������ 500���̶�� ����
		super(500);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product {
	Audio() {
		// ������� �⺻������ 100���̶�� ����
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	NoteBook() {
		// ��Ʈ���� �⺻������ 150���̶�� ����
		super(150);
	}

	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer { // ������
	int money = 1000;
	int bonuspoint;

	// �����ڴ� ���������� �� �� �ִ� - ���
	// ����������°� (�ܾ� - ��ǰ����, ����Ʈ + ����)
	// **************�����ڴ� ���忡 �ִ� ��� ������ ������ �� �ִ�.**************

	/*
	 * // 1�� �ڵ� // ������ 3���ϱ� ������ �� �ִ� �Լ��� 3���� �־���ҵ�
	 * 
	 * // 1�� ����
	 * 
	 * //2�� �ó����� //���忡 ���ڱ� ��ǰ�� 1000���� �ٸ� ��ǰ�� �߰� (���콺, �佺��...) (��ǰ ��� POS�� ����� �ڵ�ȭ)
	 * //���忡 1000�� ��ǰ�� ���õ�. �׷��� ����? //1. ���忡�� �����ڰ� 3���ۿ� ���Ÿ� ����, ������ 997���� ��ǰ�� �� ��
	 * ����.. //��? ������ 997���� ��ǰ�� ������ �� �ִ� ����� ����.. //��ȭ�� �����ϴ� �ڵ带
	 * 
	 * void KtTvBuy(KtTv n) { // �Լ��� ��ǰ ��ü�� �ּҸ� �Ķ���ͷ� �޾����, ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�. if
	 * (this.money < n.price) { System.out.println("����. �ܾ��� �����մϴ�." + this.money);
	 * return; // return �Լ�����(���������� ����) } // �� ���� ���� this.money -= n.price; // �ܾ�
	 * this.bonuspoint += n.bonuspoint; System.out.println("������ ������ : " +
	 * n.toString()); }
	 * 
	 * void AudioBuy(Audio n) { // �Լ��� ��ǰ ��ü�� �ּҸ� �Ķ���ͷ� �޾����, ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�.
	 * if (this.money < n.price) { System.out.println("����. �ܾ��� �����մϴ�." +
	 * this.money); return; // return �Լ�����(���������� ����) } // �� ���� ���� this.money -=
	 * n.price; // �ܾ� this.bonuspoint += n.bonuspoint;
	 * System.out.println("������ ������ : " + n.toString()); }
	 * 
	 * void NotebookBuy(NoteBook n) { // �Լ��� ��ǰ ��ü�� �ּҸ� �Ķ���ͷ� �޾����, ��ǰ�� ���ݰ� ����Ʈ�� �� ��
	 * �ִ�. if (this.money < n.price) { System.out.println("����. �ܾ��� �����մϴ�." +
	 * this.money); return; // return �Լ�����(���������� ����) } // �� ���� ���� this.money -=
	 * n.price; // �ܾ� this.bonuspoint += n.bonuspoint;
	 * System.out.println("������ ������ : " + n.toString()); }
	 */

	/*
	 * //2�� ���� (�缳�� : �����丵) - �Լ��� �̸��� ���� �ٲ� -> ������ 997�� �� ������ �ϴ°� ������ ����! //�ϳ���
	 * �̸����� �������� ���(method overloading) void Buy(KtTv n) { // �Լ��� ��ǰ ��ü�� �ּҸ� �Ķ���ͷ�
	 * �޾����, ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�. if (this.money < n.price) {
	 * System.out.println("����. �ܾ��� �����մϴ�." + this.money); return; // return
	 * �Լ�����(���������� ����) } // �� ���� ���� this.money -= n.price; // �ܾ� this.bonuspoint +=
	 * n.bonuspoint; System.out.println("������ ������ : " + n.toString()); }
	 * 
	 * void Buy(Audio n) { // �Լ��� ��ǰ ��ü�� �ּҸ� �Ķ���ͷ� �޾����, ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�. if
	 * (this.money < n.price) { System.out.println("����. �ܾ��� �����մϴ�." + this.money);
	 * return; // return �Լ�����(���������� ����) } // �� ���� ���� this.money -= n.price; // �ܾ�
	 * this.bonuspoint += n.bonuspoint; System.out.println("������ ������ : " +
	 * n.toString()); }
	 * 
	 * void Buy(NoteBook n) { // �Լ��� ��ǰ ��ü�� �ּҸ� �Ķ���ͷ� �޾����, ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�. if
	 * (this.money < n.price) { System.out.println("����. �ܾ��� �����մϴ�." + this.money);
	 * return; // return �Լ�����(���������� ����) } // �� ���� ���� this.money -= n.price; // �ܾ�
	 * this.bonuspoint += n.bonuspoint; System.out.println("������ ������ : " +
	 * n.toString()); }
	 */

	// 3�� ���� - �ߺ��ڵ带 �ٿ����� - ������!
	// ��ǰ�� �߰� �Ǵ��� �������� ����� �� ����.
	// ��� ��ǰ�� Product�� ����ϰ� �ִ� - �θ�� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�.
	// -> ��ǰ�� 1000�����ٸ� ��û�� �ڵ差�� ���� �� �ִ�!
	// �ϳ��� �̸��� ���, �ߺ��ڵ带 ����,...
	// �̷��� �� �� �ִ� ���� : ��� ��ǰ�� Product�� ����ϰ� �ִ�.(Product�� ��� ��ǰ�� �θ�)
	// Product p;
	// Audio audio = new Audio();
	// p = audio;
	// �ʿ��� �ڵ�� �θ�ü�� ������ �ִ�! > ���� ��
	void Buy(Product n) {
		if (this.money < n.price) {
			System.out.println("����. �ܾ��� �����մϴ�." + this.money);
			return;
		}
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
}

//KtTv tv = new KtTv(); ��ǰ�� ����� ��!
public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		// ����
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();

		Buyer buyer = new Buyer();

		// 1������
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
