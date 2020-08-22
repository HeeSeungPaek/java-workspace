package day05;
//ȭ�鿡 ��µǴ� �޽����� �޼ҵ� ���� ������.
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
	
	//1. �޴��� �����ִ� �޼ҵ�
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
				//�����޼ҵ� ȣ��
				insertPark();
			}else if(choice == 2) {
				//���� �޼ҵ� ȣ��
				deletePark();
			}else if(choice == 3) {
				System.out.println("�����մϴ�.");
				scanner.close();
				break;
			}
		}
	}

	//������ ����ϴ� �޼ҵ�
	private void insertPark() {
		if(controller.size() < SIZE) {
			//������ ������ ����� 5 �����̹Ƿ� ���� ����
			//1. ������ȣ�� ���� ���� �´���
			//2. �Էµ� �ð��� ��ȿ�� �ð��� �´���
			//3. ���� 2���� ����ؾ� list�� �߰�
			//���� ������ ��´�
			
			//������ ������ �ӽú����� ParkVO ��ü ����
			ParkVO p = new ParkVO();
			//1. ������ȣ�� ��ȿ���� üũ
			scanner.nextLine();
			System.out.println("���� ��ȣ�� �Է����ּ���: ");
			p.setPlateNumber(scanner.nextLine());
			
			//while������ �̿��Ͽ� ���� controller.contains(p)�� true�̸� �̹� ���� ��ȣ�� �����Ѵٴ� �ǹ��̹Ƿ� �ٽ� �Է��� �޴´�.
			while(controller.contains(p)) {
				//�̹� �����ϴ� �����̶�� ��� ��� �� ���� ��ȣ ���Է½�Ű��
				System.out.println("�̹� �����ϴ� �����Դϴ�!");
				System.out.println("���� ��ȣ�� �Է����ּ���: ");
				p.setPlateNumber(scanner.nextLine());
			}
			 
			//�ð��� �Է� �޴´�.
			System.out.println("���� �ð��� �Է����ּ��� : ");
			p.setInTime(scanner.nextInt());

			//while ������ ���� ���� �ð��� ��ȿ���� �ʴٸ� ��ȿ�� �ð��� �Էµ� ������ �Է��� �ݺ�
			while(!controller.validateTime(p.getInTime())) {
				System.out.println("��ȿ���� �ʴ� �ð� ����!");
				System.out.println("���� �ð��� �Է����ּ��� : ");
				p.setInTime(scanner.nextInt());
			}
			//��ȿ�� �ð�, ��ȿ�� ���� ��ȣ�� p�� ��������Ƿ� p�� controller.add(p)���ָ� controller ���� ArrayList�� �߰��ȴ�.
			controller.add(p);
			
		}else {
			//�����̹Ƿ� ���޼����� ���
			System.out.println("�̹� �����Դϴ�.");
		}
	}
	
	private void deletePark() {
		//1.������ ������ �����ϴ��� Ȯ��
		//2.������ �����ϸ� ���� ��ȣ �Է�
		//3.�Էµ� ���� ��ȣ�� ���� ParkVO ã��
		//4.�ð� �Է� �ޱ�
		//5.���� ��� ���
		//6.�ش� ���� ����

		//������ ������ �����ϴ��� Ȯ��
		//������ ������ �����ϴ����� controller.size()�� üũ�ϸ� �ȴ�.
		if(controller.size()==0) {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}else {
			//���� ��ȣ �Է� �ޱ�
			ParkVO p = new ParkVO();
			scanner.nextLine();
			System.out.println("���� ��ȣ�� �Է����ּ���.");
			p.setPlateNumber(scanner.nextLine());
			while(!controller.contains(p)) {
				//�ش� ������ȣ�� �������� �����Ƿ� �ٽ� �Է¹޴´�.
				System.out.println("�������� �ʴ� ���� ��ȣ�Դϴ�.");
				p.setPlateNumber(scanner.nextLine());
			}
			
			//�츮�� ����Ʈ�� �����ϴ� ���� ��ȣ�� �Է��ϱ�� ������,
			//������ p�� ���⼭ ���� ParkVO��ü�̱� ������
			//inTime�� �������� �ʰ� �ȴ�.
			//�׷��ٸ� inTime�� ��� �����ұ�?
			
			//controller �� private ArrayList<> list�� ����Ǿ��ִ�.
			//���� �츮�� �ش� list���� �� ������ȣ�� ���� ParkVO ��ü��
			//ã�ƴ޶��
			//controller���� ��Ź�ؾ��Ѵ�!!!!!!!!!!
			
			p = controller.get(p);
			
			//�����ð��� �Է� �޴´�.
			//�����ð��� ������
			//1. �ùٸ� �ð�����
			//2. ���� �ð����� ���� �ð��� ��
			System.out.println("���� �ð��� �Է����ּ���: ");
			int outTime = scanner.nextInt();
			while(!controller.validateTime(outTime)
					|| outTime < p.getInTime()) {
				System.out.println("�߸��� �ð��Դϴ�.");
				System.out.println("���� �ð��� �Է����ּ���: ");
				outTime = scanner.nextInt();
			}
			//�ùٸ� ������ȣ + �ùٸ� �����ð��� ������ ���� ������ �غ���
			//�ϴ� ���� �ð��� ���� �ð��� �̿��ؼ�
			//�� �����ð��� ������ ����غ���
			int hourDifference = outTime / 100 - p.getInTime() / 100;
			int minuteDifference = outTime % 100 - p.getInTime() % 100;
			int totalDifference = hourDifference * 60 + minuteDifference;
			int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;//������ ���ڰ� ���� �ʰ� ��������
			
			System.out.println("���� ����� " +rate+"���Դϴ�.");
			
			//���� �ش� ������ list���� �������ش�.
			controller.remove(p);
		}		
	}
}
