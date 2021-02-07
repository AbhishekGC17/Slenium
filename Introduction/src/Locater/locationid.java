package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Desktop\\web\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("abhishekgc1992@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("@Abhishek123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getTitle());
	
	}
}
