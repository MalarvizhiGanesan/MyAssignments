package Week4.day3Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class salesForce2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		/*Assignment2:Create Opportunity without mandatory fields
		1. Login to https://login.salesforce.com
		2. Click on toggle menu button from the left corner
		3. Click view All and click Sales from App Launcher
		4. Click on Opportunity tab 
		5. Click on New button
		6. Choose Close date as Tomorrow Date
		7. Click on save 
		8. Verify the Alert message (Complete this field) displayed for Name and Stage"*/
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-Notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		
		//String windowHandle = driver.getWindowHandle();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
		
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_xx-small')]")).click();
			
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_x-small')]")).click();
				
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']")).click();
		driver.findElement(By.xpath("//span[text()='20']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Opportunity Name']")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Salesforce");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Stage']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		Thread.sleep(5000);
						
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
