package nov19;


public class MainAppAnnonymous {


public static void main(String[] args) {
//Using Thread class
Thread tob = new Thread() {
public void run() {
System.out.println("Run method");
}
};
tob.start();


new Thread() {
public void run() {
System.out.println("Run method");
}
}.start();

//Using runnable

Runnable rob = new Runnable() {

@Override
public void run() {
System.out.println("Indide run method");

}
};
Thread t = new Thread(rob);
t.start();

new Thread(new Runnable() {

@Override
public void run() {
System.out.println("run method");

}
}).start();

}


}
