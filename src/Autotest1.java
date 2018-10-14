import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autotest1 {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
			//to handle webtables
	
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		
	}	
}
