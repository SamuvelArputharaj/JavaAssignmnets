package week3.day4;

public class TextField extends WebElement {

	public void getText() {
		System.out.println("getText");
	}
	
	public static void main(String[] args) {
		
		TextField s2 = new TextField();
		
		s2.click();
		s2.setString("Test2");
		s2.getText();
	}
}
