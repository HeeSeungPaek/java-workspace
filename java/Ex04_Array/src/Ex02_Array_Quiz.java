
public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		// 수학과 학생들의 기말고사 시험점수
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // max변수에 79값이 들어가있음
		int min = score[0]; // min변수에 79

		/*
		 * 제어문을 사용해서 max라는 변수에 시험점수 최대값을 min이라는 변수에 시험 점수 최소값을 담으세요 출력결과 : max 97, min
		 * 54. 단, for문을 한번만 써라
		 */

		for (int i = 1; i < score.length; i++) {
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
		}
		System.out.println("max : " + max + ",min : " + min);

		int[] number = new int[10];
		// 10개의 방의 값을 1~10까지
		for (int i = 0; i < number.length; i++) {
			number[i] = (i + 1);
			System.out.printf("[%d번째 방의 값] = [%d]\n", i, number[i]);
		}
		System.out.println();
		// 어느 학생의 기말고사 시험 점수 (5과목을 시험봤다)
		int sum = 0;
		float average = 0f;
		int[] jumsu = { 100, 55, 90, 60, 78 };
		// 1.총 과목의 수
		// 2.과목의 합
		// 3.과목의 평균
		// 단, 2,3번 문제는 하나의 for문으로 해결하라

		System.out.println("1.총 과목수 : " + jumsu.length + "개의 과목");
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			if (i == jumsu.length - 1) {
				average = (float)sum / jumsu.length;
			}
		}
		System.out.println("2.과목의 합 : " + sum + "점" + "\n3.과목 평균 : " + average + "점");
		System.out.printf("평균 : [%f]",average);
		//BigDecimal ,라운드, 트렁크 알아보기
		
		
		
	}
}
