import java.util.List;

public class Generic {
	public static void dis(List <?>list) 
{
	for(Object o:list)
	{
		System.out.println(o);
	}
}
	public  static void display(List<? extends Number> list)
	{
		for(Object p:list)
		{
			System.out.println(p);
		}
		
	}
	
	public static void show(List<? super Float>list)
	{
		for(Object q:list)
		{
			System.out.println(q);
		}
	}
}
	

