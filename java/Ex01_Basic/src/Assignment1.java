//���ĺ� A~Z���� ����ϴ� ���α׷��� �ۼ��ϼ���.

public class Assignment1 {

	public static void main(String[] args) {

		// [1�� ����] ���ĺ� A~Z ���
		char ch1 = 'A';
		for (int i = 0; i <= 25; i++) {
			System.out.print((char) (ch1 + i) + " ");
		}

		// [2�� ����] 1~100���� 10�� 10�� ���
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * 10 + j + " ");
			}
			System.out.println();
		}

	}

}

/*
 * int[] arr = new int[26]; char ch = 'A';
 * 
 * for (int i = 0; i <= 25; i++) { arr[i] = ch; ch++;
 * System.out.println((char)arr[i]); }
 */