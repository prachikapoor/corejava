import java.util.Comparator;

public class apnaCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
	
		//two different methods to compare marks
	
	
			if(o1.getMark()==o2.getMark())
			return 0;
			else if (35>o2.getMark())
			return 1;
			else if(35 < o2.getMark())
			return -1;
			else
			return 0;
					}
		
		/*Integer a = new Integer(o1.getMark());
		Integer b = new Integer(o2.getMark());
		
		
		return a.compareTo(b);*/
	}

	
	
	

