/*
package CIET;

public class Cse {
	public static void main(String args[]) {
		System.out.println("Hello!");
	}
}



// local variable example


package CIET;

public class Cse {
	public static void main(String args[]) {
		int age=19;
		String name="Anu Sri";
		System.out.println("Age :"+age);
		System.out.println("Name :"+name);
	}
}
 

//Global (or) Inatace Variable example

package CIET;

public class Cse {
	String name;
	int age;
	public static void main(String args[]) {
		Cse a=new Cse();
		a.name="Anu";
		a.age=19;
		System.out.println("Name :"+ a.name);
		System.out.println("Age :"+ a.age);
	}
}



//default values for global variables there is no default value for local variables

package CIET;

public class Cse {
	byte b;
	short c;
	int d;
	long e;
	float f;
	double g;
	char ch;
	String s;
	public static void main(String args[]) {
		Cse a=new Cse(); 
		System.out.println("Byte:"+a.b);
		System.out.println("Short:"+a.c);
		System.out.println("Int:"+a.d);
		System.out.println("Long:"+a.e);
		System.out.println("Float:"+a.f);
		System.out.println("Double:"+a.g);
		System.out.println("String:"+a.ch);
		System.out.println("String:"+a.s);
	}
}


//static keyword example

package CIET;

public class Cse {
	static String college="CIET Guntur";
	String name;
	int age;
	public static void main(String args[]) {
		Cse student1=new Cse();
		Cse student2=new Cse();
		student1.name="Sunitha";
		student1.age=20;
		student2.name="Manisha";
		student2.age=19;
		System.out.println("Student1 Name:"+student1.name);
		System.out.println("Student1 Age:"+student1.age);
		System.out.println("Student1 College Name:"+student1.college);
		System.out.println("Student2 Name:"+student2.name);
		System.out.println("Student2 Age:"+student2.age);
		System.out.println("Student2 College Name:"+student2.college);
	}
}

//arithmetic operator

package CIET;

public class Cse {
	public static void main(String args[]) {
		byte a=15;
		byte b=2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}


//relational operator

== equal to
!= not equal
>greater than
<lessthan 
>=greater than or equal to
<=lessthan or equal to


package CIET;

public class Cse {
	public static void main(String args[]) {
		byte a=23;
		byte b=15;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
}


//Assignment operator

package CIET;

public class Cse {
	public static void main(String args[]) {
		byte a=15;
		byte b=2;
		System.out.println(a=b);
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
	}
}

 

//pre-increment and post increment

package CIET;

public class Cse {
	public static void main(String args[]) {
		int a=12;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
	}
}


//pre-decrement and post-decrement operator 

package CIET;

public class Cse {
	public static void main(String args[]) {
		int a=12;
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
	}
}



//swapping using 3(temp) variable

package CIET;

public class Cse {
	public static void main(String args[]) {
		int a=10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping_a: "+a);
		System.out.println("After Swapping_b: "+b);
		
	}
}


// swapping using 3rd variable by taking input from user

package CIET;
import java.util.Scanner;
public class Cse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value: ");
		int a=sc.nextInt();
		System.out.println("Enter B value: ");
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping A value: "+a);
		System.out.println("After Swapping B value: "+b);
		
	}
}



//Swapping using without 3(temp) varibale

package CIET;

public class Cse {
	public static void main(String args[]) {
		int a=12;
		int b=9;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping_a: "+a);
		System.out.println("After Swapping_b: "+b);
		
	}
}



// swapping without using 3rd variable by taking input from user

package CIET;
import java.util.Scanner;
public class Cse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value: ");
		int a=sc.nextInt();
		System.out.println("Enter B value: ");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping A value: "+a);
		System.out.println("After Swapping B value: "+b);
		
	}
}



// if-else conditions example program for voterid application

package CIET;

public class Cse {
	public static void main(String args[]) {
		int a=17;
		if(a>=18) {
			System.out.println("Can Apply");
		}
		else {
			System.out.println("Cannot Apply");
		}
		
	}
}


//write a java program to check the given number is even or odd
package CIET;
import java.util.Scanner;
public class Cse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Even Number!");
		}
		else {
			System.out.println("Odd Number!");
		}
		
	}
}

// if else if (nested if) example
package CIET;
import java.util.Scanner;
public class Cse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks: ");
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Grade B");
		}
		else if(marks>=75) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
	}
}

//switch case

package CIET;
import java.util.Scanner;
public class Cse{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a day");
		int day=s.nextInt();
		    switch(day) {
		        case 1:
		        	System.out.println("Monday");
		        	break;
		        case 2:
		        	System.out.println("Tuesday");
		        	break;
		    }
		
	}
}


//for loop example

package CIET;
public class Cse{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("Anu Sri");
		}
	}
}



//while loop example

package CIET;
public class Cse{
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			System.out.println("ciet");
			i++;
		}
	}
}


//largest of 3 members

package CIET;
import java.util.Scanner;
public class Cse{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
		System.out.println("Enter the third number");
		int c=s.nextInt();
		if(a>=b && a>=c) {
			System.out.println("largest a:" + a);
		}
		else if(b>=a && b>=c) {
			System.out.println("largest b:" + b);
		}
		else {
			System.out.println("largest c:" + c);
		}
	}
}


//fibonacci series program

package CIET;
import java.util.Scanner;
public class Cse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print("Fibonacci Series: ");
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}


//for knowing the class
package CIET;
public class Cse {
	public static void main(String[] args) {
		int[] a=new int[5];
		System.out.println(a.getClass());
	}
}

o/p: class [I


//to check an array length-- length is a keyword and length() it is a method

package CIET;
public class Cse {
	public static void main(String[] args) {
		int[] a=new int[5];
		System.out.println(a.length);
	}
}

*/
























