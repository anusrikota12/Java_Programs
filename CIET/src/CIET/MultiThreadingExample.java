/*

package CIET;

public class MultiThreadingExample {
	public static void main(String[] args) {
		Thread t1=new Thread(()-> {
			System.out.println("Task 1 is Running!");
		});
		Thread t2=new Thread(()-> {
			System.out.println("Task 2 is Running!");
		});
		t1.start();
		t2.start();
	}
}


//o/p:-
//Task 1 is Running!
//Task 2 is Running!




package CIET;
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}
public class MultiThreadingExample {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
	}
}

//o/p:-
//Thread is running




package CIET;
class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Task is Running");
	}
}
public class MultiThreadingExample {
	public static void main(String[] args) {
		Thread t=new Thread(new MyThread());
		t.start();
	}
	
}



//o/p:-
//Task is Running




package CIET;
class MyThread  {
	Thread t=new Thread(()-> {
		System.out.println("Thread is Running!");
	});
	public void startMyThread() {
		t.start();
	}
}
class MultiThreadingExample {
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		mt.startMyThread();
	}
}

//op:- Thread is Running!


package CIET;
class MultiThreadingExample {
	public static void main(String[] args) {
		System.out.println("Task Started--");
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("--Task Completed!");
	}
}


//o/p:-
//Task Started--
//--Task Completed!



package CIET;
public class MultiThreadingExample {
	public static void main(String[] args) {
		Thread t1=new Thread(()-> {
			for(int i=1;i<=5;i++) {
				System.out.println("Thread-1: "+i);
			}
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println("Thread 1 is executed!");
		});
		Thread t2=new Thread(()-> {
			for(int i=1;i<=5;i++) {
				System.out.println("Thread-2: "+i);
			}
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println("Thread 2 is executed!");
		});
		t1.start();
		t2.start();
	}
}

//o/p:-
//
//Thread-2: 1
//Thread-2: 2
//Thread-2: 3
//Thread-2: 4
//Thread-1: 1
//Thread-1: 2
//Thread-1: 3
//Thread-2: 5
//Thread-1: 4
//Thread-1: 5
//Thread 1 is executed!
//Thread 2 is executed!
//



package CIET;
class MyThread extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
class MultiThreadingExample {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.setName("ANU");
		t2.setName("SRI");
		t1.start();
		t2.start();
	}
}

//o/p:-
//ANU 1
//SRI 1
//SRI 2
//SRI 3
//SRI 4
//SRI 5
//ANU 2
//ANU 3
//ANU 4
//ANU 5

*/





















































































































