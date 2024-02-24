package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
	public static WebDriver driver;
	public static Properties prop;
	
	static {
		try {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("start-maximized");
			driver = new ChromeDriver(opt);
			
			File f = new File("C:\\Users\\vigne\\eclipse-workspace\\RedBus\\src\\test\\resources\\properti\\propertys.properties");
			FileInputStream fi = new FileInputStream(f);
			
			prop = new Properties();
			prop.load(fi);
			
			
		}catch(Exception e) {
			
		}
	}

}
