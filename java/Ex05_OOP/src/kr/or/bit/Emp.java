package kr.or.bit;

//데이터를 담을 수 있는 클래스
//목적 : DTO, VO, DOMAIN
//Data Transfer Object, Value Object, 업무를 담을수 잇는 객체

public class Emp { // extends Object가 생략되어있는걸 알죠?
					// Object 중에 toString이 있다.
	private int empno;
	private String ename;

	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	// 사번과 이름을 출력하는 메소드....

	// toString : Object class가 가지고 있는 메소드
	// 내가 당신(Object꺼)의 toString()을 내 마음대로 쓰고싶어!
	// 근데 왜 굳이 이렇게 쓰느냐... 개발자라면 누구나 다 알고 있는 함수이기에..

	/*
	 * @Override public String toString() { return this.empno + "/" + this.ename;
	 * //내가 가지고 있는 멤버필드 값을 찍는게 범용적으로 사용된다 }
	 */
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
}
