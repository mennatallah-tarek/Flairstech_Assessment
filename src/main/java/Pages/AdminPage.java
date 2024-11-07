package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AdminPage {
    private By records= By.className("oxd-table-row--with-border");
private By Addbutton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
private By Usersystembutton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button");
private By UserNameField = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");

private By searchbutton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
private By deleteicon = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/button[1]");
private By Delete= By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]");

    private WebDriver driver;


    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }
    public int NoOfRecords() {
        return  driver.findElements(records).size()-1;
    }
    public WebElement ADDBUTTON(){return driver.findElement(Addbutton);}
    public WebElement Userbutton(){return driver.findElement(Usersystembutton);}
    public WebElement UserNameFieldsearch(){return driver.findElement(UserNameField);}
    public WebElement searchuser(){return driver.findElement(searchbutton);}
    public WebElement Deletebutton(){return driver.findElement(deleteicon );}
    public WebElement Deleteconfirmclick(){return driver.findElement(Delete);}





    public AddUserPage AddUserPage(){
        ADDBUTTON().click();
        return new AddUserPage(driver);
    }
    public void opensearchtab(){
        Userbutton().click();
    }
    public void UsernameSearch(String Lesson) {
        UserNameFieldsearch().sendKeys(Lesson);
        UserNameFieldsearch().sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void Clicksearch(){
        searchuser().click();
    }
    public void ClickDelete(){
        Deletebutton().click();

    }
    public void ClickDeleteConfirmation(){
        Deleteconfirmclick().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
