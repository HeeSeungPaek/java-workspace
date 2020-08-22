package assignment;

import java.util.Scanner;
/*
시나리오
 -자전거 대여하는 업무 프로그램 작성
 -자전거는 10대가 필요하다 자전거의 성인용의 바퀴는 17인치이고 바디는 200cm이고 두발 자전거, 
  핸들의 크기는 30cm로 고정이다.
 -대여 시 기본 자전거의 색상은 black이며, 대여 시 색상 변경을 희망하면, 색상을 바꿔 대여할 수 있다.
 -자전거 대여 기능
 >이름과 생년월일을 작성하면 대여가 가능하다.
 >이름과 생년월일을 작성하면 반납이 가능하다.
 >대여 시간과 반납 시간을 기록하되 정액권으로 1시간권 /3시간권 /6시간권/ 종일권 선택이 가능하다.
 >결제 금액은 1시간권이 1000원, 3시간권은 3000원, 6시간권은 6000원, 종일권은 20000원이다.
 >자전거를 빌려가면, 현재 대여가능한 자전거가 몇 대 있는지 알 수 있고, 만약 대여가능한 자전거가 0대라면
  빌릴 수 있는 자전거가 없다고 고지한다. 
 */

class Bicycle { // =================================================Bicycle 클래스
	// 고유정보
	private static int handle = 30;
	private static int body = 200;
	private static int wheel = 17;

	// 상태 정보
	private String color;

	Scanner sc = new Scanner(System.in);
	
	// 기본 생성자에 this 메소드를 추가해, 기본 생성자를 입력하면 "기본 자전거 색상은 black"
	public Bicycle() {
		this("black");
	}

	public Bicycle(String color) {	//색깔을 변경하고 싶을 때 색깔만 변경되는 오버로딩된 생성자함수
		color = sc.nextLine();
		this.color = color;
	}

	public int getHandle() {
		return handle;
	}

	public int getBody() {
		return body;
	}

	public int getWheel() {
		return wheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

class Rent { // ==================================================== Rent 클래스
	// 고유정보
	private String userName;
	private int userBirth;
	private int choice; // 선택지

	private int price;
	// private int totalprice; 총 가격이나 매출 쓰게되면 활성화, 아니면 삭제하기

	private static int count = 3; // 렌트 클래스에서 개수를 관리한다

	// count는 set할 수 없다(write)
	/*
	 * public static void setCount(int count) { Bicycle.count = count; }
	 */

	// 자전거를 빌렸을 때 수행되어야 하는 메소드(자전거 수 -1)

	public static void minusCount() {
		count -= 1;
	}

	// 부품정보
	Bicycle bicycle;

	// 기능
	// 메인메뉴 출력

	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("==========따릉이=========");
		System.out.println("이름과 생년월일을 작성해 주세요");
		System.out.print("이름: ");
		this.userName = sc.nextLine();
		System.out.print("생년월일(6자리 입력) : ");
		this.userBirth = Integer.parseInt(sc.nextLine());
		// System.out.println("현재 자전거가 "+b.count+"대 남았습니다.");
		do {
			try {
				if (getCount() > 0 && getCount() <= 3) {	//자전거 개수가 3개 이하인 경우
					break;
				} else {
					// 0보다 작거나, 10보다 큰값 => 프로그램 오류
					throw new Exception("현재 대여할 수 있는 자전거가 없습니다.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("죄송합니다. 다음에 방문해 주세요");
			}
		} while (true);
		// 실행
		// 대여 메소드
		rental(bicycle);
	}

	// 대여 메소드
	public void rental(Bicycle b) {
		b = new Bicycle();
	}

	// 가격표 정보 메소드
	public void choicePrice(int choice) { // 메소드이름 초이스프라이스 - 필드 초이스 변경하면 좋을듯
		System.out.print("1:1시간권 2:3시간권 3.6시간권  4.종일권:  ");
		choice = Integer.parseInt(sc.nextLine());
		while (true) {
			if (choice == 1) {
				System.out.println("1시간권은 1000원입니다.");
				price = 1000;
				// System.out.println("시간초과시 1시간당 1000원이 추가결제됩니다.");
				break;
			} else if (choice == 2) {
				System.out.println("3시간권은 3000원입니다.");
				price = 3000;
				// System.out.println("시간초과시 1시간당 1000원이 추가결제됩니다.");
				break;
			} else if (choice == 3) {
				System.out.println("6시간권은 6000원입니다.");
				price += 6000;
				// System.out.println("시간초과시 1시간당 1000원이 추가결제됩니다.");
				break;
			} else if (choice == 4) {
				System.out.println("종일권은 20000원입니다.");
				price += 20000;
				// System.out.println("시간초과시 1시간당 1000원이 추가결제됩니다.");
				break;
			} else {
				System.out.println("다시입력해주세요");
				// System.out.print("1:1시간권 2:3시간권 3.6시간권 4.종일권 ");
				choice = Integer.parseInt(sc.nextLine());
			}
		}
	}

	public static int getCount() {
		return count;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(int userBirth) {
		this.userBirth = userBirth;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

// 메인
public class Bicycle_Show_main {
	public static void main(String[] args) {
		
		Rent rent = new Rent();
		//첫 번째 손님은 기본자전거를 대여하고 싶어한다. 
		Bicycle b1 = new Bicycle();
		
		
		
	}
}
