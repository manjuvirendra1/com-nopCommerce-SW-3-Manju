package homepage;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
   public void pageNavigation() {
        selectMenu("Computers");
        selectMenu("Desktops");
        // Verify that navigate to correct page
        String expectedUrl = "https://demo.nopcommerce.com/desktops";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

   @After
    public void tearDown() {
        driver.close();
   }

    }

