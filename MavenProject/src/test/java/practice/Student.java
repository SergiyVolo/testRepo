package practice;

public class Student {

	public String name;
	public int age;
	public boolean isSmart;
	public double gpa;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void m1() {
		System.out.println("Student is studying");

	}
	
	public void m2() {
		System.out.println("Student passed the test");
		
	}
}
