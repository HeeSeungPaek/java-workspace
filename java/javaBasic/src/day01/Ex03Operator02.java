package day01;

/*증감연산자
 * 증감연산자는 변수의 값을 1씩 더하거나 뺀다.
 * 전위나 후위에 따라 실행시점이 달라진다.
 * 1 증가 시킬 때는 ++
 * 1 감소 시킬 때는 --*/
public class Ex03Operator02 {
	public static void main(String[] args) {
		int number = 5;
		System.out.println("number의 현재값 : " + number);
		//만약 앞에 붙으면 실행순서는 가장 먼저가 된다
		System.out.println("number의 현재값 : " + ++number);
		//위 number의 값이 1 증가 되어 6이 되고 number 6이 출력됨.
		System.out.println("number의 현재값 : " + number);
		//위에서 먼저 number변수가 전위로 1값이 더해졌으므로 6이 출력됨.
		
		//반대로 증감연산자가 뒤에 붙는다면 실행순서는 나중이 된다.
		System.out.println("number의 현재값 : " + number++);
		//출력은 현재 6인 number가 출력되지만 실제 number에 저장된 값은 7
		System.out.println("number의 현재값 : " + number);
		//위의 출력문 시점에 와서야 7이 출력된다
	}
}
