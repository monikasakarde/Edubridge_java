package nov9;

public class StringReverse {
		public static void main(String[] args) {
		String s="Education";
		// StringBuffer sb = new StringBuffer(s);
		// String s1= sb.reverse().toString();
		// System.out.println("Reversed String ="+s1);

		String rs="";

		for(int i=s.length()-1;i>=0;i--) {
		rs=rs+s.charAt(i);
		}
		System.out.println("Reversed String is "+rs);
		}
	}
