package week2.day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// /*http://leaftaps.com/opentaps/control/main
		
				//* 1	Launch the browser
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
			
				//* 8	Enter first name
					driver.findElement(By.xpath("//a[text()='Create Lead']/following::a")).click();
					Thread.sleep(5000);
		
				//* 9	Click Find leads button
					driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
					Thread.sleep(5000);

		
				
				//* 10 Click on first resulting lead
					WebElement firstleadwebelement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
					String firstResultingLead = firstleadwebelement.getText();
					System.out.println(firstResultingLead);
					firstleadwebelement.click();
					
						
				//* 11 Verify title of the page
					String tle = driver.getTitle();
					System.out.println(tle);

		
				//* 12 Click Edit
					driver.findElement(By.xpath("//a[text()='Qualify Lead']/following-sibling::a")).click();
					Thread.sleep(5000);
		
				//* 13 Change the company name
					WebElement webelement_companyname = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
					
					String companyname = webelement_companyname.getAttribute("value");
					System.out.println("Company name: "+companyname);
					
					webelement_companyname.clear();
					webelement_companyname.sendKeys("L&T");
					Thread.sleep(5000);
		
				//* 14 Click Update
					driver.findElement(By.xpath("//textarea[@name='importantNote']/following::input[@value='Update']")).click();
					Thread.sleep(5000);

		
				//* 15 Confirm the changed name appears
					String changedcompanyname = driver.findElement(By.xpath("(//span[text()='Company Name']/following::span)[1]")).getText();
					//System.out.println("Changed company name is : "+changedcompanyname);
					
					if (changedcompanyname.contains("BOA")) {
						
						System.out.println("company name changed successfully: "+changedcompanyname);
						
					}
					else
					{
						System.out.println("company name not canged: "+changedcompanyname);
					}
					
					// 16 Close the browser (Do not log out)
					driver.close();

		
				//* 16 Close the browser (Do not log out
		



	}

}
