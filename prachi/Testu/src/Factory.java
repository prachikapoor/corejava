
public class Factory {
	int capacity=10;
	int current=0;
	Object lock=new Object();
	public void produce()
	{
		System.out.println("start producing");
			synchronized (lock) 
			{
				while(capacity>current)
				{
					current++;
					System.out.println(" start consuming"+current);
				}
				System.out.println("awake waiting thraeds" );
				lock.notifyAll();
	
				// TODO Auto-generated method stub
			}
			System.out.println("production done");
	}
	

	public void consume() {
		synchronized (lock)
		{
			if(current==0)
			{
				try {
					System.out.println("nothing to consume ");
					lock.wait();
					}
				
			catch(InterruptedException e)
					{
					e.printStackTrace();
					}
			}
			System.out.println("start consuming");
		while(current>0)
		{
			current--;
			System.out.println("comnsuming"+current);
		}

		}
		// TODO Auto-generated method stub
		System.out.println("consumption done ");
		
	}

}
