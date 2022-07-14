import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='ui-id-1']//li//div")));
		List<WebElement> autoSusggetDDOptions = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//div"));

		for (WebElement option : autoSusggetDDOptions) {
			if (option.getText().equalsIgnoreCase("United States (USA)")) {
				option.click();
			}
		}
	}

}
