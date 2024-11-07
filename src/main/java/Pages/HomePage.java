package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private By Adminlocator= By.linkText("Admin");

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement Admin(){return driver.findElement(Adminlocator);}
    public AdminPage Adminpage(){
        Admin().click();
        return new AdminPage(driver);
    }
}
