package nov4;
import java.util.Scanner;


public class BigFour {


public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter four numbers:");
int a=sc.nextInt();
int b = sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();

int big = (a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;

System.out.println("Biggest of "+a+","+b+"," +c+"," +d +" is:"+big);
}


}