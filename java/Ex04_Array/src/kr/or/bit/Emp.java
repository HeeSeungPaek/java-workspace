package kr.or.bit;

//사원 정보를 담을 수 있는 설계도
//사원은 사번, 이름을 가지고 있다
public class Emp {
	private int empno;
	private String name;

	public Emp() {

	}

	public Emp(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void empInfoPrint() {
		System.out.println(this.empno + "/" + this.name);
	}
}
