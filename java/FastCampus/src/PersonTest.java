
public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(40);
		person.setName("James");
		person.setMarried(true);
		person.setNumberOfChildren(3);
		
		System.out.println("���� : "+person.getAge());
		System.out.println("�̸� : " + person.getName());
		System.out.println("��ȥ : " + person.isMarried());
		System.out.println("���� : " + person.getNumberOfChildren());
		
		
	}
}
