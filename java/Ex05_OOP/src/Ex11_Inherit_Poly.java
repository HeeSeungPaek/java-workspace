class Pbase{
	int p = 100;
}

class Cbase extends Pbase {
	int c = 200;
}

class Dbase extends Pbase {
	
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());

		Pbase p = cbase;	//부모타입 Pbase의 참조변수 p는 자식타입인 Cbase가 가지고 있는 참조변수 값을 가질 수 있다.
							// = 다형성
		Dbase dbase = new Dbase();
		
		p = dbase;			//부모는 모든 자식을 다 포용.
		
		//Cbase c = p; 거꾸로 자식타입은 부모의 주소를 가질 수 없다.
		Cbase c = (Cbase)p; //이걸 가능하게 하는게 다운캐스팅...
		
	}

}
