package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class saleforpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhi\\Desktop\\web\\geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://login.salesforce.com/?locale=eu");
       driver.findElement(By.xpath("//*[@type='email']")).sendKeys("aassasa");;
       driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123");;
       driver.findElement(By.xpath("//*[@type='submit']")).click();
       driver.findElement(By.cssSelector("#forgot_password_link")).click();
       System.out.println(driver.getTitle());
       driver.close();
       
	}

}
