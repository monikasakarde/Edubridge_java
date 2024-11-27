/*
* Units Charge/unit
first 100 2 
next 200 3
above 300 5


calculate electricity bill
accept name and no of units
* 
*/


package nov5;


import java.util.Scanner;


public class ElectricityBill {


public static void main(String[] args) {
int units;
String name;
float billAmount=0;

Scanner scanner = new Scanner(System.in);
System.out.println("Enter name");
name = scanner.next();

System.out.println("Enter units");
units = scanner.nextInt();

if(units>0 && units<=100) {
billAmount = units*2;
}
else if(units>=100 && units<=300) { //250
billAmount =100*2+(units-100)*3; //100*2+250-100*3
}else {
billAmount = 100*2+200*3+(units-300)*5;
}

System.out.println("Name :"+name);
System.out.println("Bill Amount :"+billAmount);


}


}