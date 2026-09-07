/*

package CIET;
class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}
public class RuntimePolymorphism {
	public static void main(String[] args) {
		Animal d=new Dog();//for knowing we are using polymorphism concept here
		Animal c=new Cat();
		d.sound();
		c.sound();
	}
}

o/p:-
Dog Barks
Cat meows


//dynamic dispatch

package CIET;
class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}
public class RuntimePolymorphism {
	public static void main(String[] args) {
		Animal animal;
		animal=new Animal();
		animal.sound();
		animal=new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
	}
}


o/p:-
Animal makes sound
Dog Barks
Cat meows

*/