package week2.day3;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		// Need to learn how to add implicit wait 
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Chennai");
		driver.findElement(By.name("lastname")).sendKeys("Madras");
		driver.findElement(By.name("reg_email__")).sendKeys("Chennai@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Chennai@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("NewChennai");
		
		// DropDown Selection & radio Button need to Work 
        driver.close();
	}

}
