package nov16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;


public class MainApp1 {


public static void main(String[] args) {
//ArrayList is resizable array
ArrayList<Integer> alist =new ArrayList<Integer>();
alist.add(12);
alist.add(14);
alist.add(90);
alist.add(45);
alist.add(34);


System.out.println(alist);
for(int i:alist) {
System.out.println(i);
}

Iterator<Integer> iobj = alist.iterator();

while(iobj.hasNext()) {
//int i=iobj.next();
//System.out.println(i);
System.out.println(iobj.next());
}

alist.add(2, 456);
System.out.println(alist);
// alist.clear();
// System.out.println(alist);
//alist.remove(100);
//System.out.println(alist);
System.out.println(alist.contains(45));
System.out.println(alist.size());

ArrayList<Integer> alist1 =new ArrayList<Integer>();
alist1.add(121);
alist1.add(141);
alist1.add(901);
alist1.add(451);
alist1.add(341);

alist1.addAll(alist);
System.out.println(alist);
//sort,swap,shuffle
Collections.sort(alist);
System.out.println(alist);
Collections.swap(alist, 2, 5);
System.out.println(alist);

Collections.shuffle(alist);
System.out.println(alist);


}
}
