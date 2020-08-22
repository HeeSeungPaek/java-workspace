/*프로그램 오류

**컴파일 에러와 런타임 에러**
컴파일 에러 : 컴파일 시 발생하는 에러 / 런타임 에러 : 실행 도중에 발생하는 에러!

> 자바의 런타임 에러 : 에러(Error:개발자가 처리할 수 없는)와 예외(Exception:개발자의 실수)
에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 (ex. 네트워크 장애, 메모리, 하드웨어 >> 개발자가 코드적으로 해결X
예외 - 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 ( 개발자의 코드의 실수에 의해 발생 >> 코드 수정, 방어책을 짠다(예외처리)
		>>예외가 발생하면, 프로그램은 강제로 종료돼버린다. 
		>>예외처리 : 문제가 생길 수 있는 코드에 안정장치를 달아주는 것 >> 문제가 발생하더라도 강제 종료되지 않고,
		>>일단 진행하는 것 [ 비정상적인 종료를 막는다 ]

> 에러는 어쩔 수 없지만, 예외는 처리해야 한다.
> 예외처리의 정의 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
		   목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
		   
 
 try {
 	>> 문제(예외)가 발생할 수 있는 코드를 넣는 곳 (의심되는 코드)
 	>> 예외가 발생하면 catch에게 맡긴다.
 	-> 문제가 발생하면, 그 문제를 담을 수 있는 객체가 자동으로 생성된다!!!
 	-> 컴파일러가 문제에 맞는 객체를 new해버린다 ~> 	new java.lang.ArithmeticException (0으로 나눳을 경우)
 	-> 발생한 문제의 정보 ArithmeticException를 전달한다.
 }catch (Exception e) {		//위에 무슨 예외인지 확실히 모른다? => 모든 예외를 포용할 수 잇는 Exception에게 준다!
 	>> 문제가 생긴다면, catch로 잡아서 문제를 [파악]한다
 	>> 처리
 	>> 1. 관리자에게 Email을 보낸다.
 	>> 2. 로그파일에 문제를 기록한다.
 	>> 3. 강제로 종료되는 것을 일단 막는다.
 	>> 결론 : 결국엔 예외라는 것은 개발자가 해결해야 한다!
 } finally {
 	>> 문제가 발생하던말던 강제로 수행되어야 할 코드!
 	>> Ex) DB연결 해제하기.
 }
 //try catch는 많으면 많을수로 좋지 않다. 하지만 코드가 늘어나더라도, 비정상적 종료를 막기 위해 쓰는 것.


*/

public class Ex01_Exception {

	public static void main(String[] args) {

		System.out.println("main start");
		
		
		try {	//사고가 터지는 블록
			System.out.println(0/0);
		}catch(Exception e) {		//예외에 대한 수습.. 고치는게 아니라 문제의 정보에 대해서 알려주는 것
			//catch에서는 무슨 문제가 발생했고, 원인은 무엇인지라는 정보를 고치는 게 아니라 보는 것!
			e.printStackTrace();
			System.out.println("catch : " + e.getMessage());
		}
		
		//System.out.println(0/0);
		//이렇게 문제가 발생하더라도, 일단은 프로그램이 강제로 종료되지 않았으면 좋겠다!
		//이럴 때 하는 것이 예외처리
		//출력결과 : main start
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at Ex01_Exception.main(Ex01_Exception.java:34)
		
		System.out.println("main end");
		
	}

}
