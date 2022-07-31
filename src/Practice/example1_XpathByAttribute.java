package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute 
{
     public static void main(String[] args)
     {
    	 System.setProperty("webdriver.chrome.driver","//E:\\\\\\\\Software Testing Batch\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
    	 
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.get("https://www.facebook.com/");
    	 
    	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhijeet");
    	 
    	 
    	 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");
    	 driver.findElement(By.xpath("//button[@name='login']")).click();
    	 
    	 
     }
	
}
