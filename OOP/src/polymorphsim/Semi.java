package polymorphsim;

public class Semi extends  Vehicle{
	
public Semi(String make , String model,int year)
{
	super(make,model,year);
}
//start method
public void start()
{
	System.out.println(String.format("%s %s %d starting", getMake(),getModel(),getYear()));
}
//call stop method
public void stop()
{
	System.out.println(String.format("%s %s %d sttooping", getMake(),getModel(),getYear()));
}
}
