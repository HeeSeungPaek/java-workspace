package kr.or.bit;

//�����͸� ���� �� �ִ� Ŭ����
//���� : DTO, VO, DOMAIN
//Data Transfer Object, Value Object, ������ ������ �մ� ��ü

public class Emp { // extends Object�� �����Ǿ��ִ°� ����?
					// Object �߿� toString�� �ִ�.
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

	// ����� �̸��� ����ϴ� �޼ҵ�....

	// toString : Object class�� ������ �ִ� �޼ҵ�
	// ���� ���(Object��)�� toString()�� �� ������� ����;�!
	// �ٵ� �� ���� �̷��� ������... �����ڶ�� ������ �� �˰� �ִ� �Լ��̱⿡..

	/*
	 * @Override public String toString() { return this.empno + "/" + this.ename;
	 * //���� ������ �ִ� ����ʵ� ���� ��°� ���������� ���ȴ� }
	 */
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
}
