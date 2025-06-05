package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

	private String name;
	private int age;
	private String studentId;
	private List<String> courses;

	public Student(String name, int age, String studentId) {
		super();
		if (validateAge(age) && validateName(name) && validateStudentId(studentId)) {
			this.age = age;
			this.name = name;
			this.studentId = studentId;
			courses = new ArrayList<String>();
		}
	}

	public void enrollCourse(String course) {
		if (validateCourses(course)) {
			if (!courses.contains(course)) {
				courses.add(course);
				System.out.println("Student is enrolled to " + courses + " Successfully!!");
			} else
				System.out.println("Student is alrady enrolled for the course " + courses);
		}
	}

	public void printStudenInfo() {
		System.out.println("===========Student Information=========");
		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
		System.out.println("Student Student ID : " + studentId);
		System.out.println("Enrolled for : " + courses);
	}

	// Validations

	public boolean validateAge(int age) {
		if (age > 19 && age < 35)
			return true;
		else
			System.out.println("Invalid age, the age should be between 19 and 35!! ");
		return false;

	}

	public boolean validateName(String name) {
		String nameRegex = "^[a-zA-Z\\s]+$";
		Pattern namePattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = namePattern.matcher(name);
		if (nameMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invalid name please enter alphabets only!!");
			return false;
		}

	}

	public boolean validateStudentId(String studentId) {
		String studentIdRegex = "S-\\d+$";
		Pattern studentIdPattern = Pattern.compile(studentIdRegex);
		Matcher studenIdMatcher = studentIdPattern.matcher(studentId);

		if (studenIdMatcher.matches())
			return true;

		else {
			System.out.println("Invalid Student ID, use the correct format S-12345");
			return false;
		}
	}

	public boolean validateCourses(String course) {
		if (course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("DevOps") || course.equalsIgnoreCase("Python")
				|| course.equalsIgnoreCase("Selenium")) {
			return true;
		} else
			System.out.println("Invalid course name, please select cource from [Java, DevOps, Python, Selenium]");
		return false;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getStudentId() {
		return studentId;
	}

	public List<String> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}

}
