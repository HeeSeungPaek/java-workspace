package kr.or.bit;

/*
�� (���� (�Ϲ�ȭ,�߻�ȭ)) : ���� �� �� �ִ�, ���� ������.
 */
public class Bird {
	//���� ���
	public void fly() {
		System.out.println("flying");
	}
	
	//�����ڰ� ������� protected �ڿ��� ��ٴ� �̾߱��?
	// : ���� ����ϴ� ����� moveFast�� �ʿ信 ���� ������ ������ ���ھ� (������ ����)
	protected void moveFast() {
		fly();
	}
}
