package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement s1 = driver.findElement(By.id("createLeadForm_dataSourceId"));	
		 Select dropdown =new Select(s1);
		 dropdown.selectByIndex(7);
		 
		WebElement s2 = driver.findElement(By.name("marketingCampaignId"));		
		Select dropdown2 = new Select(s2);
		   dropdown2.selectByValue("CATRQ_CAMPAIGNS");
		   
		 WebElement s3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select dropdown3 = new Select(s3);
		 dropdown3.selectByVisibleText("Computer Software");
		   driver.close();
		 
		
		

	}

}
