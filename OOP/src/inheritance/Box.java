package inheritance;

public class Box {
//
	private int lenght;
	private int  width ;
	private int height;
	
	//constructor
	public Box(int l,int w) {
		this.lenght = l;
		this.width = w;
		
		}
		
		//displaya box name
		public void displayBoxName(){
			System.out.println("ı am parent box v-class");
		}
	
}
