package kr.or.bit;

/*
�츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ�
�츮 ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ��Ϸ� �Ѵ�

�䱸����
1. ����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �Ѵ�. //����� Ŭ������ ����ʵ� �����
2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο��Ǿ��� �� Ȯ���ϴ� �۾��� �ʿ�(������� Ȯ��) //����ϴ� �޼ҵ�
3. �������� ������� ������� ������� �Ѵ��(����)�� Ȯ�� �� �� �ֽ��ϴ�. //

�ٸ� �䱸������ ������

AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
 */
public class AirPlane {
	private String name;
	private int number;
	private static int count;

	public AirPlane(String name, int number) {
		this.name = name;
		this.number = number;
		count++; //�����Ѵ�.
	}
	
	/*
	 * public void makeAirPlane(int number, String name) { this.number = number;
	 * this.name = name; count++; //�����Ѵ�. }
	 */

	public void AirPlaneInfo() {
		System.out.printf("����Ͻ� ������� �̸� : [%s], ��ȣ : [%d]\n",this.name, this.number);
	}
	
	public void printTotal() {
		System.out.printf("�� ����� ����� [%d] �Դϴ�\n", count);
	}
	
	
}
