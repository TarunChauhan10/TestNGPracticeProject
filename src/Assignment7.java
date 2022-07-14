import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr"));
		System.out.println("The number of Rows present in the Products table is: "+ rowCount.size());
		
		List<WebElement> colCount = driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr//th"));
		System.out.println("The number of Columns present in the Products table is: "+ colCount.size());
		

		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr[3]//td"));
		for(int i=0;i<rowData.size();i++)
		{
			System.out.print("\n");
			System.out.print(rowData.get(i).getText());
			System.out.print("\n");
		}
	}

}
