
public class Ex08_Array {

	public static void main(String[] args) {
		// ������ �迭 (2����)
		// [��][��]
		// ������ �¼�(��ȭ�� ����), �浵�� ����(����), ����,
		// ��ȭ�� ���� ���� ���α׷�
		// ���� . ��ȸ . ���

		int[][] score = new int[3][2];

		// System.out.println(score[0][0]);

		score[0][0] = 100;
		score[0][1] = 200;

		score[1][0] = 300;
		score[1][1] = 400;

		score[2][0] = 500;
		score[2][1] = 600;

		// ���� ��, ���� ��
		// for...

		// ********************************************
		// 2���� �迭�� �׸��� �����ϸ� Ǯ����.
		// ���� ������ �迭���̸�.length >> score.length
		// ���� ������ �迭���̸�[i].length >> score[i].length

		// score[0].length >> ���� ����
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) { // �÷������� �޶� �ƹ� ������ ��������! ->score[i].length
				System.out.printf("score[%d][%d] �� : [%d]\t", i, j, score[i][j]);
			}
			System.out.println();
		}

		// 2���� �迭���� ���
		int[][] score3 = new int[][] { 
			{ 11, 12 },
			{ 13, 14 },
			{ 15, 16 } 
		};

		// ������ for���� ����ؼ� 2���� �迭�� �� ���
		// ���� �����´�
		for (int[] row : score3) {
			for (int column : row) {
				System.out.println("�� : " + column);
			}
		}

	}

}
