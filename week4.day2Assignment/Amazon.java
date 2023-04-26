package Week4.day2Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub

				/*Assignment 2 Amazon
				1.Load the URL https://www.amazon.in/
				2.search as one plus 9 pro 
				3.Get the price of the first product
				4. Print the number of customer ratings for the first displayed product
				5. Click the first text link of the first image
				6. Take a screen shot of the product displayed
				7. Click 'Add to Cart' button
				8. Get the cart subtotal and verify if it is correct.
				9.close the browser*/
			
			
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disableNotification");
			ChromeDriver driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
			driver.findElement(By.id("nav-search-submit-button")).click();
			String  price= driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
			
			Thread.sleep(3000);
			Actions act=new Actions(driver);
			WebElement mouseover = driver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-small')]"));
			act.moveToElement(mouseover).perform();
			
			Thread.sleep(3000);
			String outOf = driver.findElement(By.xpath("(//span[text()='3 out of 5'])[2]")).getText();
			System.out.println("Customer Ratings: "+outOf);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='s-image']")).click();
			Set<String> windowHandles = driver.getWindowHandles();		
			List<String> allList=new ArrayList<String>(windowHandles);
			driver.switchTo().window(allList.get(1));
			File source=driver.getScreenshotAs(OutputType.FILE);
			File destination=new File("./snapshot/oneplus.png");
			FileUtils.copyFile(source, destination);
			
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")).click();
			String Subtotal = driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).getText();
		
			if(price.equals(Subtotal))
			{
				System.out.println("Total Value is verified and it is equal");
			}
			else
			{
				System.out.println("Total Value is verified and it is not equal");
			}
			Thread.sleep(5000);
			driver.quit();
			

	}

}
