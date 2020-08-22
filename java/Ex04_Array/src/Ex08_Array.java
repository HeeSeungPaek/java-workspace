
public class Ex08_Array {

	public static void main(String[] args) {
		// 다차원 배열 (2차원)
		// [행][열]
		// 교실의 좌석(영화관 예매), 경도와 위도(지도), 오목스,
		// 영화관 예매 관리 프로그램
		// 예약 . 조회 . 취소

		int[][] score = new int[3][2];

		// System.out.println(score[0][0]);

		score[0][0] = 100;
		score[0][1] = 200;

		score[1][0] = 300;
		score[1][1] = 400;

		score[2][0] = 500;
		score[2][1] = 600;

		// 행의 수, 열의 수
		// for...

		// ********************************************
		// 2차원 배열의 그림을 이해하면 풀린다.
		// 행의 개수는 배열의이름.length >> score.length
		// 열의 개수는 배열의이름[i].length >> score[i].length

		// score[0].length >> 열의 개수
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) { // 컬럼개수가 달라도 아무 문제가 없어진다! ->score[i].length
				System.out.printf("score[%d][%d] 값 : [%d]\t", i, j, score[i][j]);
			}
			System.out.println();
		}

		// 2차원 배열선언 방법
		int[][] score3 = new int[][] { 
			{ 11, 12 },
			{ 13, 14 },
			{ 15, 16 } 
		};

		// 개선된 for문을 사용해서 2차원 배열의 값 출력
		// 값만 가져온다
		for (int[] row : score3) {
			for (int column : row) {
				System.out.println("값 : " + column);
			}
		}

	}

}
