package week2.day3;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Chennai");
		driver.findElement(By.name("lastname")).sendKeys("Madras");
		driver.findElement(By.name("reg_email__")).sendKeys("Chennai@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Chennai@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("NewChennai");
		
		WebElement s1 = driver.findElement(By.id("day"));
		Select dropdown = new Select(s1);
		dropdown.selectByValue("19");
		
		WebElement s2 = driver.findElement(By.id("month"));
		Select dropdown2 = new Select(s2);
		dropdown2.selectByVisibleText("Jun");
		
		WebElement s3 = driver.findElement(By.id("year"));
		Select dropdown3 = new Select (s3);
		dropdown3.selectByValue("1993");
		
		
		WebElement radioButton = driver.findElement(By.xpath("//label[text()='Male']"));
		radioButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		// DropDown Selection & radio Button need to Work 
		
		
		
        driver.close();
	}

}
