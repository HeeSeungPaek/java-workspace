import kr.or.bit.Card;

//Static�� ���̵��! ������ static���� �Ҵ��ؾ� ���� �����غ���
//static�� ������ �� ���� �ְ�, ������ �� ���� �ִ�.
//�ѹ��� �������� ��ü�� ������ �ٲ� �� ������, �߸� �ٲ۴ٸ� ��� ���赵�� �߸��Ǵ²��̴�.
//�� �����ؼ� static�� ������ �սô�.

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//Card 53���� ����
		/*
		Card c = new Card();
		c.number = 1;
		c.kind = "��";
		c.cardInfo();

		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "��";
		c2.cardInfo();
		*/
		//53ī�带 new�� ���� �����Ѵ�.
		//�� ��, Ŭ���̾�Ʈ�� .. ũ�Ⱑ �߸��ƾ��..
		//���� ����� ������ �ٽ� ������������
		//���α׷��ֿ����� ũ�⸦ �����ϴ� �� �����ϴ�.
		//���̴� 70, �ʺ�� 50���� �ٲ��ּ���
		
		//1.�� �徿 �����Ѵ�. (10000���̸� 10000�� ������ �ؾߵȴ�.)
		//c.h = 70;
		//c.w = 50;
		
		//2. ���赵�� ��� ��ģ��. (���� �� ������ �ٽ� ���� ����)
		
		Card c = new Card();
		c.number = 1;
		c.kind = "��";

		c.height = 70;
		c.width = 50;
		
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "��";
		c2.cardInfo();
	
	}

}
