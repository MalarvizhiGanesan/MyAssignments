package week2.day3Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("malarvizhiganesan2@gmail.com");
		
		/*14. Click Find lead*/
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
		
		WebElement leadfirstname= driver.findElement(By.id("viewLead_firstName_sp"));
		String leadname = leadfirstname.getText();
		
		//13	Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		Thread.sleep(5000);
		
		//14	Verify the title as 'Duplicate Lead'
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		
		if (actualTitle.equalsIgnoreCase("Duplicate Lead | opentaps CRM")) {
			
			System.out.println("Duplicate Lead");
			Thread.sleep(5000);
		}
		
		else
		{
			System.out.println("not a Duplicate lead");
			Thread.sleep(5000);
		}
		//15	Click Create Lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(5000);
		
		//16	Confirm the duplicated lead name is same as captured name
		WebElement duplicatename = driver.findElement(By.id("viewLead_firstName_sp"));
		String originallead = duplicatename.getText();
		Thread.sleep(5000);
		
		if (originallead.equalsIgnoreCase(leadname)) {
			System.out.println("Duplicate lead name is same as Captured " + originallead);
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("Duplicate lead name is not same as Captured name ");
			Thread.sleep(5000);
		}
		//17	Close the browser (Do not log out)
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
