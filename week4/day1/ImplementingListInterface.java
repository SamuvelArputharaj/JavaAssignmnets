package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
	    //Print the Count	
		String count = driver.findElement(By.xpath("//strong[text()=' Items Found']")).getText();
		System.out.println("Item found:"+count);

		//Print the BagName
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String>ls=new ArrayList<String>();
		for(int i=0; i<elements.size();i++) {
			//System.out.println(elements.get(i).getText());
			String  bagsName = elements.get(i).getText();
		    ls.add(bagsName);	
		}
		   System.out.println("bagNames:"+ls);
		   
		//Print the List of brand 
		List<String>ls1=new ArrayList<String>();
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='brand']"));
		for(int i=0; i<elements2.size();i++) {
			String brandNames = elements2.get(i).getText();
			ls1.add(brandNames);
		}
		System.out.println("brandNames:"+ls1);
		
		driver.close();

	}

}
