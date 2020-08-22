
public class Ex06_Operation {

	public static void main(String[] args) {

		int sum = 0;
		// 대입연산자 " += , -=, *=, /= "
		sum += 1;
		sum -= 1;
		System.out.println("sum : " + sum);

		// 간단한 학점 계산기
		// 학점 : a+ a- b+ b-.... F
		// 데이터 점수 : 94점
		// 판단 기준 : 90점 이상 >> A
		// 그런데 점수가 95점 이상이라면 A+
		// 아닌데 a-
		// 90..80..70
		/*
		 * 95 이상 A+ 90 이상 A- 85 이상 B+ 80 이상 B- 75 이상 C+ 70 이상 C- F
		 */

		// 첫 번째 학생
		/*
		 * int score = 75; String grade = (score >= 95) ? "A+" : (score >= 90) ? "A-" :
		 * (score >= 85) ? "B+" : (score >= 80) ? "B-" : (score >= 75) ? "C+" : (score
		 * >= 70) ? "C-" : (score >= 65) ? "D+" : (score >= 60) ? "D-" : "F";
		 * System.out.println("첫 번째 학생 점수: " + score + "점, 성적 : " + grade);
		 */
		//혼란을 가중시키는 일

		/*
		 * // 두 번쨰 학생 while (true) { int score2 = 75; if (score2 >= 95)
		 * System.out.printf("두 번째 귀하의 점수는 %d점, 성적=A+\n", score2); else if (score2 >=
		 * 90) System.out.printf("두 번째 귀하의 점수는 %d점, 성적=A-\n", score2); else if (score2
		 * >= 85) System.out.printf("두 번째 귀하의 점수는 %d점, 성적=B+\n", score2); else if
		 * (score2 >= 80) System.out.printf("두 번째 귀하의 점수는 %d점, 성적=B-\n", score2); else
		 * if (score2 >= 75) System.out.printf("두 번째 귀하의 점수는 %d점, 성적=C+\n", score2);
		 * else if (score2 >= 70) System.out.printf("두 번째 귀하의 점수는 %d점, 성적=C-\n",
		 * score2); else System.out.printf("두 번째 귀하의 점수는 %d점, 성적=F\n", score2); break; }
		 * 
		 * // 세번째학생 int score3 = 85; if (score3 >= 0 && score3 <= 100) { if (score3 >=
		 * 90) { //A if (score3 == 95) { System.out.println("A"); } else if (score3 >
		 * 95) { System.out.println("A+"); } else System.out.println("A-"); } else if
		 * (score3 >= 80) { //B if (score3 == 85) { System.out.println("B"); } else if
		 * (score3 > 85) { System.out.println("B+"); } else System.out.println("B-"); }
		 * else if (score3 >= 70) { //C if (score3 == 75) { System.out.println("C"); }
		 * else if (score3 > 75) { System.out.println("C+"); } else
		 * System.out.println("C-"); } else //F System.out.println("F"); }
		 */
		
		int score = 78;
		String grade = ""; // 문자열의 초기화
		System.out.println("당신의 점수는 :" + score);

		// 학점계산 로직
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
