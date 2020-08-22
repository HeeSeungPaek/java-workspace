
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];

		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "___";
			}
		}

		// 예매
		seat[2][1] = "콩길동";
		seat[0][0] = "킴풍진";

		// 좌석정보 보여주기 
		// 문자열의 비교는 equals메소드
		// 3항연산자로 빈 좌석은 자리로 표시, 예매된 곳은 예매로 표시
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("___") ? "자리" : "예매");
			}
			System.out.println();
		}

		// for(String[] row : seat) {
		// for(String col : row) {
		// System.out.println(col);
		// }
		// }
		
		int row, col;	//사용자로부터 행과 열의 번호를 받아야된다. -> 리스너 ㄱㄱ
		row = 0;
		col = 0;
		if(seat[row][col].equals("___")) {
			System.out.println("예약 가능 좌석입니다.");
		}else {
			System.out.println("이미 예약되었습니다.");
		}

		
		//좌석정보 초기화
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "___";
			}
		}
		
		//위에 있는 요구사항을 설계도로 만들어서 레츠기기춘
		//class Cinema{속성, 기능}
		
		
	}
}
