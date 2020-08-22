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
			System.out.println("|비트 주차 관리 프로그램|");
			System.out.println("================");
			System.out.println();
			System.out.println("1.입차 2.출차 3.종료");
			System.out.println("> ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				insertPark();
			}else if(choice == 2) {
				deletePark();
			}else if(choice == 3) {
				System.out.println("감사합니다.");
				scanner.close();
				break;
			}
		}
	}

	private void insertPark() {
		if(controller.size() < SIZE) {
			ParkVO p = new ParkVO();

			scanner.nextLine();
			System.out.println("차량 번호를 입력해주세요: ");
			p.setPlateNumber(scanner.nextLine());
			
			while(controller.contains(p)) {
				System.out.println("이미 존재하는 차번입니다!");
				System.out.println("차량 번호를 입력해주세요: ");
				p.setPlateNumber(scanner.nextLine());
			}
			 
			System.out.println("입차 시간을 입력해주세요 : ");
			p.setInTime(scanner.nextInt());

			while(!controller.validateTime(p.getInTime())) {
				System.out.println("유효하지 않는 시간 형식!");
				System.out.println("입차 시간을 입력해주세요 : ");
				p.setInTime(scanner.nextInt());
			}
			controller.add(p);
			
		}else {
			System.out.println("이미 만차입니다.");
		}
	}
	
	private void deletePark() {
		if(controller.size()==0) {
			System.out.println("주차된 차량이 존재하지 않습니다.");
		}else {

			ParkVO p = new ParkVO();
			scanner.nextLine();
			System.out.println("차량 번호를 입력해주세요.");
			p.setPlateNumber(scanner.nextLine());
			while(!controller.contains(p)) {
				System.out.println("존재하지 않는 차량 번호입니다.");
				p.setPlateNumber(scanner.nextLine());
			}
			
			p = controller.get(p);
			System.out.println("출차 시간을 입력해주세요: ");
			int outTime = scanner.nextInt();
			while(!controller.validateTime(outTime)
					|| outTime < p.getInTime()) {
				System.out.println("잘못된 시간입니다.");
				System.out.println("출차 시간을 입력해주세요: ");
				outTime = scanner.nextInt();
			}
			int hourDifference = outTime / 100 - p.getInTime() / 100;
			int minuteDifference = outTime % 100 - p.getInTime() % 100;
			int totalDifference = hourDifference * 60 + minuteDifference;
			int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;//마술의 숫자가 되지 않게 조심하자
			
			System.out.println("주차 요금은 " +rate+"원입니다.");
			
			controller.remove(p);
		}		
	}
}
