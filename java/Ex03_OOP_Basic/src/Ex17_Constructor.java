import java.util.Scanner;

/*
자동차 영업소 입니다.
영업사원은 고객에게 자동차를 팔려고 합니다
고객은 자동차의 기본 사양을 살 수도 있고... 여러가지 선택 옵션을 선택할 수 있습니다.
자동차의 기본은
문의 개수 4개, 자동차 색상은 "red"이 기본입니다.

그런데 고객은
문의 개수만 변경 가능하고 휠의 개수는 4개 기본으로 할 수 있고
문의 개수는 기본으로 하고 휠의 개수는 변경 가능하고
문의 개수와 휠의 개수를 모두 변경 하여 차를 구매할 수 있습니다.

자동차 구매		//생성자가 4개
1.기본 사양		
2.옵션 : 문 변경, 휠 기본
3.옵션 : 문 기본, 휠 변경
4.옵션 : 문 변경, 휠 변경
*/

class Car5 {
	private int window; // 멤버 필드에서는 초기화를 관습적으로 많이 하지 않는다.
	private String color;

	public Car5() { // 기본
		this.window = 4;
		this.color = "red";
	}

	public Car5(int window) { // 문 변경, 색상 기본
		this.window = window;
		this.color = "red";
	}

	public Car5(String color) { // 문 기본, 색상 변경
		this.window = 4;
		this.color = color;
	}

	public Car5(int window, String color) { // 문, 색상 변경
		this.window = window;
		this.color = color;
	}

	public void showMenu() {
		System.out.println("★☆★☆★☆★☆자동차 영업소☆★☆★☆★☆★☆★");
		System.out.println("구매하실 차량을 입력해주세요");
		System.out.println("1.기본 2.문 개수 변경 3.색상 변경 4.모두 변경");
		System.out.println(">>");
	}

	public void carInfo() {
		System.out.println(this.window + "," + this.color);
	}

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

public class Ex17_Constructor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Car5 car = new Car5();

		car.showMenu();
		int inputnumber = Integer.parseInt(sc.nextLine());
		int choicewindow = 0;
		String choicecolor = "";

		if (inputnumber == 1) {
			Car5 car1 = new Car5();
			car1.carInfo();
		} else if (inputnumber == 2) {
			System.out.println("원하시는 문 개수 입력 >>");
			Car5 car2 = new Car5(choicewindow = Integer.parseInt(sc.nextLine()));
			car2.carInfo();
		} else if (inputnumber == 3) {
			System.out.println("원하시는 차 색상 입력");
			Car5 car3 = new Car5(choicecolor = sc.nextLine());
			car3.carInfo();
		} else if (inputnumber == 4) {
			System.out.println("원하시는 차량 문 개수, 차량 색상 입력");
			Car5 car4 = new Car5(choicewindow = Integer.parseInt(sc.nextLine()), choicecolor = sc.nextLine());
			car4.carInfo();
		} else
			System.out.println("올바르게 입력해주세요.");
		System.out.println("프로그램 종료");

		sc.close();

	}
}
