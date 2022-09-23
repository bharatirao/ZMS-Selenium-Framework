package practiceTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
@Test
private void TC1Test() {
//	System.out.println("Test Case1 inititated");
//	System.out.println("modified code");
//	String browser = System.getProperty("br");
//	String url = System.getProperty("ur");
//	System.out.println(browser);
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("www.skillrary.com");
	driver.close();
	
}
}
