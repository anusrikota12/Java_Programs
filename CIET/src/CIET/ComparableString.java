package CIET;
import java.util.*;
class Student implements  Comparable<Student> {
	String name;
	Student(String name) {
		this.name=name;
	}
	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
	public String toString() {
		return name;
	}
}
public class ComparableString {
	public static void main(String[] args) {
		List<Student> s=new ArrayList<>();
		s.add(new Student("Anu"));
		s.add(new Student("Sri"));
		s.add(new Student("Sunny"));
		s.add(new Student("Bujji"));
		s.add(new Student("Sweety"));
		System.out.println("----Before Sorting----");
		System.out.println(s);
		Collections.sort(s);
		System.out.println("----After Sorting----");
		System.out.println(s);
		
	}
}


//o/p:-
//----Before Sorting----
//[Anu, Sri, Sunny, Bujji, Sweety]
//----After Sorting----
//[Anu, Bujji, Sri, Sunny, Sweety]
