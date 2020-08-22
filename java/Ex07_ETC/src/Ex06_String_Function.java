import java.util.StringTokenizer;

/*
Method of String class
	concat() : 기존 문자열에 원하는 문자열 추가 return String
	contains() : 원하는 문자열이 있는지 검사 return boolean
	length() : 문자열 개수 return int
	indexOf() : 문자의 시작 위치값(없으면 -1 리턴)
	lastIndexOf() : 글자가 포함된 문자열의 방 번호 리턴
	substring(int) : int방 부터 출력
	substring(int , int) : inclusive int ~ exclusive int 출력

 */
public class Ex06_String_Function {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);

		boolean bo = str.contains("ell");
		System.out.println(bo);

		String str2 = "a b c d"; // [a][ ][b][ ][c][ ][d];
		System.out.println(str2.length());

		String filename = "hello java world"; // [h][e][l][l][o][ ][j][a][v][a][ ][w][o][r][l][d]
		System.out.println(filename.indexOf("h"));
		System.out.println(filename.indexOf("java")); // 단어의 시작 위치값
		System.out.println(filename.indexOf("개폭망")); // -1 -> 배열의 첨자는 0부터 시작하는데 0이아닌 첫번쨰 수 = 배열에 없다는 뜻!

		// 신문의 사설을 검색한다.. 폭망이란 단어 있는지 찾고싶다
		// indexOf : 내가 원하는 문자열이 포함되어 있느냐 - 0보다 큰값이면 최소한 내가원하는 문자열 한가지는 포함하고 있다.

		// -1이 아니라면 최소한 내가 원하는 그 문자가 그 스트링에 한가지라도 포함되어 있다!
		if ((filename.indexOf("wo")) != -1) {
			System.out.println("wo 하나라도 가지고 있네요");
		}

		System.out.println(filename.lastIndexOf("a"));

		// length(), indexOf(), substring(), replace(), split() 코어..
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(2, 3)); // 결국 자기자신 //p
		// beginIndex - the beginning index, inclusive. : 시작 index 포함 부터
		// endIndex - the ending index, exclusive. : 끝 index 제외(-1)까지

		System.out.println(result.substring(0, 0)); // (0,-1) -> 아무것도 안나옴
		System.out.println(result.substring(0, 1)); // (0, 0) -> s
		System.out.println(result.substring(1, 1)); // (1,0) -> 안나옴

		// Quiz
		String filename2 = "aaaa.zip"; // 또는 hong.png 또는 h.jpeg
		// 여기서 파일명과 확장자를 분리해서 출력하세요.
		boolean split = filename2.contains(".");
		System.out.println(split);

		/*
		 * String first = ""; String second = ""; second =
		 * filename2.substring(filename2.indexOf(".")); System.out.println(second);
		 * 
		 * first = filename2.substring();
		 */

		// 기준점을 찾아라
		int position = filename2.indexOf("."); // 점을 찾아 위치정보를 int position
		String file = filename2.substring(0, position); // filename2.length() -> 8
		// (4+1), 8
		String extention2 = filename2.substring(position + 1, filename2.length()); // ?

		String extention = filename2.substring(++position);

		System.out.println("file : " + file);
		System.out.println("extension : " + extention);
		System.out.println("extension 2 : " + extention2);

		// replace(치환함수)
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDDD", "오늘은 목요일");
		System.out.println(result3);

		result3 = str3.replace("A", "a");
		System.out.println(result3);

		// ETC
		System.out.println(str3.charAt(0)); // 몇번째 글자
		System.out.println(str3.charAt(3));
		System.out.println(str3.endsWith("DDDA")); // true
		System.out.println(str3.endsWith("DDD")); // 뭘로 끝나는지 boolean type return -> false
		System.out.println(str3.equalsIgnoreCase("abcdADDDDDA")); // case sensetive 대소문자 구별 없음

		// Today Point (Split) - 구분자
		// String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		// String[] namearray = str4.split(",");

		String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
		String[] namearray = str4.split("\\.");
		for (String s : namearray) {
			System.out.println(s);
		}

		/*
		 * .(점) >> 정규표현식 문법 >> .은 문자 그대로 인지해줘! >> escape문자 \ + \. >> \\.
		 * 
		 * 조별과제 정규표현식 (단 조건, 해석은 우리가 해야한다 - 5가지)
		 * https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
		 * 
		 * https://regexr.com/ -> 검증하는 사이트 정규표현식(regex)표준 (java, javascript, Oracle, c#)
		 * 공통적인 규칙 어떠한 문자를 만들 때 [규칙]을 부여 >> 유효한 판단 근거 - 주민번호 : 숫자 6자리 - 숫자 7자리
		 * {\d6}-{\d7} 이 규칙에 맞느냐 맞지 않느냐-> true - 12345-1234567 -> false - 폰번호, 차량번호,
		 * 우편번호, 도메인 주소, 이메일 주소 등을 검증할 수 있는 정규 표현식을 개발자들이 다 만들어놨다...
		 * 
		 */
		String filename3 = "bit.hwp";
		// split 사용해서 파일명과 확장자를 출력해보세요.

		String[] namearray2 = filename3.split("\\.");
		String file2 = namearray2[0];
		String ext = namearray2[1];

		System.out.println(file2);
		System.out.println(ext);

		for (String s : namearray2) {
			System.out.println(s);
		}

		// split 사용이 불가하기에 별도의 클래스가 필요하다. 그 때 쓰는 클래스가 StringTokenizer 정도
		String str5 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str5, "/,-."); // ""안의 모든 걸 구분자로 넣을꺼다
		while (sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}

		// 넌센스
		String str6 = "홍        길                               동";
		// 저장할 때는 공백이 제거된 "홍길동"으로 저장하고 싶다!
		String[] namearray3 = str6.split(" ");
		System.out.println(str6.replace(" ", ""));

		String str7 = "            홍길동                         ";
		System.out.println(">" + str7 + "<");
		// 공백제거해서 "홍길동" 출력하고 싶다
		System.out.println(">" + str7.trim() + "<");

		String str8 = "             홍           길            동                     ";
		// 홍길동으로 출력하자
		// String result5 = str8.replace(" ","");
		// String result6 = result5.trim(); //무식한 인간

		// ****************여러개의 함수를 적용할때는 (Method Chain 기법)을 사용한다.
		System.out.println(str8.trim().replace(" ", "").substring(2)); // 동
		System.out.println(str8.replace(" ", ""));

		// ---------------------------------
		// 내가 푼 퀴즈1,2
		// ---------------------------------Quiz-1
		int sum = 0;
		String[] numarr = { "1", "2", "3", "4", "5" };
		// 배열에 있는 문자들값의 합을 sum변수에 담아서 출력 : 결과 15
		for (int i = 0; i < numarr.length; i++) {
			sum += Integer.parseInt(numarr[i]);
		}
		System.out.println("Quiz-1) String 배열의 합 : " + sum);

		// ---------------------------------Quiz-2
		String jumin = "123456-1234567";
		// 위 주민번호의 합을 구하세요
		String realjumin = jumin.replace("-", "");
		String[] juminarr = new String[13];
		int sum2 = 0;
		for (int i = 0; i < juminarr.length; i++) {
			juminarr[i] = realjumin.substring(i, i + 1);
			sum2 += Integer.parseInt(juminarr[i]);
		}
		System.out.println("Quiz-2) 주민번호의 합 : " + sum2); // 안좋은 방법

		// ---------------------------------Quiz-2_1)
		int sum3 = 0;
		for (int i = 0; i < realjumin.length(); i++) {
			sum3 += Integer.parseInt(realjumin.substring(i, i + 1));
		}
		System.out.println("Quiz-2_1) 주민번호의 합 : " + sum3); // 보다 나은 방법?

		/*
		 * //Quiz-2 String jumin="123456-1234567"; //위 주민번호의 합을 구하세요_1 int sum2=0;
		 * for(int i = 0 ; i < jumin.length() ; i++) { String numstr =jumin.substring(i,
		 * i+1); if(numstr.equals("-")) continue; sum2+= Integer.parseInt(numstr); }
		 * System.out.println("주민번호 합:" + sum2);
		 * 
		 * //위 주민번호의 합을 구하세요_2 //String jumin="123456-1234567"; String[] numarr2 =
		 * jumin.replace("-","").split(""); int sum3=0; for(String i : numarr2) { sum3+=
		 * Integer.parseInt(i); } System.out.println("주민번호 합2:" + sum3);
		 * 
		 * //위 주민번호의 합을 구하세요_3 String jumin4 = jumin.replace("-", ""); int sum4=0;
		 * for(int i = 0 ; i < jumin4.length() ;i++) {
		 * sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i))); }
		 * System.out.println("주민번호 합4:" + sum4);
		 * 
		 * }
		 */
		// ---------------------------------------------------------------------------------------------------
		// ---------------------------------------------------------------------------------------------------
		// ---------------------------------------------------------------------------------------------------
	}

}
