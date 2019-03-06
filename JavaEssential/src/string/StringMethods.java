package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str1 = "hello guys +"welcome to java worlld"";
		String str2 ="welcome";
		String str3 ="";
		String str4 = "  ";
		System.out.println(str1.length());
		System.out.println(str1.substring(1));//1 + then
		System.out.println(str1.substring(6, 13));
		System.out.println(str2.contains("hello"));
		System.out.println(str2.equals("welcome"));
		System.out.println(str2.equalsIgnoreCase("hi"));
		System.out.println(str2.equalsIgnoreCase("welcome"));
		System.out.println(str3.isEmpty());
		System.out.println(str4.isEmpty());*/
		//
		String str5 = "hello guys";
		String str6 ="welcome";
		String str7 ="test";
		String str8 = "java ";
		String str9 ="		string		";	
		int totalGuy =50;
		String str10 = "abc def ghi";
		String[] strCount = str10.split("\\s+");
		System.out.println(str5.concat(str6));
		System.out.println(str6.substring(1));
		System.out.println(str5.replace("e", "a"));
		System.out.println(str8.toLowerCase());
		System.out.println(str7.toUpperCase());
		System.out.println(str9.trim());// remove begin end edin space);
		System.out.println(String.valueOf(totalGuy));
		System.out.println(strCount);
		for (String i : strCount)
			System.out.println("word: "+i);
		System.out.println();
		System.out.println();
	}

}
