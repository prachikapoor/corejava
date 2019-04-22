
public class ProducerT implements Runnable {
	Factory factory;
	public ProducerT(Factory factory)
	{
		this.factory=factory;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		factory.produce(); 
	}
}
