import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		// 반복문 (while, do ~ while)

		int i = 10;

		while (i >= 10) {
			i--; // 반드시 while문은 증,가감 논리가 필요하다, 없을 경우 무한루프!
			System.out.println("i : " + i);
		}

		// while 1~100까지의 합
		int sum = 0;
		int j = 1;
		while (j <= 100) {
			// j++; // sum:5150
			sum += j;
			j++; // sum : 5050

		}
		System.out.printf("sum : [%d] , j : [%d]", sum, j);
		System.out.println();

		// while문으로 구구단 출력
		// 조건문을 잘 사용하는 것의 여부는 연습을 많이 했느냐, 안했느냐이다.
		// 눈으로 보는 코드는 절대 내 것이 안된다.
		// 돌아서서 복습하는 습관과
		// 눈으로 본 것은 내가 직접 해보는 습관(눈코딩이 아닌 손코딩) 이 두가지가 필수이다.
		// 코드를 짜려면 논리를 세우는 연습이 필요
		
		int a = 2;
		int b = 1;

		while (a <= 9) {
			while (b <= 9) {
				System.out.printf("[%d] X [%d] = [%d] ", a, b, a * b);
				b++;
			}
			a++;
			b = 1;
			System.out.println();
		}

		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");

		int a1 = 2;
		while (a1 <= 9) {
			int b1 = 1;
			while (b1 <= 9) {
				System.out.printf("[%d] X [%d] = [%d] ", a1, b1, a1 * b1);
				b1++;
			}
			a1++;
			b1 = 1;
			System.out.println();
		}
	
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");
		
		//while(true) {if(true) break;} 이거도 가능
		
		//do ~while 외우자 : 강제적 수행 ... while문은 조건이 거짓이면 한번도 안타지만, do~while은 무조건 한번 강제수행
		//주로 메뉴같은거 만들 때 많이 쓰인다.
		//do { 실행문 } while (조건식) : 조건이 true면 do를 계속 실행, 조건이 false면 빠져나옴.
		//메뉴 구성
		//1. 인사
		//2. 회계
		//당신이 원하는 업무를 선택하세요 >> do {선택하세요 _ 값을 받아서}
		//입력값 : 3 >> while(조건식) 에서 판단 -> 
		
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		
		do {
			System.out.println("숫자 (0~9)입력해 : ");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata >= 10); //조건이 true라면 do문을 계속 실행...
								 //조건이 false일 때 탈출!! 고로 만들때 주의하여 만들기
		System.out.println("당신이 입력한 숫자는 : " + inputdata);
		
		
	}

}