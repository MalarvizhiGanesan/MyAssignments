package week2.day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///*http://leaftaps.com/opentaps/control/main
		 
		//Delete Lead:
		
		//1	Launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//2	Enter the username
		
		//3	Enter the password
		
		//4	Click Login
		
		//5	Click crm/sfa link
		
		//6	Click Leads link
		
		//7	Click Find leads
		
		//8	Click on Phone
		
		//9	Enter phone number
		
		//10	Click find leads button
		
		//11	Capture lead ID of First Resulting lead
		
		//12	Click First Resulting lead
		
		//13	Click Delete
		
		//14	Click Find leads
		
		//15	Enter captured lead ID
		
		//16	Click find leads button
		
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		//18	Close the browser (Do not log out)
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("92654320");
		Thread.sleep(5000);
		
		/*10. Click Find lead*/
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
		Thread.sleep(5000);
		
		/*11.Capture lead ID of First Resulting lead*/
		WebElement firstLeadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String firstResultingLead = firstLeadId.getText();
		System.out.println("Lead ID f first Resulting Lead "+firstResultingLead);
		Thread.sleep(5000);
		
		//12. Click First Resulting lead
		firstLeadId.click();
		Thread.sleep(5000);
		
		//13. Click Delete
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		//14. Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		//15. Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(firstResultingLead);
		Thread.sleep(5000);
		
		//16. Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		//17. Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement msg = driver.findElement(By.xpath("//div[text()='No records to display']"));
		Thread.sleep(5000);
		
		if (msg.isDisplayed()) {
			System.out.println("The captured LeadID Record deleted successfully");
			
		}
		else
		{
			System.out.println("The captured Lead ID  Record is not deleted");
		}
		//18. Close the browser (Do not log out)
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		


	}

}
