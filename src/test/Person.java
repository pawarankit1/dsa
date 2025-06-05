package test;
public class Person {
    String name;
    int age;

    // Constructor 1
    Person() {
        this("Unknown", 0); // Calls Constructor 2
        System.out.println("Default constructor");
    }

    // Constructor 2
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor");
    }
    
    public static void main(String[] args) {
		Person p = new Person();
	}
}