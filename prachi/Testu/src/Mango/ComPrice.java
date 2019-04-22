package Mango;

import java.util.Comparator;

	public class ComPrice implements Comparator<Mangoes>
	{

		@Override
		public int compare(Mangoes o1, Mangoes o2) {
			// TODO Auto-generated method stub
		return	(o1.getPrice()-o2.getPrice());
			
			
			
			
			
		}

}
