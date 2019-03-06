package polymorphsim;

public class Vehicle {
//prvatee variable
	private String make ;
	private String model ;
	private int year; 
	public Vehicle(String make,String model,int year)
	{
		this.make =make;
		this.model = model ;
		this.year = year;
				
	}
	//getter and setter methods

	
	public String getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//instance method 
	public void start()
	{
		System.out.println("starting");
	}
	public void stop() {
		System.out.println("stoping");
	}
}
