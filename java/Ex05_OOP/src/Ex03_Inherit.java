// 두개의 설계도
class Tv { // Tv
	boolean power;
	int ch;

	void power() { // Toggling 토글링 Power
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}

}

class Vcr { // VideoPlayer
	boolean power;

	void power() {
		this.power = !this.power;
	}

	void play() {
		System.out.println("재생하기");
	}

	void stop() {
		System.out.println("정지하기");
	}

	void rew() {
	}

	void ff() {
	}
}
//Tv 설계도
//Vcr 설계도

//요구사항 : Tv인데 Vcr기능이 포함된 제품을 만들어주세요!
//우리는 상속과 포함을 배웠다.
//class TvVcr extends Tv,Vcr -> 다중상속 금지
//계층적상속을 해야한다 > Vcr extends Tv ... TvVcr extends Vcr(자원들의 이름이 충돌)

// 1조) class TvVcr { Tv t; Vcr v; }
// 2조) class TvVcr { Tv t; Vcr v; }
// 3조) class TvVcr { Tv t; Vcr v; }
// 1조) class TvVcr extends Tv { Vcr v; }
// 기준 : 주기능적인 면을 보면(메인 기능) 비중이 높은 클래스를 상속 >> 남는 것들은 포함으로 빠져버리는.. 
// >> 답이 아니라 일반적인 사고..

class TvVcr extends Tv {	//tv가 만들어지면 vcr도 같이 만들어진다. >> 일체형
	Vcr vcr;
	
	TvVcr(){
		vcr = new Vcr();
	}
	
}

public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("tv의 전원 : " + t.power);
		t.chUp();
		System.out.println("채널 정보 : " + t.ch);
		
		//비디오
		t.vcr.power();
		System.out.println("비디오 전원 : " + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		System.out.println("tv의 전원 : " + t.power);
		System.out.println("비디오 전원 : " + t.vcr.power);
	}

}















