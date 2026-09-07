/*

//sorting by marks

package CIET;
import java.util.*;
class EventDemo {
	String name;
	int marks;
	EventDemo(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return name+" "+marks;
	}
}
public class ComparatorExample {
	public static void main(String[] args) {
		List<EventDemo> s=new ArrayList<>();
		s.add(new EventDemo("Anu",84));
		s.add(new EventDemo("Sri",66));
		Comparator<EventDemo>byMarks=(s1,s2)-> Integer.compare(s1.marks, s2.marks);
		s.sort(byMarks);
		System.out.println(s);
	}
}


//
//o/p:-
//[Sri 66, Anu 84]




//sorting by string

package CIET;
import java.util.*;
class EventDemo {
	String name;
	int marks;
	EventDemo(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return name+" "+marks;
	}
}
public class ComparatorExample {
	public static void main(String[] args) {
		List<EventDemo> s=new ArrayList<>();
		s.add(new EventDemo("Anu",84));
		s.add(new EventDemo("Sri",66));
		Comparator<EventDemo>byName=(s1,s2)-> s1.name.compareTo(s2.name);
		s.sort(byName);
		System.out.println(s);
	}
}


//o/p:-
//[Anu 84, Sri 66]




package CIET;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class EventDemo implements Comparable<EventDemo> {
	String name;
	EventDemo(String name) {
		this.name=name;
	}
	public int compareTo(EventDemo other) {
		return this.name.compareTo(other.name);
	}
	public String toString() {
		return name;
	}
}
public class ComparatorExample {
	public static void main(String[] args) {
		List<EventDemo> e=new ArrayList<>();
		e.add(new EventDemo("Anu"));
		e.add(new EventDemo("Venkateswaramma"));
		e.add(new EventDemo("Sri"));
		
		System.out.println("Before Sorting: ");
		for(EventDemo emp:e) {
			System.out.println(emp);
		}
		Collections.sort(e);
		System.out.println("\n After Sorting: ");
		for(EventDemo emp:e) {
			System.out.println(emp);
		}
	}
}


o/p:-
Before Sorting: 
Anu
Venkateswaramma
Sri

 After Sorting: 
Anu
Sri
Venkateswaramma


*/