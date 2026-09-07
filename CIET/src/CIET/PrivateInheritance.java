/*


//with private

package CIET;
class Parent {
	private int x=12;
}
class Child extends Parent {
	void show() {
		System.out.println(x);
	}
}
public class PrivateInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}
}

o/p:-
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The field Parent.x is not visible
	


//without private

package CIET;
class Parent {
	int x=12;
}
class Child extends Parent {
	void show() {
		System.out.println(x);
	}
}
public class PrivateInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}
}


//o/p:- 12



//to print by using private keyword we eed to use get() method.

package CIET;
class Parent {
	private int x=12;
	public int get() {
		return x;
	}
}
class Child extends Parent {
	void show() {
		System.out.println(get());
	}
}
public class PrivateInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}
}


//o/p:- 12

*/