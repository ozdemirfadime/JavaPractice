package inheritance;

public class Employee extends Person {
 private String SSN;

public String getSSN() {
	return SSN;
}

public void setSSN(String SSN) {
	this.SSN = SSN;
}
}
class InheritanceExample{
	public void main(String args[])
	{ //create person object
		Person person1 = new Person();
		person1.setName("james");
		person1.setAge(35);
		//System.out.println(String.format("%d 's name %s age", person1.getAge(),person1.getName()));
				
		
		//create Employee object 
		Employee eple1 = new Employee();
		eple1.setName("john");
		eple1.setAge(30);
		eple1.setSSN("123-785-895");
		System.out.println(String.format("%s's whose ssn %s  %s age",eple1.getName(),eple1.getSSN(),eple1.getAge()));
	}
}