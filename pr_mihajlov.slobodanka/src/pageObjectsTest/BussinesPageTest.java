package pageObjectsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import appModules.NewBusiness;
import pageObjects.BankAccountPAge;
import pageObjects.BusinessPage;

public class BussinesPageTest {

	public static void AddNewBussinesTest(WebDriver driver) throws Exception
	{
	      
	       Thread.sleep(1000);
	       BusinessPage.btn_addNewBusiness(driver).click();
	       System.out.println("Izvrseno 2.");
	       NewBusiness.Execute(driver);
	       
	       System.out.println("Izvrseno 3.");
	       Thread.sleep(1000);
	       BankAccountPAge.getAddBankAccount(driver).click();
	       
	       BankAccountTest.SetUpExcel();
	       BankAccountTest.AddNewBankAccount(driver);
	       Thread.sleep(1000);
	       BankAccountPAge.getNewBankAccount(driver).click();
	       Thread.sleep(1000);
	       BusinessPage.btn_Save(driver).click();
	       Thread.sleep(1000);
	}
}
