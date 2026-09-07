/*

//super keyword is used to get the value from parent class
package CIET;
class Parent {
	int x=10;
}
class Child extends Parent {
	int x=20;
	void show() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}
}


//o/p:-
//20
//10


package CIET;
class Parent {
	void display() {
		System.out.println("Inside Parent Class");
	}
}
class Child extends Parent {
	@Override
	void display() {
		System.out.println("Inside Child Class");
		super.display();
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
	}
}

o/p:-
Inside Child Class
Inside Parent Class




package CIET;
class Parent {
	Parent() {
		System.out.println("Inside Parent Constructor");
	}
	void son() {
		System.out.println("Inside Son");
	}
}
class Child extends Parent {
	Child() {
		super();
		System.out.println("Inside Child Constructor");
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		 Child c=new Child();
	}
}


o/p:
	Inside Parent Constructor
	Inside Child Constructor

*/



