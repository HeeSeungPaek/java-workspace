package fastCampus;

public class Ex05_br_ctnue_practice {
	public static void main(String[] args) {
		// ������ ��� �� ¦�� �ܸ� ����ϸ鼭 �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ����ϼ���

		int dan;
		int count;

		for (dan = 2; dan <= 9; dan++) {

			if (dan % 2 != 0)
				continue;

			for (count = 1; count <= 9; count++) {

				if (count > dan)
					break;
				System.out.println(dan + "X" + count + "=" + dan * count);
				// if(count >= dan) break;

			}
			System.out.println();
		}

	}
}
