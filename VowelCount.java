package nov9;

public class VowelCount {


public static void main(String[] args) {
String s="EduBridge";
String s1 = s.toLowerCase();
int vc=0;
for(int i=0;i<s1.length();i++) {
char ch = s1.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
vc++;
}
}
System.out.println("No of vowels="+vc);
}


}
