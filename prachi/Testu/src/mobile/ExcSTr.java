package mobile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExcSTr {
public static void main(String []args) throws IOException
{
	File file=new File("C:\\");
	File dir=new File(file,"world");
	dir.mkdir();
	File file1=new File(dir,"m.java");
	file1.createNewFile();
	
	@SuppressWarnings("resource")
	FileWriter fw=new FileWriter(file1) ;
	fw.write(0+"\r\n"+1+"\r\n"+2+"\r\n"+3+"\r\n"+4+"\r\n"+5);
	//fw.write("myfile");
	fw.close();
	Scanner s=new Scanner(file1);
	//Scanner s=new Scanner(new File("D:\\Hello\\h.txt"));
/*	while(s.hasNextLine())
	{int n=Integer.parseInt(s.nextLine());
		switch(n)
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
	  
		}*/
	FileReader fr=new FileReader(file1);
	BufferedReader bf=new BufferedReader(fr);
	String i;
	while((i=bf.readLine())!=null)
	{
		System.out.println(i);
	}
	
	}
}
