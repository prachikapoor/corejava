
public class Threadsim extends Thread {
	public void run()
	{
			Thread current=Thread.currentThread();
			String str=current.getName();
			System.out.println(str);
			for(int i=0;i<5;i++)
			{
				System.out.println("hello from thread sim"+i*5+" "+str );
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
					
				}
			
		
			}
	}	
}
