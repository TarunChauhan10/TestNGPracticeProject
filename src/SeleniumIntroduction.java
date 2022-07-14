import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Invoking the Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tarun.chauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		// This is a depricated wait method    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// This is a depricated method driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*
		String url = "";
		
		 * driver.get("https://www.google.com");
		 
		
		List<WebElement> allURLs = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> iterator = allURLs.iterator();
	      while (iterator.hasNext()) {
	    	  url = iterator.next().getText();
	    	  System.out.println(url);
	      }
	      
	      driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Search In Google");
	      driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	      */
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String Usernamestr = driver.findElement(By.id("inputUsername")).getAttribute("placeholder");
		System.out.println("This is the Username field with "+Usernamestr+" Placeholder text");
		
		String PasswordStr = driver.findElement(By.name("inputPassword")).getAttribute("placeholder");
		System.out.println("This is the Password field with "+PasswordStr+" Placeholder text");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Tarun");
		driver.findElement(By.name("inputPassword")).sendKeys("Chauhan");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		driver.findElement(By.xpath("//*[text()='Forgot your password?']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[text()='Forgot password']")).getText());
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Tarun");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("taruntest@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876543210");
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		
		//driver.close();
		
	}

}
