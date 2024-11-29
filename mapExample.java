package nov19;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
public class mapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hobj = new HashMap<Integer, String>();
		hobj.put(101, "Monika Sakarde");
		hobj.put(102, "Mrunali Sakarde");
		hobj.put(103, "Divya Sakarde");
		hobj.put(104, "Pawan Sakarde");
		hobj.put(104, "Pawan Sakarde");
		System.out.println(hobj);


		LinkedHashMap<Integer, String> hobj1 = new LinkedHashMap<Integer, String>();
		hobj1.put(101, "Taukir Khan");
		hobj1.put(102, "Kiran");
		hobj1.put(23, "Manoj");
		hobj1.put(105, "Manoj");
		hobj1.put(45, "Swetha");
		System.out.println(hobj1);

		TreeMap<Integer, String> hobj2 = new TreeMap<Integer, String>();
		hobj2.put(101, "Taukir Khan");
		hobj2.put(102, "Kiran");
		hobj2.put(34, "Manoj");
		hobj2.put(12, "Manoj");
		hobj2.put(104, "Swetha");
		System.out.println(hobj2);
		//does not maintains the orde
		//LinkedHashMap
		//should maintain the order
		//TreeMap
		//Based on the key elements are sorted
		for(Map.Entry<Integer,String> m:hobj2.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
		//does not maintains the order
		//LinkedHashMap
		//should maintain the order
		//TreeMap
		//Based on the key elements are sorted
		
	}


		

	}


