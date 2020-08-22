package day01;

/*������(Operator)
 * �����ڴ� ���α׷��� ���ο��� Ư�� ��ȣ�� ���� �ǹ̸� �ο��� �� ���̴�.
 * ��� ������ : + - / * % (������ ���)
 * -��� �����ڴ� ���� �ٸ� ������Ÿ���� �����ϸ� ������� ������
 *  �� ū ������Ÿ���� ���󰣴�. ������ �Ǽ� ���� �� �Ǽ��� ���´ٴ� ��.
 *  ��, " " ������ +�� ������ �ǹ̰� �޶�����.
 *  �ڹٿ��� ""�� �������� ���ڰ� �� �ȿ� �ִٴ� �ǹ��̴�.
 *  ���� ""���� +���� �ǹ̴� ���� ���ڵ� �ڿ� ���� ���ڸ� �̾���̱��� �ǹ�.
 *   
 * ���� ������ : i++ i-- ++i --i(����, ���� ���� �򰥸��� ����) 
 * �� ������ : < > <= >= =!
 * �� ������ : && || !
 * ����Ʈ ������ : << >> 
 * */

public class Ex02Operator01 {
	public static void main(String[] args) {
		int myNumber1 = 5;
		int myNumber2 = 10;
		System.out.println("myNumber1 + myNumber2: " + 
				(myNumber1 + myNumber2));

		System.out.println("myNumber1 - myNumber2: " + 
				(myNumber1 - myNumber2));

		System.out.println("myNumber1 * myNumber2: " + 
				(myNumber1 * myNumber2));

		System.out.println("myNumber1 / myNumber2: " + 
				(myNumber1 / myNumber2));
		//��ǻ�ʹ� ����/������ ���� �� ������ ������ �κ��� ����
		//���� �� �κи� ����Ѵ�. ��, 5/10 ��=0, ��������=5
		//���� �ڵ�� 0�� ��µȴ�.
		System.out.println("myNumber1 % myNumber2: " + 
				(myNumber1 % myNumber2));
		
		/*
		 * ���α׷��ֿ��� �ڷ����� �ٲ� ���� 2���� ����� �ִ�. 
		 * �Ͻ��� ����ȯ (Implicit Typecasting)
		 * vs ����� ����ȯ(Explicit type..)
		 * �Ͻ��� ����ȯ: �ڹٰ� �ڵ����� Ÿ���� �ٲ��ش�.
		 * - ������Ÿ�� ���� ���� ū Ÿ������ �ٲ� �� �߻� 
		 * ����� ����ȯ: ����ڰ� ���� �ۼ��� Ÿ���� �ٲ۴�.
		 * - ������Ÿ�� ���� ���� ���� Ÿ������ �ٲ� �� �߻�
		 */
		
		//1. ����� ����ȯ�� ���� ����/���� ����� �Ǽ��� ����
		System.out.println("myNumber1 / myNumber2: " +
				((double)myNumber1 / myNumber2));
		
		//2. �Ͻ��� ����ȯ�� ���� ����/�Ǽ��� �ڵ����� ��µǴ°� Ȯ��
		System.out.println("myNumber1 / 10.0: " +
				myNumber1 / 10.0 );
		
		// "" + ���� ����� Ȯ���غ���
		System.out.println(100+123);
		System.out.println("100"+123);
	}
}
