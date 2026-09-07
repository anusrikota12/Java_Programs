/*

package CIET;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
public class BuiltinLambdaExpression {
	public static void main(String[] args) {
		Predicate<Integer> isEven=number->number%2==0;
		System.out.println("Predicate: ");
		System.out.println("10 is even: "+isEven.test(10));
		System.out.println("7 is even: "+isEven.test(7));
		Consumer<String> printName=name->System.out.println("Hello, "+name);
		System.out.println("\nConsumer: ");
		printName.accept("Anu Sri");
		Function<Integer,Integer> square= number->number*number;
		System.out.println("\nFunction: ");
		System.out.println("Square of 5: "+square.apply(5));
		System.out.println("Square of 10: "+square.apply(10));
		Supplier<String> message=()->"Hello from Supplier";
		System.out.println("\nSupplier: ");
		System.out.println(message.get());
	}
}

//o/p:-
//Predicate: 
//10 is even: true
//7 is even: false
//
//Consumer: 
//Hello, Anu Sri
//
//Function: 
//Square of 5: 25
//Square of 10: 100
//
//Supplier: 
//Hello from Supplier


*/