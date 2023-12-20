package week4.day3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class SnapdealWithActions {

	public static void main(String[] args) throws InterruptedException, IOException {
       ChromeOptions opt = new ChromeOptions();
       opt.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(1000);
		//Perform Mouse hover to Click Mens fashion
		Actions builder = new Actions(driver);
		WebElement mensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		builder.moveToElement(mensFashion).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		String countOfShoes = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Count of Shoes :"+countOfShoes);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		
		// Need to work on items displayed sorted after applied filter 
		
		String text = driver.findElement(By.xpath("//span[@class='lfloat product-price']")).getText();
		System.out.println("Verify the Price Sorted:"+text);
		
		// Need to work on slider & verify the filter pills
		
		/*Thread.sleep(3000);
		WebElement scrol1 = driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		WebElement scrol2 = driver.findElement(By.xpath("//a[@class='price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		builder.clickAndHold(scrol1).moveByOffset(500, 0).release().perform();
		builder.clickAndHold(scrol2).moveByOffset(700, 0).release().perform();
		
		driver.findElement(By.xpath("(//label[@for='Color_s-White%20%26%20Blue']/span)[1]")).click();
		//System.out.println(selected);
		String text2 = driver.findElement(By.xpath("//div[@class='filters']")).getText();
		if(text2.equals(text2)) {
			System.out.println("Verified the Applied filters");		
		}
		else {
			System.out.println("Filter not verified");
		}*/
		
		WebElement hover = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
        builder.moveToElement(hover).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
        
        Thread.sleep(1000);
        String actualPrice = driver.findElement(By.xpath("//div[@class='product-desc-price pdp-e-i-PAY-r ']")).getText();
	    System.out.println("Actual Price:" +actualPrice);
	    
	    String discountPrice = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
	    System.out.println("Discount Price :"+ discountPrice);
	    
	    driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
	    
	    WebElement hover1 = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
        builder.moveToElement(hover1).perform();
        driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]")).click();
        
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> ls = new ArrayList<String>(windowHandles);
        driver.switchTo().window(ls.get(1));
        
        // To take snapshot
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    // To Save file 
	    File dest = new File("./snap/snapdeal.png");
	    //merge the source & destination
	    FileUtils.copyFile(source, dest);
	    System.out.println("ScreenShot captured");
	
	    driver.switchTo().window(ls.get(1)).close();
	    driver.switchTo().window(ls.get(0)).close();
	}
	
	

}
