import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlighting_WebElement {
	
	
	
      public static void HighlightingElement(WebDriver driver,WebElement ele)
      {
    	
		JavascriptExecutor js= (JavascriptExecutor)driver;
  		js.executeScript("arguments[0].setAttribute('style','background: green; border: 2px solid blue;');", ele);

      }

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement nam_Ele = driver.findElement(By.name("email"));
		HighlightingElement(driver ,nam_Ele);
		

	}

}
