package kr.or.bit;

public class NoteBook {
	public String color;
	// public int year;
	private int year; // ĸ��ȭ, ����ȭ�� ���̴�.
	// ���� �Ҵ�
	// ĸ��ȭ�� ������ �ǹ� : ���� �Ҵ��� �����ְ�,
	// �����Ҵ��� ���� �ܺηκ��� �ڷḦ ��ȣ(�����ڰ� ���ϴ� ���� ó���ϰٴ�)

	//��Ʈ���� ���콺�� ������ �ִ�.
	//���콺�� �������� �Ӽ��� ������� �����ȴ�
	//==������ Ŭ����(���赵)�� ������ �Ѵ�!
	//��ü�� ���콺�� �ƴ� ��
	//public Mouse mouse;
	
	public Mouse handle(Mouse m) { //Mouse Ÿ���� [�ּ�]���� �Ķ���ͷ� �� �� �ִ�.>>new
		m.x = 100;
		m.y = 200;
		return m; //���ϰ��� Mouse Ÿ���̴� Mouse Ÿ������ ������ �ȴ�!
	}
	
	
	// ���࿡
	// public int year >>
	// ������ �Է��� ���� NoteBook notebook = new NoteBook(); >>
	// notebook.year = -2000;

	//��ü������ 3�� Ư¡ �� �ϳ��� ĸ��ȭ(����ȭ)
	//���� ���ϴ� �����ʹ� �������� ���� �����ϰڴٴ� ����!
	
	//ĸ��ȭ�� ����ʵ忡 ���Ͽ� write(set), read(get)
	//>> setter�Լ��� getter�Լ���� �θ���
	
	
	public void setYear(int y) { // ���� �Ҵ�
		if (y < 0) {
			year = 1999;
		} else {
			year = y;
		}
	}

	public int getYear() { // private �ʵ带 ���������� �� �� �ִ� ��
		return year;
	}
}
