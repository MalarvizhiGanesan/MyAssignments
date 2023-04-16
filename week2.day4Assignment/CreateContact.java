package week2.day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//*
		 //* //Pseudo Code
		 
		 //* 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 //* 2. Enter UserName and Password Using Id Locator
			driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Democsr");
			driver.findElement(By.xpath("(//input[@id='username']/following::input)[1]")).sendKeys("crmsfa");
			Thread.sleep(5000);
		 
		 //* 3. Click on Login Button using Class Locator
			driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
			Thread.sleep(5000);
		 
		 //* 4. Click on CRM/SFA Link
			 driver.findElement(By.xpath("//div[@id='label']/a")).click();
			 Thread.sleep(5000);
		  
		// * 5. Click on contacts Button
			 driver.findElement(By.xpath("//a[text()='Contacts']/parent::div")).click();
			 Thread.sleep(5000);
		  
		 //* 6. Click on Create Contact
			 driver.findElement(By.xpath("(//a[text()='My Contacts']/following::a)[1]")).click();
			 Thread.sleep(5000);
		  
		 //* 7. Enter FirstName Field Using id Locator
			 driver.findElement(By.xpath("(//span[text()='First name']/following::input)[1]")).sendKeys("Malarvizhi");
		 
		 //* 8. Enter LastName Field Using id Locator
			 driver.findElement(By.xpath("(//span[text()='Last name']/following::input)[1]")).sendKeys("Ganesan");
			 Thread.sleep(5000);
		  
		 //* 9. Enter FirstName(Local) Field Using id Locator
			 driver.findElement(By.xpath("//span[text()='First Name (Local)']/following::input")).sendKeys("Malar");
			 Thread.sleep(5000);
		  
		 //* 10. Enter LastName(Local) Field Using id Locator
			 driver.findElement(By.xpath("(//span[text()='Last Name (Local)']/following::input)[1]")).sendKeys("Gan");
			 Thread.sleep(5000);
		 
		// * 11. Enter Department Field Using any Locator of Your Choice
			 driver.findElement(By.xpath("(//span[text()='Department']/following::input)[1]")).sendKeys("CSE");
		 
		// * 12. Enter Description Field Using any Locator of your choice 
			 driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).sendKeys("TestLeaf");
		 
		// * 13. Enter your email in the E-mail address Field using the locator of your choice
			 driver.findElement(By.xpath("//textarea[@name='description']/following::input[@name='primaryEmail']")).sendKeys("malargan@gmail.com");		 
	 
		// * 14. Select State/Province as NewYork Using Visible Text
			 WebElement webelement_state = driver.findElement(By.xpath("//span[text()='State/Province']/following::select[@name='generalStateProvinceGeoId']"));
			 Select state_dropdown=new Select(webelement_state);
			 state_dropdown.selectByVisibleText("New York");
			 Thread.sleep(5000);
			 
		// * 15. Click on Create Contact
			 driver.findElement(By.xpath("//td[@class='label']/following::input[@name='submitButton']")).click();
			 Thread.sleep(5000);
			 
		 //* 16. Click on edit button 
			 driver.findElement(By.xpath("//a[text()='Deactivate Contact']/preceding-sibling::a")).click();
			 Thread.sleep(5000);
		 
		// * 17. Clear the Description Field using .clear
			 driver.findElement(By.xpath("//span[text()='Important Note']/preceding::textarea")).clear();
			 Thread.sleep(5000);
				 
		 //* 18. Fill ImportantNote Field with Any text
			 driver.findElement(By.xpath("//span[text()='Important Note']/following::textarea")).sendKeys("Test");
			 

		// * 19. Click on update button using Xpath locator
			 driver.findElement(By.xpath("//td[@class='label']/following::input[@value='Update']")).click();
		 
		 //* 20. Get the Title of Resulting Page.
			 String TitleoftheResultingPage= driver.getTitle();
			 System.out.println(TitleoftheResultingPage);
			 
			 driver.close();
        
		
	}



	}


