/*
package CIET;
public class MethodOverloading {
	void add(int a) {
		System.out.println(a);
	}
	void add(double a) {
		System.out.println(a);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.add(2);
		mo.add(1.9);
		mo.add(4,8);
		mo.add(2,8.2);
	}
}
*/
package CIET;
public class MethodOverloading {
	void calculateArea(int s){
		System.out.println("Area of Square: "+s*s);
	}
	void calculateArea(int l, int w) {
		System.out.println("Area of Rectangle: "+l*w);
	}
	void calculateArea(double area) {
		double a=Math.PI * area * area;
		System.out.println("Area of Circle: "+a);
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.calculateArea(6);
		mo.calculateArea(22,15);
		mo.calculateArea(6.6);
	}
}