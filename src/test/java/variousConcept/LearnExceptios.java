
package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnExceptios {
	WebDriver driver;

	// ELEMENT LIST-By type
	By USE_NAME_FIELD = By.xpath("//input[@id='user_name']");
	// By PASSWORD_FIELD=By.xpath("");
	By SIGNIN_BUTTON_FIELD = By.xpath("");
	By DASHBOARD_VALIDATION_FIELD = By.xpath("/html/body/div[1]/section/div/div[2]/div/div/header/div/strong");

	@Before

	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://codefios.com/ebilling/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	// Structure of declaring a variable
	// type name=value
	// int a =5
	@Test
       public void testlogin()
       {
		//ELEMENT LIST- WEBELEMENT TYPE
//    	WebElement USER_NAME_ELEMENT =driver.findElement(By.xpath("//input[@id='user_name']"));
//    	WebElement PASSWORD_FIELD= driver.findElement(By.xpath("");
//    	WebElement SIGNIN_BUTTON_ELEMENT=driver.findElement(By.xpath(""));
//    	WEBELEMENT_DASHBOARD_VALIDATION_ELEMENT=driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/div/header/div/strong"));
//    	
//    	
    	
         
    	
    	//USER_NAME_FIELD?
//    	
//    	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("demo@codefios.com");
//  	       	//  driver.findElement(USER_NAME_FIELD]).sendKeys("demo@codefios.com");
//    	
//    	     	   
//    	   
//  	       	USER_NAME_ELEMENT.sendKeys("abc");
//  	       	Thread.sleep(2000);
//  	      USER_NAME_ELEMENT.clear();
//  	       	USER_NAME_ELEMENT.sendKeys("demo@codefios.com"); 
//         PASSWORD_ELEMENT.sendkeys(abc123);
//         SIGNIN_BUTTON_ELEMENT.click();
//         
//         
//         WEBELEMENT_DASHBOARD_VALIDATION_ELEMENT=driver.findElement(By.xpath(""));
       //  Assert.assertTrue("Dashboardpage not found!!",driver.findElement(DASHBOARD VALIDATION FIELD).is displayed);
         
       //   Assert.assertTrue("Dashboardpage not found!!",.is displayed);
       }
         
       
        	 
          	   
    	   
    	   
    	   
    	   
	 
 }

