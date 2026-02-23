package com.framework.ai.tests;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import base.DriverFactory;

public class BaseTest {

    @BeforeMethod
    @Parameters({"browser", "headless", "resolution"})
    public void setup(String browser, String headless, String resolution) {
        DriverFactory.initDriver(browser, headless, resolution);
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

