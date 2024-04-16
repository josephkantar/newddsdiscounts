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

    @FindBy(xpath = "//a[@id='logo']")
    private WebElement ddsLogoTopPage;

    @FindBy(xpath = "//div[@class='modal-content']//button[@class='btn-close']")
    private WebElement signInModalWindowCloseButton;
    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement signInModalWindow;
    @FindBy(xpath = "//div[@class='modal-body']//h2")
    private WebElement signInModalWindowHeaderTittle;
    @FindBy(xpath = "//div[@class='modal-body']//p[@xpath='1']")
    private WebElement signInModalWindowHeaderText;

    @FindBy(xpath = "//div[@class='slide-image-1']")
    private WebElement carouselImageSlideOneImage1;
    @FindBy(xpath = "//div[@class='slide-image-2']")
    private WebElement carouselImageSlideOneImage2;
    @FindBy(xpath = "//div[@class='slide-image-3']")
    private WebElement carouselImageSlideOneImage3;

    @FindBy(xpath = "//div[@style='background-image: url(https://www.ddsdiscounts.com/wp-content/uploads/2023/03/EM9A7182-scaled.jpg); background-position: center left']")
    private WebElement carouselImageSlideTwoImage1;
    //Card Body images
    @FindBy(xpath = "//div[@style='background-image: url(https://www.ddsdiscounts.com/wp-content/uploads/2023/08/TikTok.jpg); background-position: center center']")
    private WebElement cardBodyTikTokImage;
    @FindBy(xpath = "//div[@style='background-image: url(https://www.ddsdiscounts.com/wp-content/uploads/2023/04/EM9A7115-scaled.jpg); background-position: top center']")
    private WebElement cardBodyHiringImage;
    @FindBy(xpath = "//div[@style='background-image: url(https://www.ddsdiscounts.com/wp-content/uploads/2021/12/Email-Sign-Up.png); background-position: center center']")
    private WebElement cardBodySignUpImage;
    // GET INSPIRED IMAGES
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2024/02/st1.jpg']")
    private WebElement getInspiredImage1;
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2024/02/st2.jpg']")
    private WebElement getInspiredImage2;
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2024/02/st3.jpg']")
    private WebElement getInspiredImage3;
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2024/02/st4.jpg']")
    private WebElement getInspiredImage4;

    @FindBy(xpath = "//div[@class='card-body']//h2[contains(text(),'SPRING IS IN THE FLAIR')]")
    private WebElement carouselSlide1Tittle;
    @FindBy(xpath = "//div[@class='card-body']//p[contains(text(),'So. Many. Spring. Dealz.')]")
    private WebElement carouselSlide1Text;
    @FindBy(xpath = "//a[@class='btn outlined outlined-white']")
    private WebElement carouselSlide1Button;
    @FindBy(xpath = "//a[@class='btn filled-pink']")
    private WebElement carouselSlide2Button;
    @FindBy(xpath = "//div[@class='card-body']//p[contains(text(),'View our openings to find a career')]")
    private WebElement carouselSlide2Text;
    //card body
    @FindBy(xpath = "//span[contains(text(),'Get Inspired')]")
    private WebElement getInspiredButton;
    @FindBy(xpath = "//h2[contains(text(),'Share Your Dealz')]")
    private WebElement getInspiredTittle;
    @FindBy(xpath = "//p[contains(text(),'Tag your finds @ddsdiscounts and use #ddsdealz for a chance to be featured.')]")
    private WebElement getInspiredText;
    //Footer SignIN module
    @FindBy(xpath = "//h2[contains(text(),'We need to tell you about')]")
    private WebElement footerSignInModuleTittle;
    @FindBy(xpath = "//div[@class='col-12 col-lg-6 header']//p[contains(text(),'Get advance notices on new store openings, in-store')]")
    private WebElement footerSignInModuleText;
    @FindBy(xpath = "//div[@class='disclaimer']//a[text()='Terms of Use']")
    private WebElement footerSignInTermsAndUse;
    @FindBy(xpath = "//div[@class='disclaimer']//a[@href='/privacy-policy/']")
    private WebElement footerSignInPrivacyPolicy;
    @FindBy(xpath = "//button[@type=\"submit\"]//span[contains(text(),'Sign Me Up')]")
    private WebElement footerSignInSignMeUpButton;
    //footer
    @FindBy(xpath = "//span[contains(text(),'©2024 Ross Stores, Inc. All rights reserved')]")
    private WebElement footerText1;
    @FindBy(xpath = "//span[contains(text(),'Price, styles, colors, and items will vary by store')]")
    private WebElement footerText2;


    @FindBy(xpath = "//img[@src='https://corp.rossstores.com/wp-content/uploads/2021/10/logo-dds.svg']")
    private WebElement ddsLogoMidPage;
    @FindBy(xpath = "//div[@class='link-container']//a[@href='https://www.ddsdiscounts.com/contact-us/']")
    private WebElement ddsLogoAltTextLink;
    @FindBy(xpath = "//div[@id='onetrust-close-btn-container']//button[@aria-label='Close']")
    private WebElement closeCookieButton;
    @FindBy(xpath = "//a[@href='http://partners.rossstores.com/index.html'][text()='dd’s Freight Routing Guide']\n")
    private WebElement ddsFreight;
    @FindBy(xpath = "//a[@href='http://partners.rossstores.com/index.html'][text()='Ross Freight Routing Guide']")
    private WebElement rossFreight;
    @FindBy(xpath = "//div[@id='mainfooter']")
    private WebElement pageFooter;
    @FindBy(xpath = "//li[@id='menu-item-21']//a[@href='https://www.ddsdiscounts.com/about-us/']")
    private WebElement footerAboutUs;
    @FindBy(xpath = "//li[@id='menu-item-22']//a[@href='https://jobs.rossstores.com/']")
    private WebElement footerCareers;
    @FindBy(xpath = "//li[@id='menu-item-23']//a[@href='https://corp.rossstores.com/responsibility']")
    private WebElement footerSocialResponsibility;
    @FindBy(xpath = "//li[@id='menu-item-611']//a[@href='https://corp.rossstores.com/responsibility/empowering-our-associates/our-commitment-to-diversity/']")
    private WebElement footerDiversityEI;
    @FindBy(xpath = "//li[@id='menu-item-24']//a[@href='https://investors.rossstores.com/']")
    private WebElement footerInvestors;
    @FindBy(xpath = "//a[contains(text(),'Product Sourcing and Human Rights')]")
    private WebElement footerProductsSourcing;
    @FindBy(xpath = "//li[@id='menu-item-38']//a[@href='https://myross.rossstores.com/']")
    private WebElement footerForAssociates;
    @FindBy(xpath = "//li[@id='menu-item-35']//a[@href='https://www.ddsdiscounts.com/legal-notices/']")
    private WebElement footerLegalNotices;
    @FindBy(xpath = "//li[@id='menu-item-37']//a[@href='https://www.ddsdiscounts.com/comparison-pricing/']")
    private WebElement footerComparisonPricing;
    @FindBy(xpath = "//li[@id='menu-item-28']//a[@href='https://www.ddsdiscounts.com/privacy-policy/']")
    private WebElement footerPrivacyLink;
    @FindBy(xpath = "//li[@id='menu-item-29']//a[@href='https://www.ddsdiscounts.com/terms-of-use/']")
    private WebElement footerTermsOfUse;
    @FindBy(xpath = "//li[@id='menu-item-26']//a[@href='https://corp.rossstores.com/accessibility']")
    private WebElement footerAccesssibilityLink;
    @FindBy(xpath = "//li[@id='menu-item-36']//a[@href='https://www.ddsdiscounts.com/contact-us/']")
    private WebElement footerContactUsLink;
    @FindBy(xpath = "//li[@id='menu-item-34']//a[@href='https://www.ddsdiscounts.com/sitemap/']")
    private WebElement footerSiteMapLink;
    @FindBy(xpath = "//button[@class='ot-sdk-show-settings']")
    private WebElement footerDoNotSellLink;


    //BUTTONS
    @FindBy(xpath = "//a[@href='https://jobs.rossstores.com/']//span[contains(text(), 'Search For Jobs ')]")
    private WebElement aboutUsSearchForJobsButton;
    @FindBy(xpath = "//a[@href='https://corp.rossstores.com/Responsibility/Supporting-our-communities/First-Book']")
    private WebElement aboutUsFirstBookButton;
    @FindBy(xpath = "//a[@href='https://corp.rossstores.com/Responsibility/Supporting-our-communities/Boys-and-girls-clubs-of-America']")
    private WebElement aboutUsBGCAButton;

    //IMAGE
    @FindBy(xpath = "//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2021/04/dinosaur.png']")
    private WebElement aboutUsDinoImage;

    //Contact Us Page FAQ Questions

    @FindBy(xpath = "//span[contains(text(),'Can I order items online from')]")
    private WebElement faqQuestion1;
    @FindBy(xpath = "//span[contains(text(),'Can you help me locate merchandise?')]")
    private WebElement faqQuestion2;
    @FindBy(xpath = "//span[contains(text(),'Do Gift Cards and Store Credits expire?')]")
    private WebElement faqQuestion3;
    @FindBy(xpath = "//span[contains(text(),'What happens to merchandise that does not sell?')]")
    private WebElement faqQuestion4;
    @FindBy(xpath = "//span[contains(text(),'Is a dd’s DISCOUNTS catalog available?')]")
    private WebElement faqQuestion5;
    @FindBy(xpath = "//span[contains(text(),'Is it possible to buy your overstock or end-of-sea')]")
    private WebElement faqQuestion6;
    @FindBy(xpath = "//span[contains(text(),'Does dd’s DISCOUNTS make donations to nonprofits i')]")
    private WebElement faqQuestion7;
    @FindBy(xpath = "//span[contains(text(),'Can you help me access your website?')]")
    private WebElement faqQuestion8;
    @FindBy(xpath = "//span[contains(text(),'When are your stores open?')]")
    private WebElement faqQuestion9;
    @FindBy(xpath = "//span[contains(text(),'I am a dd’s Associate, where can I find informatio')]")
    private WebElement faqQuestion10;
    @FindBy(xpath = "//section[@class='card block___contact-form']")
    private WebElement contacUsFormSection;


