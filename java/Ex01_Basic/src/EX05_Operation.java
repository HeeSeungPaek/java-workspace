
public class EX05_Operation {

	public static void main(String[] args) {
		int result = 100 / 100;
		System.out.println(result);

		result = 13 / 2; // 몫만 나온다.
		System.out.println(result);

		// 나머지를 구하는 연산자 ( % )
		result = 13 % 2;
		System.out.println(result);

		// 증감 연산자 ( ++, -- ) 1씩 증,감
		int i = 10;
		++i; // 전치, 전위 증가
		System.out.println("전치" + i);
		i++; // 후치, 후위 증가
		System.out.println("후치" + i);

		// POINT (연산자가 결합되면 전치와 후치가 살아난다)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result2 : " + result2 + ", j2 : " + j2);

		result2 = i2 + j2++;
		System.out.println("result2 : " + result2 + ", j2 : " + j2);

		// byte b = 100;
		// byte c = 1;

		// byte d = (byte)(b+c); //손실 - 자바의 정수연산은 int그릇에 넣고 실행하기 때문에 int에 넣고
		// 정수계산을 한 b+c는 보다 작은 그릇인 byte안에 들어갈 수 없다.

		// Today's point
		// 자바의 연산 규칙
		// 정수의 모든 연산은 [int]타입으로 변환 후 처리한다(그 아래 것들만)
		// byte + short => 컴파일러가 int + int 해버린다
		// char + char => 컴파일러가 int + int
		// 연산 처리 시 정수 연산에서 int보다 작은 타입은 전부 int로 변환 (long타입은 제외)
		// byte, char, short들은 연산 시 int로 변환해서 연산한다.

		// byte + short -> int + int
		// char + int -> int + int
		// int + long -> long + long!!

		// 정수 + 실수 > 타입의 크기와 상관없이 실수로 따라간다

		long ln = 10000000000L;
		float fl = 1.2f;
		// long lnresult = fl + ln;
		long lnresult = (long) (fl + ln);
		System.out.println("lnresult : " + lnresult);
		// 위 코드에는 소수 부분의 손실이 발생한다.
		// 손실이 없으려면 보다 큰 그릇으로 담는다.

		float num2 = 10.45f;
		int num3 = 20;
		// float + int > float + float
		float result5 = num2 + num3;
		System.out.println("result5: " + result5);

		// int result5 >> 30 ...

		char c2 = '!';
		char c3 = '"';
		int result6 = c2 + c3;
		System.out.println("result6: " + result6);
		System.out.println((char) result6);

		// 제어문
		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			// System.out.println("j : " + j);
			// sum += j;
			if (j % 2 == 0)
				sum += j;
		}
		System.out.println(sum);

		// ==연산자 (값을 비교하는 연산자)
		if (10 == 10.0f) { // 타입을 비교하지 않고 오로지 값으로만 비교한다.
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// ! 부정연산자
		if ('A' != 65) {
			System.out.println("안");
		} else {
			System.out.println("같");
		}
		// Today Point - 삼항 연산자
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		System.out.println(result8);

		int score = 65;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : (score > 60) ? 'D' : 'F';
		System.out.println("성적은? : " + grade);

		// 진리표 -> 논리연산/ 0=false, 1=true
		/*
		 * OR(논리합||) AND(논리곱&&) 0 0 0 0 0 1 1 0 1 0 1 0 1 1 1 1
		 * 
		 * Oracle(sql) select * from emp where empno = 1000 and sal > 2000 ((둘다 참일떄))
		 * 
		 * select * from emp where empno = 1000 and sal > 2000 ((둘 중 하나가 참일 떄))
		 * 
		 * 연산자(비트연산) | or연산자 & and연산자
		 * 
		 * || or논리연산자 && and논리연산자
		 */
		int x = 3; // 0011
		int y = 5; // 0101
		System.out.println("x|y : " + (x | y)); // 0111

		// 십진수 -> 2진수(0과 1로 표현)로 변환한다.
		// 128 64 32 16 8 4 2 1 (8bit)
		// 0 0 1 1 >십진수 3은 2진수 0011
		// 0 1 0 1 >십진수 5는 2진수 0101
		// OR 0 1 1 1 >2진수 0111은 10진수 7
		// ANd 0 0 0 1 >2진수 0001은 10진수 1
		System.out.println("x&y : " + (x & y));

		// Today Point ( && (and), ||(or))
		// shortCuit >> 앞조건에서 연산결과가 틀리면 뒤에 조건은 검사하지 않는다
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 ... 10개) {실행문}
		// if(10 > 0 || -1 > 1 && 100 > 2 && 1 > -1 ... 10개) {실행문}

