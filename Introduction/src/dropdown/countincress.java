package dropdown;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class countincress {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Desktop\\web\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(2000L);
		  Scanner sc=new Scanner(System.in);
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  System.out.println("how maney Adult want to  add");
		  int a=sc.nextInt();
		  for (int i=1;i<a;i++)
		  {
		  driver.findElement(By.id("hrefIncAdt")).click();
		  }
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
