import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Desktop\\web\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.get("http://www.facebook.com");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.close();
	
	}

}
