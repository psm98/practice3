package classpart;

public class PersonEx1Test {

	public static void main(String[] args) {
		PersonEx1 person = new PersonEx1();
		person.age=40;
		person.name="James";
		person.isMarried=true;
		person.children=3;
		
		System.out.println("���� : "+person.age);
		System.out.println("�̸� : "+person.name);
		System.out.println("��ȥ ���� : "+person.isMarried);
		System.out.println("�ڳ� �� : "+person.children);

	}

}
