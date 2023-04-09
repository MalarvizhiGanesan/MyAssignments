package week2.day3Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/button.xhtml");
		// 1. Click and Confirm title
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				String title = driver.getTitle();
				System.out.println(title);
				
				if (title.equalsIgnoreCase("Dashboard")) {
					System.out.println("Displayed Title");
				}
				else
					System.out.println("Not dispalyed Title");
				Thread.sleep(5000);
				
				
		// 2. Confirm if the button is disabled
				driver.navigate().back();
				
				if (driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled()==true) {
					
					System.out.println("Enabled button");
				}
				else
				{
					System.out.println("Disabled Button");
				}
				Thread.sleep(5000);
				
		// 3. Find the position of the Submit button
				Point postionofthesubmitbutton = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
				System.out.println("submit button Position "+ postionofthesubmitbutton);
				Thread.sleep(5000);
				
				driver.close();
				Thread.sleep(5000);

	}

}
