/*
1. 1~45������ ������ �߻����� 6���� �迭�� ��������
	(int)(Math.random()*45 + 1)
	lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)
���Ŀ��� ������ Ŭ���� �и��ؼ� Lotto.java ..... 
���� main �Լ� �ȿ��� ��� ....����...
���� 1�� �Դϴ�
1. 1~45������ ������ �߻����� 6���� �迭�� ��������  (ó��...)
2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (���� �н�...)
3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����   (�ڷᱸ�� ...)
4. �� ����� ��� �ִ� �迭�� ����ϼ��� 
 */
public class Ex03_Array_Lotto_Main {

	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {	//1��,2��. ���� �Ҵ� �� �ߺ� �� ����, ���Ҵ�
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) { 			
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45 + 1);
					System.out.println("�ߺ� Ȯ�ε�");
					i--;
				}
			}
		}

		for (int i = 0; i < lotto.length - 1; i++) { // 3��. ���� ���� ū ���� ��ġ �ٲ� �� ó������ �˻�
			System.out.printf("[%d],[%d]\n", i, lotto[i]);
			if (lotto[i] > lotto[i + 1]) {
				int temp = lotto[i];
				lotto[i] = lotto[i + 1];
				lotto[i + 1] = temp;
				i = -1; 							// ���� i�� 1�� �������⶧���� �ٽ� ó������ �˻� 
			}
		}
		
		for (int i = 0; i < lotto.length; i++) { 	
			System.out.printf("lotto[%d] : [%d]\n", i, lotto[i]);
		}

	}
}