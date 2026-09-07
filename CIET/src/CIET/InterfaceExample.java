/*

package CIET;
interface Animal {
	void sound();
}
class Dog implements Animal {
	public void sound() {
		System.out.println("Dog Barks!");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
	}
}


//default method inside an interface 

package CIET;
interface Animal {
	void sound();
	default void stop() {
		System.out.println("Animal stops when it human comes infront off them!");
	}
}
class Dog implements Animal {
	public void sound() {
		System.out.println("Dog Barks!");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		d.stop();
	}
}

//o/p:-
//Dog Barks!
//Animal stops when it human comes infront off them!

//static method inside an interface

package CIET;
interface Calculate {
	static int square(int n) {
		return n*n;
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		int d=Calculate.square(12);
		System.out.println(d);
	}
}

*/