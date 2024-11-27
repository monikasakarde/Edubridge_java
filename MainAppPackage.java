package nov12;

class Student{
	int age;
	private int sid;
	public String sname;
	protected float sfees;
}


public class MainAppPackage {


	public static void main(String[] args) {
		Student sobj = new Student();
		//System.out.println(sobj.sid); //private sid cannot access from anotegr class
       System.out.println(sobj.age); //default can be accessed
       System.out.println(sobj.sname);
       System.out.println(sobj.sfees);
	}


}