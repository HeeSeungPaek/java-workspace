package kr.or.bit;
/*
�츮�� ī�带 ����� �Ǹ��ϴ� ȸ��.
���� ��û�� ���� ī�� 53�� �����ϰ� ��.
�䱸����
ī��� ī���� ��ȣ�� ������ �ְ�, �׸��� ����� ������ �ִ�.
ī��� ũ�⸦ ������ �ִ�. ũ��� ����&�ʺ� �ǹ��մϴ�.
ī���� ũ��� h=50, w=20

----

[��� ī���� ���̿� �ʺ�� ����] (����) ����ƽ
??ī���� ũ�⸦ ���߿� ������ �޶�� �ϸ�????

���赵�� �ٽ� �������� �ʰ� 53�� ī���� ũ�⸦ ������ �� ������
 */
public class Card {
	public int number;
	public String kind;
	public static int height = 50;
	public static int width = 20;
	
	//���(ī���� ������ Ȯ���� �� �ִ� ����� �־��)
	public void cardInfo() {
		System.out.printf("��ȣ: [%d], ���: [%s], ����: [%d], �ʺ�: [%d]\n", number, kind, height, width);
	}
	
}