		// switch case문의 break는 강제 사항이 아니다.
		// 필요에 따라 선택적으로 (상황에 따라) 사용하는것 = break;

		int data = 80;

		switch (data) {
		case 100:
			System.out.println("100입니다.");
			break;
		case 90:
			System.out.println("90입니다.");
			break;
		case 80:
			System.out.println("80입니다.");
			break;
		default:
			System.out.println("default");
		}

		System.out.println("=====");
		int data2 = 90;

		switch (data2) {
		case 100:
			System.out.println("100입니다.");
		case 90:
			System.out.println("90입니다.");
		case 80:
			System.out.println("80입니다.");
		default:
			System.out.println("default");
		}
		System.out.println("=====");

		// switch case문의 break의 사용 예시
		int month = 5;
		String res = ""; // 빈 문자열로 초기화
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31"; // 1,3,5,7,8,10,12월은 31일
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30"; // 4,6,9,11월은 30일
			break;
		case 2:
			res = "29"; // 2월은 29일
			break;
		default:
			res = "월 데이터가 아닙니다";
		}
		System.out.println(month + " 월의 일수는 " + res);
		// 표준화시키는 것 -> 인터페이스라고 한다

		// 난수 (랜덤값 : 임의의 추출값)
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// 폴더 (package)
		// java.lang.Math (Math 클래스)
		// java 페이지는 default로 열려있는 폴더가 있다 (java.lang)
		// 생략> import java.lang.*or특정자원이름;
		// Math 클래스가 가지고 있는 자원 (static) : 객체생성 없이도 사용이 가능한 자원!
		// Math.random()
		// a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		// 결과 : double 타입의 실수 return, 값의 범위 : 0.0 <= random < 1.0

		System.out.println("Math.random() :: " + Math.random());
		System.out.println("Math.random() * 10 :: " + ((Math.random() * 10)));
		System.out.println("(int)Math.random() * 10 :: " + ((int) (Math.random() * 10)));
		System.out.println("(int)Math.random() * 10 + 1 :: " + ((int) (Math.random() * 10) + 1));
		System.out.println("\n\n\n\n\n\n\n\n================================");
		   /*
        	문제를 풀어 보세요
        	--3분 또는 2분이 같이 풀어보세요
        	--문제를 푸시면 지금까지 배운 것 이해 하고 있으신 거죠
        	우리는 백화점 경품 시스템을 만들려고 한다
        	경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
        	경품 추첨시 1000 점수가 나오면
        	경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
        	경품 추첨시 900 점수가 나오면
        	경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
        	경품 추첨시 800 점수가 나오면
        	경품으로  냉장고 , 한우세트 , 휴지
        	경품 추첨시 700 점수가 나오면
        	경품으로  한우세트 , 휴지
        	경품 추첨시 600 점수가 나오면
        	경품으로  휴지
        	그외 점수는 100 ~ 500 까지는 칫솔 
        	경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
        	사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
        
        */

		// 랜덤 실수를 10배하여 1의자리로 만들고, 곱하기 100하여 int형으로 캐스팅하면 100의 자리가
		// 나온다
		// 0점이 안나오게 하기 위해 모두 괄호 치고 100을 더해준만약, 괄호를 넣지않고 곱하면 뒤의 자리가 00이 안된다.
		
		
		
		int point = ((int) (Math.random() * 10) * 100) + 100;
		String present = "";
		switch (point) {
		case 1000:present += "TV ";
		case 900:present += "NoteBook ";
		case 800:present += "냉장고 ";
		case 700:present += "한우세트 ";
		case 600:present += "휴지 ";
			break;
		default:present += "칫솔";
			}
		System.out.println("사용자의 점수 : " + point + "\n당첨된 경품 : " + present);

		
		String m = "k";
		String r = "";
		switch (m) { //조건식에 문자열 또는 한 문자 가능
		case "A":
		case "B":
		case "C":
		case "D":
		case "E":
		case "F":
		case "G":
			r = "ok";
			break;
		case "H":
		case "K":
			r = "no";
			break;
		default:
			System.out.println("데이터가 아닙니다.");
		}
		System.out.println(r);
		
		
	}

}






