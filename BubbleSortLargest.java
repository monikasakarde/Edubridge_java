package nov9;
import java.util.Scanner;
public class BubbleSortLargest {

	public static void main(String[] args) {
	int a[]=new int[5];
	Scanner s = new Scanner(System.in);

	System.out.println("Enter array elements ");
	for(int i=0;i<a.length;i++) { 
	a[i] = s.nextInt();
	}

	//Bubble sort

	for(int i=0;i<a.length;i++) { //no pass 2 1 6 7 3
	for(int j=0;j<a.length-1-i;j++) {
	if(a[j]>a[j+1]) { //1 2 6 7 3
	int temp = a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
	}
	}
	}
	System.out.println("Sorted elements ");
	for(int i=0;i<a.length;i++) { 
	System.out.println(a[i]);
	}

	System.out.println("Second Largest element "+a[1]);

	}
}
	