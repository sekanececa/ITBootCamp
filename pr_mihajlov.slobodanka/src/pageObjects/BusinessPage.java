package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BusinessPage {
	private static WebElement web_element = null;

	
	public static WebElement btn_addNewBusiness(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']")));
        return element;
		}

	//GETERI
	
	public static WebElement txtbx_BusinessName(WebDriver driver){
		web_element = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return web_element;
		}
	public static WebElement dd_Country(WebDriver driver){

		web_element = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return web_element;
		}

	public static WebElement txtbx_City(WebDriver driver){
		web_element = driver.findElement(By.xpath(" //input[@id='business-form-city']"));
		return web_element;
		}
	public static WebElement txtbx_Street(WebDriver driver){
		web_element = driver.findElement(By.xpath(" //input[@id='business-form-street']"));
		return web_element;
		}
	public static WebElement txtbx_Zip(WebDriver driver){
		web_element = driver.findElement(By.xpath(" //input[@id='business-form-zip']"));
		return web_element;
		}
	public static WebElement txtbx_RegNum(WebDriver driver){
		web_element = driver.findElement(By.xpath(" //input[@id='business-form-reg-num']"));
		return web_element;
		}
	
	
	//Save BUTTON
	public static WebElement btn_Save(WebDriver driver){
		web_element = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return web_element;
		}

	
	//SETERI
	
	public static void setBusinessName(WebDriver driver,String businessName){
		txtbx_BusinessName(driver).sendKeys(businessName);
		}
	public static void  setCity(WebDriver driver,String city){
		txtbx_City(driver).sendKeys(city);
		}	
		//*****Metod koji postavlja ime drzave u klasi BussinesPage
		public static void setCountry(WebDriver driver, String countryName) throws InterruptedException
		{   
		Actions builder = new Actions(driver);
		Actions country = builder
		.moveToElement(dd_Country(driver))
		.click()
		.sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
		}
		
		
	public static void setStreet(WebDriver driver,String street){
		txtbx_Street(driver).sendKeys(street);
		}
	public static void setZip(WebDriver driver,String zip){
		txtbx_Zip(driver).sendKeys(zip);
		}
	public static void setRegNum(WebDriver driver,String regNum){
		txtbx_RegNum(driver).sendKeys(regNum);
		}
}
