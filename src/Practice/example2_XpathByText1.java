package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_XpathByText1
{
 public static void main(String[] args) 

 {

      System.setProperty("webdriver.chrome.driver","//E:\\\\Software Testing Batch\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	 
	ChromeDriver driver=new ChromeDriver();
	
	 driver.get("https://www.facebook.com/");
	   
	 driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	 
	 
	 
	 


	 
	 
	 
	 
	 
}
	
	

}
