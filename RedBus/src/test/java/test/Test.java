package test;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import utils.Setup;

public class Test{
	public static WebDriver driver;
	public static Properties prop;
	
	Setup obj = new Setup();
	
	@org.testng.annotations.Test(groups = {"Reggression", "Smoke"})
	public void TC001(){
		try {
		String url = prop.getProperty("url");
		driver.get(url);
		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
		Thread.sleep(Duration.ofSeconds(10));
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login/ Sign Up')]"));
		login.click();
		driver.switchTo().alert().dismiss();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-MJoBVe']")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	@BeforeClass
	public void Before_Class() {
		this.driver = obj.driver;
		this.prop = obj.prop;
		
	}

}
