package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginPage extends BasePage {

    @FindBy(xpath="(//input[@type=\"email\"])[1]")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginBtn;

    @FindBy(css = ".login-form h2")
    private WebElement loginHeader;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        type(emailField, email);
        type(passwordField, password);
        click(loginBtn);
    }

    public String getHeaderText() {
        return getText(loginHeader);
    }
}
