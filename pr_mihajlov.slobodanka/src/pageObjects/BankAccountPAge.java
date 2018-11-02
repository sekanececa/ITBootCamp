package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankAccountPAge {
	
	private static WebElement element = null;

	//geteri
	public static WebElement getAddBankAccount(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		return element;
	}
	
	public static WebElement getBankName(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return element;
	}
	public static WebElement getAccountNumber(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return element;
	}
	public static WebElement getSwiftNumber(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return element;
	}
	
	public static WebElement getPaymentInstruction(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return element;
	}
	

	public static WebElement getNewBankAccount(WebDriver driver)
	{		
		element = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return element;
	}
	
	///set
	public static void setBankName(WebDriver driver, String bankName)
	{
		getBankName(driver).sendKeys(bankName);
	}
	public static void setAccountNumber(WebDriver driver,String accountNumber)
	{
		getAccountNumber(driver).sendKeys(accountNumber);
		
	}
	public static void setSwiftNumber(WebDriver driver, String swiftNumber)
	{
		getSwiftNumber(driver).sendKeys(swiftNumber);
		
	}
	
	public static void setPaymentInstruction(WebDriver driver, String paymentInstruction)
	{
		getPaymentInstruction(driver).sendKeys(paymentInstruction);
		
	}

	public static void setNewBankAccount(WebDriver driver)
	{
		getNewBankAccount(driver).click();
	}
	
	public static WebElement getCurrency(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        element = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-select__selections']")));
        return element;
    }

    public static List<WebElement> getCurrencyLabel(WebDriver driver) {
        List<WebElement> currencyList = new ArrayList();
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
        return currencyList;
    }

    public static void setCurrency(WebDriver driver, String currencyName) {
        Actions builder = new Actions(driver);
        WebElement currencyList = getCurrency(driver);
        Actions currency = builder.moveToElement(currencyList).click();
        currency.perform();
        List<WebElement> CurrencyLabel = getCurrencyLabel(driver);
        for (WebElement e : CurrencyLabel) {
            if (e.getText().equals(currencyName)) {
                e.click();
            }
        }
    }
}
