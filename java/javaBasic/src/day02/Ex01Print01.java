package day02;
//�ڹٿ����� 3���� �ܼ� ��¹���� �����Ѵ�.
//1.print
//	print()�� ��ȣ���� ������ �״�� ����ϰ� ���� �����ġ�� �ٲ��� �ʴ´�.
//2.println
//	println()�� ��ȣ���� ������ ����ϰ� ���� �����ġ�� ���� �ٷ� �ű��.
//3.printf
//	printf()�� ��ȣ���� ������ ��� �� ���� �����ġ�� �ٲ��� ������
//	�츮�� ���ϴ� ��ŭ�� �������� �־ Ư�� ��Ŀ� ������ �� �ִ�.

//���鹮�� : \+���ĺ����� �̷����.
//	\t �� ����(�����̽� 4��)
//	\n ���๮��(next line)

public class Ex01Print01 {
	public static void main(String[] args) {
		String string1 = "abc";
		String string2 = "def";
		System.out.print(string1);
		System.out.print(string2);
		
		System.out.println(string1);
		System.out.println(string2);
		
		System.out.printf("string1 : %s, s\ntring2 : %s\t", string1, string2);
		
		System.out.print(string1);

	}
}
