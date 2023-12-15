package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		String title = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("Print the name of the first resulting bus: " + title);
		driver.findElement(By.xpath("(//a[@class='btn  outlined tertiary sm inactive button']/span)[8]")).click();
		String seatsAvailable = driver.findElement(By.xpath("(//div[@class='text-grey'])[1]/small")).getText();
		System.out.println("Print the first resulting bus seat count :" +seatsAvailable );
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search Boarding Point']")).sendKeys("shol");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		String boardingPoint = driver.findElement(By.xpath("(//div[@class='row bnd-info'])[1]")).getText();
		System.out.println(boardingPoint);
		
		driver.findElement(By.xpath("//input[@placeholder='Search Dropping Point']")).sendKeys("hos");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		String droppingPoint = driver.findElement(By.xpath("(//div[@class='row bnd-info'])[2]")).getText();
		System.out.println(droppingPoint);
	
		String seatSelected = driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
		System.out.println(seatSelected );
		String baseFare = driver.findElement(By.xpath("(//div[@id='seating-selected-seat-details']/span)[2]")).getText();
		System.out.println(baseFare);
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page:"+pageTitle);
		driver.close();
		
		
		

	}

}
