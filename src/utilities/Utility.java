package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    public void selectMenu(String menu) {
        driver.findElement(By.linkText(menu)).click();

    }
    /**
     * This method will click on element
     */
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    /**
     * This method will send text to element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        // Select by visible text
        select.selectByVisibleText(text);
    }


    /**
     * This method will hoover mouse on the element
     */
    public WebElement mouseHover(By by) {
        return driver.findElement(by);
    }

    /**
     * This method will verify text displayed on web page
     */

    public void verifyText(String expectedMessage, By by, String displayMessage) {
        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(displayMessage, expectedMessage, actualMessage);

    }
//    /**
//     * This method will mouse hover on element
//     */
//    public void mouseHoverToElement(By by) {
//        Actions actions = new Actions(driver);
//        WebElement mouseHoover = driver.findElement(by);
//        //Thread.sleep(3000);
//        // waitUnitVisibilityOfElementLocated(by,2000);
//        actions.moveToElement(mouseHoover).build().perform();
    //}

    /**
     * This method will clear text from field
     */
    public void clearTextFromField(By by) {
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);

    }

    /**
     * This method will mouse hover and click the element
     */
    public void mouseHoverAndClick(By by) {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
        //   Thread.sleep(3000);
        //  waitUnitVisibilityOfElementLocated(by,3000);
        actions.moveToElement(mouseHoover).click().build().perform();
    }
    /**
     * This method verify the text with element
     * @param driver - Driver
     * @param locator - By Locator - example - x.path
     * @param expectedText - expected string
     * @return
     */
    public boolean verifyText(WebDriver driver, By locator, String expectedText) {
        WebElement element = driver.findElement(locator);
        String actualText = element.getText();
        return actualText.equals(expectedText);
    }
}