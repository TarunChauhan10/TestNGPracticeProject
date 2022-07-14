import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("The number of links present on the page is: "+(driver.findElements(By.tagName("a")).size()));
		
		System.out.println("The number of links present in the Footer secion of the page is: "+(driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size()));
		System.out.println("The number of links present in the Footer secion's First Column of the page is: "+(driver.findElements(By.xpath("//div[@id='gf-BIG']//td[1]//a")).size()));
			
	}

}
