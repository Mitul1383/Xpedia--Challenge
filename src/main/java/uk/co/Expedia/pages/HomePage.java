package uk.co.Expedia.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import uk.co.Expedia.utility.Utility;

public class HomePage extends Utility {
    By accept = By.xpath("//span[@class='button-text']");
    By signInLink = By.xpath("//button[@id='header-account-signin-button']");
    By flightLink = By.xpath("//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']");


    public void clickOnAcceptButton() {
        clickOnElement(accept);
    }

    public void clickOnSignInButton() {
        clickOnElement(signInLink);
    }

    public void clickOnFlightButton() {
        clickOnElement(flightLink);
    }
}
