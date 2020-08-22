package assignment2;

public class Bicycle {
	private int handle;
	private int body;
	private int wheel;
	private String color;

	
	public Bicycle() {
		this("black");
	}

	public Bicycle(String color) { // ������ �����ϰ� ���� �� ���� ����Ǵ� �����ε��� �������Լ�
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
