package nov16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Employee{
private int eid;
private String name;
private float salary;
public Employee(int eid, String name, float salary) {
super();
this.eid = eid;
this.name = name;
this.salary = salary;
}
public int getEid() {
return eid;
}
public void setEid(int eid) {
this.eid = eid;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public float getSalary() {
return salary;
}
public void setSalary(float salary) {
this.salary = salary;
}

}
public class ArrayListEmployees {
public static void main(String[] args) {
LinkedList<Employee> elist=new LinkedList<Employee>();
elist.add(new Employee(100,"Abhishek",67000.0f));
elist.add(new Employee(200,"Harshith",67000.0f));
elist.add(new Employee(300,"Mithun K",67000.0f));
elist.add(new Employee(400,"Dheeraj M",67000.0f));
elist.add(new Employee(500,"Pavan K M",67000.0f));
Iterator<Employee> it=elist.iterator();
System.
out
.println("E-ID\tName\t\tSalary");
while(it.hasNext()) {
Employee s=it.next();
System.
out
.println(s.getEid()+"\t"+s.getName()+"\t"+s.getSalary());
}
}
}
