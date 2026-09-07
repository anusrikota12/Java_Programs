
/*
//printing all the declaration types
package CIET;
import java.util.Scanner;
import java.util.Arrays;
public class StringsExamples {
	public static void main(String[] args) {
		String s1="Hello!";
		String s2=new String("Welcome!");
		char[] letter= {'j','a','v','a'};
		String s3=new String(letter);
		byte[] data= {65,78,85};
		String s4=new String(data);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}


//checking the 2 strings is equal or not
package CIET;
import java.util.Scanner;
import java.util.Arrays;
public class StringsExamples {
	public static void main(String[] args) {
		String s1="Hello!";
		String s2="Hello!";
		if(s1==s2) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals"); 
		}
	}
}


// here it is not equals because of we are creating new so the addresses is different
package CIET;
import java.util.Scanner;
import java.util.Arrays;
public class StringsExamples {
	public static void main(String[] args) {
		String s1="Hello!";
		String s2=new String("Hello!");
		if(s1==s2) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals"); 
		}
	}
}

//printing length,trim method--used for removing spaces ,and also concat

package CIET;
import java.util.Scanner;
import java.util.Arrays;
public class StringsExamples {
	public static void main(String[] args) {
		String s1="Hello".concat("Everyone!");
		String s2=" java python c ";
		int a=s1.length();
		String s=s2.trim();
		System.out.println(a);
		System.out.println(s);
		System.out.println(s1);
	}
}

o/p:-
14
java python c
HelloEveryone!

//lowercase and uppercase example

package CIET;
import java.util.Scanner;
import java.util.Arrays;
public class StringsExamples {
	public static void main(String[] args) {
		String s="hello Java";
		System.out.println(s.toUpperCase());
		String a="HELLO PYTHON";
		System.out.println(a.toLowerCase());
	}
}

o/p:-
HELLO JAVA
hello python

//taking input from the user by using next()


package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println(a);
	}
}

o/p:
	hello java
	hello

//taking input from the user by using next()

package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(a);
	}
}

o/p:
	hello java
	hello java


//replacing the string by using replace() method

package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		String a="Java C Python";
		String b=a.replace("Java","dart");
		System.out.println(b);
	}
}

o/p:- dart C Python

//contains--used for checking the string whether it is there in entire string or not
//startsWith-- used for to check whether the string starts with that or not

package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		String a="Java C Python";
		boolean b=a.contains("Java");
		boolean c=a.startsWith("Python");
		System.out.println(b);
		System.out.println(c);
	}
}

o/p:-
true
false


//equals() method example

package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		String a="java";
		String b=new String("java");
		System.out.println(a.equals(b));
	}
}

//true because here we use equals method


//equalsIgnoreCase()-- used for case sensitive

package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		String a="java";
		String b=new String("Java");
		System.out.println(a.equalsIgnoreCase(b));
	}
}

//true

package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		String a="java";
		String b=new String("JAVA");
		System.out.println(a.compareTo(b));
	}
}

o/p:-
32

// equals operator


package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		String a="java";
		String b=new String("java");
		System.out.println(a==b);
	}
}
//false operator--object reference

//concatenation
package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		String a="java";
		String b=a.concat("python");
		System.out.println(b);
		System.out.println(a);
	}
}
o/p:-
javapython

//substring() method example
package CIET;
import java.util.Scanner;
public class StringsExamples {
	public static void main(String[] args) {
		String a="java";
		String b=a.substring(0,2);
		System.out.println(b);
		System.out.println(a);
	}
}

*/


/*package CIET;

import java.util.Scanner;

public class StringExamples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		String result = "";
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch>='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			result=result+ch;
		}
		System.out.println(result);
		sc.close();
		
	}
} */

// o/p:SUNITHApackage


/*package CIET;

import java.util.Scanner;

public class StringsExamples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		String result = "";
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
			}
			result=result+ch;
		}
		System.out.println(result);
		sc.close();
		
	}
} 
*/ 
//o/p:ANUSRI

/*package CIET;

import java.util.Scanner;

public class StringsExamples {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		sb.append("java");
		System.out.println(sb);
	}
}
*/

/*package CIET;

import java.util.Scanner;

public class StringsExamples {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		sb.insert(5,"java");
		System.out.println(sb);
	}
}*/


/*package CIET;

import java.util.Scanner;

public class StringsExamples {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		sb.replace(1,3,"java");
		System.out.println(sb);
	}
}
*/

/* package CIET;

import java.util.Scanner;

public class StringsExamples {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		sb.reverse();
		System.out.println(sb);
	}
}
*/
























