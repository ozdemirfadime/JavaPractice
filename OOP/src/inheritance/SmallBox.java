package inheritance;

public class SmallBox extends Box {
		
	private int lenght;
	private int width;
	public SmallBox(int l ,int w)
	{  
		super(l,w);
		this.lenght =l;
		this.width =w;
	}
	public void displayBoxName(){
		System.out.println("ı am child box v-class");
	}
//display area
	public void printAres() {
		double area =lenght * width ;
		System.out.println(area);
	}

}
	