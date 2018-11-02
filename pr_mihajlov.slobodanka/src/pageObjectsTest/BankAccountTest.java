package pageObjectsTest;


import utility.Constant;
import utility.ExcelUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.BankAccountPAge;

public class BankAccountTest {
	
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"BankAccount");
	}
	
	public static void AddNewBankAccount(WebDriver driver) throws Exception
	  {	
			String bankName = ExcelUtils.getCellData(1, 0);
			String accountNumber = ExcelUtils.getCellData(1, 1);
			String swiftNumber = ExcelUtils.getCellData(1, 2);
			String paymentInstructions = ExcelUtils.getCellData(1, 3);
			String currency = ExcelUtils.getCellData(1, 4);
			
			
			BankAccountPAge.setBankName(driver,bankName);
			BankAccountPAge.setAccountNumber(driver,accountNumber);
			BankAccountPAge.setSwiftNumber(driver, swiftNumber);
			BankAccountPAge.setPaymentInstruction(driver, paymentInstructions);
			BankAccountPAge.setCurrency(driver, currency);
			
			
			
	
	  }
}
