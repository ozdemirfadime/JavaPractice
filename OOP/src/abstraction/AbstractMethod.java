package abstraction;

public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empl1 = new Employee();
		empl1.setAddress("golden state");
		empl1.setEmplId("12346578");
		empl1.setName("james");
		System.out.println(String.format("custumer %s %s emplyee id %s address"
				, empl1.getName(),empl1.getEmplId(),empl1.getAddress()));
	/*	Custumer k = new Employee();
		k.setName("cedi");
		System.out.println(k.getName());*/
		
	
		

	}

}
