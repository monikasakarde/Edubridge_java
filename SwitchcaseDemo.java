package nov5;


import java.util.Scanner;


public class SwitchcaseDemo {


public static void main(String[] args) {
//Switch case->int char and String
float result=0;
Scanner scanner = new Scanner(System.in);
System.out.println("Menu");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("Enter your choice");
int ch = scanner.nextInt();
System.out.println("Enter two numbers");
float n1=scanner.nextInt();
float n2=scanner.nextInt();

switch(ch) {

case 1: result = n1+n2;
System.out.println("The sum of "+n1+" and "+n2+" is "+result);
break;

case 2:result = n1-n2;
System.out.println("The Difference of "+n1+" and "+n2+" is "+result);
break;
case 3:result = n1*n2;
System.out.println("The Product of "+n1+" and "+n2+" is "+result);
break;
case 4:
if(n2!=0) {
result =n1/n2;
System.out.println("The Quotient of "+n1+" and "+n2+" is "+result);
}
else {
System.out.println("Divide by zero error");
}
break;

default: System.out.println("Invalid input");

}





}


}