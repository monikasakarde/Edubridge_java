package nov12;
class MyStaticClass1{
	static int i;
	int j; 
	
	MyStaticClass1(){
		i++;
		j++;
		System.out.println("Static i="+i);
		System.out.println("Non static data j="+j);
	}
	 
	static void staticMethod() {
		System.out.println(i); //static method can access static data
	//	System.out.println(j);//non static data cannot be accessed error
	}
}


public class MainAppStaticMethod1 extends MyStaticClass1{
    static void staticMethod() {
    	System.out.println("static method of MainAppStaticMethod");
        // super.staticMethod(); //we cannot override static method
    }
	
	public static void main(String[] args) {
		MyStaticClass1.staticMethod();
		MyStaticClass1 obj1 = new MyStaticClass1();
		MyStaticClass1 obj2 = new MyStaticClass1();




	}


}