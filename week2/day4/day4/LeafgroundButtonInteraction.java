package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
		String text = driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']")).getText();
		System.out.println("Get the Text : " +text);
		driver.findElement(By.xpath("//span[text()='Click']")).click();	
		String title = driver.getTitle();
		System.out.println("Title of the page : " +title);
		driver.navigate().back();
		
	    String text4 = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']")).getText();
	    boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
	    System.out.println(text4 +":" + enabled );
		   
		String text2 = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']")).getText();
	    Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
	    System.out.println(text2 +":"+ location);
	      
		String text3 = driver.findElement(By.xpath("//h5[text()='Find the Save button color']")).getText();
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println(text3 +":"+ cssValue);
		
		String text5 = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getText();
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println(text5 +":"+ size);
			
		driver.close();
		

		
	}

}
