package Filehandl;

public class Addition {
public static int add(int a,int b)
{
	return(a+b);
}
public static float add(float a,float b)
{
	return(a+b);
}
public static String add(String a,String b)
{
	return(a+b);
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		System.out.println(a.add(2,4));
		System.out.println(a.add(2.3f,3.4f));
		System.out.println(a.add("water","melon"));
	}

}
