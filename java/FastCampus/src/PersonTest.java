
public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(40);
		person.setName("James");
		person.setMarried(true);
		person.setNumberOfChildren(3);
		
		System.out.println("나이 : "+person.getAge());
		System.out.println("이름 : " + person.getName());
		System.out.println("결혼 : " + person.isMarried());
		System.out.println("아이 : " + person.getNumberOfChildren());
		
		
	}
}
