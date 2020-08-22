/*
String 클래스 (문자열) -> 스트링클래스를 공부하는 이유는 문자열을 조작하기 위해
String 클래스는 수많은 함수를 가지고 있다... 문자열을 조작 (자르고 합치고 등등)
String >> static 함수 + 일반 함수
15개~20개의 함수가 자주 사용되기에 외울 수 있다.
ex. subString -> 부분을 뽑아내는 함수..
*/
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str = ""; // 문자열의 초기화 >> null, ""
		// 사용방법 : int, double처럼 쓰세요!

		String[] strarr = { "aaa", "bbb", "ccc" };
		for (String s : strarr) {
			System.out.println(s);
		}

		///////////////////////////////////////////////////
		String stri = "홍길동";
		System.out.println(stri.length());
		System.out.println(stri.toString());
		System.out.println(stri);	 // 실제로 클래스라면 주소값이 나와야하지만, 값이 나온다!?
									// 이렇게 쓰면 뒤에 .toString()이 생략되어 있다.
									// String도 클래스다 -> String의 부모는 Object다
									// Object가 가지고 있는 toString 함수를 String에서 재정의한 것!(값을 출력하도록)

		// 원칙적으로 String을 쓰는 방법은 이렇다.
		String stra = new String("가나다라마");
		// 1. String name = "가나다라마"; >> String은 내부적으로 메모리를 갖는데,
		// >>String은 내부적으로 char[] 메모리를 사용한다. >> char[] 배열이라는 이야기는
		// [가][나][다][라][마] 0 1 2 3 4번째 방에 각각 글씨가 들어간다.
		// class String extends Object{ char[] .... @Override toString(){재정의 구현} .. length(){}..}
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1);
		System.out.println(str2.toString());
		System.out.println(str1==str2);
		// ==이라는 연산자는 값을 비교 (str1도 주소값, str2도 주소값)
		// 주소값 == 주소값
		// 같은 주소로 판명되었다. 그 이유는
		// 메모리에 실제로 같은 문자열이 있으면 재사용해버린다.
		System.out.println(str1.equals(str2));	//주소를 찾아가 그 안에 있는 값을 비교하는 것이다
		// equals -> AAA == AAA
		
		// ---반전주의---
		String str3 = new String("BBB");	//new 새로운 메모리 생성
		String str4 = new String("BBB");
		System.out.println(str3 == str4);	//false -> cause str3과 str4는 참조변수 > 주소값이 다르다, 둘 다 다른 객체기떔에
		System.out.println(str3.equals(str4));	//주소를 타고 가 값 "BBB"=="BBB"를 비교한다. -> true!
		
		//넌센스
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		
		s = "A";
	}

}
