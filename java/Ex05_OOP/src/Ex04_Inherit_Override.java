/*
Today Point
[��Ӱ���]���� Override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� [ ������ ]
[��Ӱ���]���� [�ڽ� Ŭ����]�� [�θ� Ŭ����]�� �޼��带 ������ (������ �ٲ۴�)
�������� �ǹ� : Ʋ�� ��ȭ(�Լ��� �̸�, Ÿ��)�� ����, {���븸 ��ȭ}��Ű�� ��

����)
1.�θ��Լ��� �̸� ����
2.�θ��Լ��� parameter�� ����
3.�θ��Լ��� return type ������ ����
4.�ᱹ {����� ���� �ڵ�}�� ������ �����ϴ�.

Override�� �� ����?

*/
class Point2 {	//�� ���� ������ Ŭ����
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
	}
}

class Point3D extends Point2 {
	int z = 6;
	
	//������ : �θ� ������ �ִ� �Լ��� �ڽ��� ��Ӱ��� �ӿ��� Ȯ���ϴ� ��.
	//������ : ������ �Ȱ���... �����Ǹ� ����� �߳�?
	//@Override >> �����Ϸ� �Ǵ� ���� ���� �����ǵ� �Լ����� �ƴ��� ������ ��Ź�ϴ� �ڵ��� ��
	//Annotation > java code������ ������ �� ���� [�ΰ����� ����]�� �����Ϸ��� ���� ������ �����ϴ� ��.
	//���� ������ Error
	//@Override >> ���� �� �Լ��� ���� �����ǰ� �� �� �´��� Ȯ���غ�!
	@Override
	String getPosition() {
		return this.x + "/" + this.y + "/" + this.z;
	}
	
}

public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		String result = p.getPosition();	//������ �� �Լ��� ȣ��Ǵ���...
		System.out.println(result);
	}

}



















