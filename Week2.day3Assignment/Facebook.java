package week2.day3Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*FaceBook:
			================================
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
			  ( A normal click will do for this step) */
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/");
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Malarvizhi");
				
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ganesan");
				
				
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number')]")).sendKeys("92763542");
				
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
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		Thread.sleep(5000);
		
				
		//Close browser
		driver.close();

	}

}
