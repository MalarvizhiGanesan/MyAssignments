package week2.day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// /*http://leaftaps.com/opentaps/control/main
		 
		//1	Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		//2	Enter the username and //3	Enter the password
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Democsr");
		driver.findElement(By.xpath("(//input[@id='username']/following::input)[1]")).sendKeys("crmsfa");
		Thread.sleep(5000);
		
		//4	Click Login
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		Thread.sleep(5000);
		
		//5	Click crm/sfa link
		 driver.findElement(By.xpath("//div[@id='label']/a")).click();
		 Thread.sleep(5000);
		
		//6	Click Leads link
			driver.findElement(By.xpath("//a[text()='Contacts']/preceding::a[text()='Leads']")).click();	
			Thread.sleep(5000);
		//7	Click Find leads
			driver.findElement(By.xpath("//a[text()='Create Lead']/following::a")).click();
			Thread.sleep(5000);
		
		//8	Click on Email
			driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Email']")).click();
			Thread.sleep(5000);
		
		//9	Enter Email
			driver.findElement(By.xpath("(//label[text()='Email Address:']/following::input)[1]")).sendKeys("malarvizhiganesan2@gmail.com");
			Thread.sleep(5000);
				
		//10	Click find leads button
			
			driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
			Thread.sleep(5000);
		
		//11	Capture name of First Resulting lead
			WebElement firstleadwebelement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
			String firstResultingLead = firstleadwebelement.getText();
			System.out.println(firstResultingLead);

		
		//12	Click First Resulting lead
			firstleadwebelement.click();
			Thread.sleep(2000);
			String leadname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
			System.out.println(leadname);

		//13	Click Duplicate Lead
			driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
		
		//14	Verify the title as 'Duplicate Lead'
			String currentPageTitle = driver.getTitle();
			System.out.println(currentPageTitle);

		
		//15	Click Create Lead
			driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']/following::input")).click();
			

		
		//16	Confirm the duplicated lead name is same as captured name
			String duplicatedLeadname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
			System.out.println(duplicatedLeadname);
			
			if (duplicatedLeadname.equalsIgnoreCase(leadname)) {
				System.out.println("Duplicate lead name: "+ duplicatedLeadname+" is same captured lead name: "+leadname);
				
			}
			else
			{
				System.out.println("Dupliacted lead name is not same as captured Leadname");
				
			}

		
		//17	Close the browser (Do not log out)
		
			driver.close();
			



	}

}
