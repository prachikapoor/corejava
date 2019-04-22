


 class Employ{
	 
public static void main(String[]  args)
	{
	 Employ t1=new Employ(1,"mayank",50);
	 Employ t2=new Employ(2,"raj",40);
	 System.out.println(t1);
	 System.out.println(t2);
	 
	}

int rollno;
String name1;
int marks;


 Employ(int rollno,String name1,int marks)
		{
	this.rollno=rollno;
	this.name1=name1;
	this.marks=marks;
//	System.out.println(+rollno+""+name1+""+marks);
		}

	public String toString()
			{
		return "Try [rollno=" + rollno + ", name1=" + name1 + ", marks=" + marks + "]";
			}
 			}

