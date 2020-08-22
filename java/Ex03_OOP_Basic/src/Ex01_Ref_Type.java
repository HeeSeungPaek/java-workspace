import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

//import kr.or.bit.*; 를 안 쓰는 이유!!
//bit패키지 안의 모든 자원을 사용하라는 의미인데, 가독성의 문제가 있다. 그 상자안의 무엇을 쓰는지 모르기 때문에 쓰지 않는다.
//임포트 시 하나씩 오픈해서 사용하자

public class Ex01_Ref_Type {
	public static void main(String[] args) {
		
		//값 타입 (8가지 기본형)
		//참조 타입 (Class, Array ....)
		//참조 타입의 특징
		
		Person p2; //선언 -> 이때 p2는 메모리를 가지고 있지 않다. 선언만 했기 때문이다
					//Stack이라는 영역에 [공간]만 확보. 공간의 이름이 p2, 공간의 크기는 주소를 담을수 있는 4Byte의 빈 공간.
		p2 = new Person();	//p2라는 변수에 Person이라고 하는 객체의 주소가 할당된다.
		System.out.println(p2); //주소값이 출력됨!
		
		//Person p3; //메인이라는 함수 속은 로컬변수이기 때문에 초기화를 해야한다 -> 초기화 하지 않았기 때문에 사용 불가하다.
		Person p3 = null; //참조 변수의 초기화는 null로 한다. null : 값이 아무것도 없다.
		System.out.println(p3);
		
		//참조 변수가 메모리를 가지는 방법 2가지.
		//1. new >> p3 = new Person();	//새로 생성한 주소값을 가지기
		//2. 주소값 할당 >> p3 = p2;		//다른 주소값을 넣어주기
		
		p3 = p2;
		
		Person person = new Person(); //참조변수 person 이름은 무조건 소문자로(관용적)
		person.name = "김똥깨";
		person.age = 100;
		person.power = true;
		person.personPrint();	//메소드 사용
		
		Person p = new Person();
		p.personPrint();		//name: null age: 0 power: false >> 얘네들은 default값을 가지고 있다.
		
		//Static은 클래스 Area에 올라가는데
		//이름이 main이라면 바로 스택 영역으로 끌어내린다.[약속]
		//스택에 아무것도 없다 >> 프로그램 종료
		
		//주소값 비교
		System.out.println(person == p);//비교 (변수가 가지고 있는 값)
		System.out.println(p2 == p3); //true 이게 검증하는것
		
		int i = 100;
		i = 300;
		System.out.println(i);
		
		// --------------------------------------------------------------
		//Tv 생산
		//Tv의 이름은 비트라고 하자.
		//Tv를 한 대 만들고, 채널을 5까지 올리고
		//Tv 정보를 출력해보자.
		
		Tv btv = new Tv();
		btv.brandname = "비트";
		System.out.println("현재 비트 티비 채널정보 : " + btv.ch);
		for(int k = 0; k < 5; k++) { //채널 5업
			btv.ch_Up();
		}
		btv.tvInfo();
		
		// --------------------------------------------------------------
		//사원 한명을 생성하세요
		//그 사원은 사번이 7788, 이름이 김유신, 부서가 IT
		//그리고 신체정보에서 키는 190, 몸무게는 40
		Emp emp = new Emp();
		
		emp.empno = 7788;
		emp.name = "김유신";
		emp.job = "IT";

		//부품정보도 클래스 -> 생성
		//참조타입의 값은 주소값
		/*
		 * BodyInfo body = new BodyInfo();
		 * 
		 * body.height = 190; body.weight = 40;
		 * 
		 * e1.bodyinfo = body; //e1의 bodyinfo
		 */		
		
		emp.bodyinfo = new BodyInfo(); //위와 같은 코드와 똑같지만, 참조변수가 없다.
		emp.bodyinfo.height = 190;
		emp.bodyinfo.weight = 40;
		
		System.out.println(emp + "/" + emp.bodyinfo);
		System.out.println(emp.empno + "/" + emp.bodyinfo.height);
		System.out.println(emp.name + "/" + emp.bodyinfo.weight);
		
	}
	
}
