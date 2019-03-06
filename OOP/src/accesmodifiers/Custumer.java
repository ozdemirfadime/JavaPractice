package accesmodifiers;

public class Custumer {
	private int age =40;
	private void msg(String name) 
	{
		System.out.println(String.format("% name is ",name));
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class PrivateExample{		
public void main(String args[]) {
	Custumer customer1 = new Custumer();
	System.out.println(customer1.getAge());
	//customer1..msg("hani");
	
}
	
}

		
	



