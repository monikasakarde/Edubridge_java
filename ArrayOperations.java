//program to find the sum , average , min and max
package nov8;


import java.util.Scanner;




import java.util.Scanner;


public class ArrayOperations {


public static void main(String[] args) {
int a[]=new int[5];
//int []b=new int[5];

Scanner sc = new Scanner(System.in);
System.out.println("Enter array elemnts");

for(int i=0;i<a.length;i++) {
a[i]=sc.nextInt();
}

System.out.println("array elements are");
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
}


//find the sum and average
int sum=0;

for(int i=0;i<a.length;i++) {
sum = sum+i;
}

float average = (float)sum/a.length;

System.out.println("sum ="+sum);
System.out.println("Average ="+average);

//find max and min of array element

int max = a[0];

for(int i=1;i<a.length;i++) {
if(a[i]>max) {
max=a[i];
}
}

System.out.println("Max of array elements "+max);


int min = a[0];

for(int i=1;i<a.length;i++) {
if(a[i]<min) {
min=a[i];
}
}

System.out.println("Min of array elements "+min);


}


}
