package Base;

import Pages.AddUserPage;
import Pages.AdminPage;
import Pages.HomePage;
import org.testng.annotations.Test;
@Test
public class Login extends BaseTest {
    public void Teststeps(){LoginPage.Username().click();
    LoginPage.UsernameField("Admin");
    LoginPage.Password().click();
    HomePage homePage = LoginPage.PasswordField("admin123");
    AdminPage AdminPage = homePage.Adminpage();
        int NoOfRecords = AdminPage.NoOfRecords();
        System.out.println("Number of Records" +" = "+ NoOfRecords);
       AddUserPage AddUserPage = AdminPage.AddUserPage();
       //////////
        //add User
       AddUserPage.UserRolechoice();
        AddUserPage.Statuschoice();
        AddUserPage.Useradd("dddHelp");
        AddUserPage.Passwordcreate("Menna12");
        AddUserPage.Passwordconfirm("Menna12");
        AddUserPage.EmployeeName("TI");
        AddUserPage.UserADDED();
        System.out.println("Number of Records after adding user" +" = "+ NoOfRecords);
        //////////
        //Search and delete User
        AdminPage.opensearchtab();
        AdminPage.UsernameSearch("dddHelp");
        AdminPage.Clicksearch();
        AdminPage.ClickDelete();
        AdminPage.ClickDelete();
        AdminPage.ClickDeleteConfirmation();
        System.out.println("Number of Records after deleting user" +" = "+ NoOfRecords);



    }
}
