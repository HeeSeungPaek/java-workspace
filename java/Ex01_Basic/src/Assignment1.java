//알파벳 A~Z까지 출력하는 프로그램을 작성하세요.

public class Assignment1 {

	public static void main(String[] args) {

		// [1번 문제] 알파벳 A~Z 출력
		char ch1 = 'A';
		for (int i = 0; i <= 25; i++) {
			System.out.print((char) (ch1 + i) + " ");
		}

		// [2번 문제] 1~100까지 10행 10열 출력
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