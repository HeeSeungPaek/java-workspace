import kr.or.bit.Card;

//Static은 아이디어! 무엇을 static으로 할당해야 할지 생각해보자
//static은 장점이 될 수도 있고, 단점이 될 수도 있다.
//한번에 여러개의 객체의 정보를 바꿀 수 있지만, 잘못 바꾼다면 모든 설계도가 잘못되는꼴이다.
//잘 생각해서 static을 쓰도록 합시다.

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//Card 53장을 제작
		/*
		Card c = new Card();
		c.number = 1;
		c.kind = "♥";
		c.cardInfo();

		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "♥";
		c2.cardInfo();
		*/
		//53카드를 new를 통해 제작한다.
		//이 때, 클라이언트가 .. 크기가 잘못됐어요..
		//현실 세계는 버리고 다시 만들어내야하지만
		//프로그래밍에서는 크기를 조절하는 게 가능하다.
		//높이는 70, 너비는 50으로 바꿔주세요
		
		//1.한 장씩 수정한다. (10000장이면 10000번 이짓을 해야된다.)
		//c.h = 70;
		//c.w = 50;
		
		//2. 설계도를 뜯어 고친다. (기존 것 버리고 다시 새로 제작)
		
		Card c = new Card();
		c.number = 1;
		c.kind = "♥";

		c.height = 70;
		c.width = 50;
		
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "♥";
		c2.cardInfo();
	
	}

}
