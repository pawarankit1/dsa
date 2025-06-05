package Assignment;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Ankit", 34 , "S-1212");
		s1.enrollCourse("Java");
		s1.enrollCourse("Devops");
		s1.enrollCourse("C++");
		System.out.println(s1);
		s1.printStudenInfo();
		
		Student s2 = new Student("Priya", 21 , "S-2222");
		s2.enrollCourse("Java");
		s2.enrollCourse("Devops");
		s2.enrollCourse("Selenium");
		System.out.println(s2);
		s2.printStudenInfo();
		
		Student s3 = new Student("Riya", 30 , "S-2323");
		s3.enrollCourse("Java");
		System.out.println(s3);
		s3.printStudenInfo();
		
		

	}

}
