package com.framework.ai.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductsPage;
import base.DriverFactory;

public class ProductsTest extends BaseTest {

    @Test
    public void verifyProductsTitle() {
        ProductsPage products = new ProductsPage(DriverFactory.getDriver());
        DriverFactory.getDriver().get("https://automationexercise.com/products");
        Assert.assertEquals(products.getTitle(), "ALL PRODUCTS");
    }

    @Test
    public void verifyProductsAreDisplayed() {
        ProductsPage products = new ProductsPage(DriverFactory.getDriver());
        DriverFactory.getDriver().get("https://automationexercise.com/products");
        Assert.assertTrue(products.getProductCount() > 0);
    }
}
