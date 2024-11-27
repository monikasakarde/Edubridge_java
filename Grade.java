package nov5;

import java.util.*;
public class Grade {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

String name=sc.next();
int m=sc.nextInt();
if(m>=90 && m<=100) {
System.out.println("grade A");
}
else if(m>=80 && m<=89) {
System.out.println("grade B");
} else if(m>=50 && m<=79) {
System.out.println("grade C");
}
else if(m>=35 && m<=46) {
System.out.println("grade D");
}
else if( m<=34) {
System.out.println("grade E");
}
else
{
System.out.println("invalid");
}
}
}
