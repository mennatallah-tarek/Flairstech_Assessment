package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

        private WebDriver driver;


    private By username= By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
        private By Password = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");

        public LoginPage(WebDriver driver) {

            this.driver = driver;
        }


     public WebElement Username(){return driver.findElement(username);}
        public WebElement Password(){return driver.findElement(Password);}


       public void UsernameField(String Lesson) {
          Username().sendKeys(Lesson);
            Username().sendKeys(Keys.ENTER);
       }
        public HomePage PasswordField(String Lesson) {
                Password().sendKeys(Lesson);
               Password().sendKeys(Keys.ENTER);
                return new HomePage(driver);
        }


}
