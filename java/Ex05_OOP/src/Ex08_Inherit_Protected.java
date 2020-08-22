import kr.or.bit.Pclass;
/*
Modifier : public, private, default, [��Ӱ��迡�� >> protected]
����� ���� [������, protected, super]�� ����

protected : ��鼺�� ���ϰ� �ִ� (����) >> � ���� default�� ������ ������, � ���� public�� ������ ������ �ִ�
>> ����� ���� Ŭ���� �ȿ��� protected �����ڴ� [default]�� ����.
>> ��� ���迡���� �ǹ̸� ������.
*/
class Dclass{
	public int i;
	private int p;
	int s;	//default
	protected int k;	//default (�Ϲ����� Ŭ���������� ����� ������ x)
}

class Child2 extends Pclass {
	void method() {
		//this.j
		this.k = 1000;	// ��� ���迡��, �ڽ��� �θ��� protected �ڿ��� ������ �����ϴ�.(publicó��)
		System.out.println(this.k);
	}
}

public class Ex08_Inherit_Protected {	//protected�� ��ӿ����� �����Ѵ�

	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.j	��ü�� �������� ���忡���� �̻��¿��� ���ڸ� public�� ������ �����ϴ�.
		//p.k	��Ӱ��谡 �ƴ� �Ϳ��� defaultó��, ��Ӱ���� publicó��
		
		Child2 ch = new Child2();
		ch.method();
	}

}
