package day02;

//����̶� Ư���ڵ���� ������� ���� Ȥ�� �󸶵��� �ݺ����� ����
//����� ũ�� ���ǹ��� �ݺ����� �ִ�.
//���ǹ� : Ư�� ������ �����ÿ� �ڵ� ����
//�ݺ��� : Ư�� ������ �����ÿ� �ڵ� �ݺ�

//���� Ȥ�� �ݺ��� �ڵ���� ������ {}�� �������µ�
//�̰� �ϳ��� "�ڵ����" �̶� �Ѵ�.
public class Ex03If {
	public static void main(String[] args) {
		
		int age = 15;
		if(age <= 18) {
			System.out.printf("����: %03d��\n", age);
			System.out.println("�̼������Դϴ�.");
		}
		//���� ���� �� �ش� ������ ����ǰ� ���� �� ������ ���� ������ ���� �� ����
		//�� ������ �̸��� ���� ������ ���� ������ ���Ѵ�.
		//���� �� ������ ���� �ڵ� ������ ������ �� ������ �Ҹ�ȴ�.(korean)
		System.out.println("�� ��������");
	}
}