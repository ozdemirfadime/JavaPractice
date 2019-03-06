package inheritance;

public class BigBox extends Box{

	private int lenght;
	private int width;
	private int height;
	public BigBox(int l ,int w,int h)
	{  
		super(l,w);
		this.lenght =l;
		this.width =w;
		this.height =h;
	}
	public void displayBoxName(){
		System.out.println("ı am big  box v-class");
	}
//display area
	public void printAres() {
		double area =lenght * width*height ;
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
