package Mango;

import java.util.Iterator;
import java.util.TreeSet;



public class MainMango {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mangoes m1=new Mangoes(1,"alphanso",1000);
		Mangoes m2=new Mangoes(4,"kesari",1500);
		Mangoes m3=new Mangoes(8,"totapuri",2000);
		Mangoes m4=new Mangoes(10,"keri",3000);
		Mangoes m5=new Mangoes(5,"rashelle",4500);
		
		CompMango cmp=new CompMango();
		
		TreeSet<Mangoes>list=new TreeSet<>(cmp);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		
		System.out.println("base on quality");
		Iterator<Mangoes>iter=list.iterator();
		while(iter.hasNext())
		{
		 Mangoes value=iter.next();
		 
		 try{
			 if(value.getQuality()>4)
				 System.out.println(value.toString());
		
		 else
			 throw new  MangoException(2,"Hello");
		 }
		catch( MangoException  e)
		 {
			//e.printStackTrace();
		 }
		}
		
		
		
		ComPrice cmp1=new ComPrice();
		TreeSet<Mangoes>list1=new TreeSet<>(cmp1);
		list1.addAll(list);
		
		System.out.println("based on price");
		Iterator<Mangoes>iter1=list1.iterator();
		while(iter1.hasNext())
		{
			Mangoes value1=iter1.next();

			System.out.println(value1.toString());
		}
		
		
		CompName cmp2=new CompName();
		TreeSet<Mangoes>list2=new TreeSet<>(cmp2);
		list2.addAll(list);
		
		System.out.println("based on name");
		Iterator<Mangoes>iter2=list2.iterator();
		while(iter2.hasNext())
		{
			Mangoes value2=iter2.next();

			System.out.println(value2.toString());
		
		}
		
	}

}
