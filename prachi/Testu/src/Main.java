import java.util.Iterator;
import java.util.*;
public class Main{	 
public static void main(String[]  args)
	{  
	 Try2 t1=new Try2(1,"mayank",50);
	 Try2 t2=new Try2(2,"raj",40);
	// System.out.println(t1);
	// System.out.println(t2);
	 Try2 t3=new Try2(3,"somi",90);
	 Try2 t4=new Try2();
	 t4.setRollno(4);
	 t4.setName1("krish");
	 t4.setMarks(70);
	// System.out.println(t3);
	// System.out.println(t4);
	 
	 Capna abc=new Capna();
	 TreeSet<Try2> s=new TreeSet<>(abc);
	 s.add(t1);
	 s.add(t2);
	 s.add(t3);
	 s.add(t4);
	 //System.out.println(t1);
	 Iterator<Try2> itt=s.iterator();
	 while(itt.hasNext())
	 {
		 Try2 t=itt.next();
		 System.out.println(t.getMarks() + " "+ t.getName1() +" "+t.getRollno());
	 }
	 
	}
}


