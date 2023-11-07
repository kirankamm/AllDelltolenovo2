package Bar;

public class DisplayDisplay {

	public DisplayDisplay() {
		
		System.out.println(this.getClass().getSimpleName()+"object is created");
		
		DisplayDisplay   displayDisplay=new DisplayDisplay();
		System.out.println(displayDisplay);
		
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("starded");
		DisplayDisplay   displayDisplay=new DisplayDisplay();

		
		System.out.println(displayDisplay);
		System.out.println("ended");

		
		
	}
	
}
