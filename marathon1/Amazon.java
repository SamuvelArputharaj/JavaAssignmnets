package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("bags for mens");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
        Thread.sleep(1000);
        String totalResult = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText();
		System.out.println("TotalResults: "+totalResult);
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(1000);
		String nameOfBag = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]")).getText();
		System.out.println("Bag Name :"+nameOfBag);
		
		String discountPrice = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println("Discounted Price :" +discountPrice );
		String title = driver.getTitle();
		System.out.println("Titel : " +title);
		
		driver.close();
		

	}

}
