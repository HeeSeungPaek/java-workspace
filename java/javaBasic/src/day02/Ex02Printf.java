package day02;

//printf�� �پ��� ������ �˾ƺ���

public class Ex02Printf {
	public static void main(String[] args) {

		//	1.10�� ����('d'ecimal) : %d
		//	1-A. ������ �״�� ����ض�
		//	1-B. ������ 5�ڸ��� ������ �����ؼ� ����ض�
		//	1-C. ������ 5�ڸ��� ���� �����ؼ� ����ض�
		//	1-D. ������ 5�ڸ��� ������ �����ϰ� ���� ������� 0���� ä����
		//	%-05d�� �ȵǳ�
		int number = 478;
		System.out.printf("1-A.%d\n", number);
		System.out.printf("1-B.%5d\n", number);
		//��, �ڸ������� ����� ���� ������ �ڸ����� ���õȴ�.
		System.out.printf("1-B.%2d\n", number);
		System.out.printf("1-C.%-5d��³�\n", number);
		System.out.printf("1-D.%05d\n", number);
		
		//	2.16���� ����(he'x'adecimal)
		//	2-a.16���� ������ �״�� ǥ���ϵ�, ���ĺ��� ������ �ҹ��ڷ� ����ض�
		//	2-b.16���� ������ �״�� ǥ���ϵ�, ���ĺ��� ������ �빮�ڷ� ����ض�
		//	2-c.16���� ������ 8�ڸ��� ǥ���ϰ� ������ �����ϵ� �빮�ڷ� ����ض�
		//	2-d.16���� ������ 8�ڸ��� ǥ���ϰ� ������ �����ϰ� ���� �� ����0ä��� �빮�ڷ� ���
		System.out.printf("2-a.%x\n", number);
		System.out.printf("2-b.%X\n", number);
		System.out.printf("2-c.%8X\n", number);
		System.out.printf("2-c.%08X\n", number);
		
		//	3.�Ǽ�('f'loat)
		//	3a.�Ǽ��� �״�� ���
		//	3b.�Ǽ��� �Ҽ��� 3��° �ڸ����� ����ض�
		//	3c.�Ǽ��� �� 8�ڸ��� �Ҽ����� 3��° �ڸ����� ����ض�
		//	3d.�Ǽ��� �� 5�ڸ��� �Ҽ����� 4��° �ڸ����� ����ض�
		double myDouble = 3.141592;
		System.out.printf("3a. %f\n", myDouble);
		System.out.printf("3b. %.3f\n", myDouble);
		System.out.printf("3c. %8.3f\n", myDouble);
		//���� �� �ڸ��� �����ϱ� ������ ��°���� vvv3.142 8���ڰ� �ȴ�
		System.out.printf("3d. %5.4f\n", myDouble);
		//�� �����Ͱ� ǥ���ϰ��� �ϴ� �ڸ������� ���� ��� �ڸ����� �����ϰ�, �Ҽ��� �Ʒ� 4�ڸ���
		//�״�� ��µȴ�
		//��°�� : 3d.3.1416

		//4. ��Ʈ��('s'tring)
		//4a. ��Ʈ���� �״�� ����ض�
		//4b. ��Ʈ���� �ҹ��ڴ� �빮�ڷ� �ٲ� ����ض�
		//4c. ��Ʈ���� �� 10�ڸ��� ���߰� ������ �����ؼ� ����ض�
		//4d. ��Ʈ���� �� 10�ڸ��� ���߰� ���� �����ؼ� ����ض�
		String myString = "abcDEF";
		System.out.printf("4a.%s\n", myString);
		System.out.printf("4b.%S\n", myString);
		System.out.printf("4c.%10s\n", myString);
		System.out.printf("4d.%-10s\n", myString);
		
		//5. ����ǥ���('e'xponential)
		myDouble = 123.4567;
		System.out.printf("5.%e\n", myDouble);
		System.out.printf("5.%E\n", myDouble);
	}
}
