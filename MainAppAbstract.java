package nov12;

abstract class MyClass{
	abstract void area();
	void display() {
		System.out.println("Display method");
	}
}


public class MainAppAbstract extends MyClass{
	@Override
	void area() {
		System.out.println("Area method");
	}
	public static void main(String[] args) {
		MainAppAbstract obj = new MainAppAbstract();
		obj.area();
		obj.display();
	}


}