package bit;
/*
1.�ڹٰ� �����ϴ� �⺻ Ÿ��(�ý��� Ÿ��), �ڷ��� >> 8���� �⺻ Ÿ�� ����
2.8���� �⺻Ÿ���� '���� ����'�ϴ� Ÿ���̴�.
3.���� > ���� > ��,0,�� 
byte (-128 ~ 127) char short int*** long
4.float double -> double�� �ڹ� �Ǽ������� �⺻Ÿ���̴�.***
5.boolean > �� ��, ������ true,false�� ==> (���α׷��� ������ �帧�� �����Ҷ� ���ȴ�)
***���ڿ� : String "ȫ�浿", "hello" >> Ŭ���� Ÿ��(���� Ÿ��) >> �׷����� �ұ��ϰ�...
�ٸ� �̾߱⸦ �ϱ� ������ String�� �⺻Ÿ������ �����ϰ� �����Ѵ�.

�ڹٴ� ũ��
1. �� Ÿ��				 :8���� �⺻Ÿ��: int i = 100;							 - value type
2. ���� Ÿ�� (�ּҰ��� �����ϴ�):Ŭ����, �迭: ������ ���� ����Ǵ� ���� �ƴ϶� �ּҰ��� ����(������) - ref type
  >>�� �޸𸮿� �ִ� ��ü�� �ּҰ��� ������.
 */
// class = ���赵 == Ÿ��(Type)
class Car{ // Car Ÿ��, Car ���赵, Car Ŭ�����̴� >>> �̰ɰ����� ��üȭ�� �깰�� ����� >> ��üȭ(�޸�) >> 
	String color; //�ν��Ͻ� ���� == ��� �ʵ�
	int window;
}

public class Ex03_DataType {

	public static void main(String[] args) {
		String str="ȫ�浿";
		int age = 100;
		
		Car c;//c�� �����Լ��� �������� -> �ʱ�ȭ�� �ؾ� ���� �ִ� ��? ���������ϱ�
		//default ����� �Ҵ������ 4byte
		//c��� ������ �ʱ�ȭ�� ����? :�ּҸ� ������ �ϴ°� >> new �����ڸ� ���� ������� [new ������]�� ���ؼ� ������� [�ּ�]�� �Ҵ�ǰ� �ϴ� ��
		c = new Car();
		System.out.println(c);//bit.Car@15db9742
		
		//����� �ʱ�ȭ
		//����Ÿ���� �ʱ�ȭ��� ����, �ּҰ�
		Car c2 = new Car();
		c2.window = 100;
		c2.color = "blue";
		
		int i = 10;
		int j;
		j = 20;
		
		int k;
		k = j;//point �� �Ҵ�
		System.out.println("k"+k);
		k = 300;
		System.out.println("j"+j);
		
		//int p, g, q; // �̷������ Array : int[] arr = new int[3]; arr[0] = 1;...
		
		//int (-21�� ~ 21)
		//Today Point
		//literal >> �ִ� �״��
		//���� ���ͷ� : [�⺻�� default�� int ����]
		//int p = 10000000000;
		/*
		 * long l = 10000000000L; long l2 = 100;
		 * 
		 */
		//char : 2byte ������ - �� ���ڸ� ǥ���ϴ� �ڷ���
		//Today Point
		//���ڿ� " "
		//���� ' '
		//ĳ���� -> Ÿ�Ժ�ȯ
		int intch = 'a'; //implicit cast == �ڵ�
		System.out.println(intch);
		char ch = 'a';
		System.out.println((int)ch);
		
		int intch3 = 999999996;
		char ch3 = (char)intch3;
		System.out.println(intch3);
		//�� �� �� �� -> [���� ���� ���� ���� ������ Ÿ���� ����]
		//������ ����ȯ = ����� ����ȯ
		//key point:65��� ���ڰ� �������� charŸ�Կ� ���ϴ� ���
		//�������� �ս��� ���� �Ҵ�
		//int intch3=999999999;
		//ū ���� ���� ������ ���� ����ȯ�ϸ� [�����ͼս� �߻�]
		
		int intch4 = ch3; //�����Ϸ��� �ڵ����� �� ��ȯ -> �����Ϸ��� �ڵ� �������.
		
	}
	
}
