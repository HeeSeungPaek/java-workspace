package daeunLecture;

class Lamborghini { // ���̺귯�� Ŭ����
	// Encapsulation
	private int speed;
	private String engine;
	private String color;

	public Lamborghini() { // ���̺귯�� Ŭ������ ������ Car ����
		this.speed = 0;
		this.engine = "somthing";
		this.color = "blue";

	}

	// speedUp, Down �޼ҵ�
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

	// setter getter �޼ҵ�
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
