package week3.day4;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Submit");
	}

	public static void main(String[] args) {
		
		Button s1 = new Button();
		s1.click();
		s1.setString("Test");
		s1.submit();
	}
}
