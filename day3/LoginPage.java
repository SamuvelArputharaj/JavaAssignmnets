package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SJ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Samuvel");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arputharaj");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.close();
		
		
		

	}

}
