
public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		// ���а� �л����� �⸻��� ��������
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // max������ 79���� ������
		int min = score[0]; // min������ 79

		/*
		 * ����� ����ؼ� max��� ������ �������� �ִ밪�� min�̶�� ������ ���� ���� �ּҰ��� �������� ��°�� : max 97, min
		 * 54. ��, for���� �ѹ��� ���
		 */

		for (int i = 1; i < score.length; i++) {
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
		}
		System.out.println("max : " + max + ",min : " + min);

		int[] number = new int[10];
		// 10���� ���� ���� 1~10����
		for (int i = 0; i < number.length; i++) {
			number[i] = (i + 1);
			System.out.printf("[%d��° ���� ��] = [%d]\n", i, number[i]);
		}
		System.out.println();
		// ��� �л��� �⸻��� ���� ���� (5������ ����ô�)
		int sum = 0;
		float average = 0f;
		int[] jumsu = { 100, 55, 90, 60, 78 };
		// 1.�� ������ ��
		// 2.������ ��
		// 3.������ ���
		// ��, 2,3�� ������ �ϳ��� for������ �ذ��϶�

		System.out.println("1.�� ����� : " + jumsu.length + "���� ����");
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			if (i == jumsu.length - 1) {
				average = (float)sum / jumsu.length;
			}
		}
		System.out.println("2.������ �� : " + sum + "��" + "\n3.���� ��� : " + average + "��");
		System.out.printf("��� : [%f]",average);
		//BigDecimal ,����, Ʈ��ũ �˾ƺ���
		
		
		
	}
}
