package day05_1;
import java.util.Scanner;

public class ParkViewer {
	private Scanner scanner;
	private ParkController controller;
	private final int SIZE = 5;
	private final int UNIT_PRICE = 1000;
	private final int UNIT_MINUTE = 10;
	
	public ParkViewer() {
		scanner = new Scanner(System.in);
		controller = new ParkController();
	}
	
	public void showMenu() {
		while(true) {
			System.out.println("================");
			System.out.println("|��Ʈ ���� ���� ���α׷�|");
			System.out.println("================");
			System.out.println();
			System.out.println("1.���� 2.���� 3.����");
			System.out.println("> ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				insertPark();
			}else if(choice == 2) {
				deletePark();
			}else if(choice == 3) {
				System.out.println("�����մϴ�.");
				scanner.close();
				break;
			}
		}
	}

	private void insertPark() {
		if(controller.size() < SIZE) {
			ParkVO p = new ParkVO();

			scanner.nextLine();
			System.out.println("���� ��ȣ�� �Է����ּ���: ");
			p.setPlateNumber(scanner.nextLine());
			
			while(controller.contains(p)) {
				System.out.println("�̹� �����ϴ� �����Դϴ�!");
				System.out.println("���� ��ȣ�� �Է����ּ���: ");
				p.setPlateNumber(scanner.nextLine());
			}
			 
			System.out.println("���� �ð��� �Է����ּ��� : ");
			p.setInTime(scanner.nextInt());

			while(!controller.validateTime(p.getInTime())) {
				System.out.println("��ȿ���� �ʴ� �ð� ����!");
				System.out.println("���� �ð��� �Է����ּ��� : ");
				p.setInTime(scanner.nextInt());
			}
			controller.add(p);
			
		}else {
			System.out.println("�̹� �����Դϴ�.");
		}
	}
	
	private void deletePark() {
		if(controller.size()==0) {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}else {

			ParkVO p = new ParkVO();
			scanner.nextLine();
			System.out.println("���� ��ȣ�� �Է����ּ���.");
			p.setPlateNumber(scanner.nextLine());
			while(!controller.contains(p)) {
				System.out.println("�������� �ʴ� ���� ��ȣ�Դϴ�.");
				p.setPlateNumber(scanner.nextLine());
			}
			
			p = controller.get(p);
			System.out.println("���� �ð��� �Է����ּ���: ");
			int outTime = scanner.nextInt();
			while(!controller.validateTime(outTime)
					|| outTime < p.getInTime()) {
				System.out.println("�߸��� �ð��Դϴ�.");
				System.out.println("���� �ð��� �Է����ּ���: ");
				outTime = scanner.nextInt();
			}
			int hourDifference = outTime / 100 - p.getInTime() / 100;
			int minuteDifference = outTime % 100 - p.getInTime() % 100;
			int totalDifference = hourDifference * 60 + minuteDifference;
			int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;//������ ���ڰ� ���� �ʰ� ��������
			
			System.out.println("���� ����� " +rate+"���Դϴ�.");
			
			controller.remove(p);
		}		
	}
}
