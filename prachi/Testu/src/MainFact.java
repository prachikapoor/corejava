
public class MainFact {
	public static void main(String[] args)
	{
	Factory f=new Factory();
	ProducerT p=new ProducerT(f);
	ConsumerT c=new ConsumerT(f);
	Thread pth=new Thread(p);
	Thread cth=new Thread(c);
	
	//cth.start();
	pth.start();
	cth.start();

	}
}
