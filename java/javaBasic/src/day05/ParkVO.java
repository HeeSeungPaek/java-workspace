package day05;
//MVC ����: 
// MVC �����̶� ���α׷��� ���� �� MODEL, VIEW, CONTROLLER 3������ ���α׷��� �ɰ��� 
// �����ϴ� ����̴�. ���� ��ü�� ������� �� �־, ���������� ��������. 
// �� : ���α׷����� ���� �����͸� Ŭ������ �ٲ���� ���� 
// �� : ����ڰ� ���� �� ȭ�� 
// ��Ʈ�ѷ� : ������� ��û�� ���� �����͸� �����ؼ� �����ִ� Ŭ���� 
//"������ ����" : ���α׷��ֿ��� �ϵ��ڵ��� �� �� ���� ����. ��� Ƣ��Դ��� 
// �𸣴� ���ڰ� �ڵ忡 �������� �� ������ ���ڶ���Ѵ�. 
// ������ ���ڴ� ����� �����ϰ� ����ؼ� ������ �� �ִ�.
public class ParkVO {
	//Value Object�� ���Ӹ��ν�
	//�ַ� �� Ŭ������ �ٿ����� ���̻��̴�.
	//VO���� �ʵ�� Object Ŭ�����κ��� ���� �޼ҵ����
	//�������̵� �ϴ� �޼ҵ��� ���� ���� ������ ���� �ȴ�.
	//�ʵ�
	//�����԰�ð�
	private int inTime;
	//������ȣ
	private String plateNumber;

	//�޼ҵ�
	//getter / setter
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	
	public int getInTime() {
		return inTime;
	}
	
	
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ParkVO) {
			ParkVO p = (ParkVO)obj;
			if(plateNumber.equals(p.plateNumber)) {
				return true;
			}
		}
		
		return false;
	}
}
