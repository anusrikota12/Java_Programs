/*

//Arrays
//for knowing the class
package CIET;

public class Arrays {
	public static void main(String[] args) {
		int[] a=new int[5];
		System.out.println(a.getClass());
	}
}

o/p: class [I


//to check an array length-- length is a keyword and length() it is a method
 
package CIET;

public class Arrays {
	public static void main(String[] args) {
		int[] a=new int[5];
		System.out.println(a.length);
	}
}

package CIET;

public class Arrays {
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60;
		System.out.println(a[0]);
		//System.out.println(a[5]); //error-- arrayindexoutofbounds
	}
}


//array reference vs array object
 //for reference it gives priority

package CIET;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b=a;
		b[0]=12;
		System.out.println(a[0]);
	}
}

//clone method

package CIET;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b=a.clone();
		b[0]=12;
		System.out.println(a[0]);
		System.out.println(b[0]);
	}
}

o/p:- 10 12

*/