//careers, social responsibiity, diversity, investors, products, for asso, access

    public HomePage closeCookie() {

        Allure.step("The user navigates to the home page " + getUrl());
        navigateTo_URL(getUrl());
        click(closeCookieButton);

        return this;
    }

    public HomePage verifySignInModalWindowDisplay() {

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
        System.out.println(" carousel Slide1 Tittle1 displayed " + carouselSlide1Tittle1);
        boolean carouselSlide1Text1 = carouselSlide1Text.isDisplayed();
        System.out.println(" carousel Slide1 Text1 displayed " + carouselSlide1Text1);
        boolean carouselSlide1Button1 = carouselSlide1Button.isDisplayed();
        System.out.println(" carousel Slide1 Button1 displayed " + carouselSlide1Button1);
        boolean carouselSlide2Text1 = carouselSlide2Text.isDisplayed();
        System.out.println(" carousel Slide2 Text1 displayed " + carouselSlide2Text1);
        boolean carouselSlide2Button1 = carouselSlide2Button.isDisplayed();
        System.out.println(" carousel Slide2 Button1 displayed " + carouselSlide2Button1);

        // Get Inspired Text and Tittle
        boolean getInspiredTittle1 = getInspiredTittle.isDisplayed();
        System.out.println(" getInspired Tittle1  displayed " + getInspiredTittle1);
        boolean getInspiredText1 = getInspiredText.isDisplayed();
        System.out.println(" getInspired Text1 displayed " + getInspiredText1);
        boolean getInspiredButton1 = getInspiredButton.isDisplayed();
        System.out.println(" getInspired Button1 displayed " + getInspiredButton1);
        //Footer sign in text and tittle
        boolean footerSignInModuleTittle1 = footerSignInModuleTittle.isDisplayed();
        System.out.println(" footer SignIn Module Tittle1 displayed " + footerSignInModuleTittle1);
        boolean footerSignInModuleText1 = footerSignInModuleText.isDisplayed();
        System.out.println(" footer rSignIn Module Text1  displayed" + footerSignInModuleText1);
        boolean footerSignInTermsAndUse1 = footerSignInTermsAndUse.isDisplayed();
        System.out.println(" footerSignInTermsAndUse1 displayed " + footerSignInTermsAndUse1);
        boolean footerSignInPrivacyPolicy1 = footerSignInPrivacyPolicy.isDisplayed();
        System.out.println(" footer SignIn Privacy Policy1 displayed " + footerSignInPrivacyPolicy1);
        boolean footerSignInSignMeUpButton1 = footerSignInSignMeUpButton.isDisplayed();
        System.out.println(" footer SignIn SignMe Up Button1 displayed " + footerSignInSignMeUpButton1);
        //footer text and tittle
        boolean footerTittle = footerText1.isDisplayed();
        System.out.println(" footer Tittle displayed " + footerTittle);
        boolean footerText = footerText1.isDisplayed();
        System.out.println(" footer Text displayed " + footerText);


        return this;

    }

    public HomePage verifyHomePageLogoAndImage() {
        Allure.step("Check that HomePage Logo And Image displayed as expected.");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {
            System.out.println("Modal windows is not displayed on the webpage");

        }

        if (ddsLogoTopPage.isDisplayed()) {
            System.out.println("DDs Logo on top of the page is displayed");
        } else {
            System.out.println("Logo is not displayed on the webpage");
        }

        //CAROUSEL IMAGES
        driver.findElement(By.xpath("//div[@class='carousel-indicators inverted']//span[@role='listitem']//span[contains(text(), 'SPRING IS IN THE FLAIR')]")).click();
        driver.findElement(By.xpath("//button[@aria-label='Pause slide show']")).click();

        boolean carouselSlide1Image1 = carouselImageSlideOneImage1.isDisplayed();
        System.out.println(" carousel Slide1 Image1 " + carouselSlide1Image1);
        boolean carouselSlide1Image2 = carouselImageSlideOneImage2.isDisplayed();
        System.out.println(" carousel Slide1 Image2 " + carouselSlide1Image2);
        boolean carouselSlide1Image3 = carouselImageSlideOneImage3.isDisplayed();
        System.out.println(" carousel Slide1 Image3 " + carouselSlide1Image3);

        driver.findElement(By.xpath("//div[@class='carousel-indicators']//span[@role='listitem']//span[contains(text(), 'We’re Hiring!')]")).click();

        boolean carouselSlide2Image1 = carouselImageSlideTwoImage1.isDisplayed();
        System.out.println(" carousel Slide2 Image1 " + carouselSlide2Image1);
        // Card Body imagess
        boolean cardBodyImage1 = cardBodyTikTokImage.isDisplayed();
        System.out.println(" cardBody Image1 " + cardBodyImage1);
        boolean cardBodyImage2 = cardBodyHiringImage.isDisplayed();
        System.out.println(" cardBody Image2 " + cardBodyImage2);
        boolean cardBodyImage3 = cardBodySignUpImage.isDisplayed();
        System.out.println(" cardBody Image3 " + cardBodyImage3);
        //Get Inspired Images
        boolean inspiredImage1 = getInspiredImage1.isDisplayed();
        System.out.println(" inspiredImage Image1 " + inspiredImage1);
        boolean inspiredImage2 = getInspiredImage2.isDisplayed();
        System.out.println(" inspiredImage Image2 " + inspiredImage2);
        boolean inspiredImage3 = getInspiredImage3.isDisplayed();
        System.out.println(" inspiredImage Image3 " + inspiredImage3);
        boolean inspiredImage4 = getInspiredImage4.isDisplayed();
        System.out.println(" inspiredImage Image3 " + inspiredImage4);


        return this;
    }

    public HomePage footerLinksList() throws InterruptedException {

        Allure.step("The user navigates to the footer links");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

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

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

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

    public HomePage navMenuList() throws InterruptedException {

        Allure.step("The user navigates to the nav menu links");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

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

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

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
        //driver.navigate().back();

        click(aboutUsSearchForJobsButton);
        String parentWindow1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String windowHandle : handles1) {
            if (!windowHandle.equals(parentWindow1)) {
                driver.switchTo().window(windowHandle);
                String actualAboutUsSearchJobsUrl = driver.getCurrentUrl();
                System.out.println(actualAboutUsSearchJobsUrl);
                String expectedAboutUsSearchJobsUrl = "https://jobs.rossstores.com/";
                Assert.assertEquals(actualAboutUsSearchJobsUrl, expectedAboutUsSearchJobsUrl);
                System.out.println("Assert URL passed");
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow1); //cntrl to parent window

        click(aboutUsFirstBookButton);
        String parentWindow2 = driver.getWindowHandle();
        Set<String> handles2 = driver.getWindowHandles();
        for (String windowHandle : handles2) {
            if (!windowHandle.equals(parentWindow2)) {
                driver.switchTo().window(windowHandle);
                String actualAboutUsFirstBookUrl = driver.getCurrentUrl();
                System.out.println(actualAboutUsFirstBookUrl);
                String expectedAboutUsFirstBookUrl = "https://corp.rossstores.com/responsibility/supporting-our-communities/national-community-partners/";
                Assert.assertEquals(actualAboutUsFirstBookUrl, expectedAboutUsFirstBookUrl);
                System.out.println("Assert URL passed");
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow2); //cntrl to parent window

        jsScrollClick(aboutUsBGCAButton);
        String parentWindow3 = driver.getWindowHandle();
        Set<String> handles3 = driver.getWindowHandles();
        for (String windowHandle : handles3) {
            if (!windowHandle.equals(parentWindow3)) {
                driver.switchTo().window(windowHandle);
                String actualAboutUsBGCABookUrl = driver.getCurrentUrl();
                System.out.println(actualAboutUsBGCABookUrl);
                String expectedAboutUsBGCABookUrl = "https://corp.rossstores.com/responsibility/supporting-our-communities/national-community-partners/";
                Assert.assertEquals(actualAboutUsBGCABookUrl, expectedAboutUsBGCABookUrl);
                System.out.println("Assert URL passed");
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow3); //cntrl to parent window

        boolean dinoImage = aboutUsDinoImage.isDisplayed();
        System.out.println(" About Us dinoImage  " + dinoImage);
        // tittles and texts p displayed
        boolean ourStoryTittle = driver.findElement(By.xpath("//h2[contains(text(),'Our Story')]")).isDisplayed();
        System.out.println("Our story Tittle is displayed " + ourStoryTittle);
        boolean ourStoryText = driver.findElement(By.xpath("//p[contains(text(),'dd’s DISCOUNTS opened its first store in 2004 as t')]")).isDisplayed();
        System.out.println("Our story text is displayed " + ourStoryText);
        boolean interestedWorkingTittle = driver.findElement(By.xpath("//span[contains(text(),'dd’s')]")).isDisplayed();
        System.out.println("interestedWorking Tittle  is displayed " + interestedWorkingTittle);
        boolean interestedWorkingText = driver.findElement(By.xpath("//p[contains(text(),'We have many job opportunities ranging from store ')]")).isDisplayed();
        System.out.println("interestedWorking Text is displayed " + interestedWorkingText);
        boolean communityInvolvementTittle = driver.findElement(By.xpath("//h2[contains(text(),'Community Involvement')]")).isDisplayed();
        System.out.println("communityInvolvementTittle is displayed " + communityInvolvementTittle);
        boolean firstBookTittle = driver.findElement(By.xpath("//h3[contains(text(),'First Book')]")).isDisplayed();
        System.out.println("firstBookTittle is displayed " + firstBookTittle);
        boolean boysAndGirlsClubsTittle = driver.findElement(By.xpath("//h3[contains(text(),'Boys & Girls Clubs of America')]")).isDisplayed();
        System.out.println("boysAndGirlsClubsTittle is displayed " + boysAndGirlsClubsTittle);


        return this;
    }

    public HomePage clickFooterCareersPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Careers  Links  on footer and verify Url and Tittle");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerCareers);
        String parentWindow1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String windowHandle : handles1) {
            if (!windowHandle.equals(parentWindow1)) {
                driver.switchTo().window(windowHandle);
                String actualFooterCareersUrl = driver.getCurrentUrl();
                System.out.println(actualFooterCareersUrl);
                String expectedFooterCareersUrl = "https://jobs.rossstores.com/";
                Assert.assertEquals(actualFooterCareersUrl, expectedFooterCareersUrl);
                System.out.println("Careers URL matched");
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow1); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterSocialResponsibilityPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Social responsibility Links  on footer and verify Url and Tittle");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerSocialResponsibility);
        String parentWindow1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String windowHandle : handles1) {
            if (!windowHandle.equals(parentWindow1)) {
                driver.switchTo().window(windowHandle);

                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://corp.rossstores.com/responsibility/");
                assertThat(DriverManager.getDriver().getTitle(), containsString("Corporate Social Responsibility"));

                // verify links on social responsibility page

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
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow1); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterDiversityPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Diversity  Links  on footer and verify Url and Tittle");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerDiversityEI);
        String parentWindow1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String windowHandle : handles1) {
            if (!windowHandle.equals(parentWindow1)) {
                driver.switchTo().window(windowHandle);
                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://corp.rossstores.com/responsibility/empowering-our-associates/our-commitment-to-diversity/");
                assertThat(DriverManager.getDriver().getTitle(), containsString("Our Commitment to Diversity, Equality, and Inclusion"));

            }
        }
        driver.close();
        driver.switchTo().window(parentWindow1); //cntrl to parent window

        return this;
    }
    public HomePage clickFooterInvestorsPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Investers  Links  on footer and verify Url");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerInvestors);
        String parentWindow2 = driver.getWindowHandle();
        Set<String> handles2 = driver.getWindowHandles();
        for (String windowHandle : handles2) {
            if (!windowHandle.equals(parentWindow2)) {
                driver.switchTo().window(windowHandle);

                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://investors.rossstores.com/");

            }
        }
        driver.close();
        driver.switchTo().window(parentWindow2); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterProductsPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Products Sourcing  Links  on footer and verify Url");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerProductsSourcing);
        String parentWindow3 = driver.getWindowHandle();
        Set<String> handles3 = driver.getWindowHandles();
        for (String windowHandle : handles3) {
            if (!windowHandle.equals(parentWindow3)) {
                driver.switchTo().window(windowHandle);
                assertThat(DriverManager.getDriver().getTitle(), containsString("Product Sourcing &"));

            }

        }
        driver.close();
        driver.switchTo().window(parentWindow3); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterAssociatesPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Associates  Links  on footer and verify Url");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerForAssociates);
        String parentWindow4 = driver.getWindowHandle();
        Set<String> handles4 = driver.getWindowHandles();
        for (String windowHandle : handles4) {
            if (!windowHandle.equals(parentWindow4)) {
                driver.switchTo().window(windowHandle);
                String forAssociatesURL;
                forAssociatesURL = driver.getCurrentUrl();
                System.out.println(forAssociatesURL);


            }

        }
        driver.close();
        driver.switchTo().window(parentWindow4); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterComparisonPricingLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  ComparisonPricing  Links  on footer and verify Url and Tittle");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerComparisonPricing);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/comparison-pricing/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Comparison Pricing"));

        boolean comparisonPricingPageText = driver.findElement(By.xpath("//p[contains(text(),'We want you to shop with more information, so many')]")).isDisplayed();
        System.out.println("comparisonPricing Page Text is displayed " + comparisonPricingPageText);

        return this;
    }

    public HomePage clickFooterSitemapLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  SiteMap  Links  on footer and verify Url and Tittle");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerSiteMapLink);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/sitemap/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Sitemap"));

        return this;
    }

    public HomePage clickFooterPrivacyLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Privacy policy Links  on footer and verify Url and Tittle");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerPrivacyLink);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/privacy-policy/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Privacy Policy"));

        WebElement privacyPageText1 = driver.findElement(By.xpath("//a[contains(text(),'https://www.ddsdiscounts.com')]"));
        System.out.println(privacyPageText1.getText());

        boolean printPageButton = driver.findElement(By.xpath("//span[contains(text(),'Print Page')]")).isDisplayed();
        System.out.println(printPageButton + " printPageButton is  displayed");

        WebElement privacyPageText2 = driver.findElement(By.xpath("//a[contains(text(),'www.google.com/policies/privacy/partners')]"));
        System.out.println(privacyPageText2.getText());

        WebElement privacyPageText3 = driver.findElement(By.xpath("//a[contains(text(),'https://tools.google.com/dlpage/gaoptout')]"));
        System.out.println(privacyPageText3.getText());

        WebElement privacyPageText4 = driver.findElement(By.xpath("//a[contains(text(),'www.aboutads.info/appchoices')]"));
        System.out.println(privacyPageText4.getText());

        driver.navigate().back();

        return this;
    }

    public HomePage clickFooterTermsofUseLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  TermsofUse Links  on footer and verify Url and Tittle");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerTermsOfUse);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/terms-of-use/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Terms of Use"));

        WebElement TermOfUseText1 = driver.findElement(By.xpath("//p[contains(text(),'Welcome to the dd’s DISCOUNTS (together with its p')]"));
        System.out.println(TermOfUseText1.getText());

        boolean termOfUseDDSLogos = driver.findElement(By.xpath("//img[@src='https://www.ddsdiscounts.com/wp-content/uploads/2021/05/legal-logos.svg']")).isDisplayed();
        System.out.println(termOfUseDDSLogos + " printPageButton is  displayed");

        WebElement termofUseTittle1= driver.findElement(By.xpath("//span[contains(text(),'1. Use of Copyrighted Contents and Trademarks')]"));
        System.out.println(termofUseTittle1.getText());

        WebElement termofUseTittle2 = driver.findElement(By.xpath("//span[contains(text(),'2. Limitations on Use')]"));
        System.out.println(termofUseTittle2.getText());

        WebElement termofUseTittle3 = driver.findElement(By.xpath("//span[contains(text(),'3. Links to Third-Party Sites')]"));
        System.out.println(termofUseTittle3.getText());

        WebElement termofUseTittle4 = driver.findElement(By.xpath("//span[contains(text(),'4. Comments and Feedback')]"));
        System.out.println(termofUseTittle4.getText());

        WebElement termofUseTittle5 = driver.findElement(By.xpath("//span[contains(text(),'5. Social Media Submissions and User-Generated Con')]"));
        System.out.println(termofUseTittle5.getText());

        WebElement termofUseTittle6 = driver.findElement(By.xpath("//span[contains(text(),'6. License Grant')]"));
        System.out.println(termofUseTittle6.getText());

        driver.navigate().back();

        return this;
    }

    public HomePage clickFooterAccessibilityLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  accessibility Links  on footer and verify Url and Tittle");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerAccesssibilityLink);

        String parentWindow4 = driver.getWindowHandle();
        Set<String> handles4 = driver.getWindowHandles();
        for (String windowHandle : handles4) {
            if (!windowHandle.equals(parentWindow4)) {
                driver.switchTo().window(windowHandle);

                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://corp.rossstores.com/accessibility/");
                assertThat(DriverManager.getDriver().getTitle(), containsString("Accessibility"));

                WebElement accessibilityPageText1 = driver.findElement(By.xpath("//p[contains(text(), 'We are committed to providing all customers with access to information about')]"));
                System.out.println(accessibilityPageText1.getText());


            }

        }
        driver.close();
        driver.switchTo().window(parentWindow4); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterDoNotCookieAndVerify() throws InterruptedException {

        Allure.step("The user clicks on Do not Sell Links  on footer and verify its displayed");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        WebElement footerDoNotSell = footerDoNotSellLink;
        JavascriptExecutor jsexecutor7 = ((JavascriptExecutor) DriverManager.getDriver());
        waitForVisibility(footerDoNotSellLink);
        jsexecutor7.executeScript("arguments[0].click();", footerDoNotSell);

        click(footerDoNotSellLink);
        boolean oneTrustWindow = driver.findElement(By.xpath("//div[@id='ot-pc-content']")).isDisplayed();
        System.out.println(oneTrustWindow + " oneTrustWindow box is  displayed");

        driver.findElement(By.xpath("//button[@id='close-pc-btn-handler']")).click();

        return this;
    }


    public HomePage clickFooterLegalNoticesLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  LegalNotices  Links  on footer and verify Url and Tittle");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerLegalNotices);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/legal-notices/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Legal Notices and Recalled Products - dd's DISCOUNTS®"));


        // all the links on legal notices page including PDF
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

    public HomePage clickFooterContactUsPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Products Sourcing  Links  on footer and verify Url");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerContactUsLink);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/contact-us/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Contact Us"));
        //Contact Us tittles and Text and make sure FORM disp;ayed
        boolean returnPolicyTittle = driver.findElement(By.xpath("//span[contains(text(),'General Return Policy')]")).isDisplayed();
        System.out.println("returnPolicy Tittle is displayed " + returnPolicyTittle);
        driver.findElement(By.xpath("//span[contains(text(),'General Return Policy')]")).click();
        boolean returnPolicyText = driver.findElement(By.xpath("//p[contains(text(),'dd’s DISCOUNTS uses a refund verification system. ')]")).isDisplayed();
        System.out.println("returnPolicy Text is displayed " + returnPolicyText);

        boolean faqTittle = driver.findElement(By.xpath("//h2[contains(text(),'FAQ')]")).isDisplayed();
        System.out.println("faqTittle is displayed " + faqTittle);

        scrollIntoViewJS(faqQuestion1);
        boolean question1 = (faqQuestion1).isDisplayed();
        System.out.println("question1 is displayed " + question1);
        click(faqQuestion1);
        Thread.sleep(1000);
        boolean faqAnswer1  = driver.findElement(By.xpath("//p[contains(text(),'No, merchandise cannot be purchased online. The op')]")).isDisplayed();
        System.out.println("faqAnswer1 Text is displayed " + faqAnswer1);
        Thread.sleep(1000);

        scrollIntoViewJS(faqQuestion2);
        boolean question2 = (faqQuestion2).isDisplayed();
        System.out.println("question1 is displayed " + question2);
        click(faqQuestion2);
        Thread.sleep(1000);
        boolean faqAnswer2  = driver.findElement(By.xpath("//p[contains(text(),'We do not provide itemized merchandise searches. B')]")).isDisplayed();
        System.out.println("faqAnswer2 Text is displayed " + faqAnswer2);


        scrollIntoViewJS(faqQuestion3);
        boolean question3 = (faqQuestion3).isDisplayed();
        System.out.println("question3 is displayed " + question3);
        jsScrollClick(faqQuestion3);
        Thread.sleep(1000);
        boolean faqAnswer3  = driver.findElement(By.xpath("//p[contains(text(),'There is no expiration on our Gift Cards or Store ')]")).isDisplayed();
        System.out.println("faqAnswer3 Text is displayed " + faqAnswer3);


        scrollIntoViewJS(faqQuestion4);
        boolean question4 = (faqQuestion4).isDisplayed();
        System.out.println("question4 is displayed " + question4);
        jsScrollClick(faqQuestion4);
        Thread.sleep(1000);
        boolean faqAnswer4  = driver.findElement(By.xpath("//p[contains(text(),'To make way for new merchandise, we regularly mark')]")).isDisplayed();
        System.out.println("faqAnswer4 Text is displayed " + faqAnswer4);

        scrollIntoViewJS(faqQuestion5);
        boolean question5 = (faqQuestion5).isDisplayed();
        System.out.println("question5 is displayed " + question5);
        jsScrollClick(faqQuestion5);
        Thread.sleep(1000);
        boolean faqAnswer5  = driver.findElement(By.xpath("//p[contains(text(),'No. We look for manufacturer closeouts. Our produc')]")).isDisplayed();
        System.out.println("faqAnswer5 Text is displayed " + faqAnswer5);

        scrollIntoViewJS(faqQuestion6);
        boolean question6 = (faqQuestion6).isDisplayed();
        System.out.println("question6 is displayed " + question6);
        jsScrollClick(faqQuestion6);
        Thread.sleep(1000);
        boolean faqAnswer6  = driver.findElement(By.xpath("//p[contains(text(),'No. dd’s DISCOUNTS does not offer any type of bulk')]")).isDisplayed();
        System.out.println("faqAnswer6 Text is displayed " + faqAnswer6);

        scrollIntoViewJS(faqQuestion7);
        boolean question7 = (faqQuestion7).isDisplayed();
        System.out.println("question7 is displayed " + question7);
        jsScrollClick(faqQuestion7);
        Thread.sleep(1000);
        boolean faqAnswer7  = driver.findElement(By.xpath("//a[contains(text(),'Supporting Our Communities')]")).isDisplayed();
        System.out.println("faqAnswer7 Text is displayed " + faqAnswer7);

        scrollIntoViewJS(faqQuestion8);
        boolean question8 = (faqQuestion8).isDisplayed();
        System.out.println("question8 is displayed " + question8);
        jsScrollClick(faqQuestion8);
        Thread.sleep(1000);
        boolean faqAnswer8  = driver.findElement(By.xpath("//p[contains(text(),'If you are having trouble accessing information')]")).isDisplayed();
        System.out.println("faqAnswer8 Text is displayed " + faqAnswer8);

        scrollIntoViewJS(faqQuestion9);
        boolean question9 = (faqQuestion9).isDisplayed();
        System.out.println("question9 is displayed " + question9);
        jsScrollClick(faqQuestion9);
        Thread.sleep(1000);
        boolean faqAnswer9  = driver.findElement(By.xpath("//a[contains(text(),'store locator')]")).isDisplayed();
        System.out.println("faqAnswer9 Text is displayed " + faqAnswer9);

        scrollIntoViewJS(faqQuestion10);
        boolean question10 = (faqQuestion10).isDisplayed();
        System.out.println("question10 is displayed " + question10);
        jsScrollClick(faqQuestion10);
        Thread.sleep(1000);
        boolean faqAnswer10  = driver.findElement(By.xpath("//a[contains(text(),'https://MyRoss.rossstores.com')]")).isDisplayed();
        System.out.println("faqAnswer10 Text is displayed " + faqAnswer10);

        boolean contacUsForm = contacUsFormSection.isDisplayed();
        System.out.println("contacUsForm Section is displayee" + contacUsForm);


        return this;
    }
}

