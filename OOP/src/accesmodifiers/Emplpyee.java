package accesmodifiers;

public class Emplpyee {
	// //privated access modifier
	private void displayEmployeeName(String name)
	{
		System.out.println("my name is"+name);
	}
	//defoult
	void displayEmployeeId(int id) {
		System.out.println("my emplooye id is:"+id);
	}
	 //protected access modifier
	 protected void displayEmployeeSalary(double salary) {
		System.out.println("salary is:"+salary);
	}
	 //public acces modifier
    public void displayEmployeeBenefits(double insurancePercentag) {
		System.out.println("employee need to pay  hostpital cost"+insurancePercentag);
	}
	public static void main(String[] args) {
		
			Emplpyee eply1 = new Emplpyee();
			eply1.displayEmployeeName("jonh");//private but it is ok here
	}

}
