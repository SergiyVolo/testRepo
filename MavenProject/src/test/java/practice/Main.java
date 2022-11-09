package practice;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("John", 18);
		System.out.println(student1.name);
		student1.m1();
		System.out.println("confict with other codes");
		student1.m2();
		student1.isSmart = true;

	}

}
