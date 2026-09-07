package CIET;
import java.util.Scanner;
public class AreaOfCircle {
	static double calculateArea(double area) {
		return Math.PI * area *area;
	}
	public static void main(String[] args) {
		double a=calculateArea(6);
		System.out.println(a);
	}
}
