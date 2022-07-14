import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5L));
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='user']/following-sibling::span")).click();
		WebElement selectDD = driver.findElement(By.xpath("//select"));
		
		Select sel = new Select(selectDD);
		
		sel.selectByValue("consult");
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[id='okayBtn']")));
		driver.findElement(By.cssSelector("button[id='okayBtn']")).click();
		
		
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id='terms']")));
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();
		
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='card h-100']//h4/a")));
		
		List<WebElement> numberOfItems = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for(int i=0; i<numberOfItems.size();i++)
		{
			numberOfItems.get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		driver.close();
		
		
		
		
		
	}

}
