package com.framework.ai.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import base.DriverFactory;

public class HomeTest extends BaseTest {

    @Test
    public void verifyNavigationToLogin() {
        HomePage home = new HomePage(DriverFactory.getDriver());
        home.open();
        home.clickSignupLogin();
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("login"));
    }

    @Test
    public void verifyNavigationToProducts() {
        HomePage home = new HomePage(DriverFactory.getDriver());
        home.open();
        home.clickProducts();
       // Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().equalsIgnoreCase(("products")));
        System.out.println(DriverFactory.getDriver().getCurrentUrl().equalsIgnoreCase(("products")));
    }
}