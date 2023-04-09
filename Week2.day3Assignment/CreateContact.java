package week2.day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
         */		
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		 		
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");					
		driver.findElement(By.id("password")).sendKeys("crmsfa");
						
		// 3.Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
				
		//4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		// 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
				 
		//6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
				
		//7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Malarvizhi");
				
				
		//8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Ganesan");
		Thread.sleep(5000);
				
		//9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Malarvizhi");
		Thread.sleep(5000);
				
		//10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ganesan");
		Thread.sleep(5000);
				
		//11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		Thread.sleep(5000);
				
		// 12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("create contact for Malarvizhi");
		Thread.sleep(5000);
				
		// 13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("malarvizhiganesan2@gmail.com");
		Thread.sleep(5000);
		
		//14. Select State/Province as NewYork Using Visible Text
		Select state = new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
		state.selectByVisibleText("New York");
		Thread.sleep(5000);
				
		//15.  Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		
		//16. Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(5000);
		
		//17. Clear the Description Field using .clear
		WebElement description = driver.findElement(By.name("description"));
		description.clear();
		Thread.sleep(5000);
				
		// 18. Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Edit contact of Malarvizhi");
		Thread.sleep(5000);
				
				
		//19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(5000);
				
		//20. Get the Title of Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
				
		//Close Browser
		driver.close();
		Thread.sleep(5000);

	}

}