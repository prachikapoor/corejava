package flehandling;

import java.util.Scanner;

public class flehandling {

	public static void main(String[] args)
	{
		System.out.println("enter values");
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		 float a=Float.parseFloat(str);
	
		Scanner s1=new Scanner(System.in);
		String str1=s1.nextLine();
		
		 float b=Float.parseFloat(str1);
			float sum=a+b;
			
		
	
				System.out.println(sum);
				try
					{
					div();
					
					}
			
	
				catch(ArithmeticException e)
							{
							System.out.println("cannot divide by 0");
							}
				
				try{//String s3=null;
						str();
						}
					catch(NullPointerException ne)
							{
							System.out.println("string is null");
							}
					}
			



public static void div() throws ArithmeticException		
				{	
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	
		int a=Integer.parseInt(str);

	Scanner s1=new Scanner(System.in);
	String str1=s1.nextLine();
	
		int b=Integer.parseInt(str1);
		
					
				int r=a/b;
				System.out.println(r);
				}
public static void str() throws NullPointerException 				
{
	String s3=null;
	if(s3 == null)
		{
			 throw new NullPointerException();
				
			}
				
				
}
}
