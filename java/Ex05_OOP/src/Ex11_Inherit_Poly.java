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

		Pbase p = cbase;	//�θ�Ÿ�� Pbase�� �������� p�� �ڽ�Ÿ���� Cbase�� ������ �ִ� �������� ���� ���� �� �ִ�.
							// = ������
		Dbase dbase = new Dbase();
		
		p = dbase;			//�θ�� ��� �ڽ��� �� ����.
		
		//Cbase c = p; �Ųٷ� �ڽ�Ÿ���� �θ��� �ּҸ� ���� �� ����.
		Cbase c = (Cbase)p; //�̰� �����ϰ� �ϴ°� �ٿ�ĳ����...
		
	}

}
