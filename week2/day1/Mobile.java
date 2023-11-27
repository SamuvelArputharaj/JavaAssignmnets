package week2.day1;

public class Mobile {
	
	public void makeCall(String mobileModel, float mobileWeight) {
		
		System.out.println("mobileModel : " +mobileModel +"\n" + "MobileWeight:" +mobileWeight );
		
	}
	
	public void sendMsg(boolean isFullyCharged,int mobileCost) {
		
		System.out.println("isFullyCharged: " +isFullyCharged +"\n"  +"mobileCost :" +mobileCost );
	}

	public static void main(String[] args) {
		
		Mobile phone = new Mobile();
		System.out.println("This is My Mobile");
		phone.makeCall("Sony", 120.4f);
		phone.sendMsg(true, 20000);		
		
	}









}







