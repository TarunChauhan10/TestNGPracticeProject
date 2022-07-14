import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> multipleWindows = driver.getWindowHandles();
		
		Iterator<String> windowsTracker = multipleWindows.iterator();
		
		String parentWindow = windowsTracker.next();
		String childWindow = windowsTracker.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
	}

}
