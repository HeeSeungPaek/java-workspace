package day04;

import java.util.Random;

public class Ex02Lottery {
	public static void main(String[] args) {
		// ����Ŭ������ �� �״�� ������ ���ڸ� ������ִ� Ŭ�����̴�.
		// �츮�� ������ ����(=����)�� ����� ���� �����
		// RandomŬ���� ��ü�� ������ ����ϸ� �ȴ�.
		Random random = new Random();
		int[] lottoNumbers = new int[6];

		// lottoNumbers�� �� �ε����� ������ �Է��ϴ� for��
		for (int i = 0; i < lottoNumbers.length; i++) {
			// random.nextInt�� 0 ~ �Ķ����-1������ ������ �����Ѵ�
			// ���� 1 ~ 45������ ������ ���ϸ�
			// random.nextInt(45)�� ������� 1�� �����ָ� �ȴ�.

			lottoNumbers[i] = random.nextInt(45) + 1;
		}
		
		System.out.println("====���� ���� ����====");
		for(int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("lottoNumbers[%d]: %3d\n", i, lottoNumbers[i]);
		}
		System.out.println("=================");
		System.out.println("====�ߺ� ���� ����====");
		//�ߺ��̶�?
		//i�� j�� �ٸ����� lottoNumber[i]�� lottoNumber[j]�� ������ �ߺ��̴�.
		
		for(int i = 0; i < lottoNumbers.length; i++) {
			for(int j = 0; j < lottoNumbers.length; j++) {
				if( i != j && lottoNumbers[i] == lottoNumbers[j]) {
					//&&�����ڷ� ���� Ȯ��
					System.out.printf("%d�� %d �ߺ�\n", i, j);
					lottoNumbers[i] = random.nextInt(45)+1;
					j = -1; //�� ������ ���ư��� �ٽ� �ߺ��˻�
				}
			}
		}
		System.out.println("====�ߺ� ���� ����====");
		for(int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("lottoNumbers[%d]: %3d\n", i, lottoNumbers[i]);
		}
		
		System.out.println("@@@@@@���� �ǽ�@@@@@@");

		//�������� ������ �� ������ i�� i+1��°�� ���Ͽ�
		//���� i�� i+1���� ũ�� 2���� ������ �ٲ��ָ� �ȴ�.
		
		//���� : 15 16 11 2 4 6
		// i: 1
		for(int i = 0; i < lottoNumbers.length - 1; i++) {
			if(lottoNumbers[i] > lottoNumbers[i+1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i] = lottoNumbers[i+1];
				lottoNumbers[i+1] = temp;
				i = -1;
			}
		}
		System.out.println("@@@@@@���� ����@@@@@@");
		for(int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("lottoNumbers[%d]: %3d\n", i, lottoNumbers[i]);
		}
		//���: �迭�� �����ϴ�.
		
	}
}
