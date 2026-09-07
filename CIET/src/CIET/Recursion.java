/*
package CIET;

public class Recursion {
	static void print(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n);
		print(n-1);
	}
	public static void main(String[] args) {
		print(5);
	}
} 
*/

package CIET;
public class Recursion {
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(factorial(6));
	}
}