package Filehandl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;



public class Mainemp {
	
	public static void main(String[] args) {
// TODO
		try
		{
		WriteF();
		readObject();
	}
catch(IOException e)
		{
	e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void WriteF() throws IOException
{	Emp e=new Emp();
	e.setId(1);
	e.setName("raj");
	e.setSal(300000);
	FileOutputStream fi=new FileOutputStream("D:\\Hello\\employ");
	ObjectOutputStream o=new ObjectOutputStream(fi);
	o.writeObject(e);
	
}
public static void readObject() throws IOException,ClassNotFoundException
{
	InputStream fi=new FileInputStream("D:\\Hello\\employ");
	ObjectInputStream os=new ObjectInputStream(fi);
	Emp em=(Emp) os.readObject();
	System.out.println(em.getName());
	System.out.println(em.getId());
	System.out.println(em.getSal());
	
	
	
	


}
}
