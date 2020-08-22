import java.util.Scanner;

//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제

//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리
//입력값 : 123456-1234567 
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력

//3개의 함수 static 
public class Ex07_String_Total_Quiz {

	static boolean juminCheck(String str) {
		return str.length() == 14 ? true : false;
	}

	static boolean JunminFirstNumber(String str) {
		boolean numcheck = false;
		int num = Integer.parseInt(str.substring(7, 8));
		if (num > 0 && num < 5) {
			numcheck = true;
		}
		return numcheck;
	}

	static void JuminDisplay(String ssn) {
		// CASE1 >
		// String gender= ssn.replace("-","").substring(6,7);
		// int numgender = Integer.parseInt(gender);
		// if(numgender%2 == 0)System.out.println("여자");
		// if(numgender%2 == 1)System.out.println("남자");

		// CASE2 >
		char cgen = ssn.replace("-", "").charAt(6);
		// 123456-1234567 -> 1234561234567 > 123456[1]234567 추출> '1'
		switch (cgen) {
		case '1': // break 생략
		case '3':
			System.out.println("남자^^");
			break;
		case '2': // break 생략
		case '4':
			System.out.println("여자^^");
			break;
		default:
			System.out.println("중성");
		}
	}

	public static void main(String[] args) {
		String ssn = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("주민번호 입력:");
			ssn = sc.nextLine();
		} while (!juminCheck(ssn) || !JunminFirstNumber(ssn));
		// 둘다 true 인경우 > false || false 탈출
		// !true || !true => false || false 탈출
		JuminDisplay(ssn);

	}

}
/*
 * public boolean CheckNumber(String str){ char check;
 * 
 * if(str.equals("")) { //문자열이 공백인지 확인 return false; }
 * 
 * for(int i = 0; i<str.length(); i++){ check = str.charAt(i); if( check < 48 ||
 * check > 58) { //해당 char값이 숫자가 아닐 경우 return false; }
 * 
 * } return true; }
 * 
 * 
 * 
 * 자바에서 숫자인지 체크하는 간단한 방법입니다.
 * 
 * [StringUtil.java] public static boolean isNumeric(String s) { try {
 * Double.parseDouble(s); return true; } catch(NumberFormatException e) { return
 * false; } }
 * 
 * if( StringUtil.isNumeric(year) == false ) { logger.info(“숫자 오류”); }
 */

/*
 * import java.util.Scanner;
 * 
 * //주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... //main 함수 Scanner 사용 주민번호 입력받고
 * //앞:6자리 뒷:7자리 //입력값 : 123456-1234567 //1. 자리수 체크 (기능)함수 (14 ok) return true
 * or false //2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수 return true or false //3. 뒷번호 첫번째
 * 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수 void 출력 //3개의 함수 static
 * 
 * public class Ex07_String_Total_Quiz {
 * 
 * static boolean checkIdNumber(String idnumber) { // 14자리가 맞는지 확인 if
 * (idnumber.length() == 14) { System.out.println("14자리 OK"); return true; }
 * else System.out.println("14자리 No"); return false; }
 * 
 * static boolean checkBackNumber(int idnumber) { // 앞자리가 1~4의 값을 확인 if
 * (idnumber >= 1 && idnumber <= 4) {
 * System.out.printf("뒷번호 첫번째 자리 : [%d] so Ok\n", idnumber); return true; } else
 * { System.out.printf("뒷번호 첫번째 자리 : [%d] so No\n", idnumber); return false; } }
 * 
 * static void print(int idnumber) { if (idnumber == 1 || idnumber == 3) {
 * System.out.println("남자"); } else if (idnumber == 2 || idnumber == 4) {
 * System.out.println("여자"); } else System.out.println("뒷자리에는 1~4만 올 수 있음"); }
 * 
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); while (true) { System.out.printf("주민번호 입력 >>\n"); String
 * usernumber = scanner.nextLine(); int firstnumber =
 * Integer.parseInt(usernumber.substring(7, 8));
 * 
 * if (checkIdNumber(usernumber)) { if (checkBackNumber(firstnumber)) {
 * print(firstnumber); break; } else {
 * System.out.println("주민번호 뒷자리를 올바르게 입력해주세요."); } } else {
 * System.out.println("14자리를 정확히 입력해주세요."); } } } }
 */