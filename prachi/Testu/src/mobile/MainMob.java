package mobile;

import java.util.TreeSet;

public class MainMob {
	
	@SuppressWarnings("unused")
	public static void main(String []args) {
		
		Mobile m1=new Mobile("moto","4g",20000);
		Mobile m2=new Mobile("moto","4g",40000);
		Mobile m3=new Mobile("moto","3g",65000);
		Mobile m4=new Mobile("moto","4g",9000);
		Mobile m5=new Mobile("moto","3g",2000);
		
		//ThreadMob tm=new ThreadMob();
		TreeSet<Mobile>tree=new TreeSet<>();
		   
		tree.add(m1);
		tree.add(m2);
		tree.add(m3);
		tree.add(m4);
		tree.add(m4);
		tree.add(m5);
		
		ThreadMob tm=new ThreadMob(tree);
		Thread thread1=new Thread(tm);
		thread1.start();
	}
		
		
}
