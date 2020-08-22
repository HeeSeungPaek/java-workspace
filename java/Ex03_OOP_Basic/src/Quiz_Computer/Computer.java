package Quiz_Computer;
import java.util.Scanner;
//나름대로 요구사항 분석
//요구사항 : 
//컴퓨터는
//속성 : 가격, 브랜드, 시리얼넘버, 색깔을 가지고 있어야 한다.
//상태 : 절전모드가 가능해야 한다.
//부품 : 본체, 키보드, 모니터를 사용할 수 있다.
//기능 : 입,출력 | 전원on,off | 절전모드 on,off | 사칙연산 가능
public class Computer {
	private int price; // --------------------------멤버필드
	private String brand;
	private String serialnumber;
	private String color;
	private boolean sleep; // 절전모드
	MainBody mainbody = new MainBody(); //
	Monitor monitor; //
	KeyBoard keyboard = new KeyBoard();
	public void showMenu() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("------------------------------------------");
			System.out.println("----------------컴퓨터 프로그램----------------");
			System.out.println("------------------------------------------");
			System.out.println("----1.입력  2.출력  3.전원모드  4.절전모드  5.사칙연산 6.프로그램 종료----");
			System.out.println(">>");
			int inputnumber = Integer.parseInt(scanner.nextLine());
			if (inputnumber == 1) { // 입력 > 키보드를 이용해 입력을 받는다 (스캐너 사용하여 변수에 저장,setKbutton()이용해 저장한다.
				inputString();
			} else if (inputnumber == 2) {
				outputString();
			} else if (inputnumber == 3) {
				System.out.println("현재 본체 전원 : " + checkBodyPower());
				/*
				 * Scanner scanner = new Scanner(System.in); if(mainbody.isPower()==false) {
				 * System.out.println("본체를 켜시겠습니까?\n 1.예\t 2.아니오"); int pnumber =
				 * Integer.parseInt(scanner.nextLine()); if(pnumber==1) {
				 * System.out.println("현재시각 새벽 1시 머리가 안돌아가요"); } } else {
				 * System.out.println("본체를 끄시겠습니까?\n 1.예\t 2.아니오"); int pnumber =
				 * Integer.parseInt(scanner.nextLine()); //미구현 }
				 */
			} else if (inputnumber == 4) {
				// 미구현
				break;
			} else if (inputnumber == 5) {
				calculator();
			} else if (inputnumber == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	public String inputString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n키보드를 이용해 값을 입력해주세요 >> ");
		keyboard.setKbutton(scanner.nextLine()); // kbutton 문자열값을 간접 할당
		System.out.println("입력 완료.");
		return keyboard.getKbutton();
	}
	public void outputString() {
		if (keyboard.getKbutton() == null) { // 최초입력밖에 못 걸름
			System.out.println("입력하신 값이 없습니다!");
		} else
			System.out.println("입력하신 값 : " + keyboard.getKbutton()); // 입력값을 입력하지 않아도 입력하신 값은 나옴.
	}
	public String checkBodyPower() { // 전원 체크
		String str = "";
		if (mainbody.isPower() == true) {
			str = "ON";
		} else
			str = "OFF";
		return str;
	}
	public void turnOnPower() { // 전원 켜기
		if (mainbody.isPower() == true) {
			System.out.println("이미 켜져 있습니다!");
		} else {
			System.out.println("전원을 킵니다.");
			mainbody.setPower(true);
		}
	}
	public void turnOffPower() { // 전원 끄기
		if (mainbody.isPower() != true) {
			System.out.println("이미 꺼져 있습니다!");
		} else {
			System.out.println("전원을 끕니다.");
			mainbody.setPower(false);
		}
	}
	public void calculator() {
		Scanner scanner = new Scanner(System.in);
		String result = "";
		System.out.print(">입력값:");
		int number1 = Integer.parseInt(scanner.nextLine());
		System.out.print("\n>입력값(기호): ");
		String operator = scanner.nextLine();
		System.out.print("\n>입력값: ");
		int number2 = Integer.parseInt(scanner.nextLine());
		if (operator.equals("+")) {
			result += number1 + number2;
		} else if (operator.equals("-")) {
			result += number1 - number2;
		} else if (operator.equals("*")) {
			result += number1 * number2;
		} else {
			result += number1 / number2;
		}
		System.out.print(">연산결과: " + result + "\n");
	}
	public int getPrice() { // --------------------------getter, setter
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isSleep() {
		return sleep;
	}
	public void setSleep(boolean computersleep) {
		this.sleep = computersleep;
	}
}