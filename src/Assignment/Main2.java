package Assignment;
 
import java.util.ArrayList;
import java.util.List;

public class Main2 {
	
	private static List<Student> studentlist;

	public static void main(String[] args) {
		
		studentlist = new ArrayList<Student>();
		
		Student s1 = new Student("Ankit", 34 , "S-1212");
		s1.enrollCourse("Java");
		s1.enrollCourse("Devops");
		
		
		Student s2 = new Student("Priya", 21 , "S-2222");
		s2.enrollCourse("Java");
		s2.enrollCourse("Devops");
		s2.enrollCourse("Selenium");
		
		
		Student s3 = new Student("Riya", 30 , "S-2323");
		s3.enrollCourse("Java");
		
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3); 
		
		Student result = findStudentById("S-232");
		System.out.println(result );
		

	}
	
	public static Student findStudentById(String studentId) {
		Student result = null;
		
		try {
		result = studentlist.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
		.findFirst()
		.orElseThrow(() -> new RuntimeException("No data found"));
		}
		catch (RuntimeException e) {
			System.err.println("Student with ID " +studentId+ " not found!!");
		}
		
		return result;
	}

}
