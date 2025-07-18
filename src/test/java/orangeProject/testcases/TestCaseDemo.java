package orangeProject.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import orangeProject.pages.BaseTest;
import orangeProject.pages.LoginPage;
import orangeProject.utility.ExcelDataProvider;

public class TestCaseDemo extends BaseTest {

//	BaseTest bt = new BaseTest();
	LoginPage lp = new LoginPage(driver);
	
	
	@Test(dataProvider = "loginData")
	public void TestCheck(String usr, String pwd) {
		LoginPage lp = new LoginPage(driver);
		lp.performLogin(usr, pwd);
	}

	@DataProvider(name = "loginData")
	public Object[][] dataProvider() {
		ExcelDataProvider dp = new ExcelDataProvider();
		System.out.println(System.getProperty("user.dir"));
		return dp.readExcelData("./TestData/LoginData.xlsx", 0);

	}
}
