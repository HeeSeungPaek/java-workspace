import kr.or.bit.Mouse;
import kr.or.bit.NoteBook;

public class Ex03_MethodCall {
	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		notebook.color = "red"; //public �ڿ��� �ٷιٷ� �� �� �ִ�.
		System.out.println("color : " + notebook.color);
		
		
		
		notebook.setYear(-2); //�����Ҵ�
		int result = notebook.getYear();
		System.out.println("result : " + result);
		
		Mouse mouse = new Mouse();
		Mouse mouse2 = notebook.handle(mouse);
		
		System.out.println(mouse2.x);
		System.out.println(mouse2.y);
		
		System.out.println(mouse==mouse2);
		
	}
}
