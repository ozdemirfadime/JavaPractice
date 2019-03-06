
public class Car {
	String make;
	String model;
	int year;
	
	//constructor method with param
	public Car(String make,String model,int year)
	{
		this.make =make ;
		this.model =model;
		this.year =year;
		
	}
	/*
	//getter method
	public String getMake()
	{
		return make;
			}
	public String getModel() {
		return model;
	}
	public int getYear()
	{
		return year;
	}
	
	// setter  method
	public  void setMake(String newMake) {
		this.make = newMake;
	}
	public  void setModel(String newModel) {
		this.model = newModel;
	}
	public  void setYear(int  newYear) {
		this.year = newYear;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
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

}
