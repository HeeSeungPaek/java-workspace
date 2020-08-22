package day05;
//화면에 출력되는 메시지를 메소드 별로 나눈다.
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
	
	//1. 메뉴를 보여주는 메소드
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
				//입차메소드 호출
				insertPark();
			}else if(choice == 2) {
				//출차 메소드 호출
				deletePark();
			}else if(choice == 3) {
				System.out.println("감사합니다.");
				scanner.close();
				break;
			}
		}
	}

	//입차를 출력하는 메소드
	private void insertPark() {
		if(controller.size() < SIZE) {
			//입차된 차량의 댓수가 5 이하이므로 입차 시작
			//1. 차량번호가 없는 차가 맞는지
			//2. 입력된 시간이 유효한 시간이 맞는지
			//3. 위의 2개를 통과해야 list에 추가
			//위의 절차를 밟는다
			
			//차량의 정보를 임시보관한 ParkVO 객체 생성
			ParkVO p = new ParkVO();
			//1. 차량번호가 유효한지 체크
			scanner.nextLine();
			System.out.println("차량 번호를 입력해주세요: ");
			p.setPlateNumber(scanner.nextLine());
			
			//while루프를 이용하여 만약 controller.contains(p)가 true이면 이미 차량 번호가 존재한다는 의미이므로 다시 입력을 받는다.
			while(controller.contains(p)) {
				//이미 존재하는 차량이라면 경고 출력 후 차량 번호 재입력시키기
				System.out.println("이미 존재하는 차번입니다!");
				System.out.println("차량 번호를 입력해주세요: ");
				p.setPlateNumber(scanner.nextLine());
			}
			 
			//시간을 입력 받는다.
			System.out.println("입차 시간을 입력해주세요 : ");
			p.setInTime(scanner.nextInt());

			//while 루프를 통해 만약 시간이 유효하지 않다면 유효한 시간이 입력될 때까지 입력을 반복
			while(!controller.validateTime(p.getInTime())) {
				System.out.println("유효하지 않는 시간 형식!");
				System.out.println("입차 시간을 입력해주세요 : ");
				p.setInTime(scanner.nextInt());
			}
			//유효한 시간, 유효한 차량 번호가 p에 담겨졌으므로 p를 controller.add(p)해주면 controller 안의 ArrayList에 추가된다.
			controller.add(p);
			
		}else {
			//만차이므로 경고메세지만 출력
			System.out.println("이미 만차입니다.");
		}
	}
	
	private void deletePark() {
		//1.주차된 차량이 존재하는지 확인
		//2.차량이 존재하면 차량 번호 입력
		//3.입력된 차량 번호를 토대로 ParkVO 찾기
		//4.시간 입력 받기
		//5.출차 요금 계산
		//6.해당 차량 삭제

		//주차된 차량이 존재하는지 확인
		//주차된 차량이 존재하는지는 controller.size()를 체크하면 된다.
		if(controller.size()==0) {
			System.out.println("주차된 차량이 존재하지 않습니다.");
		}else {
			//차량 번호 입력 받기
			ParkVO p = new ParkVO();
			scanner.nextLine();
			System.out.println("차량 번호를 입력해주세요.");
			p.setPlateNumber(scanner.nextLine());
			while(!controller.contains(p)) {
				//해당 차량번호가 존재하지 않으므로 다시 입력받는다.
				System.out.println("존재하지 않는 차량 번호입니다.");
				p.setPlateNumber(scanner.nextLine());
			}
			
			//우리가 리스트에 존재하는 차량 번호를 입력하기는 했지만,
			//실제로 p는 여기서 만든 ParkVO객체이기 때문에
			//inTime은 존재하지 않게 된다.
			//그렇다면 inTime은 어디에 존재할까?
			
			//controller 속 private ArrayList<> list에 저장되어있다.
			//따라서 우리는 해당 list한테 이 차량번호를 가진 ParkVO 객체를
			//찾아달라고
			//controller에게 부탁해야한다!!!!!!!!!!
			
			p = controller.get(p);
			
			//출차시간을 입력 받는다.
			//출차시간의 조건은
			//1. 올바른 시간형태
			//2. 입차 시간보다 늦은 시간일 것
			System.out.println("출차 시간을 입력해주세요: ");
			int outTime = scanner.nextInt();
			while(!controller.validateTime(outTime)
					|| outTime < p.getInTime()) {
				System.out.println("잘못된 시간입니다.");
				System.out.println("출차 시간을 입력해주세요: ");
				outTime = scanner.nextInt();
			}
			//올바른 차량번호 + 올바른 출차시간이 있으니 이제 출차를 해보자
			//일단 나간 시간과 들어온 시간을 이용해서
			//총 주차시간을 분으로 계산해보자
			int hourDifference = outTime / 100 - p.getInTime() / 100;
			int minuteDifference = outTime % 100 - p.getInTime() % 100;
			int totalDifference = hourDifference * 60 + minuteDifference;
			int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;//마술의 숫자가 되지 않게 조심하자
			
			System.out.println("주차 요금은 " +rate+"원입니다.");
			
			//이제 해당 차량을 list에서 제거해준다.
			controller.remove(p);
		}		
	}
}
