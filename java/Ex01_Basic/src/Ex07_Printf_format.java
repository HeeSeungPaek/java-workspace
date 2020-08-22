import java.util.Scanner;

public class Ex07_Printf_format {

	public static void main(String[] args) {
		//System.out.println()
		//C# : Console.WriteLine()
		System.out.println();//줄바꿈
		System.out.print("A");
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num 값은" + num);
		//형식 format 틀
		
		System.out.printf("num값은 %d\n",num);
		//format 형식문자 
		//%d : 10진수 >> d 자리에
		//%f : 실수 >> f자리에
		//%s : 문자열
		//%c : 문자
		//\t \n
		System.out.printf("num값은 [%d] 입니다. 그리고 [%d] 도 있어요 \n",num,12345);
		
		float f = 3.14f; //f를 붙이는 이유 -> 자바는 double이 실수 기본형
		System.out.println(f);
		System.out.printf("f변수값:%f\n",f);
		
		//입력을 받는데 (console (cmd)) 사용자가 입력한 값을 ...
		Scanner sc = new Scanner(System.in); //Listener
		
		//컨트롤 시프트 o -> import 자동 생성
		
		//System.out.println("값을 입력하세요"); 
		//String value = sc.nextLine(); //입력하고 엔터 칠 때까지 대기하다가 입력값을 문자열로 리턴하는 함수 -> nextLine()메소드
		//System.out.println(value);
		
		//int number = sc.nextInt();
		//float number = sc.nextFloat();
		//System.out.println(number);
		//권장사항 : nextInt nextFloat 보다는 nextLine() read

		//***Today Point***
		// [문자를] -> [숫자로](정수, 실수) 변환이 가능하다!
		//Wrapper Class -> 원시 데이터타입은 각각 고유의 클래스를 가지고 있다.
		//Integer.parseInt("11"); >>정수값으로 변환해준다.
		//Float.parseFloat(s) >>실수로 변환
		
		System.out.println("숫자 입력하세요");
		int number = Integer.parseInt(sc.nextLine()); // 입력한 문자를 숫자로 변환한다!
		System.out.println("정수 값 : " + number);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
