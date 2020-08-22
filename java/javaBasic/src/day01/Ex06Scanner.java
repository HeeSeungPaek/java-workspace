package day01;

//자바에서 입력은 우리가 직접 기능을 만드는게 아니라
//Scanner 객체 생성 후 기능을 호출해 사용하게 된다.
//단, Scanner는 자바 기본 라이브러리에 있는 클래스이기 때문에
//우리가 "수입"해서 써야한다.
//어떤 클래스를 "수입"할 때에는
//import 클래스위치 형식을 사용한다.
import java.util.Scanner;
//import 단축키 : Ctrl + Shift + O

public class Ex06Scanner {
	public static void main(String[] args) {
		// 스캐너객체를 만들어보자
		Scanner scanner = new Scanner(System.in);

		// 정수를 입력받아보자
		System.out.println("정수입력 : ");
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 정수 : " + number);

		// 실수쓰를 입력받아봅세
		System.out.println("실수입력 : ");
		double userDouble = scanner.nextDouble();
		System.out.println("사용자가 입력한 실수 : " + userDouble);
		
		//String을 입력받아보자구
		scanner.nextLine();
		
		System.out.println("스트링입력 : ");
		String userString = scanner.nextLine();
		System.out.println("사용자가 입력한 스트링 : " + userString);
		//스트링 실행 결과 입력이 종료가 되면서 빠져나온다. 왜냐.
		//스트링을 입력 받을 때에는 한 가지 주의할 점이 있다.
		//위에서 nextInt(), nextDouble()등의 숫자로 입력받고 난 후라면
		//반드시 scanner.nextLine()을 한번 적어주어야 한다는 점이다.
		//이렇게 적어주는 이유는 scanner의 뻐그 때문이다.
		//그래서 스트링 입력받기 전 줄에 nextLine을 적어준 모습.
		//주의점 : nextLine 치다가 자동완성기능 때문에 hasNextLine으로 바뀔수도 있다.
		//종종 경우가 있으니 자동완성기능 사용시 주의할 필요성이 있다.
		
		
		// scanner와 같이 메모리를 참조하는 객체들은 가장 마지막줄에
		// close() 메소드를 호출해주는 게 좋은 방법이다.
		scanner.close();
	}
}
