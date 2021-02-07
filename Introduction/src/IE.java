import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\abhi\\Desktop\\web\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		System.err.println(driver.getTitle());

	}

}
