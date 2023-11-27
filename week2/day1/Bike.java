package week2.day1;

public class Bike {

   public void applyBrake() {
		
		System.out.println("Applied break for Bike");		
	}
	
	public void soundHorn() {
		
		System.out.println("sound horn for Bike ");
	}
	
	public static void main(String[] args) {
		
		Car automobile1 = new Car();
		Bike automobile2 =new Bike();
		
		automobile1.applyBrake();
		automobile1.soundHorn();
		
		automobile2.applyBrake();
		automobile2.soundHorn();
	
	}
	

	
	
}
