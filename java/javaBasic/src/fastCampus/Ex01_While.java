package fastCampus;

public class Ex01_While {
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		//while���� ���ǽ��� ���� ���� ����ȴ�
		//�ٸ� ����, ���ǽ��� ������ �Ǵ� ����! �������´�~
		while(num <=10) {
			sum += num;
			num++; //num�� 11�� �Ǵ� ���� �������´�. 10������ ���ư���.
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
