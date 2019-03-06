package accesmodifiers;
import  accesmodifiers.Emplpyee;
public class AccessModifier extends Emplpyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplpyee eply1 = new Emplpyee();
	//	eply1.displayEmployeeName("jonh");//private 
		eply1.displayEmployeeId(122);
		AccessModifier e1 =  new AccessModifier();
		eply1.displayEmployeeSalary(1458.2);
		e1.displayEmployeeSalary(2000);
		eply1.displayEmployeeBenefits(25);
	}

}
