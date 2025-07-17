package orangeProject.testcases;

import org.testng.annotations.Test;

import orangeProject.pages.BaseTest;
import orangeProject.pages.LoginPage;

public class TestCaseDemo extends BaseTest{

//	BaseTest bt = new BaseTest();
	
	@Test
	void TestCheck() {
		LoginPage lp=new LoginPage(driver);
		lp.clickSignInBtn();
	}
	
}
