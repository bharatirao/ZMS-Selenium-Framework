package practiceTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public void TC2Test() {
		System.out.println("Test Case2 initiated");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.skillrary.com");
		driver.close();
		
	}

}
