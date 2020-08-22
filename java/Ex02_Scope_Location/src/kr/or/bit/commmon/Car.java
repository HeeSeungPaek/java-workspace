package kr.or.bit.commmon;

public class Car {
	//클래스가 퍼블릭이라 하더라도 안쪽자원이 막고 있으면 다른 자원에서 호출할 수 없다.
	int i; //컴파일러가 자동으로 default를 붙여준다 >> default i; 
	public int window; //public을 붙여 어디에서나 (어느 폴더에 있건) 공유하겠다!
	private int pri; //객체지향에서 가장 중요한 건 private(사적인)
	
	//직접적인할당 외에 사적인 데이터 변환이 필요할 경우 간접 할당(private)
	
	
	
	/*
	 * public void air() { AirPlane ariplane = new AirPlane(); }
	 */
}