package nov9;

public class Gandhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="Mahathma Karamchand Gandhi";
		//M.K.Gandhi
		System.out.print(m.charAt(0)+".");
		int i = m.indexOf(' ');
		System.out.print(m.charAt(i+1)+".");
		int j=m.lastIndexOf(' ');
		String lw=m.substring(j+1);
		System.out.println(lw);

	}

}
