package week3.day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://in.bookmyshow.com/");
		
			driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
			
			driver.findElement(By.xpath("//strong[text()='Hyderabad']")).click();
		
		//04) Confirm the URL has got loaded with Hyderabad 
			
			String city = driver.findElement(By.xpath("//span[@class='sc-kZmsYB ekDEWP ellipsis']")).getText();					
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);			
			if (currentUrl.contains("Hyderabad")) {
				
				System.out.println("the page is Hyderabad ");
			}
			else
			{
				System.out.println("page is not Hyderabad ");
			}

			
			//05) Search for your favorite movie 
			driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).sendKeys("Vidudhala Part - 1");
			driver.findElement(By.xpath("(//span[@class='sc-jhaWeW ChCae'])[1]")).click();
			
			//06) Click on movie
			driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
			
			//07) Print the name of the theater displayed first
			String theatre = driver.findElement(By.xpath("(//a[@class='__venue-name'])[1]")).getText();
			System.out.println(theatre);
			
			//08) Click on the info of the theater
			driver.findElement(By.xpath("(//div[text()='INFO'])[1]")).click();
			
			//09) Confirm if there is a parking facility in the theater
			WebElement parking = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]"));
			
			if (parking.isDisplayed()) {
				System.out.println("parking-Yes");
			}
			
			else
			{
				System.out.println("Parking-No ");
			}
			
			//10) Close the theatre popup
			driver.findElement(By.xpath("//div[contains(@onclick,'CrossIcon')]")).click();
			
			//11) Click on the first green (available) timing
			driver.findElement(By.xpath("(//div[@class='showtime-pill-container _available'])[1]")).click();
			
			
			//12) Click Accept
			driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
			Thread.sleep(5000);
			
			//13) Choose 1 Seat and Click Select Seats
			driver.findElement(By.xpath("//li[@id='pop_1']")).click();
			driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
			
			
			//14) Choose any available ticket and Click Pay
			driver.findElement(By.xpath("(//a[@class='_available'])[1]")).click(); //click any available seat
			driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]")).click(); // //click pay button
		
			//15) Print the sub total
			String subtotal = driver.findElement(By.xpath("//span[@class='__sub-total']")).getText();
			System.out.println("Sub Total is: "+subtotal);
			driver.close();	
	}

}
	