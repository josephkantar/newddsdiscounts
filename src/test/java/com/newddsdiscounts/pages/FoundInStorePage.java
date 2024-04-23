package com.newddsdiscounts.pages;

import com.newddsdiscounts.driver.DriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

import static com.newddsdiscounts.constants.FrameworkConstants.getFoundInStoreUrl;
import static com.newddsdiscounts.constants.FrameworkConstants.getUrl;
import static com.newddsdiscounts.utils.JSUtils.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class FoundInStorePage extends BasePage {

    public FoundInStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//section[@id='footer-email-signup']")
    private WebElement footerSignInModalWindow;
    @FindBy(xpath = "//div[@id='mainfooter']")
    private WebElement pageFooter;
    @FindBy(xpath = "//button[@id='stackla-filter-toggle']")
    private WebElement foundIStoreSelectCategory;
    @FindBy(xpath = "//button[@data-filterslug='men']")
    private WebElement categoryMen;
    @FindBy(xpath = "//button[@data-filterslug='ladies']")
    private WebElement categoryLadies;
    @FindBy(xpath = "//button[@data-filterslug='kids']")
    private WebElement categoryKids;
    @FindBy(xpath = "//button[@data-filterslug='shoes']")
    private WebElement categoryShoes;
    @FindBy(xpath = "//ul[@class='dropdown-menu show']//button[@data-filterslug='for-the-home']")
    private WebElement categoryHome;
    @FindBy(xpath = "//ul[@class='dropdown-menu show']//button[@data-filterslug='more']")
    private WebElement categoryMore;
    @FindBy(xpath = "//button[@data-filterslug='view-all']")
    private WebElement categoryAll;

//    @FindBy(xpath = "//div[@id='onetrust-pc-sdk']//button[@id='close-pc-btn-handler']")
//    private WebElement closeCookieButton;

    @FindBy(xpath = "//div[@class='ot-sdk-container']//..//..//.//..//button[@id='close-pc-btn-handler']")
    private WebElement closeCookieButton;


    public FoundInStorePage clickFoundInStoreLinkAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user navigate to Found In Store page");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);
        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/found-in-store/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Found In Store"));

        //jsScrollClick(closeCookieButton);

        return this;

        }

    public FoundInStorePage verifyTittlesAndTexts() throws InterruptedException {

        Allure.step("The user verify Found In Store page tittle and Texts");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        boolean realDealsText = driver.findElement(By.xpath("//p[contains(text(),'Real deals found in our stores for you, your famil')]")).isDisplayed();
        System.out.println( " realDealsText is displayed " + realDealsText);
        boolean allMerchandiseText = driver.findElement(By.xpath("//p[contains(text(),'All merchandise is representative of the merchandi')]")).isDisplayed();
        System.out.println( " allMerchandiseText is displayed " + allMerchandiseText);
        boolean signInModalFooter = footerSignInModalWindow.isDisplayed();
        System.out.println("footer SignIn Modal Window is displayed " + signInModalFooter);
        boolean displayFooter = pageFooter.isDisplayed();
        System.out.println("footer Section is displayed " + displayFooter);



        return this;

        }
    public FoundInStorePage clickFoundInStoreSelectAllFromDropdown() throws InterruptedException {

        Allure.step("The user Select ALL from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        boolean dropDownMenuDisplayed = foundIStoreSelectCategory.isDisplayed();
        System.out.println("Dropdownmenu -All- is displayed " + dropDownMenuDisplayed);
        click(foundIStoreSelectCategory);
        Thread.sleep(1000);

        WebElement selectAllDropDown = categoryAll;
        selectAllDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean allImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("All Image preview displayed " + allImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
         String destinationPath = "src/test/screenshots/ScreenshotForSelectedAll.png";

         try {
              //Save the screenshot to the specified path
              FileUtils.copyFile(screenshotFile, new File(destinationPath));
              System.out.println("Screenshot saved to: " + destinationPath);
              } catch (Exception e) {
              System.out.println("Failed to save screenshot: " + e.getMessage());
              }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);





        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectMenFromDropdown() throws InterruptedException {

        Allure.step("The user Select ALL from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        boolean dropDownMenuDisplayed = foundIStoreSelectCategory.isDisplayed();
        System.out.println("Dropdownmenu  -Men- is displayed " + dropDownMenuDisplayed);
        click(foundIStoreSelectCategory);
        Thread.sleep(1000);

        WebElement selectMenDropDown = categoryMen;
        selectMenDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean menImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("Men Image preview displayed " + menImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/screenshots/ScreenshotForSelectedMen.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);





        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectLadiesFromDropdown() throws InterruptedException {

        Allure.step("The user Select ALL from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        boolean dropDownMenuDisplayed = foundIStoreSelectCategory.isDisplayed();
        System.out.println("Dropdownmenu -Ladies-  is displayed " + dropDownMenuDisplayed);
        click(foundIStoreSelectCategory);
        Thread.sleep(1000);

        WebElement selectLadiesDropDown = categoryLadies;
        selectLadiesDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean ladiesImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("ladies Image preview displayed " + ladiesImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/screenshots/ScreenshotForSelectedLadies.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectShoesFromDropdown() throws InterruptedException {

        Allure.step("The user Select ALL from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        boolean dropDownMenuDisplayed = foundIStoreSelectCategory.isDisplayed();
        System.out.println("Dropdownmenu -shoes- is displayed " + dropDownMenuDisplayed);
        click(foundIStoreSelectCategory);
        Thread.sleep(1000);

        WebElement selectShoesDropDown = categoryShoes;
        selectShoesDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean shoesImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("Shoes Image preview displayed " + shoesImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/screenshots/ScreenshotForSelectedShoes.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectKidsFromDropdown() throws InterruptedException {

        Allure.step("The user Select ALL from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        boolean dropDownMenuDisplayed = foundIStoreSelectCategory.isDisplayed();
        System.out.println("Dropdownmenu -Kids- is displayed " + dropDownMenuDisplayed);
        click(foundIStoreSelectCategory);
        Thread.sleep(1000);

        WebElement selectKidsDropDown = categoryKids;
        selectKidsDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean kidsImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("Kids Image preview displayed " + kidsImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/screenshots/ScreenshotForSelectedKids.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectHomeFromDropdown() throws InterruptedException {

        Allure.step("The user Select ALL from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        Thread.sleep(1000);
        boolean dropDownMenuDisplayed = foundIStoreSelectCategory.isDisplayed();
        System.out.println("Dropdownmenu - Home -  is displayed " + dropDownMenuDisplayed);
        jsScrollClick(foundIStoreSelectCategory);
        Thread.sleep(1000);

        JavascriptExecutor jsexecutor = (JavascriptExecutor) DriverManager.getDriver();
        jsexecutor.executeScript("window.scrollBy(0, 300)");

        WebElement selectHomeDropDown = categoryHome;
        selectHomeDropDown.click();
        Thread.sleep(2000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean homeImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("Home Image preview displayed " + homeImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/screenshots/ScreenshotForSelectedHome.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectMoreFromDropdown() throws InterruptedException {

        Allure.step("The user Select ALL from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        boolean dropDownMenuDisplayed = foundIStoreSelectCategory.isDisplayed();
        System.out.println("Dropdownmenu - more -  is displayed " + dropDownMenuDisplayed);
        jsScrollClick(foundIStoreSelectCategory);
        Thread.sleep(3000);

        JavascriptExecutor jsexecutor = (JavascriptExecutor) DriverManager.getDriver();
        jsexecutor.executeScript("window.scrollBy(0, 500)");

        WebElement selectMoreDropDown = categoryMore;
        selectMoreDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(2000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean moreImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("More Image preview displayed " + moreImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/screenshots/ScreenshotForSelectedMore.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        return this;

    }


}