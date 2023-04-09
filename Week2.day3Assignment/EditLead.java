package week2.day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/* http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		//8. Enter FirstName Field Using id Locator
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Malarvizhi");
		/*9. Click Find leads button*/
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
		Thread.sleep(5000);
		
		/*10.Capture lead ID of First Resulting lead and click first resulting lead*/
		WebElement firstLeadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String firstResultingLead = firstLeadId.getText();
		System.out.println("Lead ID f first Resulting Lead "+firstResultingLead);
		Thread.sleep(5000);
		firstLeadId.click();
		Thread.sleep(5000);
		
		//11. Verify title of the page
		String Title = driver.getTitle();
		System.out.println(Title);
		Thread.sleep(5000);
		
		
		if (Title.equalsIgnoreCase("View Lead | opentaps CRM")) {
			
			System.out.println("Displayed View Lead Page");
		}
		
		else
		{
			System.out.println("View page not displayed");
		}
		
		// 12. Click Edit
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(5000);
		
		// 13. Change the company name
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		String actualCompanyName = companyName.getText();
		Thread.sleep(5000);
		
		String update_companyName="HCL";
		Thread.sleep(5000);
		
		companyName.clear();
		companyName.sendKeys(update_companyName);
		Thread.sleep(5000);
		
		// 14 Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(5000);
		
		// 15 Confirm the changed name appears
		String companyname_afterUpdate = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		Thread.sleep(5000);
		
		if (companyname_afterUpdate.contains(update_companyName)) {
			System.out.println("updated CompanyName "+ companyname_afterUpdate );
			
		}
		else
		{
			System.out.println("CompanyName not updated");
		}
		// 16 Close the browser (Do not log out)
		
		driver.close();
	}

}
