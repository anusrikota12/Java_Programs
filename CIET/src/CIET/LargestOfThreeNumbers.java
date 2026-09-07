package CIET;
import java.util.Scanner;
public class LargestOfThreeNumbers {
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
