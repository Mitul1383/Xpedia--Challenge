package uk.co.expedia.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.Expedia.basepage.BasePage;
import uk.co.Expedia.browserselector.BrowserSelector;
import uk.co.Expedia.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty=new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser=loadProperty.getProperty("browser");


    @BeforeMethod(groups = {"Regression","Sanity","Smoke"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups ={"Regression","Sanity","Smoke"} )
    public void tearDown(){
        driver.quit();;
    }
}
