package com.inetbanking.testData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions act = new Actions(driver);
		WebElement searchOption = driver.findElement(By.name("q"));
		act.sendKeys(searchOption, "iphone").perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		Thread.sleep(3000);
        driver.quit();

		//searchOption.sendKeys("iphone");
		//WebElement CircleBoxOption = driver
				//.findElement(By.xpath("//*[name()='svg']//*[local-name()='g' and @fill-rule='evenodd']"));
		//js.executeScript("arguments[0].click()", CircleBoxOption);

		// act.moveToElement(mainmenu).build().perform();//taking mouse
		//driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		;
		;
		// mobiles.click();//clicking on mobiles

		/*
		 * List<WebElement> brands =
		 * driver.findElements(By.xpath("//div[@id='list-tagcloud']/div[2]/a"));
		 * System.out.println(brands.size()); for(int i=0;i<brands.size();i++){
		 * System.out.println(brands.get(i).getText());//fetching all the brands
		 * if(brands.get(i).getText().equals("Samsung"))//matching for samsung
		 * only { brands.get(i).click();//clicking pon samsung } brands =
		 * driver.findElements(By.xpath("//div[@id='list-tagcloud']/div[2]/a"));
		 * //for cache } WebElement searchbox = driver.findElement(By.xpath(
		 * "//*[@id='searchbox']/li[2]/form/input[4]"));
		 * searchbox.sendKeys("grand2");//in search box search for grand2
		 * driver.findElement(By.xpath(
		 * "//*[@id='searchbox']/li[2]/form/input[5]")).click();//clicking on
		 * search icon
		 * 
		 * List<String> allLinks = new ArrayList<String>(); List<WebElement>
		 * data = driver.findElements(By.xpath(
		 * "//div[@id='products']/div/div/div/div[2]/div[@class='pu-title fk-font-13']/a"
		 * )); System.out.println("total fonds are =="+data.size());//total
		 * searches coming on the page for(int i=0;i<data.size();i++){
		 * System.out.println(data.get(i).getText());//printing all samsung
		 * phones if(data.get(i).getText().contains("Grand 2"))//search for
		 * grnad2 only { String link =
		 * data.get(i).getAttribute("href");//fetching all the links
		 * allLinks.add(link);//adding them to list
		 * 
		 * } data = driver.findElements(By.xpath(
		 * "//div[@id='products']/div/div/div/div[2]/div[@class='pu-title fk-font-13']/a"
		 * ));// for cache } System.out.println(allLinks.size());//total grand2
		 * phones for(int i=0;i<allLinks.size();i++){
		 * System.out.println(allLinks.get(i)); driver.get(allLinks.get(i));
		 * driver.findElement(By.xpath(
		 * "//*[@id='mplistings']/div/div/div[1]/div[3]/a")).click();//click on
		 * view sellers List<WebElement> retails = driver.findElements(By.xpath(
		 * "//div[@class='cart-table']/div[starts-with(@class,'line seller-item')]/div[4]/a"
		 * ));//fetching info System.out.println(retails.size()); for(int
		 * j=0;j<retails.size();j++) {
		 * 
		 * System.out.println(retails.get(j).getText());//printing all the
		 * sellers info
		 * 
		 * }
		 * 
		 */ }

}
