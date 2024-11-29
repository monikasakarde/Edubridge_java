
package nov19;


class MyClass1 extends Thread{
public void run() {
for(int i=1;i<=5;i++) {
System.out.println("run method "+Thread.currentThread()+" "+i);
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}
public class MainAppRunnable {


public static void main(String[] args) throws InterruptedException {
System.out.println("JVM Thread "+Thread.currentThread());
MyClass1 obj = new MyClass1(); //new state
obj.setName("first");
System.out.println("Thread is alive or dead ="+obj.isAlive());
MyClass1 obj1 = new MyClass1();
obj1.setName("Second");
obj.start(); //runnable, after runnable when it starts running , it 
//is running state
System.out.println("Thread is alive or dead ="+obj.isAlive());
obj.join();
System.out.println("Thread is alive or dead ="+obj.isAlive());
obj1.start(); //Thread cannot be started more than once
//obj.start(); //shows java.lang.IllegalThreadStateException
}
}
