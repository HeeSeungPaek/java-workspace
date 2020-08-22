package day05;
//��Ʈ�ѷ� Ŭ������ ����ϴ� �ڵ尡 ����.
//�ܼ��� �����͸� �����ϱ⸸ �Ѵ�.
//������ζ�� �����ͺ��̽� ��ŵ� ����ؾ�������
//DB�� �����Ƿ� �׳� ArrayList�� �ʵ�� ���´�.
import java.util.ArrayList;

public class ParkController {
	
	private ArrayList<ParkVO> list;
	
	public ParkController() {
		list = new ArrayList<>();
	}

	//list�� ���� ũ�⸦ �����ϴ� �޼ҵ�
	public int size() {
		return list.size();
	}
	
	//�Ķ���ͷ� �Ѿ�� ParkVO ��ü�� ����Ʈ�� �����ϴ��� üũ�ϴ� �޼ҵ�
	public boolean contains(ParkVO p) {
		return list.contains(p);
	}
	
	//�Ķ���ͷ� �Ѿ�� ParkVO ��ü�� ����Ʈ�� �߰��ϴ� �޼ҵ�
	public void add(ParkVO p) {
		list.add(p);
	}
	
	//�Ķ���ͷ� �Ѿ�� int ���� ��ȿ�� �ð����� üũ�ϴ� �޼ҵ�
	public boolean validateTime(int time) {
		int hour = time / 100;
		int minute = time % 100;
		
		return (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59);
	}
	
	public ParkVO get(ParkVO p) {
		//���� p�� ���� plateNumber�� ���� list�� ����� �ε����� ã�´�.
		//���? indexOf �޼ҵ��!
		int index = list.indexOf(p);
		return list.get(index);
	}
	
	public void remove(ParkVO p) {
		list.remove(p);
	}
}
