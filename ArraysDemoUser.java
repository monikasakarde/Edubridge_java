package nov8;


import java.util.Scanner;


public class ArraysDemoUser {


public static void main(String[] args) {
// int a[]= {3,8,1,2,4};
// //0 1 2 3 4 5
// System.out.println(a[0]);
// System.out.println(a[1]);
// System.out.println(a[2]);
// System.out.println(a[3]);
// System.out.println(a[4]);

//int a[]=new int[5];
int a[];
int size;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter size of an array");
size = scanner.nextInt();
a=new int[size];

System.out.println("Enter array elements");
for(int i=0;i<a.length;i++) {
a[i]=scanner.nextInt();
}


System.out.println("No of elements in a array "+a.length);

for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
}
}
}
