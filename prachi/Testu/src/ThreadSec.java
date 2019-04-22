
public class ThreadSec implements Runnable {

			@Override
		public void run() {
		Thread run=Thread.currentThread();
			String str1=run.getName();
			System.out.println(str1);
			for(int i=1;i<4;i++)
			System.out.println("bye from thread sec");
			

}
}