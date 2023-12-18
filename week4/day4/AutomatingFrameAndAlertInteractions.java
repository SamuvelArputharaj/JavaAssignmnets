package week4.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlertInteractions {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//driver.switchTo().frame(1);
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("Samuvel Arputharaj");
		alert.accept();
		String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text2);
		if(text2.contains("Samuvel")) {
			System.out.println("Alert is handel");
		}
		else {
			System.out.println("Alert is not handel");
		}
		driver.close();
		
		

	}

}
