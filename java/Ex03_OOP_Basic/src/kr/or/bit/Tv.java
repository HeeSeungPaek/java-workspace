package kr.or.bit;

/*
클래스 설계 전에 요구사항을 만들어주며 보다 더 설꼐도를 만들기 간편해진다.
요구사항을 나름대로 정의해보고 구성하는 연습을 하다보면 좋은 설계도를 만들 수 있다.
Tv 설계도 요구사항 정의
Tv는 채널 정보를 가지고 있다 (예 : 1~200 값을 가질 수 있다)
Tv는 브랜드 이름을 가지고 있다 (예: 엘지 삼성)
Tv는 채널 전환 기능을 가지고 있다(채털은 한 채널씩 이동이 가능하다
->채널 증가,감소 기능을 가지고 있따
*/

//사적인 얘기 : 요구사항에 없는 기능을 만드는 건 바보같은 행위, 하지 말아야 한다. 요구사항에 있는 것만 하자.

//Tv를 만드는 설계도
public class Tv {
	public int ch;	//default = 0 값을 가지고 있다는 뜻.
	public String brandname; //default = null
	
	//채널 정보를 증가시키는 기능정보
	public void ch_Up() {
		ch++;
	}
	public void ch_Down() {
		ch--;
	}
	
	//채널 정보, 브랜드 이름을 출력하는 기능을 보고싶다. 기능을 만들어보자
	public void tvInfo() {
		System.out.printf("[%s], [%d]\n", brandname, ch);
	}
	
	
	
}
