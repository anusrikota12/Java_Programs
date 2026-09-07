/*

//multiple inheritance using interface--imp

package CIET;
interface Animal {
	void eat();
}
interface Dog {
	void barks();
}
class Cat implements Animal, Dog {
	public void eat() {
		System.out.println("Animal Eats");
	}
	public void barks() {
		System.out.println("Dog barks");
	}
}
public class MultipleInheritanceInterface {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.barks(); 
	}
}

*/