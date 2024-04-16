package com.newddsdiscounts.pages;

import com.newddsdiscounts.driver.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import static com.newddsdiscounts.constants.FrameworkConstants.getUrl;
import static com.newddsdiscounts.utils.BrowserUtils.click;
import static com.newddsdiscounts.utils.BrowserUtils.navigateTo_URL;
import static com.newddsdiscounts.utils.JSUtils.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='logo']") private WebElement ddsLogoTopPage;

    @FindBy(css = "button.btn-close") private  WebElement signInModalWindowCloseButton;
    @FindBy(xpath = "//div[@class='modal-content']") private  WebElement signInModalWindow;
    @FindBy(xpath = "//div[@class='modal-body']//h2") private WebElement signInModalWindowHeaderTittle;
    @FindBy(xpath = "//div[@class='modal-body']//p[@xpath='1']") private  WebElement signInModalWindowHeaderText;

    @FindBy(xpath = "//div[@class='slide-image-1']") private  WebElement carouselImageSlideOneImage1;
    @FindBy(xpath = "//div[@class='slide-image-2']") private  WebElement carouselImageSlideOneImage2;
    @FindBy(xpath = "//div[@class='slide-image-3']") private  WebElement carouselImageSlideOneImage3;

    @FindBy(xpath = "//div[@style='background-image: url(https://www.ddsdiscounts.com/wp-content/uploads/2023/03/EM9A7182-scaled.jpg); background-position: center left']") private  WebElement carouselImageSlideTwoImage1;
   //Card Body images
    @FindBy(xpath = "//div[@style='background-image: url(https://www.ddsdiscounts.com/wp-content/uploads/2023/08/TikTok.jpg); background-position: center center']") private  WebElement cardBodyTikTokImage;
    @FindBy(xpath = "//div[@style='background-image: url(https://www.ddsdiscounts.com/wp-content/uploads/2023/04/EM9A7115-scaled.jpg); background-position: top center']") private  WebElement cardBodyHiringImage;
    @FindBy(xpath = "//div[@style='background-image: url(https://www.ddsdiscounts.com/wp-content/uploads/2021/12/Email-Sign-Up.png); background-position: center center']") private  WebElement cardBodySignUpImage;
    // GET INSPIRED IMAGES
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2024/02/st1.jpg']") private  WebElement getInspiredImage1;
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2024/02/st2.jpg']") private  WebElement getInspiredImage2;
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2024/02/st3.jpg']") private  WebElement getInspiredImage3;
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2024/02/st4.jpg']") private  WebElement getInspiredImage4;

    @FindBy(xpath = "//div[@class='card-body']//h2[contains(text(),'SPRING IS IN THE FLAIR')]") private WebElement carouselSlide1Tittle;
    @FindBy(xpath = "//div[@class='card-body']//p[contains(text(),'So. Many. Spring. Dealz.')]") private WebElement carouselSlide1Text;
    @FindBy(xpath = "//a[@class='btn outlined outlined-white']") private WebElement carouselSlide1Button;
    @FindBy(xpath = "//a[@class='btn filled-pink']") private WebElement carouselSlide2Button;
    @FindBy(xpath = "//div[@class='card-body']//p[contains(text(),'View our openings to find a career')]") private WebElement carouselSlide2Text;
   //card body
    @FindBy(xpath = "//span[contains(text(),'Get Inspired')]") private WebElement getInspiredButton;
    @FindBy(xpath = "//h2[contains(text(),'Share Your Dealz')]") private WebElement getInspiredTittle;
    @FindBy(xpath = "//p[contains(text(),'Tag your finds @ddsdiscounts and use #ddsdealz for a chance to be featured.')]") private WebElement getInspiredText;
   //Footer SignIN module
    @FindBy(xpath = "//h2[contains(text(),'We need to tell you about')]") private WebElement footerSignInModuleTittle;
    @FindBy(xpath = "//div[@class='col-12 col-lg-6 header']//p[contains(text(),'Get advance notices on new store openings, in-store')]") private WebElement footerSignInModuleText;
    @FindBy(xpath = "//div[@class='disclaimer']//a[text()='Terms of Use']") private WebElement footerSignInTermsAndUse;
    @FindBy(xpath = "//div[@class='disclaimer']//a[@href='/privacy-policy/']") private WebElement footerSignInPrivacyPolicy;
    @FindBy(xpath = "//button[@type=\"submit\"]//span[contains(text(),'Sign Me Up')]") private WebElement footerSignInSignMeUpButton;
    //footer
    @FindBy(xpath = "//span[contains(text(),'©2024 Ross Stores, Inc. All rights reserved')]") private WebElement footerText1;
    @FindBy(xpath = "//span[contains(text(),'Price, styles, colors, and items will vary by store')]") private WebElement footerText2;



    @FindBy(xpath = "//img[@src='https://corp.rossstores.com/wp-content/uploads/2021/10/logo-dds.svg']") private WebElement ddsLogoMidPage;
    @FindBy(xpath = "//div[@class='link-container']//a[@href='https://www.ddsdiscounts.com/contact-us/']") private WebElement ddsLogoAltTextLink;
    @FindBy(xpath = "//div[@id='onetrust-close-btn-container']//button[@aria-label='Close']") private WebElement closeCookieButton;
    @FindBy(xpath = "//a[@href='http://partners.rossstores.com/index.html'][text()='dd’s Freight Routing Guide']\n") private WebElement ddsFreight;
    @FindBy(xpath = "//a[@href='http://partners.rossstores.com/index.html'][text()='Ross Freight Routing Guide']") private WebElement rossFreight;
    @FindBy(xpath = "//div[@id='mainfooter']") private WebElement pageFooter;
    @FindBy(xpath = "//li[@id='menu-item-21']//a[@href='https://www.ddsdiscounts.com/about-us/']") private WebElement footerAboutUs;
    @FindBy(xpath = "//li[@id='menu-item-22']//a[@href='https://jobs.rossstores.com/']") private WebElement footerCareers;
    @FindBy(xpath = "//li[@id='menu-item-23']//a[@href='https://corp.rossstores.com/responsibility']") private WebElement footerSocialResponsibility;
    @FindBy(xpath = "//li[@id='menu-item-611']//a[@href='https://corp.rossstores.com/responsibility/empowering-our-associates/our-commitment-to-diversity/']") private WebElement footerDiversityEI;
    @FindBy(xpath = "//li[@id='menu-item-24']//a[@href='https://investors.rossstores.com/']") private WebElement footerInvestors;
    @FindBy(xpath = "//li[@id='menu-item-25']//a[@href='https://www.rossstores.com/media/1062/productsourcinghumanrights.pdf']") private WebElement footerProductsSourcing;
    @FindBy(xpath = "//li[@id='menu-item-38']//a[@href='https://myross.rossstores.com/']") private WebElement footerForAssociates;
    @FindBy(xpath = "//li[@id='menu-item-35']//a[@href='https://www.ddsdiscounts.com/legal-notices/']") private WebElement footerLegalNotices;
    @FindBy(xpath = "//li[@id='menu-item-37']//a[@href='https://www.ddsdiscounts.com/comparison-pricing/']") private WebElement footerComparisonPricing;
    @FindBy(xpath = "//li[@id='menu-item-28']//a[@href='https://www.ddsdiscounts.com/privacy-policy/']") private WebElement footerPrivacyLink;
    @FindBy(xpath = "//li[@id='menu-item-29']//a[@href='https://www.ddsdiscounts.com/terms-of-use/']") private WebElement footerTermsOfUse;
    @FindBy(xpath = "//li[@id='menu-item-26']//a[@href='https://corp.rossstores.com/accessibility']") private WebElement footerAccesssibilityLink;
    @FindBy(xpath = "//li[@id='menu-item-36']//a[@href='https://www.ddsdiscounts.com/contact-us/']") private WebElement footerContactUsLink;
    @FindBy(xpath = "//li[@id='menu-item-34']//a[@href='https://www.ddsdiscounts.com/sitemap/']") private WebElement footerSiteMapLink;
    @FindBy(xpath = "//li[@id='menu-item-27']//button[@class='ot-sdk-show-settings']") private WebElement footerDoNotSellLink;



