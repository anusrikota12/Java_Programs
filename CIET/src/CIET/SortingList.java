/*

package CIET;
import java.util.*;
class Student implements Comparable<Student> {
	String name;
	int marks;
	Student(int marks,String name) {
		this.marks=marks;
		this.name=name;
	}
	@Override
	public int compareTo(Student other) {
		return this.marks-other.marks;
	}
	public String toString() {
		return name+" "+marks;
	}
}
public class SortingList {
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(99,"Anu"));
		students.add(new Student(30,"Sri"));
		students.add(new Student(60,"Bujji"));
		students.add(new Student(45,"Sweety"));
		Collections.sort(students);
		System.out.println(students);
	}
}

//o/p:-
//[Sri 30, Sweety 45, Bujji 60, Anu 99]



package CIET;
import java.util.*;
class Student implements Comparable<Student> {
	String name;
	int marks;
	Student(int marks,String name) {
		this.marks=marks;
		this.name=name;
	}
	@Override
	public int compareTo(Student other) {
		return other.marks-this.marks;
	}
	public String toString() {
		return name+" "+marks;
	}
}
public class SortingList {
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(99,"Anu"));
		students.add(new Student(30,"Sri"));
		students.add(new Student(60,"Bujji"));
		students.add(new Student(45,"Sweety"));
		Collections.sort(students);
		System.out.println(students);
	}
}

//[Anu 99, Bujji 60, Sweety 45, Sri 30]

*/
