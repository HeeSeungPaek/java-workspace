import java.util.Scanner;

public class Ex07_Printf_format {

	public static void main(String[] args) {
		//System.out.println()
		//C# : Console.WriteLine()
		System.out.println();//�ٹٲ�
		System.out.print("A");
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num ����" + num);
		//���� format Ʋ
		
		System.out.printf("num���� %d\n",num);
		//format ���Ĺ��� 
		//%d : 10���� >> d �ڸ���
		//%f : �Ǽ� >> f�ڸ���
		//%s : ���ڿ�
		//%c : ����
		//\t \n
		System.out.printf("num���� [%d] �Դϴ�. �׸��� [%d] �� �־�� \n",num,12345);
		
		float f = 3.14f; //f�� ���̴� ���� -> �ڹٴ� double�� �Ǽ� �⺻��
		System.out.println(f);
		System.out.printf("f������:%f\n",f);
		
		//�Է��� �޴µ� (console (cmd)) ����ڰ� �Է��� ���� ...
		Scanner sc = new Scanner(System.in); //Listener
		
		//��Ʈ�� ����Ʈ o -> import �ڵ� ����
		
		//System.out.println("���� �Է��ϼ���"); 
		//String value = sc.nextLine(); //�Է��ϰ� ���� ĥ ������ ����ϴٰ� �Է°��� ���ڿ��� �����ϴ� �Լ� -> nextLine()�޼ҵ�
		//System.out.println(value);
		
		//int number = sc.nextInt();
		//float number = sc.nextFloat();
		//System.out.println(number);
		//������� : nextInt nextFloat ���ٴ� nextLine() read

		//***Today Point***
		// [���ڸ�] -> [���ڷ�](����, �Ǽ�) ��ȯ�� �����ϴ�!
		//Wrapper Class -> ���� ������Ÿ���� ���� ������ Ŭ������ ������ �ִ�.
		//Integer.parseInt("11"); >>���������� ��ȯ���ش�.
		//Float.parseFloat(s) >>�Ǽ��� ��ȯ
		
		System.out.println("���� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine()); // �Է��� ���ڸ� ���ڷ� ��ȯ�Ѵ�!
		System.out.println("���� �� : " + number);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
