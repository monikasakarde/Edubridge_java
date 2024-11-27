package nov9;


import java.util.Scanner;


public class LoginValidation {


public static void main(String[] args) {
String uname, upass;

Scanner s=new Scanner(System.in);
System.out.println("Enter username and password");
uname = s.next();
upass = s.next();

if(uname.equalsIgnoreCase("admin") && upass.equals("admin123")) {
System.out.println("Valid user");
}else {
System.out.println("Invalid user");
}

}
}