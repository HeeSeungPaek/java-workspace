package day01;

/*����������
 * ���������ڴ� ������ ���� 1�� ���ϰų� ����.
 * ������ ������ ���� ��������� �޶�����.
 * 1 ���� ��ų ���� ++
 * 1 ���� ��ų ���� --*/
public class Ex03Operator02 {
	public static void main(String[] args) {
		int number = 5;
		System.out.println("number�� ���簪 : " + number);
		//���� �տ� ������ ��������� ���� ������ �ȴ�
		System.out.println("number�� ���簪 : " + ++number);
		//�� number�� ���� 1 ���� �Ǿ� 6�� �ǰ� number 6�� ��µ�.
		System.out.println("number�� ���簪 : " + number);
		//������ ���� number������ ������ 1���� ���������Ƿ� 6�� ��µ�.
		
		//�ݴ�� ���������ڰ� �ڿ� �ٴ´ٸ� ��������� ������ �ȴ�.
		System.out.println("number�� ���簪 : " + number++);
		//����� ���� 6�� number�� ��µ����� ���� number�� ����� ���� 7
		System.out.println("number�� ���簪 : " + number);
		//���� ��¹� ������ �ͼ��� 7�� ��µȴ�
	}
}
