package week2.day3Assignment;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/select.xhtml");
		
		
				//Select Which is your favourite automation tool using selectByIndex()
				WebElement Tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
				Select ToolDropdown = new Select(Tool);
				ToolDropdown.selectByIndex(1);
				
				
				Thread.sleep(5000);
				//Choose your preferred country 
				driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();	
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//li[text()='Germany']")).click();
				Thread.sleep(5000);
				
				//Confirm Cities belongs to Country is loaded
				driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//li[text()='Munich']")).click();
				Thread.sleep(5000);
				
			
				//Choose the Course
				driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
				Thread.sleep(5000);
						
				//Choose language randomly
				driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//li[text()='Tamil']")).click();
				Thread.sleep(5000);
				
			
				//close browser
				driver.close();

	}

}
