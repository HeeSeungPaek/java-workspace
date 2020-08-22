import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		// 1. ��� 3���� ���弼��. ( ��, �迭�� ����ϼ��� )
		// 1000, ȫ�浿 / 2000, ������ / 3000, ������
		// ����� ������ ����� �̸��� ����϶�

		// ù ��° ��� == ��� �󵵰� ���� ����-------------------------------------------
		Emp[] emparr = { new Emp(1000, "ȫ�浿"), new Emp(2000, "������"), new Emp(3000, "������") };

		for (int i = 0; i < emparr.length; i++) {
			emparr[i].empInfoPrint();
		}

		Emp[] emplist3 = { new Emp(3, "�达"), new Emp(4, "ȫ��") };
		for (int i = 0; i < emplist3.length; i++) {
			emplist3[i].empInfoPrint();
		}

		// �� ��° ���--------------------------------------------------------------
		Emp[] emplist = new Emp[] { new Emp(1, "�̾�"), new Emp(2, "�ھ�") };
		for (int i = 0; i < emplist.length; i++) {
			emplist[i].empInfoPrint();
		}

		// 3��° ���---------------------------------------------------------------
		// ���ε��� �����ϰ� ���� �־��ִ� ��
		Emp[] emplist2 = new Emp[3];

		emplist2[0] = new Emp();
		emplist2[0].setEmpno(1000);
		emplist2[0].setName("ȫ�浿");

		emplist2[1] = new Emp();
		emplist2[1].setEmpno(2000);
		emplist2[1].setName("������");

		emplist2[2] = new Emp();
		emplist2[2].setEmpno(1000);
		emplist2[2].setName("������");

		// �׷� ������ for���� �������... ��ü �迭 ��µ� ������ for�� ����� �����ϴ�
		for (Emp value : emparr) {
			value.empInfoPrint();
		}

	}

}
