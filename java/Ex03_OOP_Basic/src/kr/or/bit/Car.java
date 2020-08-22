package kr.or.bit;

public class Car {

	private int window;
	private int speed;
	

	// private 타입 필드는 상황에 따라 게터/세터, 게터, 세터만 쓸 수 있다(의도에 따라)
	// 보통은 다 만든다

	// 단축키 설정하는거도 팀원들한테 알려주기 window>preference>general>keys>binding

	// speed 마이너스 -> 0세팅

	// getter함수
	public int getWindow() {
		return window;
	}

	// setter함수
	public void setWindow(int window) { // 자동생성된 파라미터 window
		this.window = window;
	}

	// getter함수
	public int getSpeed() {
		return speed;
	}

	// setter함수
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else
			this.speed = speed;
	}
	
	// 속도를 10씩 올리거나 내리는 메소드 만들어보자

	public void speedUp() {
		this.speed += 10;
	}

	public void speedDown() {
		if(speed > 0) {
			speed -= 10;
		}else
			speed = 0;
	}
	//this는 꼭 붙여야 한다. >> 가독성을 높이기 위해 this를 쓴다

}
