package Vehicle;

import java.util.ArrayList;
import java.util.Iterator;




public class ThreadGen implements Runnable  {
	
	ArrayList<Vehicleshow>list=null;
	ThreadGen()
	{
		
	}
	
	ThreadGen(ArrayList<Vehicleshow>list)
	{
		
		this.list=list;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread started");	
		
		Iterator<Vehicleshow>iter=list.iterator();
		while(iter.hasNext())
		{
			Vehicleshow temp=iter.next();
			if(temp.getVtype()=="petrol")
			{
				System.out.println(temp. toString());
			}
				
				
		}
		
		
	}
	
}
