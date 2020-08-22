import java.util.Random;
import java.util.Scanner;

//�ٲٴ� ���� -> 

public class Ex13_do_while_Static_Lunch_Menu {
	
	//static�� Ȱ���� ���ɸ޴� �����ϱ� ���α׷� �ۼ�
	
	
	// ��� ... �Ϲ� ... ���� (����, ���� , ��ǰ(����:Ŭ����))
	static Scanner sc = new Scanner(System.in); // ��ǰ(����:Ŭ����)
	static Random random = new Random();
	
	static int suggestRandom() {
		String str = "";
		int rannum = (int)(random.nextInt(3) + 1); //1~3
		if(rannum == 1) {
			str = "�߱���";
		}else if(rannum == 2) {
			str = "��������";
		}else {
			str = "�谡��";
		}
		System.out.println(str + "\n");
		return rannum;
	}
	
	static void subSuggest(int rannum) {	//subSuggest(suggestRandom());
		System.out.println("���⿣ �̷� �޴��� �ֽ��ϴ�.\n");
		String str = "";
		switch(rannum) {
		
		case 1:
			str = "¥���, «��, ������";
			break;
		case 2:
			str = "��Ƣ, �Ұ��, ���� �긮��";
			break;
		default:
			str = "�谡�״� ��¥ ���� �����";
		}
		System.out.println(str);
	}
	
	
	// ���

	static int displayMenu() {
		System.out.println("***************");
		System.out.println("***�������� ��õ��***");
		System.out.println("1. �Ĵ� ���� ��õ");
		System.out.println();
		System.out.println("2. ���� ���� ��õ");
		System.out.println();
		System.out.println("3. ����� �Ÿ� ��õ");
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
			switch (displayMenu()) {
			case 1:
				subSuggest(suggestRandom());
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				System.out.println("���α׷� ����");
				// return; //main ����
				System.exit(0); // ���α׷� ���� ���� (kill)
			}
		}
	}

}
