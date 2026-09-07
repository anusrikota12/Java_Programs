/*

//example for excepton handling error

package CIET;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
}


//o/p:-

//15
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at CIET/CIET.ExceptionHandling.main(ExceptionHandling.java:8)


.//try catch block

package CIET;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int result=12/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
	}
}


o/p:- Can't divide by zero



//catch with exception by zero

package CIET;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int result=12/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}

o/p:- / by zero

//used to trace the error

package CIET;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int result=12/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

/ by zero
java.lang.ArithmeticException: / by zero
	at CIET/CIET.ExceptionHandling.main(ExceptionHandling.java:70)


//multiple catch blocks

package CIET;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int arr[]= {10,20,30};
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

o/p:-

Index 5 out of bounds for length 3


//finally block

package CIET;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int arr[]= {10,20,30};
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Completed");
		}
	}
}

o/p:-
Index 5 out of bounds for length 3
Completed

//general example

package CIET;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int x=10/0;
			System.out.println("a");
		}
		catch(ArithmeticException e) {
			System.out.println("b");
		}
		finally {
			System.out.println("c");
		}
	}
}

o/p:-
b
c

//throw keyword

package CIET;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		int a=16;
		if(a<18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}
	}
}

o/p:-
Exception in thread "main" java.lang.IllegalArgumentException: Age must be 18 or above
at CIET/CIET.ExceptionHandling.main(ExceptionHandling.java:165)



//throws block

package CIET;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionHandling {
	public static void readFile() throws IOException {
		FileReader file=new FileReader("data.txt");
		System.out.println("File created");
		file.close();
	}
	public static void main(String[] args) throws IOException {
		readFile();
	}
}

//Exception in thread "main" java.io.FileNotFoundException: data.txt (The system cannot find the file specified)
//at java.base/java.io.FileInputStream.open0(Native Method)
//at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
//at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
//at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
//at java.base/java.io.FileReader.<init>(FileReader.java:60)
//at CIET/CIET.ExceptionHandling.readFile(ExceptionHandling.java:184)
//at CIET/CIET.ExceptionHandling.main(ExceptionHandling.java:189)

//creating the file

package CIET;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionHandling {
	public static void readFile() throws IOException {
		FileReader file=new FileReader("./data.txt");
		System.out.println("File created");
		file.close();
	}
	public static void main(String[] args) throws IOException {
		readFile();
	}
}

o/p:- File created

*/

package CIET;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionHandling {
	public static void readFile() throws IOException {
		FileReader file=new FileReader("./data.txt");
		BufferedReader reader=new BufferedReader(file);
		String line;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
		file.close();
	}
	public static void main(String[] args) throws IOException {
		readFile();
	}
}
































