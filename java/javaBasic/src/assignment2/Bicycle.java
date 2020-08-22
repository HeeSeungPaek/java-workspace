package assignment2;

public class Bicycle {
	private int handle;
	private int body;
	private int wheel;
	private String color;

	
	public Bicycle() {
		this("black");
	}

	public Bicycle(String color) { // 색깔을 변경하고 싶을 때 색깔만 변경되는 오버로딩된 생성자함수
		this.handle = 30;
		this.body = 200;
		this.wheel = 17;
		this.color = color;
	}

	public int getHandle() {
		return handle;
	}

	public int getBody() {
		return body;
	}

	public int getWheel() {
		return wheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
