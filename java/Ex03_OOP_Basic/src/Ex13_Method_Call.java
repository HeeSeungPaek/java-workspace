class Data{
	int i;
	
}


public class Ex13_Method_Call {
	
	public static void main(String[] args) {
		Data d = new Data();	//d의 주소값 ox12
		d.i = 100;
		System.out.println("d.i: " + d.i);
		
		scall(d);	//주소값을 받았다
		
		
		vcall(d.i); //값만 파라미터로 넘겻기 때문에
		System.out.println("d.i: "+d.i);	//111
	}
	
	static void scall(Data sdata) {	//Data 타입의 sdata 주소값을 파라미터로 받는 메소드
		System.out.println("함수 : " + sdata.i);
		sdata.i = 111;
	}
	
	static void vcall(int x) {	//이건 블록변수, 내가 파라미터로 받은 값은 객체주소의 변수가 아닌 그냥 값이다.
		
		System.out.println("before x : " + x);
		x = 8888;	//파라미터가 x고 x에 8888을 대입한걸 보자
		System.out.println("after x : " +  x);
		
	}
	
}
