package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser, String headless, String resolution) {

        ChromeOptions options = new ChromeOptions();

        // HEADLESS MODE
        if ("true".equalsIgnoreCase(headless)) {
            options.addArguments("--headless=new");
        }

        // RESOLUTION (if specified)
        if (resolution != null && !resolution.isEmpty()) {
            String[] res = resolution.split("x");
            if (res.length == 2) {
                options.addArguments(String.format("--window-size=%s,%s", res[0], res[1]));
            }
        }

        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver(options));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}

