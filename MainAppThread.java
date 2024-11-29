package nov19;

		class MyClass extends Thread{
		public void run() {
		System.out.println("run method "+Thread.currentThread());
		}
		}

		public class MainAppThread {


		public static void main(String[] args) {
		System.out.println("JVM Thread "+Thread.currentThread());
		MyClass obj = new MyClass();
		obj.setName("first");

		MyClass obj1 = new MyClass();
		obj1.setName("Second");

		obj.start();
		obj1.start(); //Thread cannot be started more than once
		//obj.start(); //shows java.lang.IllegalThreadStateException
		}


		}
