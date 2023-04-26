package week3.day4Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//span[text()=' for boys']/parent::div[text()='bags']")).click();
	    Thread.sleep(2000);
	    
		String text1 = driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']")).getText();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//li[contains(@id,'Safari')]//i")).click();
	    Thread.sleep(2000);
	    	    
	    driver.findElement(By.xpath("(//span[@class='a-expander-prompt'])[1]")).click();
	    Thread.sleep(2000);
	    
	    
	   driver.findElement(By.xpath("//li[contains(@id,'Generic')]//i")).click();
	   Thread.sleep(2000);

		
	   driver.findElement(By.xpath("//span[@aria-label='Sort by:']")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	   Thread.sleep(2000);
	   
	   
	   driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
	   Thread.sleep(2000);
	   	   
	   //Window Handling
		   	Set<String> windowHandles = driver.getWindowHandles();
		 	List<String> cycle= new ArrayList<String>(windowHandles);
			
			driver.switchTo().window(cycle.get(1));
			String text = driver.findElement(By.id("productTitle")).getText();
			
			System.out.println("Prod Name: "+text);
			
			String cost = driver.findElement(By.xpath("//span[@class='a-price-symbol']/following-sibling::span")).getText();
			System.out.println("cost: "+cost);
			
			driver.close();
			
			driver.switchTo().window(cycle.get(0));//Switch to first window
			

		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		driver.close();
	}
		

}
	




