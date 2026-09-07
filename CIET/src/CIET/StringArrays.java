/*

//converting arrays into strings and also using for each loop
package CIET;
import java.util.Arrays;
public class StringArrays {
	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,50};
		System.out.println(Arrays.toString(numbers));
		for(int i:numbers) {
			System.out.println(i);
		}
	}
}


//array sort

package CIET;
import java.util.Arrays;
public class StringArrays {
	public static void main(String[] args) {
		int numbers[]= {40,78,84,61,28,12};
		System.out.print("Array Before Sorting: ");
		System.out.println(Arrays.toString(numbers));
		System.out.print("Array After Sorting: ");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}

o/p:-
Array Before Sorting: [40, 78, 84, 61, 28, 12]
Array After Sorting: [12, 28, 40, 61, 78, 84]


//partial sorting
package CIET;
import java.util.Arrays;
public class StringArrays {
	public static void main(String[] args) {
		int numbers[]= {40,78,84,61,28,12};
		Arrays.sort(numbers,1,4);
		System.out.println(Arrays.toString(numbers));
	}
}


//Binary Search Method
package CIET;
import java.util.Arrays;
public class StringArrays {
	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,50,54,84,90};
		int target=54;
		int index=Arrays.binarySearch(numbers, target);
		System.out.println(index);
	}
}


//passing the array values to the another method

package CIET;
import java.util.Arrays;
public class StringArrays {
	static void printArray(int[] numbers) {
		for(int num:numbers) {
			System.out.println(num+" ");
		}
	}
	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,50};
		printArray(numbers);
	}
}


//**********varargs example it is important**********

package CIET;
import java.util.Arrays;
public class StringArrays {
	static int sum(int... numbers) {
		int total=0;
		for(int num:numbers) {
			total+=num;
		}
		return total;
	}
	public static void main(String[] args) {
		int[] numbers= {10,12,13,14,15,16};
		int a= sum(numbers);
		System.out.println(a);
	}
}

*/










































