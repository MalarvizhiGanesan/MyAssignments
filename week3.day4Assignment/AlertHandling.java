package week3.day4Assignment;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/alert.xhtml");
		

		//Handle Alert (Simple Dialog)
		driver.findElement(By.xpath("(//button[contains(@class,'ui-button-outlined')])[1]")).click();
			
		//Handle simple alert
		Alert alert = driver.switchTo().alert();
		
		//click OK button	
		alert.accept();
			
		String text = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(text);
		
		//Handle Confirmation alert
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-warning')]")).click();
		
		alert.accept();//Click OK button
		
		//Get the displayed text
		String txt1 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(txt1);
				
		//Handling Sweet Alert1
		driver.findElement(By.xpath("(//button[contains(@onclick,'show')])[1]")).click();
		
		//click dismiss button
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
				
		//Handling Sweet Alert2
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-help')]")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
				
		//Handling Prompt Alert
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-success')]")).click();
		alert.sendKeys("MG");
		alert.accept();
		
		//Get displayed text from screen
		String txt2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(txt2);
		
		//Handling Sweet confirmation Alert
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-danger')]")).click();
		Thread.sleep(5000);
		
		//Click Yes Button
		driver.findElement(By.xpath("//button[contains(@class,'ui-confirmdialog-yes')]")).click();
		Thread.sleep(5000);	
		
		//Handling Minimize and Maximize Alert
		driver.findElement(By.xpath("(//button[contains(@class,'ui-button-outlined')])[2]")).click();
		Thread.sleep(2000);
		
		//Click Maximize icon
		driver.findElement(By.xpath("//a[contains(@class,'ui-dialog-titlebar-maximize')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		driver.close();

	}

}
