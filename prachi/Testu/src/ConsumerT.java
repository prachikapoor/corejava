
public class ConsumerT implements Runnable{
	Factory factory;
	public ConsumerT(Factory factory)
	{
		this.factory=factory;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		factory.consume();
	}
}
