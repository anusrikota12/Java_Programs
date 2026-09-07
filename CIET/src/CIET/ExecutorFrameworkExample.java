/*

package CIET;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorFrameworkExample {
	public static void main(String[] args) {
		
		//create a thread pool with 3 threads
		ExecutorService executor=Executors.newFixedThreadPool(3);
		
		//submit task1
		executor.submit(()-> {
			System.out.println("Task 1 Executes by "+Thread.currentThread().getName());
		});
		
		//submit task2 
		executor.submit(()-> {
			System.out.println("Task 2 Executes by "+Thread.currentThread().getName());
		});
		
		//submit task 3
		executor.submit(()-> {
			System.out.println("Task 3 Executes by "+Thread.currentThread().getName());
		});
		
		//submit task4
		executor.submit(()-> {
			System.out.println("Task 4 Executes by "+Thread.currentThread().getName());
		});
		executor.shutdown();
	}
}

//o/p:-
//Task 3 Executes by pool-1-thread-3
//Task 1 Executes by pool-1-thread-1
//Task 2 Executes by pool-1-thread-2
//Task 4 Executes by pool-1-thread-2




package CIET;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyTask implements Runnable {
	private String taskName;
	MyTask(String taskName) {
		this.taskName=taskName;
	}
	public void run() {
		System.out.println(taskName+" "+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
public class ExecutorFrameworkExample {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		executor.execute(new MyTask("Task 1"));
		executor.execute(new MyTask("Task 2"));
		executor.execute(new MyTask("Task 3"));
		executor.shutdown();
	}
}


//o/p:-
//Task 2 pool-1-thread-2
//Task 1 pool-1-thread-1
//Task 3 pool-1-thread-2




package CIET;
import java.util.concurrent.*;
class ExecutorFrameworkExample {
	public static void main(String[] args) throws Exception{
		ExecutorService executor=Executors.newFixedThreadPool(2);
		Callable<Integer> task=()-> {
			System.out.println("Calculating...");
			Thread.sleep(2000);
			return 10+20;
		};
		Future<Integer> future=executor.submit(task);
		System.out.println("Task Submitting..");
		Integer result=future.get();
		System.out.println("Result = "+result);
		executor.shutdown();
	}
}


//o/p:-
//Task Submitting..
//Calculating...
//Result = 30

*/




