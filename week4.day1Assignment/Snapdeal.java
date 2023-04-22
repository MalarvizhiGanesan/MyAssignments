package Week4.day1Assignment;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mongodb.MapReduceCommand.OutputType;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		Assignment 1:
			============
			1. Launch https://www.snapdeal.com/
			2. Go to Mens Fashion
			3. Go to Sports Shoes
			4. Get the count of the sports shoes
			5. Click Training shoes
			6. Sort by Low to High
			7. Check if the items displayed are sorted correctly
			8.Select the price range (500-1200)
			9.Filter with color yellow 
			10 verify the all applied filters 
			11. Mouse Hover on first resulting Training shoes
			12. click QuickView button
			13. Print the cost and the discount percentage
			14. Take the snapshot of the shoe */
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.snapdeal.com/");
		WebElement mens_fashion = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));		
		Actions hold = new Actions(driver);
		hold.moveToElement(mens_fashion).perform();			
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();	
		
		String count = driver.findElement(By.xpath("//h1[@class='category-name']/following-sibling::span")).getText();		
		System.out.println("Sports Shoe counts "+count);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();	
		driver.findElement(By.xpath("//div[contains(@class,'sort-drop')]")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(3000);
		String price1 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
				String r1 = price1.replaceAll("Rs. ", "");
				int cost1 = Integer.parseInt(r1);
		String price2 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
				String s1 = price2.replaceAll("Rs. ", "");
				int cost2 = Integer.parseInt(s1);
				if(cost1<cost2) 
		{
			
			System.out.println("Items are sorted as expected");
		}
		
		else
		{
			System.out.println("Items are not sorted yet");
			
		}		 
		Thread.sleep(5000);
		WebElement priceFrom = driver.findElement(By.xpath("//input[@name='fromVal']"));
		priceFrom.clear();
		priceFrom.sendKeys("500");	
		Thread.sleep(5000);
		WebElement priceTo = driver.findElement(By.xpath("//input[@name='toVal']"));
		priceTo.clear();
		priceTo.sendKeys("1200");		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click(); 	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Navy']/parent::div")).click();
		Thread.sleep(5000);
		String appliedFilters = driver.findElement(By.xpath("(//div[@class='filters'])[1]")).getText();		
		if (appliedFilters.contains("Price")&&(appliedFilters.contains("Navy"))) {
			
			System.out.println("Filters are applied successfully");
			
		}
		else
		{
			System.out.println("Filters are not applied yet");
			
		}	
		
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@supc='SDL901001171'])[2]")).click();
		String currency = driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY-l')]")).getText();
		String amount = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		Thread.sleep(2000);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The price of the shoe is "+currency+ amount +discount);
		driver.close();

	}

}
