package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionswithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// Click on the "Basic Checkbox.”
		WebElement s1 = driver.findElement(By.xpath("//span[text()='Basic']"));
		s1.click();
		System.out.println("Basic checkbox is selected");
//Click on the "Notification Checkbox."
		WebElement s2 = driver.findElement(By.xpath("//span[text()='Ajax']"));
		s2.click();
		System.out.println("Notification Checkbox is selected");
//Verify that the expected message is displayed.
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 String text = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		 if(text.equalsIgnoreCase("Checked")) {
			 System.out.println("Verify the expected message is displayed for Notification :" + text);	 
		 }
		 else {
			 System.out.println("Expected Message not displayed");
		 }		
//Click on your favorite language (assuming it's related to checkboxes).	
		WebElement s3 = driver.findElement(By.xpath("//label[text()='Java']"));		
		s3.click();
//Click on the "Tri-State Checkbox."
		WebElement s4 = driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]"));		
		s4.click();		
//Verify which tri-state option has been chosen.
	  //Need clarity on above	
//Click on the "Toggle Switch."
		WebElement s5 = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));		
		s5.click();		
//Verify that the expected message is displayed.
		 Thread.sleep(3000);
		 String text2 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();	
		 
		 if(text2.equalsIgnoreCase("Checked")) {
			 System.out.println("Verify the expected message is displayed after Toggle :" + text2); 
		 }
		 else {
			 System.out.println("Expected Message not displayed");
		 }
//Verify if the Checkbox is disabled. 
		 boolean selected = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isSelected();
		 System.out.println("isCheckbox is disabled : "+selected);
//Select multiple options on the page (details may be needed).
		 driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		 driver.findElement(By.xpath("//li[@data-item-value='Miami']//label")).click();
		 driver.findElement(By.xpath("//li[@data-item-value='Paris']//label")).click();
		 driver.findElement(By.xpath("//li[@data-item-value='Rome']//label")).click();
// Uncheck the Miami & verify is unslected
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//span[@class='ui-selectcheckboxmenu-token-icon ui-icon ui-icon-close'])[3]")).click();
		 driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		 boolean selected2 = driver.findElement(By.xpath("//label[text()='Miami']")).isSelected();
		 String text3 = driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).getText();
		 System.out.println("Veriy the " +text3+" is unselected :"+ selected2);	
		driver.close();	
	}
}
