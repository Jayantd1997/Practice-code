import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptRunning {
	
	WebDriver driver;
public void launchBrowser() {
	System.setProperty("webdriver.gecko.driver", "/Users/vikasbhendarkar/Desktop/selenium-java-4.2.2/drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	
}
	public static void main(String[] args) {
		
ScriptRunning obj = new ScriptRunning();
obj.launchBrowser();

	}

}
