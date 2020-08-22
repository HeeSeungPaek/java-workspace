package kr.or.bit;
/*
우리는 카드를 만들어 판매하는 회사.
고객의 요청에 따라 카드 53장 제작하게 됨.
요구사항
카드는 카드의 번호를 가지고 있고, 그리고 모양을 가지고 있다.
카드는 크기를 가지고 있다. 크기는 높이&너비를 의미합니다.
카드의 크기는 h=50, w=20

----

[모든 카드의 높이와 너비는 동일] (동일) 스태틱
??카드의 크기를 나중에 변경해 달라고 하면????

설계도를 다시 변경하지 않고 53장 카드의 크기를 변경할 수 없을까
 */
public class Card {
	public int number;
	public String kind;
	public static int height = 50;
	public static int width = 20;
	
	//기능(카드의 정보를 확인할 수 있는 기능을 넣어보자)
	public void cardInfo() {
		System.out.printf("번호: [%d], 모양: [%s], 높이: [%d], 너비: [%d]\n", number, kind, height, width);
	}
	
}
