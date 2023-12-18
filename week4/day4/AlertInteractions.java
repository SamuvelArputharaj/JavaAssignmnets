package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertInteractions {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://buythevalue.in/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.xpath("(//div[@class='product-image']/a)[1]")).click();
     Thread.sleep(3000);
     driver.findElement(By.id("wk_zipcode")).sendKeys("620007");
     driver.findElement(By.xpath("//input[@value='Check']")).click();
     String checkavailability = driver.findElement(By.xpath("//div[@class='wk_availability_msg']")).getText();
     Thread.sleep(1000);
     System.out.println("Check Availability :"+checkavailability);
     driver.findElement(By.xpath("//button[@value='Add to Cart']")).click();
     
     String text2 = driver.findElement(By.xpath("//strong[@class='product-title']")).getText();
     System.out.println(text2);
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//a[text()='View Cart'])[1]")).click();
   
     driver.findElement(By.id("checkout")).click();
     Alert alert = driver.switchTo().alert();
     String text = alert.getText();
     System.out.println("Verify the Terms:"+text);
     alert.accept();
     System.out.println("Alert popup handled ");
     driver.close();

	}

}
