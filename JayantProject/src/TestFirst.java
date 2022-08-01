import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirst {
	
	WebDriver driver;
	
	public void launchbrowser() {
		System.setProperty("webdriver.gecko.driver", "/Users/vikasbhendarkar/Desktop/selenium-java-4.2.2/drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFirst obj = new TestFirst();
		obj.launchbrowser();
	}

}
