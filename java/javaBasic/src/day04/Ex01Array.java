package day04;
//�迭(Array)

//�迭�̶� �Ȱ��� ������Ÿ���� Ư�� ũ�⸸ŭ ��Ƶ� ����
//�迭�̶�� �Ѵ�.

//�迭��
//������Ÿ��[] �迭�̸� = new ������Ÿ��[ũ��];
//�� ����� �ʱ�ȭ�Ѵ�.

//������ 2���� ������ �־ �Ⱦ��δ�.
//1. ũ�Ⱑ �����Ǿ��ִ�.
//2. 2���� ���α׷��ֺ��� �����ϴ� �����̱� ������
//	  Ŭ������ ��ģȭ���̴�.

public class Ex01Array {
	public static void main(String[] args) {
		// ũ�Ⱑ 5�� int �迭�� ������
		int[] arr = new int[5];

		// �迭�� �� ��Ҵ� �ϳ��� ����ó�� �� �� �ִ�.
		arr[0] = 15;
		System.out.println("arr[0]: " + arr[0]);

		// �迭�� �� ��ġ�� �ε����� �ִ�.
		// index�� 0 ~ ũ��-1
		// �ε��� Ʋ���� ������ ������
		// System.out.println("arr[5]:"+arr[5]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i]);
		}
		// �⺻�� ������Ÿ���� �迭�� ����� ó�� �ʱ�ȭ�� �ڵ����� 0�� �ȴ�.
		// �׷��ٸ� ������ ������Ÿ���� �迭�� �����
		// �ʱ�ȭ�� �����ָ� ���� ���� ��������? -> null��
		Student[] studentArray = new Student[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("studentArray[" + i + "] : " + studentArray[i]);
		}
		//null�̶�?
		//������ ������ �ּҰ��� �ο��� �Ǿ�������
		//�ش� �ּҿ��� ���� �ƹ��͵� ���� ���¸� null�̶�� �Ѵ�.
		//null�� ���¿����� �ʵ�� �޼ҵ忡 �ƹ��� ������ �� �� ����.
		//������ �ϰ� �Ǹ�java.lang.NullPointerException�� �߻��Ѵ�.
		//studentArray[0].printInfo();
		//���� ������ �迭�� �� ��ġ�� �����ڸ� ȣ���ؼ� �ʱ�ȭ �ؾ� �Ѵ�.
		for(int i = 0; i < arr.length; i++) {
			studentArray[i] = new Student();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("studentArray[" + i + "] : " + studentArray[i]);
		}
		
		//���� �츮�� ��ü�� �迭���� ����ִ� ĭ�� ã������?
		//������ ȣ���� �ȵǾ������� null�� ã�ƾ� �ϰ�
		//������ ȣ���� �Ǿ������� ���� ã�Ƽ� �� ĭ�� ã�ƾ� �Ѵ�.
		//�� ������.
	}
}
