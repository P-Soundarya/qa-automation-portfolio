package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ProductsPage extends BasePage {

    @FindBy(css = ".title.text-center")
    private WebElement productsTitle;

    @FindBy(css = ".single-products")
    private List<WebElement> productList;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getText(productsTitle);
    }

    public int getProductCount() {
        return productList.size();
    }
}

