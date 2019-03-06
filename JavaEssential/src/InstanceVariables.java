
public class InstanceVariables {

	//ıntanse varaible
	String name;
	int age;
	//constructor method
	public InstanceVariables(String name)
	{
		this.name =name;
	}
	//set age
	public void setAge(int age)
	{this.age =age;
		
	}
	public void Balance(double balance) {
		double accountBalance = 20000;
		
	}
	//display info
	public void displayInfo() {
		System.out.println("name is "+ name);
		System.out.println("age is :"+ age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstanceVariables iv= new InstanceVariables("dani");
iv.setAge(6);
iv.displayInfo();
System.out.println(iv.age);
iv.Balance(16.885);
	}

}
