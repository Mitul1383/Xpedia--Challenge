package uk.co.expedia.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.Expedia.pages.FlightPage;
import uk.co.Expedia.pages.HomePage;
import uk.co.expedia.testbase.TestBase;

public class FlightTest<FlightsPage> extends TestBase {
    HomePage homePage = new HomePage();
    FlightPage flightPage=new FlightPage();

    @Test(groups = {"sanity","regression"},priority = 1)
    public void verifyUserShouldFindDestinationAccordingToUserRequirement(){
        homePage.clickOnAcceptButton();
        homePage.clickOnFlightButton();
        FlightPage.enterFlyingFrom("London (Gatwick)");
        FlightPage.enterGoingTo("Ahmedabad (AMD-Sardar Vallabhbhai Patel Intl.)");
        FlightPage.enterDepartingDate("15 /11/2020");
        FlightPage.enterReturningDate("1/01/2021");
        FlightPage.clickOnTravellers();
        FlightPage.clickOnAdults();
        FlightPage.clickOnClose();
        FlightPage.clickOnSearchButton();
        String expectedResult = "Select your departure to Ahmedabad";
        String actualResult = flightPage.getDestinationText();
        Assert.assertEquals(expectedResult, actualResult);







    }

}
