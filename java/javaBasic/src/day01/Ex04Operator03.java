package day01;
//비교 연산자
//2개의 값을 비교한다.
// < <= > >= == !=
public class Ex04Operator03 {
	public static void main(String[] args) {
	
		/*
		 * int number1 = 5; int number2 = 6;
		 * 
		 * System.out.println("number1 > number2 : " + (number1 > number2)); 
		 * //5>6 의 식은 거짓이므로 false(0)값이 리턴된다.
		 * 
		 * System.out.println("number1 <= number2 : " + (number1 <= number2));
		 */		
		
		//public static void main(String[] args)
		//String이란 여러 개의 글자를 모아둔 "문자열"클래스이다.
		//만약 우리가 문자열 비교를 한다고 가정할 때
		//그 안에 글자가 전부 같은지 궁금하다는 의미가 된다.
		//하지만 String같은 "클래스 변수(=객체)"를 비교할 때에는
		//비교연산자 ==, !=을 사용하면 안된다.
		//아래의 예제를 통해서 알아보자.
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = str1;
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str3 : " + (str2 == str3));
		//출력 결과로 알 수 있는 사실 : 참조형 데이터타입은
		//변수에는 값이 아니라 해당 변수가 실제로 들어가 있는 곳의 '주소값'이 들어가 있다.
		//실제로는 그 주소값을 '참조'해서 실제 값이 있는 곳으로 들어가
		//어떤 값이 있고 그 값을 토대로 비교해야 한다.
		//하지만 비교연산자는 주소값을 비교하기 때문에
		//str1, str2, str3에는 모두 abc 세글자만 들어가 있지만
		//str2의 주소값은 당연히 나머지와 다르기 때문에 false가 출력된다.
		//결론 : 주소값의 차이로 인해
		
		//그렇다면 객체의 실제값 비교를 위해서는 뭘 해야 할까?
		//해당 객체에 정의되어 있는 equals라는 메소드를 이용해 실제적 비교를 해야 한다.
		//객체 내부에 정의되어 있는 메소드를 호출하기 위해서는
		//객체. 으로 들어가서 해당 메소드를 적어주면 된다.
		System.out.println("str1.equals(str2) : " + str1.contentEquals(str2));
		System.out.println("str1.equals(str3) : " + str1.contentEquals(str3));
		System.out.println("str2.equals(str3) : " + str2.contentEquals(str3));
	}
}

