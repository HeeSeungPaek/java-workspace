import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {
	public static void main(String[] args) {
		Fclass fc = new Fclass();
		fc.m(); // ��� �Լ��� �������� ���� �ͼ� ����ȴ�. //�Լ� = ���ÿ��� ���� = LIFO
				// ���� ��� : �Լ��� �ѹ��� �Ѱ��ۿ� ������ �� ���� -> Sequancial �Լ�
		fc.m2(50);

		int result = fc.m3();
		System.out.println("result : " + result);

		result = fc.m4(-1);
		System.out.println("result : " + result);

		result = fc.sum(10, 20, 30);
		System.out.println("result : " + result);

		// fc.subSum(); �̰� �Ⱥ����� private�ϱ� ���� ��Ű�� �ȿ����� ����, Ŭ���� �ȿ����� ���� �־� -> ���ڽ�
		fc.callSubSum(); // private �Լ��� public int callSubSum()�Լ��� �ҷ����� ����� �� �� �ִ�.

		result = fc.opSum(20);
		System.out.println("result : " + result);

		result = fc.max(7, 6);
		System.out.println("result === " + result);

		result = fc.max100(-99, -100);
		System.out.println("100��¥�� �Լ� : " + result);
		
		Tv t2 = fc.tCall(); // �޼ҵ带 �̿��� �ּҰ��� Ÿ�� [����] �� �޴� �� �� �� �ִ�.
	}
}
