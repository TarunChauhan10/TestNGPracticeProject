import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		WebElement option = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label"));
		String selectOption = option.getText();
		System.out.println(selectOption);
		
//		driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		Select selectDD = new Select(driver.findElement(By.cssSelector("select[id='dropdown-class-example']")));
		
		selectDD.selectByVisibleText(selectOption);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(selectOption);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		Alert ale = driver.switchTo().alert();
		String alertText = ale.getText();
		System.out.println(alertText);
		
		String[] alertArray = alertText.split("Hello ");
		String[] finalText = alertArray[1].split(",");
		
		System.out.println("The Option select is: "+finalText[0].trim());

	}

}
