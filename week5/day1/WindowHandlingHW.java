package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingHW {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
	    List<String>ls= new ArrayList<String>(windowHandles);
	    WebDriver window = driver.switchTo().window(ls.get(1));
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	    
	    driver.switchTo().window(ls.get(0));
	      
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(1000);
		
		Set<String> windowHandles1 = driver.getWindowHandles();
	    List<String>ls1= new ArrayList<String>(windowHandles1);
	    WebDriver window1 = driver.switchTo().window(ls1.get(1));
	    Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		driver.switchTo().window(ls.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println("Tilte:"+title);
		

	}

}
