/*

package CIET;
interface Calculator {
	int add(int a,int b);
}
public class LambdaExpression {
	public static void main(String[] args) {
		Calculator c=(a,b)->a+b;
		int result=c.add(10, 20);
		System.out.println(result);
		System.out.println(c.add(30, 30));
	}
}


//o/p:-
//30
//60



//lambda expression with one parameter

package CIET;
interface Message {
	void show(String msg);
}
class LambdaExpression {
	public static void main(String[] args) {
		Message m=msg->System.out.println(msg);
		m.show("Hello");
	}
}

//o/p:-
//Hello



package CIET;
interface Calculator {

	int add(int a,int b);
}
public class LambdaExpression {
	public static void main(String[] args) {
		Calculator c=(a,b)->{
			int result=a+b;
			return result;
		};
		int result=c.add(40, 60);
		System.out.println(result);
	}
}

//o/p:-
//100



package CIET;
@FunctionalInterface
interface Greeting {
	void sayHello();
}
public class LambdaExpression {
	public static void main(String[] args) {
		Greeting g=()->System.out.println("Hello!");
		g.sayHello();
	}
}

//o/p:-
//Hello!

*/