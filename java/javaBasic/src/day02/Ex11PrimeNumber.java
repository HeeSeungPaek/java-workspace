package day02;
//PrimeNumber : �Ҽ�
//����� 1�� �ڱ��ڽŹۿ� ���� �� = ����� 2��
//��� : ������ �������� �� = �������� 0�� ��
//�ִ� ��� : ��� �� �ִ��� �� = �ڱ� �ڽ�
//�� �� ���� ������ �̿��� 1~100������ �Ҽ��� ���ϴ� ���α׷��� ������
public class Ex11PrimeNumber {
	public static void main(String[] args) {
		
		//i for���� ����� i�� �ش� ���ڰ� �Ҽ����� �ƴ����� üũ�ϰ�,
		//j for���� ����־� j�� i�� ������� �ƴ����� üũ�Ѵ�.
		for(int i = 1; i <= 100; i++) {
			//����� ������ ������ count ������ ����� 0���� �ʱ�ȭ�Ѵ�.
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.printf("�Ҽ� : %03d.\n", i);
			}
		}
	}
}