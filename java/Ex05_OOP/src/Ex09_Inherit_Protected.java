import kr.or.bit.Bird;

// Bird�� ��ӹ޾Ƽ� ���� �غ���
// protected : ��Ӱ��迡�� �ʿ信 ���� [������]�� ������ ���ھ�	(90% ������ ���ϸ� �� ������)
// protected : ���� ���� ���忡���� ������ �� ����. ?? -> ��Ӱ��迡�� ������!
// ��� : ������

class Bi extends Bird {

	@Override
	protected void moveFast() {
		// TODO Auto-generated method stub
		super.moveFast();
	}

}

class Ostrich extends Bird {
	// ��üȭ Ư��ȭ
	void run() {
		System.out.println("run");
	}

	@Override
	protected void moveFast() {
		run();
	}

}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		b.moveFast();

		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();
	}

}
