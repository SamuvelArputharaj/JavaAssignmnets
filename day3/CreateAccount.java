package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("SJ ACCOUNT");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
	    WebElement s1 = driver.findElement(By.name("industryEnumId"));
	    Select dropdown =new Select(s1);
	    dropdown.selectByValue("IND_SOFTWARE");
	    
	    WebElement s2 = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(s2);
		dropdown2.selectByVisibleText("S-Corporation");
		
		WebElement s3 = driver.findElement(By.id("dataSourceId"));
		Select dropdown3 =new Select(s3);
		dropdown3.selectByIndex(4);
		
		WebElement s4 = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4 = new Select(s4);
		dropdown4.selectByValue("9000");
		
		WebElement s5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(s5);
		dropdown5.selectByVisibleText("Texas");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
		
		

	}

}
