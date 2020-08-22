package kr.or.bit;

public class Car {

	private int window;
	private int speed;
	

	// private Ÿ�� �ʵ�� ��Ȳ�� ���� ����/����, ����, ���͸� �� �� �ִ�(�ǵ��� ����)
	// ������ �� �����

	// ����Ű �����ϴ°ŵ� ���������� �˷��ֱ� window>preference>general>keys>binding

	// speed ���̳ʽ� -> 0����

	// getter�Լ�
	public int getWindow() {
		return window;
	}

	// setter�Լ�
	public void setWindow(int window) { // �ڵ������� �Ķ���� window
		this.window = window;
	}

	// getter�Լ�
	public int getSpeed() {
		return speed;
	}

	// setter�Լ�
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else
			this.speed = speed;
	}
	
	// �ӵ��� 10�� �ø��ų� ������ �޼ҵ� ������

	public void speedUp() {
		this.speed += 10;
	}

	public void speedDown() {
		if(speed > 0) {
			speed -= 10;
		}else
			speed = 0;
	}
	//this�� �� �ٿ��� �Ѵ�. >> �������� ���̱� ���� this�� ����

}
