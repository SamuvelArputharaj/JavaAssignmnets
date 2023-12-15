package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRcinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='thumnail clearfix']/img)[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.name("city"));
		Select dropdown1 = new Select(city);
		dropdown1.selectByVisibleText("Chennai");
		Thread.sleep(1000);
		
		WebElement genre = driver.findElement(By.name("genre"));
		Select dropdown2 = new Select(genre);
		dropdown2.selectByVisibleText("ANIMATION");
		Thread.sleep(1000);

		WebElement lang = driver.findElement(By.name("lang"));
		Select dropdown3 = new Select(lang);
		dropdown3.selectByVisibleText("ENGLISH");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(5000);
		
	String text = driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted'][1]")).getText();
	System.out.println("Moviename:" +text);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted'][1]")).click();
	driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
	
	WebElement cinemaName = driver.findElement(By.name("cinemaName"));
	Select cN= new Select(cinemaName);
	cN.selectByVisibleText("PVR Theyagaraja Thiruvanmiyur Chennai");
	
	WebElement timings = driver.findElement(By.name("timings"));
	Select tmg= new Select(timings);
	tmg.selectByVisibleText("06:00 PM - 09:00 PM");
	
	//driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
	//driver.findElement(By.xpath("(//span[text()='29'])[2]")).click();
	
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Samuvel");
	driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@gmail.com");
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("1236549877");
	
	WebElement food = driver.findElement(By.xpath("//select[@name='food']"));
	Select fd= new Select(food);
	fd.selectByVisibleText("Yes");
	
	driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No");
	
   driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
   driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
   String text2 = driver.findElement(By.xpath("//div[text()='Daily limit exceeded.']")).getText();
   
   if(text2.equals(text2)) {
	  driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
	    System.out.println("Exceed daily Limt : "+"Close the OTP dialog box "); 
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page:"+pageTitle);
		driver.close();
   }
   
 else {
   driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
   driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
   
   System.out.println("Postive flow : "+"Close the OTP dialog box ");
   
	String pageTitle = driver.getTitle();
	System.out.println("Title of the page:"+pageTitle);
	driver.close();
		
   }	
		
	}

}
