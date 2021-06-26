package methodOverridingInSelenium;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Upcast is used to runtime Polymorphysium
		// Child class object is assigned to referance variable of the parent class
		ParentClass upcast = new ChildClass();
		
		upcast.launchApp();

	}

}
