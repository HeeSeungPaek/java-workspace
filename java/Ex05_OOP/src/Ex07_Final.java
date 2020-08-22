/*
�츮�� ���ݱ��� ���� ���� <-> ���
��� : �� �� ���� �ʱ�ȭ�Ǹ� ������ �Ұ��ϴ�. -> �ٲ��� ���ƾ� �� ��
����ڿ� : [������](�ֹι�ȣ), ���� : PI, ������ȣ, �ý��� ������ȣ
����� ���������� �빮�ڷ� �����Ѵ�.

java : final int NUM = 10;
C# : const integer NUM = 10;

final Ű���� 
Ŭ���� �� >> final class Car{} >> final Math { } >> ��� ����
�Լ� �տ� >> public final void print() {} >> ��Ӱ��迡�� ������ (Override ����)
		  public static final void print() {} >> ��ü �� ���� �Լ� but ������ ����!
*/
class Vcard {
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		System.out.println(Math.PI);//.�� S,F static final ��ü�� �����Լ� but ������ ����!
	}
}

class Vcard2 {						//���赵�� ���� �� ����� �ʱ�ȭ�� ��������� �Ѵ�. (������)
	
	final String KIND;				//����� ���� �� �ٷ� �ʱ�ȭ�� ���ص� ������,
	final int NUM;					//��ü ���� ������ [�ʱ�ȭ�� ����]�� �ؾ��Ѵ�.
	/*
	Vcard2(){
		this.KIND = "heart";
		this.NUM = 10;
	}
	*/
	Vcard2(String kind, int num){	//�����ε� ����Ʈ���� - ī�� 53���� ���� ���ڴ� �ٸ��ٴ� �䱸������ �־���.
		this.KIND = kind;			//(�ѹ� �������� ������ �Ұ��ϴ�)
		this.NUM = num;
	}
	
	//extends Object�� ������ �ֱ⿡ toString �޼ҵ带 �������̵��� �� �ִ�.
	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
	
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard v = new Vcard();
		//v.KIND = "AAA";	�����°� ���� �ѹ� �Ҵ��ϸ� �ٲ��� ���ϱ⿡ ������ ������ ������ ���´�!
		v.method();
		
		Vcard2 v1 = new Vcard2("spade", 1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade", 2);
		System.out.println(v2.toString());
		
		Vcard2 v3 = new Vcard2("spade", 3);
		System.out.println(v3.toString());
		
		//v3.KIND = "aaa"; �ٽ� ������ �Ұ��ϴ�
	}

}
