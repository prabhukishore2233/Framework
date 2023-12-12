package testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import utilities.ReadConfig;

public class BaseClass {
	public static WebDriver driver;
	   public static Logger log;
	   
	   ReadConfig rc=new ReadConfig();
	   
	   public String url=rc.getApplicationURL();
	   public String username=rc.getUsername();
	   public String password=rc.getPassword();
//	    public ResourceBundle rb;
	   
	   @BeforeClass
	   @Parameters("browser")
	   public void openApplication(String br) throws InterruptedException {
		   if(br.equals("chrome")) {

				Thread.sleep(2000);
		        driver=new ChromeDriver();
		        }
		        else if(br.equals("edge")) {
		            driver=new EdgeDriver();
		        }
		        else if( br.equals("firefox")) {
		            driver=new FirefoxDriver();
		        }
	       
	       driver=new ChromeDriver();
	       //Project home directory (system.getProperty("user.dir")+"\src\test\resources\config.properties"
	       //./config.propertie
//	        rb=ResourceBundle.getBundle("./config.properties");
	       
	       log=Logger.getLogger(this.getClass());
	       PropertyConfigurator.configure("C:\\Hybridframe\\log4j.properties");
	       driver.get(url);
	       
	   }
	   
	   @AfterClass
	   public void closeApplication() {
	       driver.close();
	   }}
	   


