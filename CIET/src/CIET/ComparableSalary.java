/*

package CIET;
import java.util.*;
class Employee implements Comparable<Employee> {
	String name;
	int salary;
	Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	public int compareTo(Employee other) {
		int result=Integer.compare(this.salary,other.salary);
		if(result!=0) {
			return result;
		}
		return this.name.compareTo(other.name);
	}
	public String toString() {
		return "Name: " +name+" , Salary: "+salary;
	}
}
public class ComparableSalary {
	public static void main(String[] args) {
		List<Employee> e=new ArrayList<>();
		e.add(new Employee("Anu",90000));
		e.add(new Employee("Sri",95000));
		e.add(new Employee("Bujji",50000));
		System.out.println("Before Sorting: ");
		for(Employee emp:e) {
			System.out.println(emp);
		}
		Collections.sort(e);
		System.out.println("\nAfter Sorting: ");
		for(Employee em: e) {
			System.out.println(em);
		}
	}
}


//o/p:-
//Before Sorting: 
//Name: Anu , Salary: 90000
//Name: Sri , Salary: 95000
//Name: Bujji , Salary: 50000
//
//After Sorting: 
//Name: Bujji , Salary: 50000
//Name: Anu , Salary: 90000
//Name: Sri , Salary: 95000

*/