package string;

public class RegeXample {
	public static final String  STRING_TEST ="this is my " + "small example";
		//match any character   - .*
	// match beginning character  - ^
	// match ending character - $
	
	

	public static void main(String[] args) {
		System.out.println(STRING_TEST.matches("\\w.*")); //w: a lot of spaces :false
		String[] splitString = (STRING_TEST.split("\\s+"));
		System.out.println(splitString.length);
		System.out.println(splitString);
  
		//for each loop
		for (String s :splitString)
		{
			System.out.println(s);
		}
		System.out.println(STRING_TEST.replace("\\s", "\t"));//spate to tab
		
	}

}
