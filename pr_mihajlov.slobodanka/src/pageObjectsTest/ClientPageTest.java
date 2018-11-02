package pageObjectsTest;
import pageObjects.ClientsPage2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


import utility.Constant;
import utility.ExcelUtils;

public class ClientPageTest {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"ClientsPage");
	}
  public static String AddNewClientTest(WebDriver driver) throws Exception
  {
		String clientName = ExcelUtils.getCellData(1, 0);
		System.out.println(clientName);
		String contactName = ExcelUtils.getCellData(1, 1);
		System.out.println(contactName);
		String email = ExcelUtils.getCellData(1, 2);
		System.out.println(email);
		String registryNumber = ExcelUtils.getCellData(1, 3);
		System.out.println(registryNumber);
		String country = ExcelUtils.getCellData(1, 4);
		System.out.println(country);
		String city = ExcelUtils.getCellData(1, 5);
		System.out.println(city);
		String street = ExcelUtils.getCellData(1, 6);
		System.out.println(street);
		String zip = ExcelUtils.getCellData(1, 7);
		System.out.println(zip);
		String dateAdded = ExcelUtils.getCellData(1, 8);
		System.out.println(dateAdded);
		String code = ExcelUtils.getCellData(1, 9);
		System.out.println(code);
		String agreementDay = ExcelUtils.getCellData(1, 10);
		System.out.println(agreementDay);
		String status = ExcelUtils.getCellData(1, 11);
		System.out.println(status);
		
		ClientsPage2.getAddNewClient(driver).click();
		System.out.println("Seting client name");
		ClientsPage2.setClientName(driver, clientName);
		System.out.println("Seting contact name");
		ClientsPage2.setContactName(driver, contactName);
		System.out.println("Seting email");
		ClientsPage2.setEmail(driver, email);
		System.out.println("Seting registryNumber");
		ClientsPage2.setRegistryNumber(driver, registryNumber);
		System.out.println("Seting country");
		ClientsPage2.setCountry(driver, country);
		System.out.println("Seting city");
		ClientsPage2.setCity(driver, city);
		System.out.println("Seting street");
		ClientsPage2.setStreet(driver, street);
		System.out.println("Seting zip");
		ClientsPage2.setZip(driver, zip);
		System.out.println("Seting dateAdded");
		//ClientsPage2.setDateAdded(driver, dateAdded);
		System.out.println("Seting code");
		ClientsPage2.setCode(driver, code);
		System.out.println("Seting agreementDay");
		//ClientsPage2.setAgreementDay(driver, agreementDay);
		System.out.println("Seting status");
		ClientsPage2.setStatus(driver, status);
		System.out.println("Save");
		ClientsPage2.setSave(driver);
		Thread.sleep(1000);
		return "Pass";
  }
}
