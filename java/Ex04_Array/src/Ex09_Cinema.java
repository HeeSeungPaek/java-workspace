
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "___";
			}
		}

		// ����
		seat[2][1] = "��浿";
		seat[0][0] = "Ŵǳ��";

		// �¼����� �����ֱ� 
		// ���ڿ��� �񱳴� equals�޼ҵ�
		// 3�׿����ڷ� �� �¼��� �ڸ��� ǥ��, ���ŵ� ���� ���ŷ� ǥ��
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("___") ? "�ڸ�" : "����");
			}
			System.out.println();
		}

		// for(String[] row : seat) {
		// for(String col : row) {
		// System.out.println(col);
		// }
		// }
		
		int row, col;	//����ڷκ��� ��� ���� ��ȣ�� �޾ƾߵȴ�. -> ������ ����
		row = 0;
		col = 0;
		if(seat[row][col].equals("___")) {
			System.out.println("���� ���� �¼��Դϴ�.");
		}else {
			System.out.println("�̹� ����Ǿ����ϴ�.");
		}

		
		//�¼����� �ʱ�ȭ
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "___";
			}
		}
		
		//���� �ִ� �䱸������ ���赵�� ���� ���������
		//class Cinema{�Ӽ�, ���}
		
		
	}
}
