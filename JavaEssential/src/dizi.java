package deneme;

public class dizi {

	public static void main(String[] args)
	{
		/* Array1
		  int value =7;
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		System.out.println("ll" + values[0]);
		System.out.println("ll"+ values[1]);
		System.out.println("ll" + values[2]);
		
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i]);
		}
		int[] number = {5,6,8};		
		for(int i=0;i< number.length;i++) {
			System.out.println(number[i]); 
		}*/
		/*
		// string array
		String[] word =new String[3];
		word[0]= "hello";
		word[1] = "to";
		word[2]= "you";
		System.out.println(word[0]);
		String[] fruits = {"apple","kiwi","banana","pear"};
	 for(String fruit:fruits)
		System.out.println(fruit);
	 String text = null;
	 System.out.println(text);
	 String[] texts = new String[2];
	 System.out.println(texts[0]);
	 texts[0] ="one";*/
		//two dimonsial array
		int[] values = { 2,3,56,5896};
		System.out.println(values[2]);
		int[][] grid = {{3,5,6},{2,3},{1,2,3,4}};
		System.out.println(grid[1][1]);
		System.out.println(grid[0][1]);
		System.out.println(grid[2][3]);
		String[][] text =new String[2][3];
		text[0][1] = "hello there";
		System.out.println(text[0][1]);
		
		for( int row= 0;row<grid.length;row++)
		{for( int col=0;col<grid[row].length;col++)
		{
		System.out.print(grid[row][col] + "\t");	
		}
		System.out.println();
		}
		String[][] word = new String[2][];
		System.out.println(word[0]);
		word[0] = new String[3];
		word[0][1] = " hi thete";
		System.out.println(word[0][1]);
		
	}
}
