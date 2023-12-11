package week3.day5;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("Perform the common task of LoginPage");
	}

	public static void main(String[] args) {
		LoginPage lp =new LoginPage();
		lp.performCommonTasks();
		
	}
}
