package interfaceexampale;

public class Ford implements Vehicle{
	@Override
	public void start() {
		System.out.println("stasring");
	}
	@Override
	public void stop()
	{		System.out.println("stopping");
		
	}
	@Override
	public void cruise()
	{
		System.out.println("cruesing");
	}

	public static void main(String args[])
	{
		Ford f15 = new Ford();
		f15.start();
		f15.stop();
		f15.cruise();
		//Vehicle v15 = new Vehicle() ;//vehicle abstract 
		
			
	
	}
}
