package Filehandl;

public class AreaOver {
	
	public static float Circle(float a)
	{
		return (3.14f*3.14f*a);
	}
	public static float Circle(float a,float pt)
	{
		return(2*pt*a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Circle(2.3f));
		System.out.println(Circle(2.4f,3.14f));
	}

}
