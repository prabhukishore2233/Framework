package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass1 {
	public static WebDriver driver;
	    
	   @BeforeClass
	   public void openApplication() throws InterruptedException {
			Thread.sleep(2000);
	       driver=new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       
	   }
	   
	   @AfterClass
	   public void closeApplication() {
	       //driver.close();
	   }
	   

	}




