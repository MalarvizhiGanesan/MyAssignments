package Week4.day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class salesForce {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Asssignment1:Create New Opportunity
//		"Test Steps:
//		1. Login to https://login.salesforce.com
//		2. Click on toggle menu button from the left corner
//		3. Click view All and click Sales from App Launcher
//		4. Click on Opportunity tab 
//		5. Click on New button
//		6. Enter Opportunity name as 'Salesforce Automation by Your Name,Get the text and Store it 
//		7. Choose close date as Today
//		8. Select 'Stage' as Need Analysis
//		9. click Save and VerifyOppurtunity Name"
		//hari.radhakrishnan@qeagle.com
		//Leaf@123 
		
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
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_xx-small')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[name() = 'svg'][contains(@class, 'slds-icon slds-icon-text-default slds-icon_x-small')]")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Salesforce");
				
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']")).click();
		driver.findElement(By.xpath("//span[text()='19']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(5000);
		
		WebElement findElement=driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_neutral')]"));
		findElement.click();
		Thread.sleep(5000);
		
		String OptTitle = driver.findElement(By.xpath("(//span[@class='slds-text-body--regular slds-text-color--default slds-truncate slds-show'])[4]")).getAttribute("title");
		System.out.println(OptTitle);
		String OptName="Salesforce";
		System.out.println(OptName);
		if(OptName.equals(OptTitle))
		{
			System.out.println("Oppurtunity Name is Verified");
		}
		else
		{
			System.out.println("Oppurtunity Name is not Verified ");

		}
		Thread.sleep(5000);
		driver.close();
	}

}
