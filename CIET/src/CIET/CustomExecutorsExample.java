/*

package CIET;
import java.util.concurrent.*;
public class CustomExecutorsExample {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		CompletableFuture<Integer> future=CompletableFuture.supplyAsync(() -> {
			System.out.println("Running in "+Thread.currentThread().getName());
			return 100;
		},executor);
		future.thenApply(value->value+50).thenAccept(result -> {
			System.out.println("Result = "+result);
		}).join();
		executor.shutdown();
	}
}


//o/p:-
//Running in pool-1-thread-1
//Result = 150

*/