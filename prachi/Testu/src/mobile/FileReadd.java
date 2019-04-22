package mobile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileReadd {
	//@SuppressWarnings("unused")
	@SuppressWarnings("resource")
	public static void main(String []args) throws IOException
	{
			File file=new File("C:\\");
			
			File dir=new File(file,"Hello");
			dir.mkdir();
			
			File file1=new File(dir,"kk.java");
			file1.createNewFile();
			
			System.out.println( "Dir isFile ?  :: "+dir.isFile() );
			System.out.println( "Dir isDirectory ? :: "+dir.isDirectory() );
			
			
			FileWriter fw=new  FileWriter(file1);
			fw.write("hello data is added 123");
			//fw.write("hello data is added 123");
			fw.close();
			
			
			
			
			FileReader fr=new FileReader(file1);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
	
	}
	}
