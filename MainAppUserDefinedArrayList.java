package nov16;

import java.util.ArrayList;
import java.util.Iterator;


class Student{
private int sid;
private String sname;
private float sfees;

public Student() {
super();
// TODO Auto-generated constructor stub
}


public Student(int sid, String sname, float sfees) {
super();
this.sid = sid;
this.sname = sname;
this.sfees = sfees;
}


public int getSid() {
return sid;
}


public void setSid(int sid) {
this.sid = sid;
}


public String getSname() {
return sname;
}


public void setSname(String sname) {
this.sname = sname;
}


public float getSfees() {
return sfees;
}


public void setSfees(float sfees) {
this.sfees = sfees;
}


@Override
public String toString() {
return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
}
}


public class MainAppUserDefinedArrayList {


public static void main(String[] args) {
ArrayList<Student> slist = new ArrayList<Student>();
Student s1 = new Student(1,"Dheeraj",9876);
Student s2 = new Student(2,"Khanfhgj",8876);
Student s3 = new Student(7,"Deepa",7876);
Student s4 = new Student(12,"Kiran",4876);
Student s5 = new Student(15,"Manoj",14876);

slist.add(s1);
slist.add(s2);
slist.add(s3);
slist.add(s4);
slist.add(s5);

System.out.println(slist);

// for(Student s:slist) {
// System.out.println(s);
// }

//Using Iterator

Iterator<Student> itobj = slist.iterator();

System.out.println("sid\tsname\tsfees");
System.out.println("----------------------");
while(itobj.hasNext()) {
Student s=itobj.next();
//System.out.println(itobj.next());
System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
}





}


}
