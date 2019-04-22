package Filehandl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class Filehan {
	public static void main(String []args)

{
try {
		FileWrite();
		FileRead();
}
catch (IOException e) {
	
	e.printStackTrace();
} 


System.out.println("End of the program");
}
public static void FileWrite() throws IOException
{
	
		@SuppressWarnings("resource")
		FileOutputStream fs=new FileOutputStream("D:\\Hello\\f");
		
	
		/*String content="hello";
		byte[] buffer=content.getBytes();
		fs.write(buffer);
	*/	for(int i =0;i<=10;i++)
		{
			fs.write(String.valueOf(i).getBytes());
		}
}
@SuppressWarnings("resource")
public static void FileRead()throws IOException

{
	
	FileInputStream fi=new FileInputStream("D:\\Hello\\f");
	/*byte[] buffer=new byte[fi.available()];
	fi.read(buffer);
	@SuppressWarnings("unused")
	String content=new String(buffer);
	System.out.println(content);*/
	int i;
	while((i = fi.read())!=-1)
	{
		char c=(char)i;
		System.out.print(Character.getNumericValue(c));
	switch(Character.getNumericValue(c))
	/*Scanner s=new Scanner(new File("D:\\Hello\\f"));
	while(s.hasNextLine())
		
	{
	int i=Integer.parseInt(s.nextLine());
	switch(i)*/
	{
	case 0: System.out.println(" zero"); break;
	case 1: System.out.println(" one"); break;
	case 2: System.out.println(" two"); break;
	case 3: System.out.println(" three"); break;
	case 4: System.out.println(" four"); break;
	case 5: System.out.println(" five"); break;
	case 6: System.out.println(" six"); break;
	case 7: System.out.println(" seven"); break;
	case 8: System.out.println(" eight"); break;
	case 9: System.out.println(" nine"); break;
	case 10: System.out.println(" ten"); break;
   
	
	
	
	
	}
}
}
}