package deneme;




public class String_Builder {

	public static void main(String[] args) {
		//inefficient
		String info = "";
		info +="my name bob";
		info +=" ";
		info +="ı am builder";
		System.out.println(info);
		// more efficient
		StringBuilder sb =new StringBuilder("");
		sb.append("my nam is nini");
		sb.append(" ");
		sb.append("ı am stenhan curry");
		System.out.println(sb.toString());
		StringBuilder s = new StringBuilder();
		s.append("my nam e cuz")
		.append(" ")
		.append("ı am skydriver");
		System.out.println(s.toString());
		//formating
		System.out.println("here is some text \t thar tab\nnew line");
		System.out.println("more text");
		//formating integer
		System.out.printf("totaş cost %10d ;quantiy id %d\n" ,5,120);//10 br then write 5
		for(int i =0;i<20;i++)
		{   System.out.printf("%-2d:%s\n",i,"helo guys");
				
			//System.out.printf("%-2d:some text here\n",i); // %2d 0-10  2 br then start ,//
		
		//formating floatingn poing value	
		System.out.printf("%.1f:totoal value:\n",256.14185621496); //%f :5 zera add
		System.out.printf("%9.1f:totoal value:\n",256.14185621496); //9 br then write .then 1 number
		
		}
	}

}
