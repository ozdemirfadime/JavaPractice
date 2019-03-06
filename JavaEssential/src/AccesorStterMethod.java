
public class AccesorStterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("toyoto", "fadime", 2018);
		System.out.println(c1.getMake());
		System.out.println(c1.getModel());
		System.out.println(c1.getYear());
		
		//set to new value
		c1.setMake("jepper");
		c1.setModel("minicopper");
		c1.setYear(2019);
		//get the value again
		System.out.println(c1.getMake());
		System.out.println(c1.getModel());
		System.out.println(c1.getYear());
		
	}

}
