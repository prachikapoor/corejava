import java.util.*;

public class String1 {
	
public static void main(String[] args) {
		
		System.out.println("Enter no : ");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int temp;
	   String str="";
		while(n>0) {
			temp=n%2;
			n=n/2;
			str=temp + str; 
			
		}	
		System.out.println("Binary of"+ str);

}
}
