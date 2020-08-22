package Cinema_after;

public class CinemaMain {

	//예매 조회와
	//예매 취소가 미구현됨
	//예매할 때 정확한 표현 아닐 시 알려주는 것 없음
	//1-1을 제일 먼저 예매 후 다른 좌석 예매가 안됨(치명적 : 쓰레기코드)
	//예매 도중 좌석 재선택 안됨 -> 됨
	
	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		cinema.startProgram();
	}

}

