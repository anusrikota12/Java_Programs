/*

//using filter and collectors to print even numbers

package CIET;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StreamAPIExample {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(10,15,20,25,30);
		List<Integer> evennum=num.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		System.out.println(evennum);
	}
}


//o/p:-
//[10, 20, 30]







//converting it into upppercase by using map()

package CIET;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StreamAPIExample {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Anu","Sri","Bujji");
		List<String> result=names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}


//o/p:-
//[ANU, SRI, BUJJI]





//Write a Java program using the Stream API to process a list of names.Perform the following operations:
//
//Filter names whose length is greater than 4.
//Convert the remaining names to uppercase.
//Sort the names in alphabetical order.
//Store the result in a new List<String>.
//Print the final list.


package CIET;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StreamAPIExample {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Amit","Rahul","Sneha","Pallavi","Raj");
		List<String> result=names.stream()
				.filter(name->name.length()>4)
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}


//o/p:-
//[PALLAVI, RAHUL, SNEHA]



package CIET;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StreamAPIExample {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(20,48,56,10,85,9,10);
		List<Integer> result=num.stream()
				.distinct()
				.filter(n->n>10)
				.sorted((a,b)->b-a)
				.limit(3)
				.collect(Collectors.toList());
		int sum=result.stream()
				.reduce(0, Integer:: sum);
		System.out.println(result);
		System.out.println("Sum = "+sum);
	}
}


//o/p:-
//[85, 56, 48]
//Sum = 189



package CIET;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StreamAPIExample {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Amit","Rahul","Anu","Sri","Arun","Arjun","Aarav");
		List<String> result=names.stream()
				.filter(name->name.startsWith("A"))
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}


//o/p:-
//[AARAV, AMIT, ANU, ARJUN, ARUN]

 
*/
