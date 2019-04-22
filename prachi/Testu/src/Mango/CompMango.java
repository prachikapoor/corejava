package Mango;

import java.util.Comparator;

public class CompMango implements Comparator<Mangoes>
{

	@Override
	public int compare(Mangoes o1, Mangoes o2) {
		// TODO Auto-generated method stub
		if (o1.getQuality()==o2.getQuality())
			return 0;
		else if(o1.getQuality()>o2.getQuality())
			return 1;
		else if(o1.getQuality()<o2.getQuality())
			return -1;
		else 
			return 0;
	}

	

}
