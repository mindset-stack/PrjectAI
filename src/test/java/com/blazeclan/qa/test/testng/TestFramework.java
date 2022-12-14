package com.blazeclan.qa.test.testng;

import com.blazeclan.qa.pages.LoginPage;
import com.blazeclan.qa.utility.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class TestFramework extends BaseTest {

    @Test(priority = 1)
    public void navigateToLoginPage() {

        loginPage = new LoginPage(driver);
        String expectedUrl = "https://pulse-stage.projectai.com/en/admin/login/?next=/en/admin/";
        String actualUrl = getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test(priority = 2)
    public void loginToApplication() {

        enterText(loginPage.loginEmail,"premila.jina@projectai.com");
        enterText(loginPage.loginPassword, "Hetvi2012!");
        clickElement(loginPage.loginBtn);

    }

}
