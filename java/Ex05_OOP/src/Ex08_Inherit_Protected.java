import kr.or.bit.Pclass;
/*
Modifier : public, private, default, [상속관계에서 >> protected]
상속이 없인 [재정의, protected, super]도 없다

protected : 양면성을 지니고 있다 (박쥐) >> 어떨 때는 default의 성격을 가지고, 어떨 때는 public의 성격을 가지고 있다
>> 상속이 없는 클래스 안에서 protected 접근자는 [default]와 같다.
>> 상속 관계에서만 의미를 가진다.
*/
class Dclass{
	public int i;
	private int p;
	int s;	//default
	protected int k;	//default (일반적인 클래스에서는 사용할 이유가 x)
}

class Child2 extends Pclass {
	void method() {
		//this.j
		this.k = 1000;	// 상속 관계에서, 자식은 부모의 protected 자원에 접근이 가능하다.(public처럼)
		System.out.println(this.k);
	}
}

public class Ex08_Inherit_Protected {	//protected는 상속에서만 존재한다

	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.j	객체의 참조변수 입장에서는 이상태에서 보자면 public만 접근이 가능하다.
		//p.k	상속관계가 아닌 것에선 default처럼, 상속관계면 public처럼
		
		Child2 ch = new Child2();
		ch.method();
	}

}
