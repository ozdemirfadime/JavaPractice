package string;

public class IntegerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer  a =100;
		Integer b = 20;
		Integer c =2220;
		Integer  d = 100;
	
		System.out.println(a.intValue());
		System.out.println(b.doubleValue());
		System.out.println(c.floatValue());
		System.out.println(Integer.parseInt("13456"));
		System.out.println(Integer.compare(100, 100)); //return  0 
		System.out.println(Integer.compare(100, 90)); //retrun 1
		System.out.println(a.equals(d));
		System.out.println(a.equals(c));
		
		

	}

}
