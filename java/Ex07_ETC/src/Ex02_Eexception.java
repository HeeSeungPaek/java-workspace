public class Ex02_Eexception {
	public static void main(String[] args) {

		// �����ڰ� ����ó���� ���� ���ϴ� ����.
		int num = 100;
		int result = 0;

		System.out.println("mmain start");

		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10); // 0~9���� ������ ����
				System.out.println("result : " + result + " ,i : " + i);
			}
		} catch (ArithmeticException e) { // try���� ������ �߻��ϸ� ������ �´� ��ü�� �ڵ����� �����ǰ�,
			// �� ��ü�� �ּҰ��� catch���� ���޵ȴ�.
			// �ٵ� Exception�� �θ�Ÿ���̶� ���ܰ� ��� ������ �� �޾��ش�.

			System.out.println("������ �߻�. �����ڿ��� ���� �߼�");
			System.out.println("���� : " + e.getMessage());
			// catch (Exception e) >> �������� ��������! ��? �ƴ� �ȵ������� �𸣰ڴµ� �̰� ��ü ���� ��������...
			// �׷��ٸ� >> ���� catch �ȿ� �ش� ������ ��ü�� �־��ش�.
			// Arithmetic���� �ٲٸ� ��������� �Ÿ� �� �ִ�. �׷��� �ٸ� ������ ����´�!
			// �׷� �� ����ϴ� �� catch�� �� ���� �Ŵ�!
		} catch (NullPointerException e) {
			// NullPointerException�� ���� ó���Ұ�!
			// -> ���� ���� ���ܸ� ������ �������� ���� ó���Ѵٴ� �ǹ�!
		} catch (Exception e) {
			// �������� catch�� �������� ���ؼ���
			// ���� ����ó�� Ŭ������ ���� catch���ְ�..
			// ū catch(Exception��ü)�� ���߿� ���ش�!
			// [���� ����], [null ����] �� ������ �������� ���� ó���Ұ�!
			// �̷��� ���������� ���� ���ܰ�ü�� ������ �ִ� ���� >>> �������� ���δ�!! (�̰� �����ǹ��ϱ�?)
			// ���� ���ܸ� ���� �������ν�, try�� �ڵ�� �̷� ���ܰ� ���� �� �ְڱ��� ������ ������ �ڵ尡 �Ǳ� ������ �������� �ö󰣴�! }

			// �̷��� �ǽɽ����� �ڵ忡 ���ؼ��� ����ó���� �ݵ�� �ؾ��Ѵ�!
			/*
			 * for(int i = 0; i < 10; i++) { result = num / (int)(Math.random() * 10);
			 * //0~9���� ������ ���� System.out.println("result : " + result + "i : " + i); }
			 */

			System.out.println("main end");
		}
	}
}
