package day01;
//�� ������
//2���� ���� ���Ѵ�.
// < <= > >= == !=
public class Ex04Operator03 {
	public static void main(String[] args) {
	
		/*
		 * int number1 = 5; int number2 = 6;
		 * 
		 * System.out.println("number1 > number2 : " + (number1 > number2)); 
		 * //5>6 �� ���� �����̹Ƿ� false(0)���� ���ϵȴ�.
		 * 
		 * System.out.println("number1 <= number2 : " + (number1 <= number2));
		 */		
		
		//public static void main(String[] args)
		//String�̶� ���� ���� ���ڸ� ��Ƶ� "���ڿ�"Ŭ�����̴�.
		//���� �츮�� ���ڿ� �񱳸� �Ѵٰ� ������ ��
		//�� �ȿ� ���ڰ� ���� ������ �ñ��ϴٴ� �ǹ̰� �ȴ�.
		//������ String���� "Ŭ���� ����(=��ü)"�� ���� ������
		//�񱳿����� ==, !=�� ����ϸ� �ȵȴ�.
		//�Ʒ��� ������ ���ؼ� �˾ƺ���.
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = str1;
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str3 : " + (str2 == str3));
		//��� ����� �� �� �ִ� ��� : ������ ������Ÿ����
		//�������� ���� �ƴ϶� �ش� ������ ������ �� �ִ� ���� '�ּҰ�'�� �� �ִ�.
		//�����δ� �� �ּҰ��� '����'�ؼ� ���� ���� �ִ� ������ ��
		//� ���� �ְ� �� ���� ���� ���ؾ� �Ѵ�.
		//������ �񱳿����ڴ� �ּҰ��� ���ϱ� ������
		//str1, str2, str3���� ��� abc �����ڸ� �� ������
		//str2�� �ּҰ��� �翬�� �������� �ٸ��� ������ false�� ��µȴ�.
		//��� : �ּҰ��� ���̷� ����
		
		//�׷��ٸ� ��ü�� ������ �񱳸� ���ؼ��� �� �ؾ� �ұ�?
		//�ش� ��ü�� ���ǵǾ� �ִ� equals��� �޼ҵ带 �̿��� ������ �񱳸� �ؾ� �Ѵ�.
		//��ü ���ο� ���ǵǾ� �ִ� �޼ҵ带 ȣ���ϱ� ���ؼ���
		//��ü. ���� ���� �ش� �޼ҵ带 �����ָ� �ȴ�.
		System.out.println("str1.equals(str2) : " + str1.contentEquals(str2));
		System.out.println("str1.equals(str3) : " + str1.contentEquals(str3));
		System.out.println("str2.equals(str3) : " + str2.contentEquals(str3));
	}
}

