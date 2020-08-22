/*
String Ŭ���� (���ڿ�) -> ��Ʈ��Ŭ������ �����ϴ� ������ ���ڿ��� �����ϱ� ����
String Ŭ������ ������ �Լ��� ������ �ִ�... ���ڿ��� ���� (�ڸ��� ��ġ�� ���)
String >> static �Լ� + �Ϲ� �Լ�
15��~20���� �Լ��� ���� ���Ǳ⿡ �ܿ� �� �ִ�.
ex. subString -> �κ��� �̾Ƴ��� �Լ�..
*/
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str = ""; // ���ڿ��� �ʱ�ȭ >> null, ""
		// ����� : int, doubleó�� ������!

		String[] strarr = { "aaa", "bbb", "ccc" };
		for (String s : strarr) {
			System.out.println(s);
		}

		///////////////////////////////////////////////////
		String stri = "ȫ�浿";
		System.out.println(stri.length());
		System.out.println(stri.toString());
		System.out.println(stri);	 // ������ Ŭ������� �ּҰ��� ���;�������, ���� ���´�!?
									// �̷��� ���� �ڿ� .toString()�� �����Ǿ� �ִ�.
									// String�� Ŭ������ -> String�� �θ�� Object��
									// Object�� ������ �ִ� toString �Լ��� String���� �������� ��!(���� ����ϵ���)

		// ��Ģ������ String�� ���� ����� �̷���.
		String stra = new String("�����ٶ�");
		// 1. String name = "�����ٶ�"; >> String�� ���������� �޸𸮸� ���µ�,
		// >>String�� ���������� char[] �޸𸮸� ����Ѵ�. >> char[] �迭�̶�� �̾߱��
		// [��][��][��][��][��] 0 1 2 3 4��° �濡 ���� �۾��� ����.
		// class String extends Object{ char[] .... @Override toString(){������ ����} .. length(){}..}
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1);
		System.out.println(str2.toString());
		System.out.println(str1==str2);
		// ==�̶�� �����ڴ� ���� �� (str1�� �ּҰ�, str2�� �ּҰ�)
		// �ּҰ� == �ּҰ�
		// ���� �ּҷ� �Ǹ�Ǿ���. �� ������
		// �޸𸮿� ������ ���� ���ڿ��� ������ �����ع�����.
		System.out.println(str1.equals(str2));	//�ּҸ� ã�ư� �� �ȿ� �ִ� ���� ���ϴ� ���̴�
		// equals -> AAA == AAA
		
		// ---��������---
		String str3 = new String("BBB");	//new ���ο� �޸� ����
		String str4 = new String("BBB");
		System.out.println(str3 == str4);	//false -> cause str3�� str4�� �������� > �ּҰ��� �ٸ���, �� �� �ٸ� ��ü�⋪��
		System.out.println(str3.equals(str4));	//�ּҸ� Ÿ�� �� �� "BBB"=="BBB"�� ���Ѵ�. -> true!
		
		//�ͼ���
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		
		s = "A";
	}

}
