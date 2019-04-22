interface Myclg
{
	void board(int a);
	void lib(int b);
}
public class MainInter implements Myclg {

	int ec=2;
	int cs=5;

@Override
public void board(int in) {
	// TODO Auto-generated method stub
	System.out.println(in+cs);
}

@Override
public void lib(int in2) {
	// TODO Auto-generated method stub
	System.out.println(in2+ec);
}
public void display()
	 { System.out.println();
	   System.out.println();
 
}
}




