package subject;

/*
�ó�����
- ������ �뿩�� ��ϴ� ȸ�縦 â���Ϸ� �Ѵ�
-�׷��� �����Ű� �ʿ��ϴ�
-�����Ŵ� n�밡 �ʿ��ϴ� �������� ���ο��� ������ 17��ġ�̰� �ٵ�� 200cm�̰� �ι� ������, �ڵ��� ũ��� 30cm �̴�.
	
	���ο��������� ������ 3�����̴� (������,���,������) �̿��ڴ� ������ �� �� �ִ�.
	�� ������ ������ 10����  �̸� â����,�̿�� ���� ���� ��� ��� �ƴ��� �� ���ִ�.
-������ �뿩 ���
�̸��� ��������� �ۼ��ϸ� �뿩�� �����ϴ�.
�̸��� ��������� �ۼ��ϸ� �ݳ��� �����ϴ�.
�뿩�ð��� �ݳ��ð��� ����ϵ� ���ױ����� 1�ð��� 3�ð��� �õ��̸� ������ �� ������ �ʰ��п� ���� �ð��� 1000���� ����� �ΰ��ȴ�
*/

public class Bycicle {
	
	private static int handle = 30;
	private static int body = 200;
	private static int wheel = 17;
	private String color;
	private static int count;
	
	public static int getCount() {
		return count;
	}

	/*public static void setCount(int count) {
		Bycicle.count = count;
	}*/
	
	//�����Ÿ� ������ �� ����Ǿ�� �ϴ� �޼ҵ�(������ �� -1)
	public static void minusCount() {
		count -= 1;
	}

	public Bycicle() {
		this("black");
	}

	public Bycicle(String color) {
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
