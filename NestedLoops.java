package nov8;


public class NestedLoops {


public static void main(String[] args) {
//Nested Loop
for(int i=1;i<=3;i++) { //i=2
//for(int j=1;j<=3;j++) {
for(int j=1;j<=i;j++) {
//System.out.println("i="+i +" and j="+j);
//System.out.print(i+" ");
//System.out.print(j+" ");
System.out.print("*");
}
System.out.println();
}
}
}
