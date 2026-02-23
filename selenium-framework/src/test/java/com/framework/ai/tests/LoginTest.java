package com.framework.ai.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import base.DriverFactory;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPageHeader() {
        HomePage home = new HomePage(DriverFactory.getDriver());
        home.open();
        home.clickSignupLogin();

        LoginPage login = new LoginPage(DriverFactory.getDriver());
        Assert.assertEquals(login.getHeaderText(), "Login to your account");
    }

    @Test
    public void verifyInvalidLogin() {
    	 HomePage home = new HomePage(DriverFactory.getDriver());
         home.open();
         home.clickSignupLogin();
        LoginPage login = new LoginPage(DriverFactory.getDriver());
        login.login("fake@mail.com", "wrongpass");
        Assert.assertTrue(DriverFactory.getDriver().getPageSource().contains("incorrect"));
    }
}
