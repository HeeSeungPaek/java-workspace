import java.io.IOException;

import kr.or.bit.ExClass;

public class Ex04_Exception {

	public static void main(String[] args) {
		// File f = new File("C:\\Temp"); //���� ��ΰ� ���� ��� ������ �߻��� �� ����!
		try {
			ExClass ex = new ExClass("Temp"); // �̷� ��ΰ� ������, ������ġ�� �����ؼ� ���α׷��� ���� �ʰ� �ϰڴٴ� ��
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
