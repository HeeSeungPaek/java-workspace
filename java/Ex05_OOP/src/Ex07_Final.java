/*
우리가 지금까지 배운건 변수 <-> 상수
상수 : 한 번 값이 초기화되면 변경이 불가하다. -> 바뀌지 말아야 할 값
상수자원 : [고유값](주민번호), 수학 : PI, 버전번호, 시스템 관리번호
상수는 관용적으로 대문자로 선언한다.

java : final int NUM = 10;
C# : const integer NUM = 10;

final 키워드 
클래스 앞 >> final class Car{} >> final Math { } >> 상속 금지
함수 앞에 >> public final void print() {} >> 상속관계에서 재정의 (Override 금지)
		  public static final void print() {} >> 객체 간 공유 함수 but 재정의 금지!
*/
class Vcard {
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		System.out.println(Math.PI);//.찍어서 S,F static final 객체간 공유함수 but 재정의 금지!
	}
}

class Vcard2 {						//설계도를 만들 때 상수는 초기화를 보장해줘야 한다. (생성자)
	
	final String KIND;				//상수를 만들 때 바로 초기화를 안해도 되지만,
	final int NUM;					//객체 생성 전까지 [초기화를 보장]을 해야한다.
	/*
	Vcard2(){
		this.KIND = "heart";
		this.NUM = 10;
	}
	*/
	Vcard2(String kind, int num){	//오버로딩 컨스트럭터 - 카드 53장의 모양과 숫자는 다르다는 요구사항이 있엇다.
		this.KIND = kind;			//(한번 정해지면 변경이 불가하다)
		this.NUM = num;
	}
	
	//extends Object가 숨겨져 있기에 toString 메소드를 오버라이딩할 수 있다.
	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
	
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard v = new Vcard();
		//v.KIND = "AAA";	상수라는건 값을 한번 할당하면 바꾸지 못하기에 컴파일 전부터 에러가 나온다!
		v.method();
		
		Vcard2 v1 = new Vcard2("spade", 1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade", 2);
		System.out.println(v2.toString());
		
		Vcard2 v3 = new Vcard2("spade", 3);
		System.out.println(v3.toString());
		
		//v3.KIND = "aaa"; 다시 변경은 불가하다
	}

}
