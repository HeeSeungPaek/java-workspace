
public class Ex06_Operation {

	public static void main(String[] args) {

		int sum = 0;
		// ���Կ����� " += , -=, *=, /= "
		sum += 1;
		sum -= 1;
		System.out.println("sum : " + sum);

		// ������ ���� ����
		// ���� : a+ a- b+ b-.... F
		// ������ ���� : 94��
		// �Ǵ� ���� : 90�� �̻� >> A
		// �׷��� ������ 95�� �̻��̶�� A+
		// �ƴѵ� a-
		// 90..80..70
		/*
		 * 95 �̻� A+ 90 �̻� A- 85 �̻� B+ 80 �̻� B- 75 �̻� C+ 70 �̻� C- F
		 */

		// ù ��° �л�
		/*
		 * int score = 75; String grade = (score >= 95) ? "A+" : (score >= 90) ? "A-" :
		 * (score >= 85) ? "B+" : (score >= 80) ? "B-" : (score >= 75) ? "C+" : (score
		 * >= 70) ? "C-" : (score >= 65) ? "D+" : (score >= 60) ? "D-" : "F";
		 * System.out.println("ù ��° �л� ����: " + score + "��, ���� : " + grade);
		 */
		//ȥ���� ���߽�Ű�� ��

		/*
		 * // �� ���� �л� while (true) { int score2 = 75; if (score2 >= 95)
		 * System.out.printf("�� ��° ������ ������ %d��, ����=A+\n", score2); else if (score2 >=
		 * 90) System.out.printf("�� ��° ������ ������ %d��, ����=A-\n", score2); else if (score2
		 * >= 85) System.out.printf("�� ��° ������ ������ %d��, ����=B+\n", score2); else if
		 * (score2 >= 80) System.out.printf("�� ��° ������ ������ %d��, ����=B-\n", score2); else
		 * if (score2 >= 75) System.out.printf("�� ��° ������ ������ %d��, ����=C+\n", score2);
		 * else if (score2 >= 70) System.out.printf("�� ��° ������ ������ %d��, ����=C-\n",
		 * score2); else System.out.printf("�� ��° ������ ������ %d��, ����=F\n", score2); break; }
		 * 
		 * // ����°�л� int score3 = 85; if (score3 >= 0 && score3 <= 100) { if (score3 >=
		 * 90) { //A if (score3 == 95) { System.out.println("A"); } else if (score3 >
		 * 95) { System.out.println("A+"); } else System.out.println("A-"); } else if
		 * (score3 >= 80) { //B if (score3 == 85) { System.out.println("B"); } else if
		 * (score3 > 85) { System.out.println("B+"); } else System.out.println("B-"); }
		 * else if (score3 >= 70) { //C if (score3 == 75) { System.out.println("C"); }
		 * else if (score3 > 75) { System.out.println("C+"); } else
		 * System.out.println("C-"); } else //F System.out.println("F"); }
		 */
		
		int score = 78;
		String grade = ""; // ���ڿ��� �ʱ�ȭ
		System.out.println("����� ������ :" + score);

		// ������� ����
		if (score >= 90) {
				grade = "A";
				grade = (score >= 95) ? (grade += "+") : (grade += "-");
		} else if (score >= 80) {
			grade = "B";
				if (score >= 85) {
					grade += "+";// grade = grade + "+";
				} else {
					grade += "-";// grade = grade + "-";
				}
		} else if (score >= 70) {
			grade = "C";
				if (score >= 75) {
					grade += "+";// grade = grade + "+";
				} else {
					grade += "-";// grade = grade + "-";
				}
		} else {
			grade = "F";
		}
		
	}

}
