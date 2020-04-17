package uk.co.expedia.testsuit;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.Expedia.pages.AccountPage;
import uk.co.Expedia.pages.HomePage;
import uk.co.Expedia.pages.SignInPage;
import uk.co.expedia.testbase.TestBase;

public class LoginTest extends TestBase {
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        AccountPage accountPage = new AccountPage();

        @Test(groups = {"smoke", "regression"}, priority = 0)
        public void verifyUserShouldNotLoginWithInvalidUserNameAndPassword() {
            homePage.clickOnAcceptButton();
            accountPage.clickOnAccountButton();
            homePage.clickOnSignInButton();
            signInPage.enterEmailAddress("dhannobhagslowly@gmail.com");
            signInPage.enterPassword("dhanno123456@");
            signInPage.clickOnSignInButton();
            String expectedResult = "You may have entered an unknown email address or an incorrect password";
            String actualResult = signInPage.getErrorText();
            Assert.assertEquals(expectedResult, actualResult);


        }
    }

