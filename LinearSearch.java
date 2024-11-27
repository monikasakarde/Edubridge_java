package nov9;

import java.util.Scanner;


public class LinearSearch {


public static void main(String[] args) {
int a[]=new int[5];
int pos =0;
Scanner s = new Scanner(System.in);

System.out.println("Enter array elements");
for(int i=0;i<a.length;i++) { //0 1 2 3 4
a[i] = s.nextInt();//a[0]=6, a[1]5 a[2]=8 a[3]=12 a[4]=4
}

System.out.println("Enter element to search");
int key = s.nextInt(); //15

for(int i=0;i<a.length;i++) {
if(a[i]== key) {
pos = i+1;
}
}
if(pos>0) {
System.out.println(key+" found at position "+pos);
System.out.println("Successful search");

}else {
System.out.println("Unsuccessful search");
System.out.println(key+" not found"); 
}
}
}
