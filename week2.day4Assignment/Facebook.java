package week2.day4Assignment;
import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Facebook {

	public static void main(String[] args) throws InterruptedException  
	{
		// TODO Auto-generated method stub
		
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		            //( A normal click will do for this step)

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/");
		
				// Step 6: Click on Create New Account button
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				Thread.sleep(5000);
						
				// Step 7: Enter the first name
				driver.findElement(By.xpath("(//div[contains(@class,'dbb')]/input)[1]")).sendKeys("Malarvizhi");
				Thread.sleep(5000);
						
				// Step 8: Enter the last name
				driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input)[1]")).sendKeys("Ganesan");
				Thread.sleep(5000);
						
						
				// Step 9: Enter the mobile number
				driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("92763542");
				Thread.sleep(5000);
						
				// Step 10: Enter the password
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Track");
				Thread.sleep(5000);
						
				// Step 11: Handle all the three drop downs
						
				Select date = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
				date.selectByValue("21");
				Thread.sleep(5000);
				
						
				Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
				month.selectByIndex(1);
				Thread.sleep(5000);
				
						
				Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
				year.selectByVisibleText("1978");
				Thread.sleep(5000);
				
						
				// Step 12: Select the radio button "Female" 
				driver.findElement(By.xpath("(//span[@data-name='gender_wrapper']//input)[1]")).click();
				Thread.sleep(5000);
				
						
				//Close browser
				driver.close();


	}

}
