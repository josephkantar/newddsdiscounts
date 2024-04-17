package com.newddsdiscounts.pages;

import com.newddsdiscounts.driver.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.newddsdiscounts.constants.FrameworkConstants.getUrl;
import static com.newddsdiscounts.utils.JSUtils.jsScrollClick;
import static com.newddsdiscounts.utils.JSUtils.scrollIntoViewJS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ContactUsPageForm extends BasePage {

    public ContactUsPageForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='modal-content']//button[@class='btn-close']")
    private WebElement signInModalWindowCloseButton;
    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement signInModalWindow;
    @FindBy(xpath = "//div[@id='mainfooter']")
    private WebElement pageFooter;
    @FindBy(xpath = "//li[@id='menu-item-36']//a[@href='https://www.ddsdiscounts.com/contact-us/']")
    private WebElement footerContactUsLink;

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


    public ContactUsPageForm clickFooterContactUsPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Contact Us page through  footer and verify Url-tittle");

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
        jsScrollClick(faqQuestion1);
        Thread.sleep(1000);
        boolean faqAnswer1  = driver.findElement(By.xpath("//p[contains(text(),'No, merchandise cannot be purchased online. The op')]")).isDisplayed();
        System.out.println("faqAnswer1 Text is displayed " + faqAnswer1);
        Thread.sleep(1000);

        scrollIntoViewJS(faqQuestion2);
        boolean question2 = (faqQuestion2).isDisplayed();
        System.out.println("question1 is displayed " + question2);
        jsScrollClick(faqQuestion2);
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

    public FoundInStorePage navigateToFoundInStore() throws InterruptedException {

        Allure.step("The user navigate FoundINsTORE page");

        navigateTo_URL(getUrl());
        Thread.sleep(2000);

        driver.navigate().to("https://www.ddsdiscounts.com/found-in-store/");
        return new FoundInStorePage(driver);

    }
}
