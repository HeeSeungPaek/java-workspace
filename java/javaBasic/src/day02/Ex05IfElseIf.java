package day02;
//if-else if ������ �������� ������ üũ�� �� ���ȴ�.
//�������� ���ǽ� �� true�� ������ ���� ������ �ڵ� ����� ����ȴ�.
//if�� else ���̿�
//�ʿ��� ��ŭ�� else if�� �־��� �� �ִ�.

public class Ex05IfElseIf {
	public static void main(String[] args) {
		int age = 99;
		if(age < 6) {
			System.out.println("����");
		}else if(age <= 13) {
			System.out.println("���");
		}else if(age < 18) {
			System.out.println("û�ҳ�");
		}else {
			System.out.println("����");
		}
		
		System.out.println("����");
	}
}
