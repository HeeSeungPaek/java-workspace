import java.util.Arrays;

/*
�迭�� ��ü�� (Array)
1. new �� ���ؼ� ������ ��ü Array��
2. heap�޸𸮿� �����ȴ�.
3. ���� �迭(���� �迭) : �迭�� ũ�Ⱑ �� �� �������� ������ �Ұ��ϴ�!
4. �ڷᱸ���� �⺻ : ���� �����ض�...
*/
public class Ex01_Array_Basic {
	public static void main(String[] args) {

		int s, s1, s2, s3;
		int[] score = new int[3];

		System.out.println(score[0]); // read
		score[0] = 101;// write
		score[1] = 20;
		score[2] = 300;
		System.out.println(score[0]);

		// ���� ������ �׻� index+1�̴�. (�氳��-1�� ������ index�̴�.)
		// score[3] = 50;
		// java.lang.ArrayIndexOutOfBoundsException : ÷���� ������ ������! > ����

		// Array �迭 : for���� ����
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%d] = [%d]\t", i, score[i]);
		}

		System.out.println();

		for (int i = 0; i < score.length; i++) { // score.length : �迭�� ����
			System.out.printf("[%d] = [%d]\t", i, score[i]);
		}

		// �� : Array�� �����ִ� Ŭ������ �ֵ�.
		// String result = Arrays.toString(score); for�� �迭 �Ը������ϸ� �׶� ����. ��Ӿ��� �Ƿ� �ش�.
		// System.out.println(result);

		// Arrays.sort(score);
		// String result1 = Arrays.toString(score); �̰͵� �ݱ�.
		// System.out.println(result1);

		// Today Point
		// �迭 ������ 3���� ���
		int[] arr = new int[5]; // �⺻��
		int[] arr2 = new int[] { 100, 200, 300 }; // �ʱⰪ�� ���ؼ� ���� ��������� �ʱ�ȭ����
		int[] arr3 = { 11, 22, 33, 44, 55 }; // �ڹٽ�ũ��Ʈ���� �̰� ���� ���̾�. let carcarr=[1,2,3,4,5];
		// 3��ó�� �ۼ��ϸ�, �����Ϸ��� new int[] { 11, 22, 33.. };�� �������ش�.

		// arr3 �濡 �ִ� ������ ����غ���
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("\n[%d] = [%d]\n", i, arr3[i]);
		}

		// �迭�� ��ü��. -> new�ؾ��Ѵ�. -> new�ϸ� �޸𸮿� �ö󰣴�. -> �޸𸮶��ϸ� ���̴�.
		int[] arr4; // ����
		arr4 = new int[] { 21, 22, 23, 24, 25 }; // Assign
		System.out.println(arr4); // I@4aa298b7 ��Ұ�

		int[] arr5 = arr4; // �ּҰ� �Ҵ�
		System.out.println(arr4 == arr5);// �ּҰ� �� >>> ���� �翬�� True

		// �迭�� Ÿ�� : 8���� �⺻ Ÿ�� + String
		// **Ŭ���� (����� ���� Ÿ��)�� Array�� Ÿ������ ����Ѵ�.

		String[] strarr = new String[] { "��", "��", "�ٶ�" };
		for (int index = 0; index < strarr.length; index++) {
			System.out.println(strarr[index]);
		}

		char[] charr = new char[10]; // default�� : ���� \u0000
		for (int i = 0; i < charr.length; i++) {
			System.out.println(">" + charr[i] + "<");
		}

		// ��ü �迭
		// Car
		// Car[] cars = new Car[10];
	}
}
