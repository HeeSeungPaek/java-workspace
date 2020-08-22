import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		// 1. 사원 3명을 만드세요. ( 단, 배열을 사용하세요 )
		// 1000, 홍길동 / 2000, 김유신 / 3000, 유관순
		// 만들고 각각의 사번과 이름을 출력하라

		// 첫 번째 방법 == 사용 빈도가 가장 높음-------------------------------------------
		Emp[] emparr = { new Emp(1000, "홍길동"), new Emp(2000, "김유신"), new Emp(3000, "유관순") };

		for (int i = 0; i < emparr.length; i++) {
			emparr[i].empInfoPrint();
		}

		Emp[] emplist3 = { new Emp(3, "김씨"), new Emp(4, "홍씨") };
		for (int i = 0; i < emplist3.length; i++) {
			emplist3[i].empInfoPrint();
		}

		// 두 번째 방법--------------------------------------------------------------
		Emp[] emplist = new Emp[] { new Emp(1, "이씨"), new Emp(2, "박씨") };
		for (int i = 0; i < emplist.length; i++) {
			emplist[i].empInfoPrint();
		}

		// 3번째 방법---------------------------------------------------------------
		// 따로따로 생성하고 값을 넣어주는 것
		Emp[] emplist2 = new Emp[3];

		emplist2[0] = new Emp();
		emplist2[0].setEmpno(1000);
		emplist2[0].setName("홍길동");

		emplist2[1] = new Emp();
		emplist2[1].setEmpno(2000);
		emplist2[1].setName("김유신");

		emplist2[2] = new Emp();
		emplist2[2].setEmpno(1000);
		emplist2[2].setName("유관순");

		// 그럼 개선된 for문을 배웠으니... 객체 배열 출력도 개선된 for문 사용이 가능하다
		for (Emp value : emparr) {
			value.empInfoPrint();
		}

	}

}
