package fileIO;

import java.io.FileNotFoundException;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamInput {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		// TODO Auto-generated method stub
		FileReader in = null ;
		try {
			in = new FileReader("/home/linus/eclipse-workspace/OOP/src/fileIO/input.txt");
			int i = 0;
			//while loop
			while ((i = in.read()) != -1)
			{
			//	System.out.println((char)i); //return char
				System.out.print((char)i); 
			}
			}finally {
				if (in != null)
				{in.close();
				}
			}
		
	}
}

