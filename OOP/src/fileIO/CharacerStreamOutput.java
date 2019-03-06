package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacerStreamOutput {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		FileInputStream in = null ;
		FileOutputStream out  = null;
		try {
		in = new FileInputStream("/home/linus/eclipse-workspace/OOP/src/fileIO/input.txt");
	 out = new FileOutputStream("/home/linus/eclipse-workspace/OOP/src/fileIO/input.txt");
			
			int i = 0;
			//while loop
			while ((i = in.read()) != -1)
			{ 
				//System.out.println((char)i);
				out.write((char)i);
			}
			} finally {
				if (in != null)
				{in.close();
				
				}
			}
	}

}