//careers, social responsibiity, diversity, investors, products, for asso, access

    public HomePage closeCookie(){

        Allure.step("The user navigates to the home page " +getUrl());
        navigateTo_URL(getUrl());
        click(closeCookieButton);

        return this;
    }

    public HomePage verifySignInModalWindowDisplay(){

        Allure.step("Sign in Modal Window Displayed");
        navigateTo_URL(getUrl());

        if (signInModalWindow.isDisplayed()) {

            WebElement modalWindowHeaderTittle = signInModalWindowHeaderTittle;
            System.out.println(modalWindowHeaderTittle.getText());

            WebElement modalWindowHeaderText = signInModalWindowHeaderText;
            System.out.println(modalWindowHeaderText.getText());

            System.out.println("signInModalWindowHeaderTittle and signInModalWindowHeaderText is displayed");
        } else {
            System.out.println("clear the cache the webpage and try again ");
        }

        return this;

    }

    public HomePage verifyHomePageTextsAndTittle() {
        Allure.step("Check that HomePage Texts And Tittles displayed as expected.");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        //carousel text and tittle
        boolean carouselSlide1Tittle1 = carouselSlide1Tittle.isDisplayed();
        System.out.println( " carousel Slide1 Tittle1 displayed " + carouselSlide1Tittle1);
        boolean carouselSlide1Text1 = carouselSlide1Text.isDisplayed();
        System.out.println( " carousel Slide1 Text1 displayed " + carouselSlide1Text1);
        boolean carouselSlide1Button1 = carouselSlide1Button.isDisplayed();
        System.out.println( " carousel Slide1 Button1 displayed " + carouselSlide1Button1);
        boolean carouselSlide2Text1 = carouselSlide2Text.isDisplayed();
        System.out.println( " carousel Slide2 Text1 displayed " + carouselSlide2Text1);
        boolean carouselSlide2Button1 = carouselSlide2Button.isDisplayed();
        System.out.println( " carousel Slide2 Button1 displayed " + carouselSlide2Button1);

        // Get Inspired Text and Tittle
        boolean getInspiredTittle1 = getInspiredTittle.isDisplayed();
        System.out.println( " getInspired Tittle1  displayed " + getInspiredTittle1);
        boolean getInspiredText1 = getInspiredText.isDisplayed();
        System.out.println( " getInspired Text1 displayed " + getInspiredText1);
        boolean getInspiredButton1 = getInspiredButton.isDisplayed();
        System.out.println( " getInspired Button1 displayed " + getInspiredButton1);
        //Footer sign in text and tittle
        boolean footerSignInModuleTittle1 = footerSignInModuleTittle.isDisplayed();
        System.out.println( " footer SignIn Module Tittle1 displayed " + footerSignInModuleTittle1);
        boolean footerSignInModuleText1 = footerSignInModuleText.isDisplayed();
        System.out.println( " footer rSignIn Module Text1  displayed" + footerSignInModuleText1);
        boolean footerSignInTermsAndUse1 = footerSignInTermsAndUse.isDisplayed();
        System.out.println( " footerSignInTermsAndUse1 displayed " + footerSignInTermsAndUse1);
        boolean footerSignInPrivacyPolicy1 = footerSignInPrivacyPolicy.isDisplayed();
        System.out.println( " footer SignIn Privacy Policy1 displayed " + footerSignInPrivacyPolicy1);
        boolean footerSignInSignMeUpButton1 = footerSignInSignMeUpButton.isDisplayed();
        System.out.println( " footer SignIn SignMe Up Button1 displayed " + footerSignInSignMeUpButton1);
        //footer text and tittle
        boolean footerTittle = footerText1.isDisplayed();
        System.out.println( " footer Tittle displayed " + footerTittle);
        boolean footerText = footerText1.isDisplayed();
        System.out.println( " footer Text displayed " + footerText);


        return this;

    }

    public HomePage verifyHomePageLogoAndImage() {
        Allure.step("Check that HomePage Logo And Image displayed as expected.");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        if (ddsLogoTopPage.isDisplayed()) {
            System.out.println("DDs Logo on top of the page is displayed");
        } else {
            System.out.println("Logo is not displayed on the webpage");
        }

        //CAROUSEL IMAGES
        driver.findElement(By.xpath("//button[@data-bs-slide-to=\"0\"]")).click();
        driver.findElement(By.xpath("//button[@aria-label='Pause slide show']")).click();

        boolean carouselSlide1Image1 = carouselImageSlideOneImage1.isDisplayed();
        System.out.println( " carousel Slide1 Image1 " + carouselSlide1Image1);
        boolean carouselSlide1Image2 = carouselImageSlideOneImage2.isDisplayed();
        System.out.println( " carousel Slide1 Image2 " + carouselSlide1Image2);
        boolean carouselSlide1Image3 = carouselImageSlideOneImage3.isDisplayed();
        System.out.println( " carousel Slide1 Image3 " + carouselSlide1Image3);

        driver.findElement(By.xpath("//button[@data-bs-slide-to='1']")).click();

        boolean carouselSlide2Image1 = carouselImageSlideTwoImage1.isDisplayed();
        System.out.println( " carousel Slide2 Image1 " + carouselSlide2Image1);
        // Card Body imagess
        boolean cardBodyImage1 = cardBodyTikTokImage.isDisplayed();
        System.out.println( " cardBody Image1 " + cardBodyImage1);
        boolean cardBodyImage2 = cardBodyHiringImage.isDisplayed();
        System.out.println( " cardBody Image2 " + cardBodyImage2);
        boolean cardBodyImage3 = cardBodySignUpImage.isDisplayed();
        System.out.println( " cardBody Image3 " + cardBodyImage3);
        //Get Inspired Images
        boolean inspiredImage1 = getInspiredImage1.isDisplayed();
        System.out.println( " inspiredImage Image1 " + inspiredImage1);
        boolean inspiredImage2 = getInspiredImage2.isDisplayed();
        System.out.println( " inspiredImage Image2 " + inspiredImage2);
        boolean inspiredImage3 = getInspiredImage3.isDisplayed();
        System.out.println( " inspiredImage Image3 " + inspiredImage3);
        boolean inspiredImage4 = getInspiredImage4.isDisplayed();
        System.out.println( " inspiredImage Image3 " + inspiredImage4);


        return this;
    }

    public HomePage footerLinksList() throws InterruptedException {

        Allure.step("The user navigates to the footer links");

        WebElement footerBar = driver.findElement(By.xpath("//div[@id='mainfooter']"));

// Find all anchor elements within the navba

        List<WebElement> footerMenuLinks = footerBar.findElements(By.tagName("a"));

// Print the total number of footer links
        System.out.println("Total Footer Links: " + footerMenuLinks.size());

// Iterate over each anchor element
        for (WebElement footerLink : footerMenuLinks) {
            // Get the URL and page title without clicking
            String url = footerLink.getAttribute("href");
            String title = footerLink.getText();

            // Print the URL and link text
            System.out.println("URL: " + url);
            System.out.println("Link Text: " + title);

            try {
                // Create a URL object from the link URL
                URL linkURL = new URL(url);

                // Open a connection to the URL
                HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();

                // Set the request method to HEAD (to check only the status code)
                connection.setRequestMethod("HEAD");

                // Get the response code
                int responseCode = connection.getResponseCode();

                // Print the response code
                System.out.println("Response Code: " + responseCode);

                // Close the connection
                connection.disconnect();
            } catch (Exception e) {
                // Print any exceptions that occur during the connection
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }

        return this;
    }

    public HomePage allLinksOnHomePage() throws InterruptedException {

        Allure.step("The user verify all links on home page");

        // Navigate to the home page
        driver.get(getUrl());

        // Find the parent element containing all the links
        WebElement homePageLinksContainer = driver.findElement(By.tagName("body"));

        // Find all anchor elements within the container
        List<WebElement> allLinksHomePage = homePageLinksContainer.findElements(By.tagName("a"));

        // Print the total number of links
        System.out.println("Total Links: " + allLinksHomePage.size());

        // Iterate over each anchor element
        for (WebElement link : allLinksHomePage) {
            // Get the URL and page title
            String url = link.getAttribute("href");
            String title = link.getText();

            // Print the URL and link text
            System.out.println("URL: " + url);
            System.out.println("Link Text: " + title);

            try {
                // Create a URL object from the link URL
                URL linkURL = new URL(url);

                // Open a connection to the URL
                HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();

                // Set the request method to HEAD (to check only the status code)
                connection.setRequestMethod("HEAD");

                // Get the response code
                int responseCode = connection.getResponseCode();

                // Print the response code
                System.out.println("Response Code: " + responseCode);

                // Close the connection
                connection.disconnect();
            } catch (Exception e) {
                // Print any exceptions that occur during the connection
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }

        return this;
    }

    public HomePage navMenuList () throws InterruptedException {

        Allure.step("The user navigates to the nav menu links");

        WebElement navbar = driver.findElement(By.xpath("//div[@id='navbarMainCollapsible']"));

        List<WebElement> navMenuLinks = navbar.findElements(By.tagName("a"));

// Print the total number of footer links
        System.out.println("Total Nav menu Links: " + navMenuLinks.size());

// Iterate over each anchor element
        for (WebElement navMenuLink : navMenuLinks) {
            // Get the URL and page title without clicking
            String url = navMenuLink.getAttribute("href");
            String title = navMenuLink.getText();

            // Print the URL and link text
            System.out.println("URL: " + url);
            System.out.println("Link Text: " + title);

            try {
                // Create a URL object from the link URL
                URL linkURL = new URL(url);

                // Open a connection to the URL
                HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();

                // Set the request method to HEAD (to check only the status code)
                connection.setRequestMethod("HEAD");

                // Get the response code
                int responseCode = connection.getResponseCode();

                // Print the response code
                System.out.println("Response Code: " + responseCode);

                // Close the connection
                connection.disconnect();
            } catch (Exception e) {
                // Print any exceptions that occur during the connection
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }

        return this;
    }

    public HomePage clickFooterAboutUsLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  About us  Links  on footer and verify Url and Tittle");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerAboutUs);
        String actualFooterAboutUsLinkUrl = driver.getCurrentUrl();
        System.out.println(actualFooterAboutUsLinkUrl);
        String expectedFooterAboutUsLinkUrl = "https://www.ddsdiscounts.com/about-us/";
        Assert.assertEquals(actualFooterAboutUsLinkUrl, expectedFooterAboutUsLinkUrl);
        System.out.println("Assert URL passed");

        String actualFooterAboutUsLinkTittle = driver.getTitle();
        System.out.println(actualFooterAboutUsLinkTittle);
        String expectedFooterAboutUsLinkTittle = "About Us - dd's DISCOUNTS®";
        Assert.assertEquals(actualFooterAboutUsLinkTittle, expectedFooterAboutUsLinkTittle);
        System.out.println("Assert Tittle passed");
        driver.navigate().back();

        return this;
    }

}

