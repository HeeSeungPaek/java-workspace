package day02;

//printf의 다양한 형식을 알아보자

public class Ex02Printf {
	public static void main(String[] args) {

		//	1.10진 정수('d'ecimal) : %d
		//	1-A. 정수를 그대로 출력해라
		//	1-B. 정수를 5자리로 오른쪽 정렬해서 출력해라
		//	1-C. 정수를 5자리로 왼쪽 정렬해서 출력해라
		//	1-D. 정수를 5자리로 오른쪽 정렬하고 왼쪽 빈공간은 0으로 채워라
		//	%-05d는 안되네
		int number = 478;
		System.out.printf("1-A.%d\n", number);
		System.out.printf("1-B.%5d\n", number);
		//단, 자릿수보다 출력할 양이 많으면 자릿수는 무시된다.
		System.out.printf("1-B.%2d\n", number);
		System.out.printf("1-C.%-5d출력끝\n", number);
		System.out.printf("1-D.%05d\n", number);
		
		//	2.16진법 정수(he'x'adecimal)
		//	2-a.16진법 정수를 그대로 표시하되, 알파벳이 있으면 소문자로 출력해라
		//	2-b.16진법 정수를 그대로 표시하되, 알파벳이 있으면 대문자로 출력해라
		//	2-c.16진법 정수를 8자리로 표시하고 오른쪽 정렬하되 대문자로 출력해라
		//	2-d.16진법 정수를 8자리로 표시하고 오른쪽 정렬하고 왼쪽 빈 공간0채우고 대문자로 출력
		System.out.printf("2-a.%x\n", number);
		System.out.printf("2-b.%X\n", number);
		System.out.printf("2-c.%8X\n", number);
		System.out.printf("2-c.%08X\n", number);
		
		//	3.실수('f'loat)
		//	3a.실수를 그대로 출력
		//	3b.실수를 소숫점 3번째 자리까지 출력해라
		//	3c.실수를 총 8자리에 소숫점은 3번째 자리까지 출력해라
		//	3d.실수를 총 5자리에 소숫점은 4번째 자리까지 출력해라
		double myDouble = 3.141592;
		System.out.printf("3a. %f\n", myDouble);
		System.out.printf("3b. %.3f\n", myDouble);
		System.out.printf("3c. %8.3f\n", myDouble);
		//점도 한 자리를 차지하기 때문에 출력결과는 vvv3.142 8글자가 된다
		System.out.printf("3d. %5.4f\n", myDouble);
		//원 데이터가 표기하고자 하는 자릿수보다 많을 경우 자릿수는 무시하고, 소숫점 아래 4자리는
		//그대로 출력된다
		//출력결과 : 3d.3.1416

		//4. 스트링('s'tring)
		//4a. 스트링을 그대로 출력해라
		//4b. 스트링을 소문자는 대문자로 바꿔 출력해라
		//4c. 스트링을 총 10자리로 맞추고 오른쪽 정렬해서 출력해라
		//4d. 스트링을 총 10자리로 맞추고 왼쪽 정렬해서 출력해라
		String myString = "abcDEF";
		System.out.printf("4a.%s\n", myString);
		System.out.printf("4b.%S\n", myString);
		System.out.printf("4c.%10s\n", myString);
		System.out.printf("4d.%-10s\n", myString);
		
		//5. 과학표기법('e'xponential)
		myDouble = 123.4567;
		System.out.printf("5.%e\n", myDouble);
		System.out.printf("5.%E\n", myDouble);
	}
}
