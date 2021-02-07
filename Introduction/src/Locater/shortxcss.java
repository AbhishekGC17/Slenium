package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shortxcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Desktop\\web\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@name='name10fa5ea0']")).sendKeys("afsafasff");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("afafsd");
		
		
		
	}

}
