package maven_Int_With_Jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import class_objects.Patient_Information_Object;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest
{
	
	public static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException 
  {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.empowertherapy.com/patient_form_sample");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  Thread.sleep(3000);
	  
	  WebElement close=driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[1]/button[1]"));
	  close.click();
	  
	  Patient_Information_Object obj=PageFactory.initElements(driver, Patient_Information_Object.class);
	  	  
	  obj.lastname.sendKeys("Sachin");
	  obj.firstname.sendKeys("Testing");
	  obj.mi.sendKeys("software testing");
	  obj.gender.click();
	  obj.Street.sendKeys("Street");
	  obj.city.sendKeys("Erode");
	  obj.par_Status.click();
	  
	  
	  	  
	  
	  
  }
}
