package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {

    @FindBy(css = "a[href='/login']")
    private WebElement signupLoginBtn;

    @FindBy(css = "a[href='/products']")
    private WebElement productsBtn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://automationexercise.com/");
    }

    public void clickSignupLogin() {
        click(signupLoginBtn);
    }

    public void clickProducts() {
        click(productsBtn);
    }
}
