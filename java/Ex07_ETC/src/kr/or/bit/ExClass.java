package kr.or.bit;

import java.io.IOException;

/*
���赵(class)�� ���� ��, Ȥ�ó� ������ �߻����� ������?
����� ���� �߸�����ٰ� ������ �װ� ���»������ �Ǽ��ϰų� �߸��ؼ�
������ �߻��� ������ �ִٸ�, ������ �߻��� ���ִ� �κп� ���ؼ� ���α׷���
������ �װ� ���� �ʰڴ�!
	>> �� ���赵�� ����ϴ� �����ڰ� ���ܸ� ������ ó��..����

�����ڳ� �Լ��� ���� �� ������ ���ܸ� ó���ϰ� �� �� �ִ�

*/
public class ExClass { // �� �����ڸ� ������ �� �� ����"��"�� ó���ϰڴٴ� ��! (throws ��������)
	public ExClass(String path) throws IOException, NullPointerException {
		System.out.println(path);
	}

}
