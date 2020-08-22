import kr.or.bit.Car;

/*
������ (������)
public ���� : [��Ű�� ���� ����] ��� �ִ����� ��� �ڿ��� �����ȴ�.
private ���� : Ŭ���� ���ο����� �ڿ��� ������ �� �ִ�. �������� ���忡���� ���� �Ұ�.

************��ü���� ����� Ư¡**************
1.ĸ��ȭ(����ȭ) -> private�� ����Ͽ� �����Ѵ�.
1.1) Ŭ���� ���ο� �ִ� �ڿ� (Member field, member method) �� ĸ��ȭ ����
	private int number;  ���� �Ҵ��� ���� ���� �Ҵ��� ���� �ڿ��� ��ȣ(����)�ϰڴ�.
						 >> ����(�Լ� :write(setter) ,read(getter))
	private void call(); �ٸ� �Լ��� ����(���� �Լ�) >> ���� �Ұ� ,but Ŭ���� ���ο��� �ٸ� �Լ��� ȣ���ؼ� ���
	
	setter�� getter�� �����
	1.setter�� ���� �� ������ ? (O) >> � ������ ������ ��������� : 
		ex) private int num; setNum(); //���������� ������ ���Ѵ� > ����(class)������ ���� ����  
	2.getter�� ���� �� ������ ? (O) >> getNum(); >> �б�(read)�� �ϰڴ�.
	3.getter�� setter�� ��� ���� (O) >> ���������� ĸ��ȭ�� �ڿ����� write,read �� �� �����ϰ� �ϰڴٴ� �ǵ�! // ������ ���
	
��ü���� ����� ���� : ��ȣ~ > private ��� > ĸ��ȭ
 */

public class Ex04_Modifier {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setSpeed(10); //setter getter�� ���� private ������ �ְڱ��� ���� ����
		car.setWindow(2);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getWindow());
		
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());
		
	}
	
}
