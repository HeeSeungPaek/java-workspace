package daeunLecture;

class Lamborghini { // 라이브러리 클래스
	// Encapsulation
	private int speed;
	private String engine;
	private String color;

	public Lamborghini() { // 라이브러리 클래스의 생성자 Car 생성
		this.speed = 0;
		this.engine = "somthing";
		this.color = "blue";

	}

	// speedUp, Down 메소드
	public void speedUp() {
		this.speed = speed + 5;
	}

	public int speedUp(int a) {
		this.speed = speed + a;
		return this.speed;
	}

	// Up, Down Overroading
	public void speedDown() {
		this.speed = speed - 5;
	}

	public int speedDown(int a) {
		this.speed = speed - a;
		return this.speed;
	}

	// setter getter 메소드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
