package polymorphsim;

public class PolymorphismMethod {
public static void main(String args[])
{
	Vehicle v1 = new Vehicle("ford", "df1532", 2019);
	v1.start();
	v1.stop();
	System.out.println("******************");
	SUV sv1 = new SUV("toyta", "fr148", 2012);
	sv1.start();
	sv1.stop();
	System.out.println("******************");
	Semi v2 = new Semi("ferrai", "fr148", 2013);
	v2.start();
	v2.stop();
	System.out.println("******************");
	Motorbike v3 = new Motorbike("Harley", "fr148", 2000);
	v3.start();
	v3.stop();
	System.out.println("******************");
	
}
	
}
