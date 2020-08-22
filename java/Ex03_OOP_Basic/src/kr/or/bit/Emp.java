package kr.or.bit;

/*
- 사원은 사번을 가지고 있고 사번은 숫자 데이터로 관리하려고 한다.
- 사원은 이름을 가지고 있고 이름은 문자열 데이터로 관리하려고 한다.
- 사원은 직종을 가지고 있다. 직종은 (IT, SALES)등의 데이터로 관리된다.
- 사원은 급여를 받는다. 급여는 숫자 데이터로 관리된다.
- 사원은 신체정보를 가지고 있다. 신체정보는 키와 몸무게 데이터로 관리된다. >> 부품정보
>>신체정보 >> 하나의 타입 >> 사용자(개발자) >> Class
*/


public class Emp {
	//멤버필드 : 고유정보, 상태정보, [부품정보 == 다른 클래스]
	
	
	public int empno;				//사번, default = 0
	public String name;				//null
	public String job;				//null
	public int sal;					//0
	
	//중요!!
	public BodyInfo bodyinfo;		//BodyInfo는 설계도 속 부품설계도 == 클래스 == 데이터 타입이다!		default : null
									//신체정보를 담을 수 있는 타입 == 부품 정보 == 사원 클래스의 멤버필드!
	
}
