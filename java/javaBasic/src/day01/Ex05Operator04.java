package day01;
//��������
//�������ڴ� ���� ���� ���� ������ �Ѵ�.
//AND OR NOT
//&& : 2���� �� ��� true�� �� true ��ȯ
//|| : 2���� �� �� �ϳ��� true��� true ��ȯ
//! : true�� false�� false�� true�� ��ȯ

//�ѱ������� ��ȭ, �߱������� ����ȭ, �Ϻ��������� ��ȭ
//���������� �齽���� + shift�� ����Ѵ�.

//���������ڴ� �ٲ� ���� �տ� !�� �ٿ��ָ� �ȴ�.
public class Ex05Operator04 {
	public static void main(String[] args) {
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		
		//and����
		System.out.println("true && false : " + (myBoolean1 && myBoolean2));
		//or����
		System.out.println("true || false : " + (myBoolean1 || myBoolean2));
		//����
		System.out.println("true! : " + (!myBoolean1));
		System.out.println("false! : " + (!myBoolean2));
	}
}
