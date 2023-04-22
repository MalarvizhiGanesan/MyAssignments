package Week4.day1Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykka {

	public static void main(String[] args) throws InterruptedException {
	/*1) Go to https://www.nykaa.com/
	2) Mouseover on Brands and Search L'Oreal Paris
	3) Click L'Oreal Paris
	4) Check the title contains L'Oreal Paris(Hint-GetTitle)
	5) Click sort By and select customer top rated
	6) Click Category and click Hair->Click haircare->Shampoo
	7) Click->Concern->Color Protection
	8)check whether the Filter is applied with Shampoo
	9) Click on L'Oreal Paris Colour Protect Shampoo
	10) GO to the new window and select size as 175ml
	11) Print the MRP of the product
	12) Click on ADD to BAG
	13) Go to Shopping Bag 
	14) Print the Grand Total amount
	15) Click Proceed
	16) Click on Continue as Guest
	17) Check if this grand total is the same in step 14
	18) Close all windows*/
			
		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.nykaa.com/");
			WebElement hold = driver.findElement(By.xpath("//a[text()='brands']"));
			Actions Build = new Actions(driver);
			Build.moveToElement(hold).perform();
			Thread.sleep(2000);
			driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[2]")).sendKeys(Keys.ENTER);
			String Loreal = driver.getTitle();
			//System.out.println(Loreal);
				if (Loreal.contains("L'Oreal Paris")) {
				System.out.println("The title is correct");
				}
				else {
					System.out.println("Page hasn't loaded to the correct title");
				}
				driver.findElement(By.xpath("//button[contains(@class,'1aucgde')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'top rated')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[@class='css-1do4irw']//div")).click();
 			Thread.sleep(1000);
 			driver.findElement(By.xpath("(//*[@class='arrow-icon'])[2]")).click();
			driver.findElement(By.xpath("(//*[@class='arrow-icon'])[2]")).click();
			driver.findElement(By.xpath("(//*[@class='arrow-icon'])[2]")).click();
			driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[2]")).click();
			
			Thread.sleep(5000);
 			driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764']//div)[2]")).click();
 			Thread.sleep(1000);
			String filterShampoo = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
			System.out.println(filterShampoo);
				if(filterShampoo.contains("Shampoo")) 
				{
					System.out.println("Filter applied and the value is Shampoo");
				}
				else 
				{
					System.out.println("Filter isn't applied");
			
				}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='css-1rd7vky']//div")).click();
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> newPageLoreal = new ArrayList<String>(windowHandles);
			driver.switchTo().window(newPageLoreal.get(1));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='180ml']")).click();
			String mrp = driver.findElement(By.xpath("//div[@class='css-1d0jf8e']")).getText();
			System.out.println(mrp);
			driver.findElement(By.xpath("//button[@class=' css-13zjqg6']")).click();
			driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
			driver.switchTo().frame(0);
			String grandTotal = driver.findElement(By.xpath("//span[contains(@class,'css-1um1mkq e171rb9k3')]")).getText();
			System.out.println(grandTotal);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]")).click();
			driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
			driver.findElement(By.xpath("(//span[@class='css-1b232xc ehes2bo3']//img)[2]")).click();
			String applepay = driver.findElement(By.xpath("(//div[@class='css-vlqrtx e1d9ugpt3']/p)[3]")).getText();
			System.out.println(applepay);
				if(applepay.equals(grandTotal)) {
					System.out.println("grand total is same");
				}else {
					System.out.println("Grand total changed");
				}
				driver.close();
			
				}
		}