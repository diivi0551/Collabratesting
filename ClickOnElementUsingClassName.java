package asssignment1_diivisharanps;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnElementUsingClassName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");			
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("gfgf");
		

	}

}
