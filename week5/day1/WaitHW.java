package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHW {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		
		//Wait for Visibility (1 - 10 Sec)
		
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 //WebElement findElement = driver.findElement(By.xpath("(//span[text()='I am here'])[1]"));
		  //wait.until(ExpectedConditions.visibilityOf(findElement));
	    //wait.until(ExpectedConditions.textToBePresentInElement(findElement, "I am here"));
		  WebElement c1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='I am here'])[1]")));
  		  System.out.println("Wait for Visibility (1 - 10 Sec):" +c1.getText());
	  
		//Wait for Invisibility (1 - 10 Sec)
  		  
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		//WebElement findElement1 = driver.findElement(By.xpath("(//span[text()='I am about to hide'])[1]"));
		//wait.until(ExpectedConditions.invisibilityOf(findElement1));
		Boolean isdissapear = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//span[text()='I am about to hide'])[1]")));
		System.out.println("Wait for Invisibility (1 - 10 Sec):"+isdissapear );
		
	  //Wait for Text Change (1 - 10 Sec)
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
		String text = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
		if(text.contains(text)) {
	      driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
	    //WebElement findElement = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
	    //WebElement c2 = wait.until(ExpectedConditions.visibilityOf(findElement));
	      WebElement c2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Did you notice?']")));
	      System.out.println("Wait for Text Change (1 - 10 Sec):"+c2.getText());
		}
		else {
			System.out.println("Visibility not found");
		}
		
		//Wait for Clickability
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
		String text2 = driver.findElement(By.xpath("//span[text()='Click Second']")).getText();
		System.out.println("Click the Second Button:"+text2);
		
		driver.close();
		
	}

}
