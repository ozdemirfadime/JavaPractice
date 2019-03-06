package abstraction;

public abstract class Custumer {
	private String name;
	private String address;
	//getter and setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//abstract method
	public abstract String getCustumerInfo();
	
}
