package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModules.NewBusiness;
import appModules.NewClient;
import appModules.SignIn_Action;
import pageObjects.BusinessPage;
import pageObjects.ClientsPage2;
import pageObjectsTest.BussinesPageTest;
import pageObjectsTest.ClientPageTest;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		 //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

       ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"LogIn");

       driver = new ChromeDriver();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get(Constant.URL);

       SignIn_Action.Execute(driver);
       
       System.out.println("Login Successfully.");
       driver.findElement(By.xpath("//*[@id=\"nav-bar-business\"]/div")).click();
      
       System.out.println("Izvrseno 1.");
    
      BussinesPageTest.AddNewBussinesTest(driver);
     Thread.sleep(1000);
      driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']")).click();
      Thread.sleep(1000);
    
      ClientPageTest.SetUpExcel();
      ClientPageTest.AddNewClientTest(driver);
     
     // 
     Thread.sleep(1000);
     System.out.println("Ubacivanje novog klijenta");
    
      System.out.println("Izvrseno 4.");
       driver.quit();

       //This is to send the PASS value to the Excel sheet in the result column.

       ExcelUtils.setCellData("Pass", 1, 3);

	}

}
