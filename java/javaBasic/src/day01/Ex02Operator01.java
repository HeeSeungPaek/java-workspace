package day01;

/*연산자(Operator)
 * 연산자는 프로그래밍 내부에서 특정 기호에 여러 의미를 부여해 둔 것이다.
 * 산술 연산자 : + - / * % (간단한 산수)
 * -산술 연산자는 서로 다른 데이터타입을 연산하면 결과값은 무조건
 *  더 큰 데이터타입을 따라간다. 정수와 실수 연산 시 실수가 나온다는 말.
 *  단, " " 다음에 +가 나오면 의미가 달라진다.
 *  자바에서 ""는 여러개의 문자가 그 안에 있다는 의미이다.
 *  따라서 ""다음 +값의 의미는 앞의 문자들 뒤에 뒤의 문자를 이어붙이기의 의미.
 *   
 * 증감 연산자 : i++ i-- ++i --i(전위, 후위 정의 헷갈리지 말기) 
 * 비교 연산자 : < > <= >= =!
 * 논리 연산자 : && || !
 * 쉬프트 연산자 : << >> 
 * */

public class Ex02Operator01 {
	public static void main(String[] args) {
		int myNumber1 = 5;
		int myNumber2 = 10;
		System.out.println("myNumber1 + myNumber2: " + 
				(myNumber1 + myNumber2));

		System.out.println("myNumber1 - myNumber2: " + 
				(myNumber1 - myNumber2));

		System.out.println("myNumber1 * myNumber2: " + 
				(myNumber1 * myNumber2));

		System.out.println("myNumber1 / myNumber2: " + 
				(myNumber1 / myNumber2));
		//컴퓨터는 정수/정수를 실행 시 정수를 제외한 부분을 무시
		//오직 몫 부분만 출력한다. 즉, 5/10 몫=0, 나ㅁ머지=5
		//위의 코드는 0이 출력된다.
		System.out.println("myNumber1 % myNumber2: " + 
				(myNumber1 % myNumber2));
		
		/*
		 * 프로그래밍에서 자료형을 바꿀 때는 2가지 방법이 있다. 
		 * 암시적 형변환 (Implicit Typecasting)
		 * vs 명시적 형변환(Explicit type..)
		 * 암시적 형변환: 자바가 자동으로 타입을 바꿔준다.
		 * - 데이터타입 값을 보다 큰 타입으로 바꿀 때 발생 
		 * 명시적 형변환: 사용자가 직접 작성해 타입을 바꾼다.
		 * - 데이터타입 값을 보다 작은 타입으로 바꿀 때 발생
		 */
		
		//1. 명시적 형변환을 통해 정수/정수 결과를 실수로 ㄱㄱ
		System.out.println("myNumber1 / myNumber2: " +
				((double)myNumber1 / myNumber2));
		
		//2. 암시적 형변환을 통해 정수/실수가 자동으로 출력되는거 확인
		System.out.println("myNumber1 / 10.0: " +
				myNumber1 / 10.0 );
		
		// "" + 값의 결과를 확인해보자
		System.out.println(100+123);
		System.out.println("100"+123);
	}
}
