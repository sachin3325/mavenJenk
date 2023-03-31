package class_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Patient_Information_Object 
{
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='lname_1']")
	public static WebElement lastname;
	
	@FindBy(xpath= "//input[@id='fname_1']")
    public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='mi_1']")
	public static WebElement mi;
	
	@FindBy(xpath="(//input[@value='Male'])[1]")
	public static WebElement gender;
	
	@FindBy(xpath="//input[@id='street_1']")
	public static WebElement Street;
	
	@FindBy(xpath="//input[@id='city_1']")
	public static WebElement city;
	
	@FindBy(xpath="(//input[@value='Divorced'])[1]")
	public static WebElement par_Status;
	
	public void waitclass(WebElement element)
	{
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	

}
