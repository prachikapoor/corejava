
class Try2 implements Comparable<Try2>
{
	int rollno;
	String name1;
	int marks;
	
	Try2()
	{
	
	}


 Try2(int rollno,String name1,int marks)
		{
	this.rollno=rollno;
	this.name1=name1;
	this.marks=marks;
//	System.out.println(+rollno+""+name1+""+marks);
		}

	public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName1() {
	return name1;
}

public void setName1(String name1) {
	this.name1 = name1;
}


public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public String toString()
			{
		return "Try [rollno=" + rollno + ", name1=" + name1 + ", marks=" + marks + "]";
			}


@Override
public int compareTo(Try2 o) {
	// if(this.getMarks()==o.getMarks())
	//	return 0;
	return this.getName1().compareTo(o.getName1());
}
	
}
 /*class Try1{
	 
public static void main(String[]  args)
	{  
	 Try2 t1=new Try2(1,"mayank",50);
	 Try2 t2=new Try2(2,"raj",40);
	 System.out.println(t1);
	 System.out.println(t2);
	 Try2 t3=new Try2(3,"somi",90);
	 Try2 t4=new Try2();
	 t4.setRollno(4);
	 t4.setName1("krish");
	 t4.setMarks(70);
	 System.out.println(t3);
	 System.out.println(t4);
	 
	Capna a=new Capna();
	 TreeSet<Try2> s=new TreeSet<>(a);
	 s.add(t1);
	 s.add(t2);
	 System.out.println(t1);
	 
	}
}*/
	 
	
