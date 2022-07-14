import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	
	public static void main(String[] args) {
		//('//div[@class="form-group"]//input[@name="name"]')
System.setProperty("webdriver.chrome.driver", "C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Tarun Chauhan");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("Tarun.Chauhan@gmail.com");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@type='password']")).sendKeys("T@run#105");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		
		WebElement dddriver = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select seldd = new Select(dddriver);
		
		seldd.selectByVisibleText("Male");
		
		System.out.println(seldd.getFirstSelectedOption().getText());
		
		driver.findElement(By.xpath("//label[text()='Employed']")).click();
		System.out.println(driver.findElement(By.xpath("//label[text()='Employed']")).isSelected());
		
		driver.findElement(By.xpath("//label[text()='Date of Birth']/following-sibling::input")).sendKeys("10051990");
		
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		driver.close();
	}

}
