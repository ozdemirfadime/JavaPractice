
public class StaticVariables {

	public static String name;
	public static String adress;
	static double balance;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables.name ="cedi";
		StaticVariables.adress="cleavand";
		System.out.println(StaticVariables.name);
		System.out.println(StaticVariables.adress);
		StaticVariables.name ="luka";
		StaticVariables.adress="lakers";
		System.out.println(StaticVariables.name);
		System.out.println(StaticVariables.adress);
		StaticVariables.balance = 2500;
		System.out.println(StaticVariables.balance);
		
	}

}
