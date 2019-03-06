package ovarloading;

public class Addition {
public int add (int a,int b)
{
	return a+b;
}
//addition of three integer
public int add (int a,int b,int c)
{
	return a+b+c;
}
//addition of double values
public double  add(double a,double b) {
	
	return a+b;
}
 public static void main(String args[]) {
	 Addition a = new Addition();
	 System.out.println(a.add(12, 12));
	 System.out.println(a.add(12.5, 15.8));
	 System.out.println(a.add(12,13,15));
}
}
