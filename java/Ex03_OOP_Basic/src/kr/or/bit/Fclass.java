package kr.or.bit;
/*
���(����) ����� ���
�Լ� (function, method)

method : ���� �Ǵ� ��� (�ּ� ����) : �ϳ��� �Լ��� �ϳ��� ��ɸ� �����ض�, 
�ȱ׷��� �����ؼ� �������� ����
ex) �Դ´�, �ܴ�, �ȴ´�. �����鼭 �Դ´� �̷��� ����...

Ŭ���� : �ʵ� + �Լ� + ������

ex) ���ӹ� : ���ӱ� ���� �ְ� ... �Լ� (�����ִ� �� x)
	�����̱� : ���� �ְ� ������ �޴� �� (�����ִ� �� o)
	
�Լ��� [ȣ�⿡ ���ؼ���(�̸��� �θ��� ��)] �����Ѵ�!
	
JAVA)
1. void �鼭 parameter�� �ִ� �� : [void] print(String str) { �����ڵ� }
2. void �鼭 parameter�� ���� �� : [void} print() { �����ڵ� }
(�Ʒ� 3,4�� return type �޼ҵ� ���� �� �ݵ�� returnŰ���� ���)
3. return type, parameter o : [int] print(int data) { return [int] }  
4. return type, parameter x : [int] print() { return [int] }

****�߿�****
void      >> �����ִ� ���� ���� >> return value ����.
return    >> 8���� �⺻ ��Ÿ�� + String, Class, Array, Collection, Interface... >> Ŭ����(���赵)
parameter >> 8���� �⺻ ��Ÿ�� + String, Class, Array, Collection, Interface... >> Ŭ����(���赵) 
ex) void print(int a, int b, int c, int d) { }... �μ�, ����, �Ű���, ���ް� == �Ķ����!
ex) print(10, 20, 30) >> ������� �ʴ´�. �Ķ���� ������ �� �־���� �۵��Ѵ�!!
ex) print(1, 2, 3, 4) >> ���� �۵�! �Ķ���Ͱ����� ������ ����ȴ�.


Car print() { Car c = new Car(); return c; } //Car[Ÿ��]�� �޼ҵ� ���ϰ��� �ּ�!!
...�������ڸ�	{ return new Car(); }
boolean print(boolean bo) { return true or false; }

�Լ��� �̸� : ���������� �ǹ��ִ� �ܾ��� ����
: getChannelNumber()
: getEmpListByEmpno()

*** �Լ��� �ݵ�� ȣ��(call)�Ǿ�� ����ȴ� : ������ ���� �̸��� �θ��� ������ ������ �ȵȴ�.


*/

public class Fclass {
	public int data;

	// void m() //�̷��� ���� �����Ϸ��� default void m()�� �ؼ� -> �ٸ� ��Ű������ �� �� ����.
	public void m() { // �׷��� public�� �ٿ� �ٸ� ��Ű�� �ȿ����� �޼ҵ带 ȣ���� �� �ֵ��� ����.
		System.out.println("�Ϲ� �Լ� : void, parameter(X)");
	}

	// void m(int ..)
	public void m2(int i) { // �Ķ���ʹ� �Լ� ����� ����, ����� �Ҹ�
		System.out.println("�Ϲ��Լ� : void. parameter(O)");
		System.out.println("parameter value (Scope = �Լ�����) : " + i);
	}

	public int m3() {
		return 100; // return Type �����ϸ� ��.��.��. return Ű���尡 �־�� �Ѵ�.
	}

	public int m4(int data) {
		return 100 + data;
	}
	// ��������� �Լ��� �⺻...

	// Ȯ��
	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// default int subSum()...
	// �������� �ǵ� : subSum() �̶�� �Լ��� �ٸ� �Լ��� �����ִ� �Լ��μ�, [�Լ� ����]���� ȣ��ǵ��� ������ ��
	// ���ο��� �������� ����..
	// �̷� ���� private ������ : Ŭ���� ���ο����� ����ϰ� �� �� �ִ�. ���� ��Ű�������� �������� ���ϵ���..
	// **Ŭ���� ���� : public, private, default ���� x
	private int subSum(int i) { // Ŭ���� ������ �����Լ��� ���ڴٴ� �������� ������ ��� �ڵ��� �� �� �ִ�.
		return i + 100;
	}

	public void callSubSum() { // ������ public �޼ҵ�� private �޼ҵ带 ȣ���ϴ°��� �����ִ�.
		int result = subSum(100);
		System.out.println("Call result : " + result);
	}

	private int operationMethod(int data) { // Ŭ���� ���ο���... �����Լ���...
		return data * 200;
	}

	public int opSum(int data) {
		int result = operationMethod(data);
		if (result > 0) {
			return 1;
		} else {
			return -1;
		}
	}

	// Quiz
	// a�� b �� �߿� ū ���� return�ϴ� �Լ��� ���弼��
	// ex) max(300, 100) return���� 300

	// �����Ѱ� : �� �� ���� �ʹ� ��ٴ°� ������ �м�
	private int maxMethod(int a, int b) {
		return a - b;
	}
	public int max(int a, int b) {
		int result = maxMethod(a, b);
		if (result < 0) {
			return b;
		} else { // (result > 0)
			return a;
		}
	}

	// 30��¥�� : return�� �ּ������� (�ݺ����� ��� X)
	public int max30(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	// 60��¥�� : return Ƚ���� �ٿ��ش�.
	public int max60(int a, int b) {
		int result = 0;
		if (a > b) {
			result = a;
		} else {
			result = b;
		}
		return result;
	}
	// 90��¥�� :
	public int max90(int a, int b) {
		int max = (a > b) ? a : b;
		return max;
	}
	// 100��¥�� :
	public int max100(int a, int b) {
		return (a > b) ? a : b;
	}

	//�Լ��� ����� �� �⺻Ÿ��(�� Ÿ��)
	//�Լ��� ����Ÿ���� �ɾ��.
	//return Ÿ�Կ� Ŭ������ �� �� �ִ�!!!
	//Ŭ���� Ÿ���� return Ÿ���̶��, �ּҰ��� �����Ѵ�!

	//****�߿��� ��****
	public Tv tCall() { //TvŸ���� ������ [�ּ�]�� tCall()�Լ��� �̿��� return�ض�
						//>> new...
		//return null;
		Tv t = new Tv();
		t.brandname = "A"; 	//�Ʒ��� �޼ҵ庸�� Ȯ�强 ���鿡�� ����!
		return t;
	}
	//���� �ڵ庸�� �� ���ٴ� �ǹ�
	public Tv tCall2() {
		return new Tv();
	}
	
	public void tCall3(Tv t) { //TvŸ���� ������ �ּҸ� �Ķ���ͷ� �־��
		System.out.println("t �ּҰ�: " + t);
	}
	/*
	 �������� �� ��
	 	main()
	 	{
	 		1.tCall3(new Tv()); //�ּҸ� �ѱ�� ����
	 		
	 		2.Tv t = new Tv(); //�ּҸ� �ѱ�鼭, t�� �̿��� t.���� ����ִ�.
	 		  tCall3(t);
	  	}
	  	
	 */
	
}
