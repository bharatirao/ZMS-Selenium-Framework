package practiceTestScripts;

import org.testng.annotations.Test;

public class Test1 {
@Test
private void TC1Test() {
	System.out.println("Test Case1 inititated");
	System.out.println("modified code");
	String browser = System.getProperty("br");
	String url = System.getProperty("ur");
	System.out.println(browser);
}
}
