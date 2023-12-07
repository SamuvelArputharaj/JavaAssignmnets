package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//Select 'Your most favourite browser' from the radio buttons
	    String text = driver.findElement(By.xpath("//h5[contains(text(),'Your most favorite browser')]")).getText();
	    String text7 = driver.findElement(By.xpath("//label[text()=\"Chrome\"]")).getText();     
		boolean selected = driver.findElement(By.xpath("(//h5[text()='Your most favorite browser']/following::span)[1]")).isSelected();
		System.out.println(text +": "+ text7+"-" +selected);
		if(selected==false) {
			driver.findElement(By.xpath("//label[text()=\"Chrome\"]")).click();
			Thread.sleep(5000);
			boolean selected2 = driver.findElement(By.xpath("(//h5[text()='Your most favorite browser']/following::span)[1]")).isSelected();			
			System.out.println(text +" :" +text7+"-"+ selected2);
		}
		else {
			System.out.println("radio button not selected");
		}
		
//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’
		String text2 = driver.findElement(By.xpath("//h5[text()='UnSelectable']")).getText();
		String text5 = driver.findElement(By.xpath("//label[text()='Chennai']")).getText();
		boolean selected2 = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		if(selected2==false) {
			WebElement check = driver.findElement(By.xpath("//label[text()='Chennai']"));
			check.click();
			System.out.println(text2 + " : " +text5 +" "+selected2 );
			boolean selected3 = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
			if(selected3==true) {
				WebElement check2 = driver.findElement(By.xpath("//label[text()='Chennai']"));
				check2.click();
				System.out.println(text2 + " :" +text5 +" "+selected2 );
			}
			else {
				System.out.println(text5 +" :"+ "radio button  still selected ");
			}
		}
		else {
			System.out.println("radio button unchecked");
		}
	
//Identify the radio button that is initially selected by default.		
		String text3 = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']")).getText();
		 boolean selected3 = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();	 
		 if(selected3==true) {
			 String text4 = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).getText();
			 System.out.println(text3 + " :"+ text4);
		 }
		 else {
			 System.out.println("radio button is not selected ");
		 }
		 
//Check and select the age group (21-40 Years) if not already selected		 
		 String text4 = driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']")).getText();
		 boolean selected4 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		 if(selected4==true) {		 
			 System.out.println(text4 +" :"+ " radio button selected default ");
		 }
		 else {
			 WebElement check = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
			 check.click();
			 String text6 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).getText();
			 System.out.println(text6 + " :"+"radio button Unchecked ");
		 }
		Thread.sleep(3000);		
		driver.close();		     
	}
}

// why isSelected  always showing false after radio button is clicked ?
// when to use isEnabled and isSelected