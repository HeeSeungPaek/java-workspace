import java.util.Scanner;

//�ٲٴ� ���� -> 

public class Ex12_do_while_Static_Menu {
	
	//static�� Ȱ���� ���ɸ޴� �����ϱ� ���α׷� �ۼ�
	
	// ��� ... �Ϲ� ... ���� (����, ���� , ��ǰ(����:Ŭ����))
	static Scanner sc = new Scanner(System.in); // ��ǰ(����:Ŭ����)

	// ���
	static void inputRecord() {
		System.out.println("���������� �Է� :");
	}

	static void deleteRecord() {
		System.out.println("���������� ���� :");
	}

	static void sortRecord() {
		System.out.println("���������� ���� :");
	}

	static int displayMenu() {
		System.out.println("***************");
		System.out.println("****���� ����****");
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2. �л����� �����ϱ�");
		System.out.println();
		System.out.println("3. �л����� �̸��� �����ϱ�");
		System.out.println();
		System.out.println("4. ���α׷� ����");
		System.out.println();

		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());				//try ������ �ϴ� �غ���
				if (menu >= 1 && menu <= 4) {						//if 1~4��� ���ѷ��� Ż��
					break; // while Ż�� (1<= menu <=4)				
				} else {											//else -> throw new Exception()
					// 1���� �۰ų� 4���� ū ���� .. ���α׷����� ���� (x)
					// ���� ���� ���ڴ� (���� ����� ����)
					// System.out.println("�߸� �Է� �ϼ̽��ϴ�");			
					throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");	//������ ����Ű�� �ڵ�
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("�޴� ���� ���� �߻�");
				System.out.println("�޴� 1~4������ �Է�");
			}
		} while (true); // ������ �Ͱ�Ż
		// ���� : ����ڰ� 1 ~ 4���� ��ȣ�߿��� �ϳ��� ����
		return menu;
	}

	public static void main(String[] args) {
		//Ex12_do_while_Static_Menu ex11 = new Ex12_do_while_Static_Menu();

		while (true) {
			switch (Ex12_do_while_Static_Menu.displayMenu()) {
			case 1:
				Ex12_do_while_Static_Menu.inputRecord();
				break;
			case 2:
				deleteRecord();
				break;
			case 3:
				sortRecord();
				break;
			case 4:
				System.out.println("���α׷� ����");
				// return; //main ����
				System.exit(0); // ���α׷� ���� ���� (kill)
			}
		}
	}

}
