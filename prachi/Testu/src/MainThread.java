
public class MainThread {
public static void main (String[] args)	
{
	Threadsim tsim=new Threadsim();
	tsim.setName("mythread");
	tsim.start();
	try {
		tsim.join();
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println(tsim.getName());
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	ThreadSec tsec=new ThreadSec();
	//Thread thr=new Thread(tsec);
	//thr.setName("mythread2");
	//thr.start();
	//System.out.println(thr.getName());
	try {
		Thread thr=new Thread(tsec);
		thr.start();
		thr.join();
		System.out.println(thr.getName());
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	Thread th=new Thread();

		th.setName("main");
	
   	System.out.println(th.getName());
   	th.setPriority(Thread.MIN_PRIORITY);
   	System.out.println(" priorit is "+th.getPriority());
	System.out.println(" hello");
   	
   		add(10,20);
}
public static int  add(int a,int b )
{
	int c=a+b;
	System.out.println(c);
	return c;
	
	
}
}
