
public class EX05_Operation {

	public static void main(String[] args) {
		int result = 100 / 100;
		System.out.println(result);

		result = 13 / 2; // �� ���´�.
		System.out.println(result);

		// �������� ���ϴ� ������ ( % )
		result = 13 % 2;
		System.out.println(result);

		// ���� ������ ( ++, -- ) 1�� ��,��
		int i = 10;
		++i; // ��ġ, ���� ����
		System.out.println("��ġ" + i);
		i++; // ��ġ, ���� ����
		System.out.println("��ġ" + i);

		// POINT (�����ڰ� ���յǸ� ��ġ�� ��ġ�� ��Ƴ���)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result2 : " + result2 + ", j2 : " + j2);

		result2 = i2 + j2++;
		System.out.println("result2 : " + result2 + ", j2 : " + j2);

		// byte b = 100;
		// byte c = 1;

		// byte d = (byte)(b+c); //�ս� - �ڹ��� ���������� int�׸��� �ְ� �����ϱ� ������ int�� �ְ�
		// ��������� �� b+c�� ���� ���� �׸��� byte�ȿ� �� �� ����.

		// Today's point
		// �ڹ��� ���� ��Ģ
		// ������ ��� ������ [int]Ÿ������ ��ȯ �� ó���Ѵ�(�� �Ʒ� �͵鸸)
		// byte + short => �����Ϸ��� int + int �ع�����
		// char + char => �����Ϸ��� int + int
		// ���� ó�� �� ���� ���꿡�� int���� ���� Ÿ���� ���� int�� ��ȯ (longŸ���� ����)
		// byte, char, short���� ���� �� int�� ��ȯ�ؼ� �����Ѵ�.

		// byte + short -> int + int
		// char + int -> int + int
		// int + long -> long + long!!

		// ���� + �Ǽ� > Ÿ���� ũ��� ������� �Ǽ��� ���󰣴�

		long ln = 10000000000L;
		float fl = 1.2f;
		// long lnresult = fl + ln;
		long lnresult = (long) (fl + ln);
		System.out.println("lnresult : " + lnresult);
		// �� �ڵ忡�� �Ҽ� �κ��� �ս��� �߻��Ѵ�.
		// �ս��� �������� ���� ū �׸����� ��´�.

		float num2 = 10.45f;
		int num3 = 20;
		// float + int > float + float
		float result5 = num2 + num3;
		System.out.println("result5: " + result5);

		// int result5 >> 30 ...

		char c2 = '!';
		char c3 = '"';
		int result6 = c2 + c3;
		System.out.println("result6: " + result6);
		System.out.println((char) result6);

		// ���
		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			// System.out.println("j : " + j);
			// sum += j;
			if (j % 2 == 0)
				sum += j;
		}
		System.out.println(sum);

		// ==������ (���� ���ϴ� ������)
		if (10 == 10.0f) { // Ÿ���� ������ �ʰ� ������ �����θ� ���Ѵ�.
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// ! ����������
		if ('A' != 65) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		// Today Point - ���� ������
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		System.out.println(result8);

		int score = 65;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : (score > 60) ? 'D' : 'F';
		System.out.println("������? : " + grade);

		// ����ǥ -> ������/ 0=false, 1=true
		/*
		 * OR(����||) AND(����&&) 0 0 0 0 0 1 1 0 1 0 1 0 1 1 1 1
		 * 
		 * Oracle(sql) select * from emp where empno = 1000 and sal > 2000 ((�Ѵ� ���ϋ�))
		 * 
		 * select * from emp where empno = 1000 and sal > 2000 ((�� �� �ϳ��� ���� ��))
		 * 
		 * ������(��Ʈ����) | or������ & and������
		 * 
		 * || or�������� && and��������
		 */
		int x = 3; // 0011
		int y = 5; // 0101
		System.out.println("x|y : " + (x | y)); // 0111

		// ������ -> 2����(0�� 1�� ǥ��)�� ��ȯ�Ѵ�.
		// 128 64 32 16 8 4 2 1 (8bit)
		// 0 0 1 1 >������ 3�� 2���� 0011
		// 0 1 0 1 >������ 5�� 2���� 0101
		// OR 0 1 1 1 >2���� 0111�� 10���� 7
		// ANd 0 0 0 1 >2���� 0001�� 10���� 1
		System.out.println("x&y : " + (x & y));

		// Today Point ( && (and), ||(or))
		// shortCuit >> �����ǿ��� �������� Ʋ���� �ڿ� ������ �˻����� �ʴ´�
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 ... 10��) {���๮}
		// if(10 > 0 || -1 > 1 && 100 > 2 && 1 > -1 ... 10��) {���๮}

		// switch case���� break�� ���� ������ �ƴϴ�.
		// �ʿ信 ���� ���������� (��Ȳ�� ����) ����ϴ°� = break;

