package subject;

import java.util.Scanner;

public class Rent {
	// 필드
	private String userName;
	private int userBirth;
	private int price;
	//private int totalprice;	총 가격이나 매출 쓰게되면 활성화, 아니면 삭제하기

	// 부품정보
	Bycicle bycicle;

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
				if (Bycicle.getCount() > 0 && Bycicle.getCount() <= 10) {
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
		rental();
	}

	// 대여 메소드
	public void rental() {
		Bycicle bycicle = new Bycicle();
	}
	
	//가격표 정보 메소드
	public void price(int price) {	//메소드이름 초이스프라이스 - 필드 초이스 변경하면 좋을듯
		System.out.print("1:1시간권 2:3시간권 3.6시간권  4.종일권:  ");
		price = Integer.parseInt(sc.nextLine());
		while (true) {
			if (price == 1) {
				System.out.println("1시간권은 1000원입니다.");
				//System.out.println("시간초과시 1시간당 1000원이 추가결제됩니다.");
				break;
			} else if (price == 2) {
				System.out.println("3시간권은 3000원입니다.");
				//System.out.println("시간초과시 1시간당 1000원이 추가결제됩니다.");
				break;
			}else if (price == 3) {
				System.out.println("6시간권은 6000원입니다.");
				//System.out.println("시간초과시 1시간당 1000원이 추가결제됩니다.");
				break;
			}else if (price == 4) {
				System.out.println("종일권은 20000원입니다.");
				//System.out.println("시간초과시 1시간당 1000원이 추가결제됩니다.");
				break;
			}else {
				System.out.println("다시입력해주세요");
				//System.out.print("1:1시간권 2:3시간권 3.6시간권  4.종일권 ");
				price = Integer.parseInt(sc.nextLine());
			}
		}
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}