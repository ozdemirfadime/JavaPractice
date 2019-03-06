package encapsulation;

public class EncaplsulationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation player1 = new Encapsulation("215356");
		player1.setName("cedi");
		player1.setAge(22);
		//player1.setIdNum("23");
		
	//System.out.println(String.format("%s  with id number:%s is %d year old  %s",player1.getName(),player1.getIdNum(),player1.getAge(),player1.getAdress()));
 // System.out.println(player1.age); age is private variable
		//System.out.println(player1.adress); //adress is not private
	}

}