		int data = 80;

		switch (data) {
		case 100:
			System.out.println("100�Դϴ�.");
			break;
		case 90:
			System.out.println("90�Դϴ�.");
			break;
		case 80:
			System.out.println("80�Դϴ�.");
			break;
		default:
			System.out.println("default");
		}

		System.out.println("=====");
		int data2 = 90;

		switch (data2) {
		case 100:
			System.out.println("100�Դϴ�.");
		case 90:
			System.out.println("90�Դϴ�.");
		case 80:
			System.out.println("80�Դϴ�.");
		default:
			System.out.println("default");
		}
		System.out.println("=====");

		// switch case���� break�� ��� ����
		int month = 5;
		String res = ""; // �� ���ڿ��� �ʱ�ȭ
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31"; // 1,3,5,7,8,10,12���� 31��
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30"; // 4,6,9,11���� 30��
			break;
		case 2:
			res = "29"; // 2���� 29��
			break;
		default:
			res = "�� �����Ͱ� �ƴմϴ�";
		}
		System.out.println(month + " ���� �ϼ��� " + res);
		// ǥ��ȭ��Ű�� �� -> �������̽���� �Ѵ�

		// ���� (������ : ������ ���Ⱚ)
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// ���� (package)
		// java.lang.Math (Math Ŭ����)
		// java �������� default�� �����ִ� ������ �ִ� (java.lang)
		// ����> import java.lang.*orƯ���ڿ��̸�;
		// Math Ŭ������ ������ �ִ� �ڿ� (static) : ��ü���� ���̵� ����� ������ �ڿ�!
		// Math.random()
		// a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		// ��� : double Ÿ���� �Ǽ� return, ���� ���� : 0.0 <= random < 1.0

		System.out.println("Math.random() :: " + Math.random());
		System.out.println("Math.random() * 10 :: " + ((Math.random() * 10)));
		System.out.println("(int)Math.random() * 10 :: " + ((int) (Math.random() * 10)));
		System.out.println("(int)Math.random() * 10 + 1 :: " + ((int) (Math.random() * 10) + 1));
		System.out.println("\n\n\n\n\n\n\n\n================================");
		   /*
        	������ Ǯ�� ������
        	--3�� �Ǵ� 2���� ���� Ǯ�����
        	--������ Ǫ�ø� ���ݱ��� ��� �� ���� �ϰ� ������ ����
        	�츮�� ��ȭ�� ��ǰ �ý����� ������� �Ѵ�
        	��ǰ �ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�
        	��ǰ ��÷�� 1000 ������ ������
        	��ǰ���� TV , NoteBook , ����� , �ѿ켼Ʈ , ����
        	��ǰ ��÷�� 900 ������ ������
        	��ǰ����  NoteBook , ����� , �ѿ켼Ʈ , ����
        	��ǰ ��÷�� 800 ������ ������
        	��ǰ����  ����� , �ѿ켼Ʈ , ����
        	��ǰ ��÷�� 700 ������ ������
        	��ǰ����  �ѿ켼Ʈ , ����
        	��ǰ ��÷�� 600 ������ ������
        	��ǰ����  ����
        	�׿� ������ 100 ~ 500 ������ ĩ�� 
        	��ǰ�ý����� ���� ������ 100 ~ 1000 ������ �����Ǿ� �ִ�
        	����ڰ� ��ǰ �ý����� ���� �����ϰ� 100 ~ 1000������ ���� ������ �Ǿ� �ֽ��ϴ�.
        
        */

		// ���� �Ǽ��� 10���Ͽ� 1���ڸ��� �����, ���ϱ� 100�Ͽ� int������ ĳ�����ϸ� 100�� �ڸ���
		// ���´�
		// 0���� �ȳ����� �ϱ� ���� ��� ��ȣ ġ�� 100�� �����ظ���, ��ȣ�� �����ʰ� ���ϸ� ���� �ڸ��� 00�� �ȵȴ�.
		
		
		
		int point = ((int) (Math.random() * 10) * 100) + 100;
		String present = "";
		switch (point) {
		case 1000:present += "TV ";
		case 900:present += "NoteBook ";
		case 800:present += "����� ";
		case 700:present += "�ѿ켼Ʈ ";
		case 600:present += "���� ";
			break;
		default:present += "ĩ��";
			}
		System.out.println("������� ���� : " + point + "\n��÷�� ��ǰ : " + present);

		
		String m = "k";
		String r = "";
		switch (m) { //���ǽĿ� ���ڿ� �Ǵ� �� ���� ����
		case "A":
		case "B":
		case "C":
		case "D":
		case "E":
		case "F":
		case "G":
			r = "ok";
			break;
		case "H":
		case "K":
			r = "no";
			break;
		default:
			System.out.println("�����Ͱ� �ƴմϴ�.");
		}
		System.out.println(r);
		
		
	}

}






