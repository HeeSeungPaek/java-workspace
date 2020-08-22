package day02;
//자바에서는 3가지 콘솔 출력방법을 지원한다.
//1.print
//	print()는 괄호안의 내용을 그대로 출력하고 다음 출력위치를 바꾸지 않는다.
//2.println
//	println()은 괄호안의 내용을 출력하고 다음 출력위치를 다음 줄로 옮긴다.
//3.printf
//	printf()는 괄호안의 내용을 출력 후 다음 출력위치를 바꾸지 않지만
//	우리가 원하느 만큼의 변수들을 넣어서 특정 양식에 맞춰줄 수 있다.

//공백문자 : \+알파벳으로 이루어짐.
//	\t 탭 공백(스페이스 4번)
//	\n 개행문자(next line)

public class Ex01Print01 {
	public static void main(String[] args) {
		String string1 = "abc";
		String string2 = "def";
		System.out.print(string1);
		System.out.print(string2);
		
		System.out.println(string1);
		System.out.println(string2);
		
		System.out.printf("string1 : %s, s\ntring2 : %s\t", string1, string2);
		
		System.out.print(string1);

	}
}
