package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.ClientsPage2;
import utility.Constant;
import utility.ExcelUtils;

public class NewClient {
	public static void Execute(WebDriver driver) throws Exception{
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"ClientsPage");
		
		
		String sClientName = ExcelUtils.getCellData(1, 0);
		System.out.println(sClientName);
		String sContactName = ExcelUtils.getCellData(1, 1);
		System.out.println(sContactName);
		String sEmail = ExcelUtils.getCellData(1, 2);
		String sRegistryNumber = ExcelUtils.getCellData(1, 3);
		String sCountries = ExcelUtils.getCellData(1, 4);
		String sDateAdded = ExcelUtils.getCellData(1, 8);
		String sStreet = ExcelUtils.getCellData(1, 6);
		String sCity = ExcelUtils.getCellData(1, 5);
		String sZip = ExcelUtils.getCellData(1, 7);
		String sCode = ExcelUtils.getCellData(1, 9);
		String sAgreementDate = ExcelUtils.getCellData(1, 10);
		
		//koristiti setere
		Thread.sleep(1000);
		ClientsPage2.setClientName(driver,sClientName);
		ClientsPage2.setContactName(driver,sContactName);
		ClientsPage2.setEmail(driver,sEmail);
		ClientsPage2.setRegistryNumber(driver,sRegistryNumber);
		ClientsPage2.setCountry(driver,sCountries);
		ClientsPage2.setCity(driver,sCity);
		ClientsPage2.setZip(driver,sZip);
		ClientsPage2.setStreet(driver, sStreet);
		ClientsPage2.setAgreementDay(driver, sAgreementDate);
		ClientsPage2.setCode(driver, sCode);
		ClientsPage2.setDateAdded(driver, sDateAdded);

		ClientsPage2.setSave(driver);
		}
}
