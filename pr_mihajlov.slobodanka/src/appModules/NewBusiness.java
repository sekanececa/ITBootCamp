package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.BusinessPage;
import utility.Constant;
import utility.ExcelUtils;

public class NewBusiness {
	public static void Execute(WebDriver driver) throws Exception{
		
	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"BusinessPage");
	
	
	String sBusinessName = ExcelUtils.getCellData(1, 0);
	
	String sCountry = ExcelUtils.getCellData(1, 1);
	
	String sCity = ExcelUtils.getCellData(1, 2);
	String sStreet = ExcelUtils.getCellData(1, 3);
	String sZip = ExcelUtils.getCellData(1, 4);
	String sRegNum = ExcelUtils.getCellData(1, 5);
	
//treba koristiti setere
	
	BusinessPage.setBusinessName(driver, sBusinessName);
	BusinessPage.setCountry(driver, sCountry);

	BusinessPage.setCity(driver, sCity);
	BusinessPage.setStreet(driver, sStreet);
	BusinessPage.setZip(driver, sZip);
	BusinessPage.setRegNum(driver, sRegNum);

	//BusinessPage.btn_Save(driver).click();
	}
}
