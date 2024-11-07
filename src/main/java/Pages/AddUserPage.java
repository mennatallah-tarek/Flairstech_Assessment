package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddUserPage {

    private WebDriver driver;
    private By Role= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
    private By RoleChoice= By.xpath("//span[normalize-space()='Admin']");
    private By EmployeeName= By.xpath("//span[normalize-space()='Timothy Lewis Amiano']");

    private By Username= By.xpath("//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    private By Status= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i");
    private By StatusChoice= By.xpath("//span[normalize-space()='Enabled']");
    private By NewPassword= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    private By NewPasswordconfirm= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
    private By Save= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
    private By dropdown= By.className("oxd-autocomplete-text-input--after");




    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement Role(){return driver.findElement(Role);}
    public WebElement RoleChoice(){return driver.findElement(RoleChoice);}
    public WebElement EmployeeName(){return driver.findElement(EmployeeName);}
    public WebElement Dropdownmenu(){return driver.findElement(dropdown);}

    public WebElement Username(){return driver.findElement(Username);}
    public WebElement Status(){return driver.findElement(Status);}
    public WebElement StatusChoice(){return driver.findElement(StatusChoice);}
    public WebElement NewPassword(){return driver.findElement(NewPassword);}
    public WebElement NewPasswordconfirm(){return driver.findElement(NewPasswordconfirm);}
    public WebElement Save(){return driver.findElement(Save);}


    public void Statuschoice( ) {
        Status().click();
        StatusChoice().click();

    }

    public void UserRolechoice( ) {
        Role().click();
        RoleChoice().click();


    }
    public void EmployeeName(String Lesson) {
        EmployeeName().sendKeys(Lesson);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Dropdownmenu().click();


    }
    public void Passwordcreate(String Lesson) {
        NewPassword().sendKeys(Lesson);
        NewPassword().sendKeys(Keys.ENTER);


    }
    public void Passwordconfirm(String Lesson) {
        NewPasswordconfirm().sendKeys(Lesson);
        NewPasswordconfirm().sendKeys(Keys.ENTER);
    }
    public void Useradd(String Lesson) {
        Username().sendKeys(Lesson);
        Username().sendKeys(Keys.ENTER);


    }

    public AdminPage UserADDED( ) {

        Save().click();
        return new AdminPage(driver);
    }


}
