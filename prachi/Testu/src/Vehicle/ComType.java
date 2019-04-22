package Vehicle;

import java.util.Comparator;

public class ComType implements Comparator<Vehicleshow>{

	@Override
	public int compare(Vehicleshow o1, Vehicleshow o2) {
		// TODO Auto-generated method stub
		
		
		return o1.getVtype().compareTo(o2.getVtype());
	}
	
	

}
