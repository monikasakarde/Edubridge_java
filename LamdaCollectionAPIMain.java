package nov22;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class LamdaCollectionAPIMain {
public static void main(String[]args) {
	List<Integer> lst = new ArrayList<Integer>();
	for (int i=1;i<=10; i++){
		lst.add(i);
	
	}
//	List<Integer> result = new ArrayList<Integer>();
//	Iterator<Integer> itobj = lst.iterator();
//	while(itobj.hasNext()) {
//		int n=itobj.next();
//		if(n>5) {
//			result.add(n);
//			
//		}
//	}
//	System.out.println(result);  or another ways below
	Stream<Integer> sm= lst.stream();
List<Integer> res=sm.filter(x->x>5).collect(Collectors.toList());
System.out.println(res);

//Predicate<Integer> pob=(x)->x>5;
//System.out.println(pob.test(7));
Stream<Integer> sm1= lst.stream();
List<Integer> res1=sm1.filter(x->x<5).collect(Collectors.toList());
System.out.println(res1);

//even numbers
Stream<Integer> evenStream = lst.stream();
List<Integer> evenNumbers = evenStream.filter(x -> x % 2 == 0).collect(Collectors.toList());
System.out.println("Even numbers: " + evenNumbers);

// Extract odd numbers
Stream<Integer> oddStream = lst.stream();
List<Integer> oddNumbers = oddStream.filter(x -> x % 2 != 0).collect(Collectors.toList());
System.out.println("Odd numbers: " + oddNumbers);

Stream<Integer> sm4= lst.stream();

sm4.filter(x->x%2==1).forEach(System.out::println);

}
}
