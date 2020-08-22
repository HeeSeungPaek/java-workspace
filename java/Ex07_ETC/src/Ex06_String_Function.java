import java.util.StringTokenizer;

/*
Method of String class
	concat() : ���� ���ڿ��� ���ϴ� ���ڿ� �߰� return String
	contains() : ���ϴ� ���ڿ��� �ִ��� �˻� return boolean
	length() : ���ڿ� ���� return int
	indexOf() : ������ ���� ��ġ��(������ -1 ����)
	lastIndexOf() : ���ڰ� ���Ե� ���ڿ��� �� ��ȣ ����
	substring(int) : int�� ���� ���
	substring(int , int) : inclusive int ~ exclusive int ���

 */
public class Ex06_String_Function {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);

		boolean bo = str.contains("ell");
		System.out.println(bo);

		String str2 = "a b c d"; // [a][ ][b][ ][c][ ][d];
		System.out.println(str2.length());

		String filename = "hello java world"; // [h][e][l][l][o][ ][j][a][v][a][ ][w][o][r][l][d]
		System.out.println(filename.indexOf("h"));
		System.out.println(filename.indexOf("java")); // �ܾ��� ���� ��ġ��
		System.out.println(filename.indexOf("������")); // -1 -> �迭�� ÷�ڴ� 0���� �����ϴµ� 0�̾ƴ� ù���� �� = �迭�� ���ٴ� ��!

		// �Ź��� �缳�� �˻��Ѵ�.. �����̶� �ܾ� �ִ��� ã��ʹ�
		// indexOf : ���� ���ϴ� ���ڿ��� ���ԵǾ� �ִ��� - 0���� ū���̸� �ּ��� �������ϴ� ���ڿ� �Ѱ����� �����ϰ� �ִ�.

		// -1�� �ƴ϶�� �ּ��� ���� ���ϴ� �� ���ڰ� �� ��Ʈ���� �Ѱ����� ���ԵǾ� �ִ�!
		if ((filename.indexOf("wo")) != -1) {
			System.out.println("wo �ϳ��� ������ �ֳ׿�");
		}

		System.out.println(filename.lastIndexOf("a"));

		// length(), indexOf(), substring(), replace(), split() �ھ�..
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(2, 3)); // �ᱹ �ڱ��ڽ� //p
		// beginIndex - the beginning index, inclusive. : ���� index ���� ����
		// endIndex - the ending index, exclusive. : �� index ����(-1)����

		System.out.println(result.substring(0, 0)); // (0,-1) -> �ƹ��͵� �ȳ���
		System.out.println(result.substring(0, 1)); // (0, 0) -> s
		System.out.println(result.substring(1, 1)); // (1,0) -> �ȳ���

		// Quiz
		String filename2 = "aaaa.zip"; // �Ǵ� hong.png �Ǵ� h.jpeg
		// ���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ����ϼ���.
		boolean split = filename2.contains(".");
		System.out.println(split);

		/*
		 * String first = ""; String second = ""; second =
		 * filename2.substring(filename2.indexOf(".")); System.out.println(second);
		 * 
		 * first = filename2.substring();
		 */

		// �������� ã�ƶ�
		int position = filename2.indexOf("."); // ���� ã�� ��ġ������ int position
		String file = filename2.substring(0, position); // filename2.length() -> 8
		// (4+1), 8
		String extention2 = filename2.substring(position + 1, filename2.length()); // ?

		String extention = filename2.substring(++position);

		System.out.println("file : " + file);
		System.out.println("extension : " + extention);
		System.out.println("extension 2 : " + extention2);

		// replace(ġȯ�Լ�)
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDDD", "������ �����");
		System.out.println(result3);

		result3 = str3.replace("A", "a");
		System.out.println(result3);

		// ETC
		System.out.println(str3.charAt(0)); // ���° ����
		System.out.println(str3.charAt(3));
		System.out.println(str3.endsWith("DDDA")); // true
		System.out.println(str3.endsWith("DDD")); // ���� �������� boolean type return -> false
		System.out.println(str3.equalsIgnoreCase("abcdADDDDDA")); // case sensetive ��ҹ��� ���� ����

		// Today Point (Split) - ������
		// String str4 = "���۸�,��Ƽ,�����,������,������";
		// String[] namearray = str4.split(",");

		String str4 = "���۸�.��Ƽ.�����.������.������";
		String[] namearray = str4.split("\\.");
		for (String s : namearray) {
			System.out.println(s);
		}

		/*
		 * .(��) >> ����ǥ���� ���� >> .�� ���� �״�� ��������! >> escape���� \ + \. >> \\.
		 * 
		 * �������� ����ǥ���� (�� ����, �ؼ��� �츮�� �ؾ��Ѵ� - 5����)
		 * https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
		 * 
		 * https://regexr.com/ -> �����ϴ� ����Ʈ ����ǥ����(regex)ǥ�� (java, javascript, Oracle, c#)
		 * �������� ��Ģ ��� ���ڸ� ���� �� [��Ģ]�� �ο� >> ��ȿ�� �Ǵ� �ٰ� - �ֹι�ȣ : ���� 6�ڸ� - ���� 7�ڸ�
		 * {\d6}-{\d7} �� ��Ģ�� �´��� ���� �ʴ���-> true - 12345-1234567 -> false - ����ȣ, ������ȣ,
		 * �����ȣ, ������ �ּ�, �̸��� �ּ� ���� ������ �� �ִ� ���� ǥ������ �����ڵ��� �� ��������...
		 * 
		 */
		String filename3 = "bit.hwp";
		// split ����ؼ� ���ϸ�� Ȯ���ڸ� ����غ�����.

		String[] namearray2 = filename3.split("\\.");
		String file2 = namearray2[0];
		String ext = namearray2[1];

		System.out.println(file2);
		System.out.println(ext);

		for (String s : namearray2) {
			System.out.println(s);
		}

		// split ����� �Ұ��ϱ⿡ ������ Ŭ������ �ʿ��ϴ�. �� �� ���� Ŭ������ StringTokenizer ����
		String str5 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str5, "/,-."); // ""���� ��� �� �����ڷ� ��������
		while (sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}

		// �ͼ���
		String str6 = "ȫ        ��                               ��";
		// ������ ���� ������ ���ŵ� "ȫ�浿"���� �����ϰ� �ʹ�!
		String[] namearray3 = str6.split(" ");
		System.out.println(str6.replace(" ", ""));

		String str7 = "            ȫ�浿                         ";
		System.out.println(">" + str7 + "<");
		// ���������ؼ� "ȫ�浿" ����ϰ� �ʹ�
		System.out.println(">" + str7.trim() + "<");

		String str8 = "             ȫ           ��            ��                     ";
		// ȫ�浿���� �������
		// String result5 = str8.replace(" ","");
		// String result6 = result5.trim(); //������ �ΰ�

		// ****************�������� �Լ��� �����Ҷ��� (Method Chain ���)�� ����Ѵ�.
		System.out.println(str8.trim().replace(" ", "").substring(2)); // ��
		System.out.println(str8.replace(" ", ""));

		// ---------------------------------
		// ���� Ǭ ����1,2
		// ---------------------------------Quiz-1
		int sum = 0;
		String[] numarr = { "1", "2", "3", "4", "5" };
		// �迭�� �ִ� ���ڵ鰪�� ���� sum������ ��Ƽ� ��� : ��� 15
		for (int i = 0; i < numarr.length; i++) {
			sum += Integer.parseInt(numarr[i]);
		}
		System.out.println("Quiz-1) String �迭�� �� : " + sum);

		// ---------------------------------Quiz-2
		String jumin = "123456-1234567";
		// �� �ֹι�ȣ�� ���� ���ϼ���
		String realjumin = jumin.replace("-", "");
		String[] juminarr = new String[13];
		int sum2 = 0;
		for (int i = 0; i < juminarr.length; i++) {
			juminarr[i] = realjumin.substring(i, i + 1);
			sum2 += Integer.parseInt(juminarr[i]);
		}
		System.out.println("Quiz-2) �ֹι�ȣ�� �� : " + sum2); // ������ ���

		// ---------------------------------Quiz-2_1)
		int sum3 = 0;
		for (int i = 0; i < realjumin.length(); i++) {
			sum3 += Integer.parseInt(realjumin.substring(i, i + 1));
		}
		System.out.println("Quiz-2_1) �ֹι�ȣ�� �� : " + sum3); // ���� ���� ���?

		/*
		 * //Quiz-2 String jumin="123456-1234567"; //�� �ֹι�ȣ�� ���� ���ϼ���_1 int sum2=0;
		 * for(int i = 0 ; i < jumin.length() ; i++) { String numstr =jumin.substring(i,
		 * i+1); if(numstr.equals("-")) continue; sum2+= Integer.parseInt(numstr); }
		 * System.out.println("�ֹι�ȣ ��:" + sum2);
		 * 
		 * //�� �ֹι�ȣ�� ���� ���ϼ���_2 //String jumin="123456-1234567"; String[] numarr2 =
		 * jumin.replace("-","").split(""); int sum3=0; for(String i : numarr2) { sum3+=
		 * Integer.parseInt(i); } System.out.println("�ֹι�ȣ ��2:" + sum3);
		 * 
		 * //�� �ֹι�ȣ�� ���� ���ϼ���_3 String jumin4 = jumin.replace("-", ""); int sum4=0;
		 * for(int i = 0 ; i < jumin4.length() ;i++) {
		 * sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i))); }
		 * System.out.println("�ֹι�ȣ ��4:" + sum4);
		 * 
		 * }
		 */
		// ---------------------------------------------------------------------------------------------------
		// ---------------------------------------------------------------------------------------------------
		// ---------------------------------------------------------------------------------------------------
	}

}
