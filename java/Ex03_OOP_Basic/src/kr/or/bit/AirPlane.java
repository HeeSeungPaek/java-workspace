package kr.or.bit;

/*
우리 회사는 비행기를 주문 제작 판매
우리 회사는 비행기를 생산하는 설계도를 작성하려 한다

요구사항
1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야 한다. //비행기 클래스에 멤버필드 만들기
2. 비행기가 생산되면 비행기의 이름과 번호에 맞게 부여되었는 지 확인하는 작업이 필요(출력정보 확인) //출력하는 메소드
3. 공장장은 현재까지 만들어진 비행기의 총대수(누적)을 확인 할 수 있습니다. //

다른 요구사항을 만들어보자

AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
 */
public class AirPlane {
	private String name;
	private int number;
	private static int count;

	public AirPlane(String name, int number) {
		this.name = name;
		this.number = number;
		count++; //강제한다.
	}
	
	/*
	 * public void makeAirPlane(int number, String name) { this.number = number;
	 * this.name = name; count++; //강제한다. }
	 */

	public void AirPlaneInfo() {
		System.out.printf("출력하신 비행기의 이름 : [%s], 번호 : [%d]\n",this.name, this.number);
	}
	
	public void printTotal() {
		System.out.printf("총 비행기 대수는 [%d] 입니다\n", count);
	}
	
	
}
