//�ܿ��� �Ѵ�!
/*
������ (��Ӱ��迡�� ����)
������ : �������� ����(����)�� ���� �� �ִ� �ɷ�

C# : ������ (Overloading, Overriding)
JAVA : [��Ӱ���]���� [�ϳ��� ��������]�� ���� ���� Ÿ���� ���� �� �ִ�.
[�ϳ��� ��������] >> [�θ� Ÿ��]
�θ�Ŭ���� Ÿ���� ���������� ���� ���� �ڽ� Ŭ���� ��ü�� ���� �� �ִ�.

���Ǽ����� �θ�� �ڽĿ��� ���Ǿ��� ��� ���� �ش�.
���α׷��� �ڽ��� �θ𿡰� ���Ǿ��� �帰��. >> ������
*/
class Tv2 { // �θ� = �Ϲ�ȭ�ϰ� �߻�ȭ�ϴ� �ڿ�, ����(�и�)
	boolean power;
	int ch;

	void power() {
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2 { // CaptionTv�� ������ �ִ� [Ư��ȭ,��üȭ�ǰ� ������ �ڿ���]�� ǥ��
	String text;

	String captionText() {
		return this.text = "���� �ڸ� ó�� ��....";
	}
}

public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("���� : " + captv.power);
		
		captv.chUp();
		System.out.println("ä�� : " + captv.ch);
		System.out.println(captv.captionText());
		
		//Car c = new Car();
		//Car c2 = c;
		
		Tv2 tv2 = captv;	//�ܿ��** captv�� Tv2�� ����ϰ� �ִ�.
							//��Ӱ��迡�� �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�.
							//��, �θ�� �ڽ��� �ڿ��� ������ �� �ִ�.
							//��, ������ �����ϰ�...
		System.out.println(tv2.toString());		//CapTv@15db9742
		System.out.println(captv.toString());	//CapTv@15db9742
		//���� 601ȣ�� ����, �ڽ��� �� �� �� ������ (�����) , �θ�� �ڽ��� ���� �͸� �� �� �ִ�.(�����, tv)
		//tv2.captionText() �Ұ��ϴ�..
		
		
	}

}