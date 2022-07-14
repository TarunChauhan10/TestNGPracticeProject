import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		
		Assert.assertEquals(false, driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
		
		
		List<WebElement> countOfCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("The total number of checkboxes on the page is: "+countOfCheckboxes.size());
		
		driver.close();

	}

}
